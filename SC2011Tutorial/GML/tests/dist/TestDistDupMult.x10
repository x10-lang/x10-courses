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

import x10.matrix.Matrix;
import x10.matrix.DenseMatrix;
import x10.matrix.blas.DenseMultBLAS;
import x10.matrix.block.Grid;

import x10.matrix.dist.DistDenseMatrix;
import x10.matrix.dist.DistSparseMatrix;
import x10.matrix.dist.DupDenseMatrix;

import x10.matrix.dist.DistMultDupToDist;

/**
   This class contains test cases for dense matrix multiplication.
   <p>

   <p>
 */

public class TestDistDupMult{
    public static def main(args:Array[String](1)) {
		val testcase = new DDMult(args);
		testcase.run();
	}
}

class DDMult {

	public val nnz:Double;
	public val M:Int;
	public val N:Int;
	public val K:Int;

    public def this(args:Array[String](1)) {
		M = args.size > 0 ?Int.parse(args(0)):50;
		nnz = args.size > 1 ?Double.parse(args(1)):0.5;
		N = args.size > 2 ?Int.parse(args(2)):M+1;
		K = args.size > 3 ?Int.parse(args(3)):M+2;	

	}
	
	public def run(): void {
		var ret:Boolean = true;
 		// Set the matrix function
		ret &= (testDistS_DupD());

		if (ret)
			Console.OUT.println("Dist Dup multiplication Test passed!");
		else
			Console.OUT.println("--------Dist-Dup multiplication Test failed!--------");
	}
	//------------------------------------------------
	//------------------------------------------------
	public def testDistS_DupD():Boolean {
		val numP = Place.numPlaces();//Place.MAX_PLACES;
		Console.OUT.printf("\nTest Dist sparse mult Dup dense over %d places\n", numP);
		val gpartA = new Grid(M, K, numP, 1);
		val da = DistSparseMatrix.make(gpartA, nnz);
		da.initRandom(nnz);
		
		val db = DupDenseMatrix.makeRand(K, N);
		db.initRandom();

		val gpartC = new Grid(M, N, numP, 1);
		val dc = DistDenseMatrix.make(gpartC);

		DistMultDupToDist.comp(da, db, dc, false);
		
		val ma = da.toDense();
		val mb = db.getMatrix();
		val mc = DenseMatrix.make(ma.M, mb.N);
		DenseMultBLAS.comp(ma, mb, mc, false);

		val ret = dc.equals(mc);
		if (ret)
			Console.OUT.println("DistCSC-DupDense multplication test passed!");
		else
			Console.OUT.println("-----DistCSC-DupDense multplication test failed!-----");
		return ret;
	}
}
