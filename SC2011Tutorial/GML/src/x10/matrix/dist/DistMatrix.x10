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

package x10.matrix.dist;

import x10.io.Console;
import x10.util.Random;

import x10.matrix.Debug;
import x10.matrix.Matrix;
import x10.matrix.DenseMatrix;
import x10.matrix.VerifyTools;

import x10.matrix.sparse.SparseCSC;

import x10.matrix.block.Grid;
import x10.matrix.block.MatrixBlock;
import x10.matrix.block.BlockMatrix;
import x10.matrix.block.DenseBlock;
import x10.matrix.block.SparseBlock;


public type DistMatrix(M:Int, N:Int)=DistMatrix{self.M==M, self.N==N};   
public type DistMatrix(M:Int)=DistMatrix{self.M==M}; 
public type DistMatrix(C:DistMatrix)=DistMatrix{self==C}; 
public type DistMatrix(g:Grid)=DistMatrix{self.grid==g}; 

/**
 * This class provides an abstraction for distributed matrix blocks, which
 * can be either dense or sparse matrix blocks.
 * 
 */
public class DistMatrix(grid:Grid){grid.M==M,grid.N==N} extends Matrix{

	public val dist:Dist(1);
	public val distBs:DistArray[MatrixBlock](1);

	//============================================================
	/**
	 * Construct a distributed matrix based on specified partitioning and distributed
	 * array of blocks in all places
	 * 
	 * @param  grid      Grid partitioning instance.
	 * @param  dbs       distributed array of matrix block
	 */
	public def this(g:Grid, dbs:DistArray[MatrixBlock](1)):DistMatrix(g.M,g.N) {
		super(g.M, g.N);
		property(g);
		dist   = dbs.dist;
		distBs = dbs;
		//Debug.assure(dbs.dist.region.size() == g.size, 
		//			 "Partition block number and distribution region's size not match");
	}
	//-----------------
	/**
	 * Construct distributed matrix without data memory allocation.
	 *
	 * @param  g      matrix partitioning
	 * @param  d      partition block distribution. 
	 */
    public def this(g:Grid, d:Dist(1)):DistMatrix(g.M,g.N) {
		super(g.M, g.N);
		property(g);
		dist   = d;
		distBs = DistArray.make[MatrixBlock](d);
		//Debug.assure(d.region.size() == g.size, 
		//			 "Partition block number and distribution region's size not match");		
	}

	/**
	 * Construct distributed block matrix using specified partitioning.
	 * Partitioned blocks are uniquely distributed among
	 * all places.  Because there is no block type specified,
	 * no memory space is allocated for matrix data.
	 *
	 * @param  g      matrix partitioning. How matrix is partitioned in a grid
	 */
    public def this(g:Grid){
		super(g.M, g.N);
		property(g);
		dist   = Dist.makeUnique();
		distBs = DistArray.make[MatrixBlock](dist);
		//Debug.assure(g.size==Place.MAX_PLACES, 
		//			 "Partition blocks cannot have unique distribution among all places");
	}

	//==============================================================
	// Distributed matrix maker
	//==============================================================

	/** 
	 * Make a distributed block matrix based on specified partitioning.
	 * All blocks are instances of dense matrix block.
	 *
	 * @param  gp      Matrix partitioning
	 */	
	public static def makeDense(gp:Grid) : DistMatrix(gp.M, gp.N) {
		val ddm = new DistMatrix(gp);
		ddm.allocDenseBlocks();
		return ddm;
	}

	/** 
	 * Make a distributed matrix based on given dimension.
	 * All blocks are instances of dense matrix block
	 *
	 * @param  m      number of rows
	 * @param  n      number of columns
	 */	
	public static def makeDense(m:Int, n:Int) : DistMatrix(m, n) {
		val g =  Grid.make(m, n, Place.MAX_PLACES);
		return makeDense(g);
	}

	/** 
	 * Make a distributed block matrix based on specified partitioning and sparsity.
	 * All blocks are instances of sparse matrix block and each block is
	 * created with the same sparsity.
	 *
	 * @param  gp      Matrix partitioning
	 * @param  nzd     nonzero sparsity of each block
	 */	
	public static def makeSparse(gp:Grid, nzd:Double) : DistMatrix(gp.M, gp.N) {
		val ddm = new DistMatrix(gp);
		ddm.allocSparseBlocks(nzd);
		return ddm;
	}

