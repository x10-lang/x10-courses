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

#ifndef MPI_API_H
#define MPI_API_H

void mpi_get_name_maxlen(int* ml);
void mpi_get_comm_pid(int* rk);
void mpi_get_comm_nproc(int* np);
void mpi_get_proc_info(int* rk, int* np, int* hlen, int* hstr);
void mpi_get_statue_memsize(int* sl);
void mpi_get_request_memsize(int* sl);

//---------------------
// Blocking double P2P
void mpi_send_double(double* buf, int off, int cnt, int dst, int tag);
void mpi_recv_double(double* buf, int off, int cnt, int src, int tag);

void mpi_send_int(int* buf, int off, int cnt, int dst, int tag);
void mpi_recv_int(int* buf, int off, int cnt, int src, int tag);

//---------------------
// Non-blocking double P2P
void mpi_Isend_double(double* buf, int off, int cnt, int dst, int tag, void* req);
void mpi_Irecv_double(double* buf, int off, int cnt, int src, int tag, void* req);

void mpi_Isend_int(int* buf, int off, int cnt, int dst, int tag, void* req);
void mpi_Irecv_int(int* buf, int off, int cnt, int src, int tag, void* req);
//---------------------
// Bcast
void mpi_bcast_int(int* buf, int off, int cnt, int root);
void mpi_bcast_double(double* buf, int off, int cnt, int root);
//---------------------
//Gatherv
void mpi_gatherv_double(double* sendbuf, int sendoff, int sendcnt, 
						double* recvbuf, int recvoff, int* recvcnts, int* displs, int root);
void mpi_gatherv_int(int* sendbuf, int sendoff, int sendcnt, 
					 int* recvbuf, int recvoff, int* recvcnts, int* displs, int root);
//---------------------
//Scatterrv
void mpi_scatterv_double(double* sendbuf, int* sendcnts, int* displs,
						 double* recvbuf, int recvcnt,  int root);
void mpi_scatterv_int(int* sendbuf, int* sendcnts, int* displs,
					  int* recvbuf, int recvcnt,  int root);

// Allgatherv
void mpi_allgatherv_double(double* sendbuf, int sendoff, int sendcnt, 
						   double* recvbuf, int recvoff, int* recvcnts, int* displs);
//---------------------
// reduce sum
void mpi_reduce_sum_int(int* sendbuf, int soff, int* recvbuf, int roff,  int cnt, int root);
void mpi_reduce_sum_double(double* sendbuf, int soff, double* recvbuf, int roff,  int cnt, int root);
//---------------------
// all reduce sum
void mpi_allreduce_sum_int(int*sendbuf, int soff, int* recvbuf, int roff, int cnt);
void mpi_allreduce_sum_double(double*sendbuf, int soff, double* recvbuf, int roff, int cnt);
//---------------------
// Request waiting
void mpi_wait_request(void* req);
void mpi_test_request(void* req, int* flag);
//---------------------


#endif

