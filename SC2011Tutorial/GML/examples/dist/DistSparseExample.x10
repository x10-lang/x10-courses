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

import x10.matrix.Debug;
import x10.matrix.block.Grid;
import x10.matrix.block.SparseBlockMatrix;

import x10.matrix.dist.DistDenseMatrix;
import x10.matrix.dist.DistSparseMatrix;

/**
 * Examples of cell-wise operations and matrix multiplication on distributed sparse matrix.
 */
public class DistSparseExample {
	
	public static def main(args:Array[String](1)) {
		val m = args.size > 0 ?Int.parse(args(0)):100;
		val n = args.size > 1 ?Int.parse(args(1)):m+1;
		val k = args.size > 2 ?Int.parse(args(2)):m+2;	    	
		val p = args.size > 3 ?Double.parse(args(3)):0.5;
		
		val testcase = new RunDistSparse(m,n,k,p);
		testcase.run();
	}
	
	static class RunDistSparse(M:Int, N:Int, K:Int, nzp:Double) {
		public val g:Grid;
		public val grow:Grid;
		
		public def this(m:Int, n:Int, k:Int, p:Double) {
			property(m, n, k, p);

			//Partition matrix in MxN into blocks same as the number of places
			//The partitioning grid is to be spared or close to square partitioning 
			g   = Grid.make(M,N); 
			
			//Partition matrix in MxN into 1 row blocks
			grow= Grid.make(M, N, 1, Place.MAX_PLACES);  
		}
 

		public def run():Boolean {

			var ret:Boolean= true;
			ret &= testClone();
			ret &= testCopy();
			ret &= testGather();

			return ret;
		}
		public def testClone():Boolean {
			var ret:Boolean;
			val m1  = DistSparseMatrix.make(g, nzp);
			m1.initRandom();

			val m2 = m1.clone();
		
			ret = m1.equals(m2);
			if (ret)
				Console.OUT.println("Test dist sparse matrix clone passed");
			else
				Console.OUT.println("--------------Test dist sparse matrix clone failed!--------------");
			return ret;
		}

		public def testCopy():Boolean {
			var ret:Boolean;
			val ds  = DistSparseMatrix.make(g, nzp);
			ds.initRandom();

			val dd  = DistDenseMatrix.make(g);

			ds.copyTo(dd); //Copy distributed sparse matrix into a distributed dense matrix of the dsame block distribution

			ret = ds.equals(dd);
			  
			if (ret)
				Console.OUT.println("Test dist sparse matrix copy to passed");
			else
				Console.OUT.println("--------------Test dist sparse matrix copy to failed!--------------");
			return ret;
		}

		public def testGather():Boolean {
			var ret:Boolean;
			
			val ds  = DistSparseMatrix.make(g, nzp);
			val sbm  = SparseBlockMatrix.make(g, nzp);
			ds.initRandom();

			ds.copyTo(sbm); //Copy all dist blcoks into block matrix at here using gather collective communication
			
			ret = ds.equals(sbm);
			  
			if (ret)
				Console.OUT.println("Test dist sparse matrix copy to passed");
			else
				Console.OUT.println("--------------Test dist sparse matrix copy to failed!--------------");
			return ret;
		}
	}
}