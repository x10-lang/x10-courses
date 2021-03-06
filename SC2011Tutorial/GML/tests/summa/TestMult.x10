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
import x10.compiler.Ifdef;
import x10.compiler.Ifndef;

import x10.matrix.Matrix;
import x10.matrix.Debug;
import x10.matrix.DenseMatrix;
import x10.matrix.blas.DenseMultBLAS;
import x10.matrix.block.Grid;

import x10.matrix.dist.DistDenseMatrix;
import x10.matrix.dist.DistSparseMatrix;
import x10.matrix.dist.DupDenseMatrix;

import x10.matrix.dist.summa.mpi.SummaMPI; 
import x10.matrix.dist.summa.SummaDense;

/**
   This class contains test cases for dense matrix multiplication.
   <p>

   <p>
 */

public class TestMult{
    public static def main(args:Array[String](1)) {
		val testcase = new SummaMultTest(args);
		testcase.run();
	}
}

class SummaMultTest {

	public val M:Int;
	public val N:Int;
	public val K:Int;

	public val pA:Grid;
	public val pB:Grid;
	public val pC:Grid;
	
    public def this(args:Array[String](1)) {
		M = args.size > 0 ?Int.parse(args(0)):21;
		N = args.size > 1 ?Int.parse(args(1)):23;
		K = args.size > 2 ?Int.parse(args(2)):25;	
		
		val numP = Place.numPlaces();//Place.MAX_PLACES;
		Console.OUT.printf("\nTest SUMMA dist dense matrix over %d places\n", numP);
		pA = Grid.make(M, K);
		pB = Grid.make(K, N);
		pC = Grid.make(M, N);
	}
	
	public def run(): void {
		var ret:Boolean = true;
 		// Set the matrix function
		@Ifdef("MPI_COMMU") {		
			ret &= (testMPI());
			ret &= (testMultTransMPI());
		}
		
		ret &= (testDenseMult());
		ret &= (testDenseMultTrans());
		
		if (ret)
			Console.OUT.println("SUMMA distributed dense matrix multiply test passed!");
		else
			Console.OUT.println("--------SUMMA distributed dense matrix multiply test failed!--------");
	}
	//------------------------------------------------
	//------------------------------------------------
	//This method only works for native C++ and MPI transport
	public def testMPI():Boolean {
		val numP = Place.numPlaces();//Place.MAX_PLACES;
		Console.OUT.printf("\nTest C-SUMMA dist dense matrix MPI over %d places\n", numP);
		Debug.flushln("Start allocating memory space for matrix A");
		val da = DistDenseMatrix.make(pA);
		Debug.flushln("Start initializing matrix A");
		da.initRandom();
		Debug.flushln("Start allocating memory space for matrix B");
		val db = DistDenseMatrix.make(pB);
		Debug.flushln("Start initializing matrix B");
		db.initRandom();

		val dc = DistDenseMatrix.make(pC);

		Debug.flushln("Start calling C-MPI SUMMA routine");
		SummaMPI.mult(1, 0.0, da, db, dc);
		Debug.flushln("SUMMA done");
		
		val ma = da.toDense();
		val mb = db.toDense();
		val mc = DenseMatrix.make(ma.M, mb.N);
		
		Debug.flushln("Start sequential dense matrix multiply");
		DenseMultBLAS.comp(ma, mb, mc, false);
		Debug.flushln("Done sequential dense matrix multiply");

		val ret = dc.equals(mc as Matrix(dc.M, dc.N));
		if (ret)
			Console.OUT.println("SUMMA C-MPI distributed dense matrix multplication test passed!");
		else
			Console.OUT.println("-----SUMMA C-MPI distributed dense matrix multplication test failed!-----");
		return ret;
	}
	//-------------------------------------------------------
	//This method only works for native C++ and MPI transport
	public def testMultTransMPI():Boolean {
		val numP = Place.numPlaces();//Place.MAX_PLACES;
		Console.OUT.printf("\nTest SUMMA C-MPI dist dense matrix multTrans MPI over %d places\n", numP);
		Debug.flushln("Start allocating memory space for matrix A");
		val da = DistDenseMatrix.make(M, K);
		Debug.flushln("Start initializing matrix A");
		da.initRandom();
		//da.printMatrix("Input A");
		
		Debug.flushln("Start allocating memory space for matrix B");
		val db = DistDenseMatrix.make(N, K);
		Debug.flushln("Start initializing matrix B");
		db.initRandom();
		//db.printMatrix("Input B");
		
		val dc = DistDenseMatrix.make(M, N);

		Debug.flushln("Start calling C-MPI SUMMA multTrans routine");
		SummaMPI.multTrans(1, 0.0, da, db, dc);
		Debug.flushln("SUMMA done");
		//dc.printMatrix("Summa multTrans result:");
		
		val ma = da.toDense();
		val mb = db.toDense();
		val mc = DenseMatrix.make(ma.M, mb.M);
		
		Debug.flushln("Start sequential dense matrix multTrans");
		DenseMultBLAS.compMultTrans(ma, mb, mc, false);
		Debug.flushln("Done sequential dense matrix multTrans");

		val ret = dc.equals(mc as Matrix(dc.M, dc.N));
		if (ret)
			Console.OUT.println("SUMMA C-MPI distributed dense matrix multTrans test passed!");
		else
			Console.OUT.println("-----SUMMA C-MPI distributed dense matrix multTrans test failed!-----");
		return ret;
	}	
	
