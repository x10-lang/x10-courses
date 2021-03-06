/*
 *  This file is part of the X10 project (http://x10-lang.org).
 *
 *  This file is licensed to You under the Eclipse Public License (EPL);
 *  You may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *      http://www.opensource.org/licenses/eclipse-1.0.php
 *
 *  (C) Copyright IBM Corporation 2006-2011.
 */

import x10.io.Console;
import x10.util.Timer;
//
import x10.matrix.Debug;
//
import x10.matrix.Matrix;
import x10.matrix.DenseMatrix;
//
//import x10.matrix.dist.DupDenseMatrix;
import x10.matrix.dist.DistDenseMatrix;
import x10.matrix.dist.DistSparseMatrix;

import pagerank.PageRank;
import pagerank.SeqPageRank;

/**
 * Page Rank demo
 * 
 */
public class RunPageRank {

	public static def main(args:Array[String](1)): void {
		
		val mG = args.size > 0 ? Int.parse(args(0)):10000; // Rows and columns of G
		val iT = args.size > 1 ? Int.parse(args(1)):20;//Iterations
		val vf = args.size > 2 ? Int.parse(args(2)):0; //Verify result or not
		val nP = args.size > 3 ? Int.parse(args(3)):1; //column of P
		val nZ = args.size > 4 ? Double.parse(args(4)):0.001; //G's nonzero density
		val pP = args.size > 5 ? Int.parse(args(5)):0; //Print out input and output matrices

		Console.OUT.println("Set row/col G:"+mG+" density:"+nZ+" iteration:"+iT);
		if (mG<=0 || iT<1 || nP<1 || nZ<0.0)
			Console.OUT.println("Error in settings");
		else {
			val paraPR = new PageRank(mG, nP, nZ, iT);
			paraPR.init();
			//paraPR.G.printMatrix("Input G sparse matrix");

			paraPR.printInfo();

			val orgP = paraPR.P.local().clone(); //for verification purpose

			val paraP = paraPR.run();
			
			if (pP > 0) {
				paraPR.G.printMatrix("Input G sparse matrix");
				paraP.print("Output matrix P");
			}
			
			if (vf > 0){
				val g = paraPR.G;
				val seqPR = new SeqPageRank(g.toDense(), orgP,
						paraPR.E, paraPR.U, iT, nZ);
				val seqP = seqPR.run();
				if (paraP.equals(seqP as Matrix{self.M==paraP.M, self.N==paraP.N})) 
					Console.OUT.println("Result reverified");
				else
					Console.OUT.println("Verification failed!!!!");
			}
		}
	}
}

