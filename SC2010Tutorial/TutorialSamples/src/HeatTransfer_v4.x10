/*
 *  This file is part of the X10 project (http://x10-lang.org).
 *
 *  This file is licensed to You under the Eclipse Public License (EPL);
 *  You may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *      http://www.opensource.org/licenses/eclipse-1.0.php
 *
 *  (C) Copyright IBM Corporation 2006-2010.
 */


/**
 * This is one of a series of programs showing how to express
 * different forms of parallelism in X10.</p>
 *
 * All of the example programs in the series are computing
 * the same thing:  solving a set of 2D partial differential
 * equations that can be expressed as an iterative 4-point
 * stencil operation.  See the X10 2.1 tutorial for
 * for more details and some pictures.</p>
 *
 * This program is illustrating an SPMD with all-to-all reduction
 * ("MPI-style").</p>
 */
public class HeatTransfer_v4 {
     static   val n = 3;
     static  val epsilon = 1.0e-5;

     val BigD:Dist(2) = Dist.makeBlock(new Array[Region(1){self.rect}][0..n+1, 0..n+1], 0);
     val D = BigD | (1..n)*(1..n);
     val LastRow = (0..0)*(1..n);
     val A:DistArray[double](BigD){self.rank==2} 
      = DistArray.make[double](BigD,(p:Point)=>{ LastRow.contains(p) ? 1.0 : 0.0 });
     val Temp = DistArray.make[Double](BigD);

     def stencil_1([x,y]:Point(2)): Double {
        return ((at(A.dist(x-1,y)) A(x-1,y)) + 
                (at(A.dist(x+1,y)) A(x+1,y)) + 
                (at(A.dist(x,y-1)) A(x,y-1)) + 
                (at(A.dist(x,y+1)) A(x,y+1))) / 4;
    }

    // TODO: The array library really should provide an efficient 
    //       all-to-all collective reduction.
    //       This is a quick and sloppy implementation, which does way too much work.
     def reduceMax(diff:DistArray[Double],z:Point{self.rank==diff.rank},  scratch:DistArray[Double]) {
        val max = diff.reduce(Math.max.(Double,Double), 0.0);
        diff(z) = max;
        next;
    }

    def run() {
        clocked finish {
            val D_Base = Dist.makeUnique(D.places());
            val diff = DistArray.make[Double](D_Base);
            val scratch = DistArray.make[Double](D_Base);
	    for (z in D_Base) clocked async at (D_Base(z)) {
                do {
                    diff(z) = 0;
                    for (p:Point(2) in D | here) {
                        Temp(p) = stencil_1(p);
                        diff(z) = Math.max(diff(z), Math.abs(A(p) - Temp(p)));
                    }
                    next;
                    for (p:Point(2) in D | here) {
                        A(p) = Temp(p);
                    }
                    reduceMax(diff, z, scratch);
                } while (diff(z) > epsilon);
            }
        }
    }
 
   def prettyPrintResult() {
       for ([i] in A.region.projection(0)) {
           for ([j] in A.region.projection(1)) {
                val pt = Point.make(i,j);
                at (BigD(pt)) { 
                    val tmp = A(pt);
                    at (Place.FIRST_PLACE) Console.OUT.printf("%1.4f ", tmp);
                }
            }
            Console.OUT.println();
        }
    }

    public static def main(Array[String]) {
        Console.OUT.println("HeatTransfer Tutorial example with n="+n+" and epsilon="+epsilon);
        Console.OUT.println("Initializing data structures");
        val s = new HeatTransfer_v4();
        Console.OUT.print("Beginning computation...");
        val start = System.nanoTime();
        s.run();
        val stop = System.nanoTime();
	Console.OUT.printf("...completed in %1.3f seconds.\n", ((stop-start) as double)/1e9);
        s.prettyPrintResult();
    }
}