	/** 
	 * Make a distributed block matrix based on specified dimension and sparsity.
	 * All blocks are instances of sparse matrix block, and each block is
	 * created with the same sparsity.
	 *
	 * @param  m      number of rows
	 * @param  n      number of columns
	 * @param  nzd      nonzero sparsity	of each block
	 * @return
	 */	
	public static def makeSparse(m:Int, n:Int, nzd:Double) : DistMatrix(m, n) {
		val g =  Grid.make(m, n, Place.MAX_PLACES);
		return makeSparse(g, nzd);
	}

	//==============================================

	/**
	 * Allocate dense blocks in the distributed block array
	 *
	 */
	public def allocDenseBlocks():void {
		finish for([p] :Point in this.dist) {
			val rid = this.grid.getRowBlockId(p);
			val cid = this.grid.getColBlockId(p);
			async at (this.dist(p)) {
				this.distBs(p) = DenseBlock.make(this.grid, rid, cid);
			}
		}
	}

	/**
	 * Allocate sparse blocks in the distributed block array
	 *
	 * @param  nzd      Nonzero sparsity of each block
	 */
	public def allocSparseBlocks(nzd:Double):void {
		finish for([p] :Point in this.dist) {
			val rid = this.grid.getRowBlockId(p);
			val cid = this.grid.getColBlockId(p);
			async at (this.dist(p)) {
				this.distBs(p) = SparseBlock.make(this.grid, rid, cid, nzd);
			}
		}
	}
	//--------------------
	/**
	 * Initial matrix data with a constant value. The matrix blocks must be created
	 * as either dense blocks or sparse blocks.
	 *
	 */	
	public def init(ival:Double) : void {
		finish ateach(val [p] :Point in this.dist) {
			distBs(p).init(ival);
		}
	}
	
	/**
	 * Initial matrix data with random values. The blocks must be created. 
	 *
	 */	
	public def initRandom() : void {
		finish ateach([p] :Point in this.dist) {
			distBs(p).initRandom();
		}
	}

	//----------------------
	// Data allocation
	//----------------------
	/**
	 * Allocate memory space for a distributed matrix.
	 */	
	public def alloc(m:Int, n:Int):DistMatrix(m,n) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Make a copy of myself, including all distributed blocks.
	 *
	 */	
	public def clone():DistMatrix(M,N) {
		//==========================================
		// The following declaration will cause runtime null exception
		// when accessing nm.distBs(p) at place p. 
		//
		// nm = new DistMatrix(this.grid, this.dist);
		// 
		// Cause is unknown. No Jira report is filed, because the is problem
		// cannot be reproduced out of DistMatrix.
		//==========================================
		// Workaround: create DistArray explicilty.
		val dBs = DistArray.make[MatrixBlock](this.dist);
		
		finish ateach(val [p] :Point in this.distBs.dist) {
			val matblk:MatrixBlock = this.distBs(here.id());
			dBs(p)=matblk.clone();
			//val matblk:MatrixBlock = this.distBs(here.id()).clone();
			//Debug.flushln("Clone matrix block id:"+p+" type:"+dBs(p).typeName());
			//dBs(p).getMatrix().printMatrix("this is clone matrix block at "+p);
		}
		
		val nm = new DistMatrix(this.grid, dBs);
		return nm;
	}

	/**
	 * Convert distributed block matrix to dist dense matrix 
	 * in all places
	 *
	 * @param   ddden   the target dense block matrix.
	 */
	public def copyTo(dden:DistDenseMatrix{self.grid==this.grid}):void {
		finish ateach(val [p] :Point in this.dist) {
			val src = local();
			val dst = dden.local();
			src.copyTo(dst as DenseMatrix(src.M, src.N));
		}
	}

	/**
	 * Copy data from distributed block matrix to dist matrix 
	 * in all places
	 *
	 * @param   dmat   the target block matrix.
	 */
	public def copyTo(dmat:DistMatrix{self.grid==this.grid}):void {
		//Debug.flushln("Starting make copy");
		finish for(val [p] :Point in this.dist) {
			val pid = here.id();
			//Debug.flushln("access a block matrix block "+pid);
			val srcblk:MatrixBlock = this.distBs(here.id());
			val srcmat:Matrix = srcblk.getMatrix();
			val dstden:DenseMatrix = dmat.local() as DenseMatrix;
			//Debug.flushln("Make a copy matrix block ");
			srcmat.copyTo(dstden);
			//src.copyTo(dst as DenseMatrix(src.M, src.N));
		}
	}

