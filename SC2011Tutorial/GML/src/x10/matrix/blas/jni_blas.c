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

#include <stdio.h>
#include <stdlib.h>

#include <jni.h>
#include "wrap_blas.h"

//------------------------------------------------------------------------
// Level One 
//------------------------------------------------------------------------
  
extern "C" {
  // public static native void scale(int n,  double alpha, double[] x);
  JNIEXPORT void JNICALL Java_x10_matrix_blas_WrapBLAS_test
  (JNIEnv *env, jobject obj) {

	printf("This is jni test call\n"); fflush(stdout);

  }
  // public static native void scale(int n,  double alpha, double[] x);
  JNIEXPORT void JNICALL Java_x10_matrix_blas_WrapBLAS_scale
  (JNIEnv *env, jobject obj, jint n, jdouble alpha, jdoubleArray x) {
	jboolean isCopy;
	jdouble* xmat = env->GetDoubleArrayElements(x, &isCopy);

	scale(n, alpha, xmat);

	if (isCopy == JNI_TRUE) {
	  //printf("Copying data from c library back to original data in JVM\n");
	  env->ReleaseDoubleArrayElements(x, xmat, 0);
	}	
  }
  //-------------------------------------------------------------
  // public static native void copy(int n, double[] x, double[] y);
  JNIEXPORT void JNICALL Java_x10_matrix_blas_WrapBLAS_copy
  (JNIEnv *env, jobject obj, jint n, jdoubleArray x, jdoubleArray y) {
	jboolean isCopy;
	jdouble* xmat = env->GetDoubleArrayElements(x, NULL);
	jdouble* ymat = env->GetDoubleArrayElements(y, &isCopy);
	copy(n, xmat, ymat);

	if (isCopy == JNI_TRUE) {
	  //printf("Copying data from c library back to original data in JVM\n");
	  env->ReleaseDoubleArrayElements(y, ymat, 0);
	}
  }

  //-------------------------------------------------------------
  // public static native double dotProd(int n, double[] x, double[] y);
  JNIEXPORT double JNICALL Java_x10_matrix_blas_WrapBLAS_dotProd
  (JNIEnv *env, jobject obj, jint n, jdoubleArray x, jdoubleArray y) {
	jdouble* xmat = env->GetDoubleArrayElements(x, NULL);
	jdouble* ymat = env->GetDoubleArrayElements(y, NULL);
	return dot_prod(n, xmat, ymat);
  }

  //-------------------------------------------------------------
  //public static native double norm2(int n, double[] x);
  JNIEXPORT double JNICALL Java_x10_matrix_blas_WrapBLAS_norm2
  (JNIEnv *env, jobject obj, jint n, jdoubleArray x) {
	jdouble* xmat = env->GetDoubleArrayElements(x, NULL);
	return norm2(n, xmat);
  }

  //-------------------------------------------------------------
  //public static native double absSum(int n, double[] x);
  JNIEXPORT double JNICALL Java_x10_matrix_blas_WrapBLAS_absSum
  (JNIEnv *env, jobject obj, jint n, jdoubleArray x) {
	jdouble* xmat = env->GetDoubleArrayElements(x, NULL);
	return abs_sum(n, xmat);
  }


//------------------------------------------------------------------------
// Level Two 
//------------------------------------------------------------------------


//------------------------------------------------------------------------
// Level Three 
//------------------------------------------------------------------------

  //-------------------------------------------------------------
  // public static native void matmatMult(double[] A, double[] B, double[] C, ...)
  JNIEXPORT void JNICALL Java_x10_matrix_blas_WrapBLAS_matmatMult
  (JNIEnv *env, jobject obj, jdoubleArray A, jdoubleArray B, jdoubleArray C, jintArray dim, jdoubleArray scale, jintArray trans) {

	jboolean isCopy;
	jdouble* amat = env->GetDoubleArrayElements(A, NULL);
    jdouble* bmat = env->GetDoubleArrayElements(B, NULL);
    jdouble* cmat = env->GetDoubleArrayElements(C, &isCopy);
    jdouble* scal = env->GetDoubleArrayElements(scale, NULL);

    jint dimlist[3];
	jint trnlist[2];
    // This line is necessary, since Java arrays are not guaranteed 
    // to have a continuous memory layout like C arrays.
    env->GetIntArrayRegion(dim, 0, 3, dimlist);
    env->GetIntArrayRegion(trans, 0, 2, trnlist);

	matrix_matrix_mult(amat, bmat, cmat, dimlist, scal, trnlist);

	if (isCopy == JNI_TRUE) {
	  //printf("Copying data from c library back to original data in JVM\n");
	  env->ReleaseDoubleArrayElements(C, cmat, 0);
	}
  }

  //-------------------------------------------------------------
  // public static native void symmatMult(double[] A, double[] B, double[] C, ...)
  JNIEXPORT void JNICALL Java_x10_matrix_blas_WrapBLAS_symmatMult
  (JNIEnv *env, jobject obj, jdoubleArray A, jdoubleArray B, jdoubleArray C, jintArray dim, jdoubleArray scale) {
	jboolean isCopy;
	jdouble* amat = env->GetDoubleArrayElements(A, NULL);
    jdouble* bmat = env->GetDoubleArrayElements(B, NULL);
    jdouble* cmat = env->GetDoubleArrayElements(C, &isCopy);
    jdouble* scal = env->GetDoubleArrayElements(scale, NULL);

    jint dimlist[2];
    // This line is necessary, since Java arrays are not guaranteed 
    // to have a continuous memory layout like C arrays.
    env->GetIntArrayRegion(dim, 0, 2, dimlist);
	//printf("Here calling blas matrix mult\n"); fflush(stdout);
	sym_matrix_mult(amat, bmat, cmat, dimlist, scal);

	if (isCopy == JNI_TRUE) {
	  //printf("Copying data from c library back to original data in JVM\n");
	  env->ReleaseDoubleArrayElements(C, cmat, 0);
	}	
  }

  //-------------------------------------------------------------
  // public static native void matvecMult2(double[] A, double[] x, double[] y, int m, int n);
/*   JNIEXPORT void JNICALL Java_x10_matrix_WrapBLAS_matvecMult2 */
/*   (JNIEnv *env, jobject obj, jdoubleArray A, jdoubleArray x, jdoubleArray y, jint m, jint n) { */

/* 	jboolean isCopy; */
/* 	jdouble* amat = env->GetDoubleArrayElements(A, NULL); */
/*     jdouble* xvec = env->GetDoubleArrayElements(x, NULL); */
/*     jdouble* yvec = env->GetDoubleArrayElements(y, &isCopy); */
/* 	matrix_vector_mult(amat, xvec, yvec, m, n); */
/* 	if (isCopy == JNI_TRUE) { */
/* 	  //printf("Copying data from c library back to original data in JVM\n"); */
/* 	  env->ReleaseDoubleArrayElements(y, yvec, 0); */
/* 	} */

/*   } */

  //-------------------------------------------------------------
  // public static native void matvecMult(double[] A, double[] x, double[] y, ....)
  JNIEXPORT void JNICALL Java_x10_matrix_blas_WrapBLAS_matvecMult
  (JNIEnv *env, jobject obj, jdoubleArray A, jdoubleArray x, jdoubleArray y, jintArray dim, jdoubleArray scale, jint tranA) {

	jdouble* amat = env->GetDoubleArrayElements(A, false);
    jdouble* xvec = env->GetDoubleArrayElements(x, false);
    jdouble* yvec = env->GetDoubleArrayElements(y, false);
    jdouble* scal = env->GetDoubleArrayElements(scale, false);
    jint dimlist[2];
    // This line is necessary, since Java arrays are not guaranteed 
    // to have a continuous memory layout like C arrays.
    env->GetIntArrayRegion(dim, 0, 2, dimlist);

	matrix_vector_mult(amat, xvec, yvec, dimlist, scal, tranA);
  }

  //-------------------------------------------------------------
  // public static native void symvecMult(double[] A, double[] x, double[] y, ...) 
  JNIEXPORT void JNICALL Java_x10_matrix_blas_WrapBLAS_symvecMult
  (JNIEnv *env, jobject obj, jdoubleArray A, jdoubleArray x, jdoubleArray y, jintArray dim, jdoubleArray scale) {
	jboolean isCopy;
	jdouble* amat = env->GetDoubleArrayElements(A, NULL);
    jdouble* xvec = env->GetDoubleArrayElements(x, NULL);
    jdouble* yvec = env->GetDoubleArrayElements(y, &isCopy);
    jdouble* scal = env->GetDoubleArrayElements(scale, NULL);
    jint dimlist[2];
    // This line is necessary, since Java arrays are not guaranteed 
    // to have a continuous memory layout like C arrays.
    env->GetIntArrayRegion(dim, 0, 2, dimlist);

	sym_vector_mult(amat, xvec, yvec, dimlist, scal);

	if (isCopy == JNI_TRUE) {
	  //printf("Copying data from c library back to original data in JVM\n");
	  env->ReleaseDoubleArrayElements(y, yvec, 0);
	}
  }

  //-------------------------------------------------------------
  // public static native void trimatMult(double[] A, double[] B, int[] dim, int tranA);
  JNIEXPORT void JNICALL Java_x10_matrix_blas_WrapBLAS_trimatMult
  (JNIEnv *env, jobject obj, jdoubleArray A, jdoubleArray B, jintArray dim, jint tranA) {

	jboolean isCopy;
	jdouble* amat = env->GetDoubleArrayElements(A, NULL);
    jdouble* bmat = env->GetDoubleArrayElements(B, &isCopy);
    jint dimlist[2];
    // This line is necessary, since Java arrays are not guaranteed 
    // to have a continuous memory layout like C arrays.
    env->GetIntArrayRegion(dim, 0, 2, dimlist);

	tri_matrix_mult(amat, bmat, dimlist, tranA);

	if (isCopy == JNI_TRUE) {
	  //printf("Copying data from c library back to original data in JVM\n");
	  env->ReleaseDoubleArrayElements(B, bmat, 0);
	}
  }

	
  //-------------------------------------------------------------
  // public static native void trimatSolve(double[] A, double[] bx, int m, int n);
  JNIEXPORT void JNICALL Java_x10_matrix_blas_WrapBLAS_trimatSolve
  (JNIEnv *env, jobject obj, jdoubleArray A, jdoubleArray bx, jint m, jint n) {

	jboolean isCopy;
	jdouble* amat = env->GetDoubleArrayElements(A, NULL);
    jdouble* bxvec = env->GetDoubleArrayElements(bx, &isCopy);
    jint dimlist[2];

	tri_matrix_solve(amat, bxvec, m, n);

	if (isCopy == JNI_TRUE) {
	  //printf("Copying data from c library back to original data in JVM\n");
	  env->ReleaseDoubleArrayElements(bx, bxvec, 0);
	}
  }

}
//-----------------------------------------------------------------
// Simplified interface, thread-safe routine
//-----------------------------------------------------------------



//------------------------------------------------------------------------
// Other tools
//------------------------------------------------------------------------
