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
 * This program is illustrating a high-level "ZPL style", where
 * the computation is expressed directly in terms of 
 * fine-grained computation on global arrays.<p>
 */
public class HeatTransfer_v1 {
    static val n = 3;
    static val epsilon = 1.0e-5;

    static val BigD = Dist.makeBlock(new Array[Region(1){self.rect}][0..n+1, 0..n+1], 0);
    static val D = BigD | (new Array[Region(1){self.rect}][1..n, 1..n] as Region);
    static val LastRow = new Array[Region(1){self.rect}][0..0, 1..n] as Region;
    static val A = DistArray.make[Double](BigD,(p:Point)=>{ LastRow.contains(p) ? 1.0 : 0.0 });
    static val Temp = DistArray.make[Double](BigD);

    static def stencil_1([x,y]:Point(2)): Double {
        return ((at(A.dist(x-1,y)) A(x-1,y)) + 
                (at(A.dist(x+1,y)) A(x+1,y)) + 
                (at(A.dist(x,y-1)) A(x,y-1)) + 
                (at(A.dist(x,y+1)) A(x,y+1))) / 4;
    }

    def run() {
        var delta:Double = 1.0;
        do {
            finish ateach (p in D) Temp(p) = stencil_1(p);

            delta = A.map(Temp, D.region, (x:Double,y:Double)=>Math.abs(x-y)).reduce(Math.max.(Double,Double), 0.0);

            finish ateach (p in D) A(p) = Temp(p);
        } while (delta > epsilon);
    }
 
   def prettyPrintResult() {
       for ([i] in A.region.projection(0)) {
           for ([j] in A.region.projection(1)) {
                val pt = Point.make(i,j);
                at (BigD(pt)) {
		    val tmp = A(pt);
                    at (Place.FIRST_PLACE) Console.OUT.printf("%1.4f ",tmp);
                }
            }
            Console.OUT.println();
        }
    }

   public static def main(Array[String]) {
       Console.OUT.println("HeatTransfer Tutorial example with n="+n+" and epsilon="+epsilon);
       Console.OUT.println("Initializing data structures");
       val s = new HeatTransfer_v1();
       Console.OUT.print("Beginning computation...");
       val start = System.nanoTime();
       s.run();
       val stop = System.nanoTime();
       Console.OUT.printf("...completed in %1.3f seconds.\n", ((stop-start) as double)/1e9);
       s.prettyPrintResult();
   }
}