	/**
	 * Copy data from distributed block matrix of all places to dense matrix 
	 * at here. Additional memory space is used to store dense blocks at here.
	 *
	 * @param  denmat   the target dense matrix.
	 */
	public def copyTo(denmat:DenseMatrix(M,N)):void {
		Debug.exit("Not implemented. Gather communication is not available for MatrixBlock");
	}

	//================================================================
	// Data access methods 
	//================================================================	

	/**
	 * Return matrix at coordinate (r, c);
	 *
	 * @param  x  the x coordination in grid partition
	 * @param  y  the y coordination in grid partition
	 * @return the instance dense matrix at its place.
	 */
	 public def getMatrix(x:Int, y:Int) = 
		 distBs(grid.getBlockId(x,y)).getMatrix();

	/**
	 * Return matrix at here
	 *
	 * @return the instance of block matrix at here
	 */
	 public def local() :Matrix = distBs(here.id()).getMatrix();

	 protected def getMatrix(i:Int) : Matrix =	distBs(i).getMatrix();

	 //------------
	 //Matrix data access
	 //------------
	 /**
	  * return value at (r, c) of the matrix block
	  *
	  * @param  r  the r-th row of the matrix
	  * @param  c  the c-th column of the matrix
	  * @return value of matrix at (r, c)
	  */
	 public operator this(r:Int, c:Int):Double {
		val loc = grid.find(r, c);
		val bid = grid.getBlockId(loc(0), loc(1));
		val dv = at (this.distBs.dist(bid)) this.distBs(bid)(loc(2), loc(3));
		return dv;
	 }


	 /**
	  * Set value at (x, y) of the matrix
	  *
	  * @param  r  the r-th row of the matrix
	  * @param  c  the c-th column of the matrix
	  * @param  v  the value
	  */
	 public  operator this(x:Int,y:Int)=(v:Double) {
		 val loc = grid.find(x, y);
		 val bid = grid.getBlockId(loc(0), loc(1));
		 at (distBs.dist(bid)) getMatrix(bid)(loc(2), loc(3))=v;
	 }


	 /**
	  * Reset the whole matrix
	  */
	 public  def reset():void {
		 finish ateach (val [p]:Point in this.distBs) {
			 getMatrix(p).reset();
		 }
	 } 

	 /**
	  * Check matrix is DistDenseMatrix object or not
	  */
	 public def likeMe(A:Matrix):Boolean =
	     ((A instanceof DistMatrix) &&
		  ((A as DistMatrix).grid.equals(this.grid)) &&
		  ((A as DistMatrix).dist.equals(dist)));
	

	 //====================================================================
	 // Cellwise operation, override Matrix methods
	 //====================================================================
	 /**
	  * Multiply each elements in matrix by times of a
	  *
	  */	
 	 public def scale(a:Double) {
		 finish ateach(val [p] :Point in this.dist) {
			 local().scale(a);
		 }
		 return this;
	 }
	 
	 //-----------------------------
	 // Cellwise addition
	 //-----------------------------

	 /**
	  * Cellwise addition. Inpute A must be a DistMatrix instance
	  */
	 public def cellAdd(A:Matrix(M,N)) {
		 if (! likeMe(A))
			 throw new UnsupportedOperationException("Not implemented");
		 return cellAdd(A as DistMatrix(M,N));
	}

	/**
	 * this += A 
	 *
	 */	
	 public def cellAdd(A:DistMatrix(M,N)) {
		 if (! this.grid.equals(A.grid))
			 Debug.exit("Partitioning grid not compatible");

		 finish ateach(val [p] :Point in this.dist) {
			 val m = local();
			 m.cellAdd(A.local() as Matrix(m.M,m.N));
		 }
		 return this;
	 }


	 protected def cellAddTo(dst:DenseMatrix(M,N)) {
		 Debug.exit("Not implemented");
		 return dst;
	 }

	 /**
	  * dst = this + dst
	  */
	 public def cellAddTo(dst:DistMatrix(M,N)) {

		 finish ateach(val [p] :Point in this.dist) {
			 val m = local();
			 m.cellAddTo(dst.local() as DenseMatrix(m.M,m.N));
		 }
		 return dst;
	 }

