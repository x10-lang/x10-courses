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
import x10.matrix.DenseMatrix;
import x10.matrix.blas.DenseMultBLAS;

import x10.matrix.sparse.SparseCSC;
import x10.matrix.sparse.SparseCSR;
import x10.matrix.sparse.SparseMultSparseToDense;
import x10.matrix.sparse.SparseMultDenseToDense;
import x10.matrix.sparse.DenseMultSparseToDense;

/**
   <p>

   <p>
 */
public class TestSparseTrans{

    public static def main(args:Array[String](1)) {
		val testcase = new SparseTrans(args);
		testcase.run();
	}
}

class SparseTrans {
	public val density:Double;
	public val M:Int;
	public val N:Int;
	public val K:Int;

    public def this(args:Array[String](1)) {
		M = args.size > 0 ?Int.parse(args(0)):50;
		density = args.size > 1 ?Double.parse(args(1)):0.5;
		N = args.size > 2 ?Int.parse(args(2)):M+1;
		K = args.size > 3 ?Int.parse(args(3)):M+2;	
	}
	
	public def run(): void {
		var ret:Boolean = true;

 		// Set the matrix function
		ret &= (testMultCtC());
		ret &= (testMultCtR());
		ret &= (testMultCtD());
		ret &= (testMultCDt());
		//
		ret &= (testMultRtC());
		ret &= (testMultRtR());
		ret &= (testMultRtD());
		ret &= (testMultRDt());

		ret &= (testToDenseCDt());
		ret &= (testToDenseDtC());

		if (ret)
			Console.OUT.println("Sparse matrix Multiply-transpose test passed!\n");
		else
			Console.OUT.println("------------------Sparse matrix multiply-transpose test failed!------------------\n");
	}

	//---------------------------------------------------------
	// Test transpose, CSC <-
	public def testMultCtC():Boolean {
		Console.OUT.println("Test CSC^T * CSC -> Dense");
		val a = SparseCSC.make(K, M, density);
		val b = SparseCSC.make(K, N, density);
		a.initRandom(density); b.initRandom(density);

		//val c = DenseMatrix.make(M,N);
		//SparseMultSparseToDense.compTransMult(a, b, c, false); //a.T() * b;
		val c = SparseMultSparseToDense.compTransMult(a, b); //a.T() * b;
		//c.printSparse("Sparse aT*b=\n");
		val da= a.toDense();
		val db= b.toDense();
		val dc:DenseMatrix(M,N)= DenseMultBLAS.compTransMult(da, db);
		//dc.print("Dense aT*b=\n");
		val ret = dc.equals(c);
		if (ret)
			Console.OUT.println("CSC^T * CSC test passed!\n");
		else
			Console.OUT.println("--------CSC^T * CSC test failed!--------\n");
		return ret;
	}
	//
	public def testMultCtR():Boolean {
		Console.OUT.println("Test CSC^T * CSR -> Dense");
		val a = SparseCSC.makeRand(K, M, density);
		val b = SparseCSR.makeRand(K, N, density);
		val c = DenseMatrix.make(M,N);
		SparseMultSparseToDense.compTransMult(a, b, c, false);//a.T() * b;
		//c.printSparse("Sparse a*b=\n");
		val da= a.toDense();
		//da.print("Dense a=\n");
		val db= b.toDense();
		//db.print("Dense b=\n");
		val dc:DenseMatrix(M,N)= DenseMultBLAS.compTransMult(da, db);
		val ret = dc.equals(c);
		//dc.print("Dense a*b=\n");

		if (ret)
			Console.OUT.println("CSC^T * CSR test passed!\n");
		else
			Console.OUT.println("--------CSC^T * CSR test failed!--------\n");
		return ret;
	}

	public def testMultCtD():Boolean {
		Console.OUT.println("Test CSC.T() * Dense -> Dense");
		val a = SparseCSC.makeRand(K, M, density);
		val b = DenseMatrix.makeRand(K, N);
		val c = SparseMultDenseToDense.compTransMult(a, b);//a.T() * b;
		//c.printSparse("Sparse a*b=\n");
		val da= a.toDense();
		//da.print("Dense a=\n");
		val db= b;
		//db.print("Dense b=\n");
		val dc:DenseMatrix(M,N)= DenseMultBLAS.compTransMult(da, db);
		val ret = dc.equals(c);
		//dc.print("Dense a*b=\n");
		if (ret)
			Console.OUT.println("CSC^T * Dense test passed!\n");
		else
			Console.OUT.println("--------CSC^T * Dense test failed!--------\n");
		return ret;
	}

	public def testMultCDt():Boolean {
		Console.OUT.println("Test CSC * Dense^T -> Dense");
		val a = SparseCSC.makeRand(M, K, density);
		val b = DenseMatrix.makeRand(N, K);
		val c = SparseMultDenseToDense.compMultTrans(a, b);
		//c.printSparse("Sparse a*b=\n");
		val da= a.toDense();
		//da.print("Dense a=\n");
		val db= b;
		//db.print("Dense b=\n");
		val dc:DenseMatrix(M,N) = DenseMultBLAS.compMultTrans(da, db);
		//val dc= da * db.T();
		val ret = dc.equals(c);
		//dc.print("Dense a*b=\n");
		if (ret)
			Console.OUT.println("CSC * Dense^T test passed!\n");
		else
			Console.OUT.println("--------CSC * Dense^T test failed!--------\n");
		return ret;
	}