	//------------------------------------------------
	public def testDenseMult():Boolean {
		val numP = Place.numPlaces();//Place.MAX_PLACES;
		Console.OUT.printf("\nTest SUMMA dist dense matrix over %d places\n", numP);
		Debug.flushln("Start allocating memory space for matrix A");
		val da = DistDenseMatrix.make(pA);
		Debug.flushln("Start initializing matrix A");
		da.initRandom();
		//da.printMatrix("Input A");

		Debug.flushln("Start allocating memory space for matrix B");
		val db = DistDenseMatrix.make(pB);
		Debug.flushln("Start initializing matrix B");
		db.initRandom();
		//db.printMatrix("Input B");

		val dc = DistDenseMatrix.make(pC);

		Debug.flushln("Start calling SUMMA Dense X10 routine");
		SummaDense.mult(1, 0.0, da, db, dc);
		Debug.flushln("SUMMA done");
		
		val ma = da.toDense();
		val mb = db.toDense();
		val mc = DenseMatrix.make(ma.M, mb.N);
		
		Debug.flushln("Start sequential dense matrix multiply");
		DenseMultBLAS.comp(ma, mb, mc, false);
		Debug.flushln("Done sequential dense matrix multiply");

		val ret = dc.equals(mc as Matrix(dc.M, dc.N));
		if (ret)
			Console.OUT.println("SUMMA x10 distributed dense matrix multplication test passed!");
		else
			Console.OUT.println("-----SUMMA x10 distributed dense matrix multplication test failed!-----");
		return ret;
	}
	//--------------------------------------------------------------------------------

	public def testDenseMultTrans():Boolean {
		val numP = Place.numPlaces();//Place.MAX_PLACES;
		Console.OUT.printf("\nTest SUMMA dist dense matrix multTrans over %d places\n", numP);
		Debug.flushln("Start allocating memory space for matrix A");
		val da = DistDenseMatrix.make(M, K);
		Debug.flushln("Start initializing matrix A "+
						da.grid.numRowBlocks+" "+da.grid.numColBlocks);
		da.initRandom();
		//da.printMatrix("Input A");
		Debug.flushln("Start allocating memory space for matrix B");
		val db = DistDenseMatrix.make(N, K);
		Debug.flushln("Start initializing matrix B "+
						db.grid.numRowBlocks+" "+db.grid.numColBlocks );
		db.initRandom();
		//db.printMatrix("Input B");
				
		val dc = DistDenseMatrix.make(M, N);

		Debug.flushln("Start calling SUMMA Dense multTrans X10 routine");
		SummaDense.multTrans(1, 0.0, da, db, dc);
		Debug.flushln("SUMMA done");
		//dc.printMatrix("Summa result");
	
		val ma = da.toDense();
		val mb = db.toDense();
		val mc = DenseMatrix.make(ma.M, mb.M);
		
		Debug.flushln("Start sequential dense matrix multTrans");
		DenseMultBLAS.compMultTrans(ma, mb, mc, false);
		Debug.flushln("Done sequential dense matrix multTrans");
		//mc.print("Sequential result");
		
		val ret = dc.equals(mc as Matrix(dc.M, dc.N));
		if (ret)
			Console.OUT.println("SUMMA x10 distributed dense matrix multTrans test passed!");
		else
			Console.OUT.println("-----SUMMA x10 distributed dense matrix multTrans test failed!-----");
		return ret;
	}
}