	 //-----------------------------
	 // Cellwise subtraction
	 //-----------------------------

	 /**
	  * Cellwise subtraction. Inpute A must be a DistMatrix instance
	  */
	 public def cellSub(A:Matrix(M,N))  {
		 if (! likeMe(A))
			 throw new UnsupportedOperationException("Not implemented");
		 return cellSub(A as DistMatrix(M,N));
	 }

	 /**
	  * this -= A
	  */	
	 public def cellSub(A:DistMatrix(M,N)) {
		if (! this.grid.equals(A.grid))
			Debug.exit("Partitioning grid not compatible");
		finish ateach(val [p] :Point in this.dist) {
			val m=this.local();
			m.cellSub(A.getMatrix(p) as Matrix(m.M,m.N));
		}
		return this;
	 }

	 /**
	  * dst = dst - this
	  */
	 protected def cellSubFrom(dst:DenseMatrix(M,N)) {
		 Debug.exit("Not implemented");
		 return dst;
	 }

	 /**
	  * dst = dst - this
	  */
	 public def cellSubFrom(dst:DistMatrix(M,N)) {

		 finish ateach(val [p] :Point in this.dist) {
			 val m = local();
			 m.cellSubFrom(dst.local() as DenseMatrix(m.M,m.N));
		 }
		 return dst;
	 }

	 //-----------------------------
	 // Cellwise multiplication
	 //-----------------------------
	 /**
	  * Cellwise multiplication. A must be a DistMatrix instance
	  */
	 public def cellMult(A:Matrix(M,N))  {
		 if (! likeMe(A))
			 throw new UnsupportedOperationException("Not implemented");
		 return cellMult(A as DistMatrix(M,N));
	 }

	 /**
	  * Cellwise multiply
	  */	
	 public def cellMult(A:DistMatrix(M,N)) {
		 if (! this.grid.equals(A.grid)) 
			 Debug.exit("Partitioning grid not compatible");
		 
		 finish ateach(val [p] :Point in this.dist) {
			 val m = local();
			 m.cellMult(A.local() as Matrix(m.M, m.N));
		 }
		 return this;
	 } 

	 protected def cellMultTo(dst:DenseMatrix(M,N)) {
		 Debug.exit("Not implemented");
		 return dst;
	 }

	 /**
	  * Compute dst = dst &#42 this
	  */
	 public def cellMultTo(dst:DistMatrix(M,N)) {

		 finish ateach(val [p] :Point in this.dist) {
			 val m = local();
			 m.cellMultTo(dst.local() as DenseMatrix(m.M,m.N));
		 }
		 return dst;
	 }

	 //-----------------------------
	 // Cellwise division
	 //-----------------------------
	 /**
	  * Cellwise division. A must be a DistMatrix instance
	  */
	 public def cellDiv(A:Matrix(M,N)) {
		 if (! likeMe(A))
			 throw new UnsupportedOperationException("Not implemented");
		 return cellDiv(A as DistMatrix(M,N));
	 }

	 /**
	  * Cellwise division this /= A.
	  *
	  */	
	 public def cellDiv(A:DistMatrix(M,N)) {
		 if (! this.grid.equals(A.grid)) 
			 Debug.exit("Partitioning grid not compatible");
		 finish ateach(val [p] :Point in this.dist) {
			 val m = getMatrix(p);
			 m.cellDiv(A.getMatrix(p) as Matrix(m.M,m.N));
		 }
		 return this;
	 }
	 
	 protected def cellDivBy(dst:DenseMatrix(M,N)) {
		 Debug.exit("Not implemented");
		 return dst;
	 }

	 /**
	  * dst = this / dst
	  */
	 public def cellDivBy(dst:DistMatrix(M,N)) {

		 finish ateach(val [p] :Point in this.dist) {
			 val m = local();
			 m.cellDivBy(dst.local() as DenseMatrix(m.M,m.N));
		 }
		 return dst;
	 }
	
	//-------------------------------------------------------------------
	// Matrix multiplication
	//-------------------------------------------------------------------