	//
	//-----------------------------------------------------------
	// CSR <-
	public def testMultRtC():Boolean {
		Console.OUT.println("Test CSR^T * CSC -> Dense");
		val a = SparseCSR.makeRand(K, M, density);
		val b = SparseCSC.makeRand(K, N, density);
		//val c = DenseMatrix.make(M,N);		
		//SparseMultSparseToDense.compTransMult(a, b, c, false);//a.T() * b;
		val c = SparseMultSparseToDense.compTransMult(a, b);
		//c.printSparse("Sparse aT*b=\n");
		val da= a.toDense();
		val db= b.toDense();
		val dc:DenseMatrix(M,N) = DenseMultBLAS.compTransMult(da, db);
		//val dc= da.T() * db;
		//dc.print("Dense aT*b=\n");
		val ret = dc.equals(c);
		if (ret)
			Console.OUT.println("CSR.T() * CSC test passed!\n");
		else
			Console.OUT.println("--------CSR.T() * CSC test failed!--------\n");
		return ret;
	}
	//
	public def testMultRtR():Boolean {
		Console.OUT.println("Test CSR^T * CSR -> Dense");
		val a = SparseCSR.makeRand(K, M, density);
		val b = SparseCSR.makeRand(K, N, density);
		val c = SparseMultSparseToDense.compTransMult(a, b);//a.T() * b;
		//c.printSparse("Sparse a*b=\n");
		val da= a.toDense();
		//da.print("Dense a=\n");
		val db= b.toDense();
		//db.print("Dense b=\n");
		val dc:DenseMatrix(M,N) = DenseMultBLAS.compTransMult(da, db);
		//val dc= da.T() * db;
		val ret = dc.equals(c);
		//dc.print("Dense a*b=\n");
		if (ret)
			Console.OUT.println("CSR^T * CSR test passed!\n");
		else
			Console.OUT.println("--------CSR^T * CSR test failed!--------\n");
		return ret;
	}

	public def testMultRtD():Boolean {
		Console.OUT.println("Test CSR^T * Dense -> Dense");
		val a = SparseCSR.makeRand(K, M, density);
		val b = DenseMatrix.makeRand(K, N);
		val c = DenseMatrix.make(M, N);
		SparseMultDenseToDense.compTransMult(a, b, c, false);//a.T() * b;
		//c.printSparse("Sparse a*b=\n");
		val da= a.toDense();
		//da.print("Dense a=\n");
		val db= b;
		//db.print("Dense b=\n");
		val dc:DenseMatrix(M,N) = DenseMultBLAS.compTransMult(da, db);
		//val dc= da.T() * db;
		val ret = dc.equals(c);
		//dc.print("Dense a*b=\n");
		if (ret)
			Console.OUT.println("CSR^T * Dense test passed!\n");
		else
			Console.OUT.println("--------CSR^T * Dense test failed!--------\n");
		return ret;
	}

	public def testMultRDt():Boolean {
		Console.OUT.println("Test CSR * Dense^T -> Dense");
		val a = SparseCSR.makeRand(M, K, density);
		val b = DenseMatrix.makeRand(N, K);
		val c = SparseMultDenseToDense.compMultTrans(a, b);
		//c.printSparse("Sparse a*b=\n");
		val da= a.toDense();
		//da.print("Dense a=\n");
		val db= b;
		//db.print("Dense b=\n");
		val dc:DenseMatrix(M,N)=DenseMultBLAS.compMultTrans(da, db);
		//val dc= da * db.T();
		val ret = dc.equals(c);
		//dc.print("Dense a*b=\n");
		if (ret)
			Console.OUT.println("CSC * Dense.T() test passed!\n");
		else
			Console.OUT.println("--------CSC * Dense.T() test failed!--------\n");
		return ret;
	}


	public def testToDenseCDt():Boolean {
		Console.OUT.println("Test CSC * Dense^T -> Dense");
		val a = SparseCSC.makeRand(M, K, density);
		val b = DenseMatrix.makeRand(N, K);
		val c = SparseMultDenseToDense.compMultTrans(a, b);
		//c.printSparse("Sparse a*b=\n");
		//db.print("Dense b=\n");
		val da = a.toDense();
		val dc:DenseMatrix(M,N) = DenseMultBLAS.compMultTrans(da, b);
		//val dc= da * b.T();
		val ret = dc.equals(c);
		//dc.print("Dense a*b=\n");
		if (ret)
			Console.OUT.println("CSC * Dense^T -> Dense test passed!\n");
		else
			Console.OUT.println("--------CSC * Dense^T -> Dense test failed!--------\n");
		return ret;
	}


	public def testToDenseDtC():Boolean {
		Console.OUT.println("Test Dense^T * CSC -> Dense");
		val a = DenseMatrix.makeRand(K, M);
		val b = SparseCSC.makeRand(K, N, density);
		//c.printSparse("Sparse a*b=\n");
		//db.print("Dense b=\n");
		val c = DenseMultSparseToDense.compTransMult(a, b);

		val db = b.toDense();
		val dc = DenseMultBLAS.compTransMult(a, db);
		//val dc= a.T() * db;

		val ret = dc.equals(c);
		//dc.print("Dense a*b=\n");
		if (ret)
			Console.OUT.println("Dense^T * CSC -> Dense test passed!\n");
		else
			Console.OUT.println("--------Dense^T * CSC -> Dense test failed!--------\n");
		return ret;
	}


}