    /**
     * Not implemented. 
	 * This method is designed to perform matrix multiplication, 
	 * returning this +=A &#42 B if plus is true, else
	 * this  = A &#42 B
     */
	public def mult(A:Matrix(M), B:Matrix(A.N,N), plus:Boolean):Matrix(this){
		if ((! likeMe(A)) || (! likeMe(B)))
			Debug.exit("Not available. Implementation depends on SUMMA");
		throw new UnsupportedOperationException("Not supported");
	}

	/**
	 * Not implemented.
	 */
	public def transMult(
			A:Matrix{self.N==this.M},
			B:Matrix(A.M,this.N),
			plus:Boolean): DistMatrix(this) {
		
		if ((! likeMe(A)) || (! likeMe(B)))
			Debug.exit("Not available. Implementation depends on SUMMA");
		throw new UnsupportedOperationException("Not supported");
    }
	
	/**
	 * Not implemented.
	 */
	public def multTrans(A:Matrix(M), 
			B:Matrix{A.N==self.N,self.M==this.N}, 
			plus:Boolean):DistMatrix(this){ 
        if ((! likeMe(A)) || (! likeMe(B)))
			Debug.exit("Not available. Implementation depends on SUMMA");
		throw new UnsupportedOperationException("Not supported");
    } 	

	//====================================================================
	// Operator overloading
	//====================================================================
	
//     /**
//      * Cell-wise addition, return this+that in a new matrix object
//      */
//     public operator this + (that:DistMatrix(M,N)):Matrix(M,N) {
//         val dst = DistMatrix.makeDense(this.grid);
// 		this.copyTo(dst as DistMatrix(this.grid));
//         that.cellAddTo(dst);
//         return dst;
//     }
//     /**
//      * Cell-wise subtraction, return this - that in a new matrix object
//      */
//     public operator this - (that:DistMatrix(M,N)):Matrix(M,N) {
//         val dst = DistMatrix.makeDense(this.grid);
// 		that.copyTo(dst as DistMatrix(grid));
//         this.cellSubFrom(dst);
//         return dst;
//     }
// 
//     /**
//      * Cell-wise multiplication, return this &#42 that in a new matrix object
//      */
//     public operator this * (that:DistMatrix(M,N)):Matrix(M,N) {
//         val dst = DistMatrix.makeDense(this.grid);
// 		this.copyTo(dst as DistMatrix(this.grid));
//         that.cellMultTo(dst as DistMatrix(grid));
//         return dst;
//     }
// 
//     /**
//      * Cell-wise division, return this / that in a new matrix object
//      */
//     public operator this / (that:DistMatrix(M,N)):Matrix(M,N) {
//         val dst = DistMatrix.makeDense(that.grid);
// 		that.copyTo(dst as DistMatrix(that.grid));
//         this.cellDivBy(dst);
//         return dst;
//     }
    	

	//====================================================================
	// Utils
	//====================================================================
	/**
	 * Copy elements to dense matrix at here one by one. 
	 *
	 * @param   
	 * @return
	 */	
	public def toDense():DenseMatrix(M,N) {
		val dm = DenseMatrix.make(this.M, this.N);
		for (var c:Int =0; c<this.N; c++)
			for (var r:Int=0; r<this.M; r++)
			    dm(r,c)=this(r,c);
		return dm;
	}

	//==================================================================
	//public def testDist(that:DistMatrix):Boolean {
	//	return this.grid.testEqual(that.grid);
	//}
	//==================================================================
	public def toString() :String {
		var output:String = "-------- Dist Matrix size:["+M+"x"+N+"] ---------\n";
		
		for (val [p]:Point in this.distBs.dist) {
			output += "At place " + p +": ";
			val strbuf:String = at (distBs.dist(p)) { 
				val blk:MatrixBlock=this.distBs(p);
				val denblk = blk as DenseBlock;
				val mat:DenseMatrix=denblk.getMatrix(); 
				mat.toString()
			};
			output += strbuf;
			//output += this.getMatrix(p).toString();
		}
		output += "--------------------------------------------------\n";
		return output;
	}
	//
	public def printBlock() { printBlock(""); }
	public def printBlock(msg:String) {
		Console.OUT.print(msg);
		Console.OUT.print(this.toString());
		Console.OUT.flush();
	}
	//
	public def debugPrintBlock() { debugPrintBlock("");}
	public def debugPrintBlock(msg:String) {
		if (Debug.disable) return;
		val dbstr:String = msg+ this.toString();
		Debug.println(dbstr);
		Debug.flush();
	}
	
}
