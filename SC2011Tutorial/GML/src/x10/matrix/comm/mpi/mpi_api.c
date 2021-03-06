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

#include <stdlib.h>
#include <stdio.h>

#ifdef MPI_COMMU
#include "mpi.h"
#include "mpi_api.h"
#endif

void mpi_get_name_maxlen(int* l)
{
#ifdef MPI_COMMU
  *l= MPI_MAX_PROCESSOR_NAME;
#endif
}

void mpi_get_comm_pid(int* rk)
{
#ifdef MPI_COMMU
  MPI_Comm_rank(MPI_COMM_WORLD, rk);
#endif
}

void mpi_get_comm_nporc(int* np)
{
#ifdef MPI_COMMU
  MPI_Comm_size(MPI_COMM_WORLD, np);
#endif
}

void mpi_get_proc_info(int* rk, int* np, int*len, int* strn)
{
#ifdef MPI_COMMU
  int i;
  char pname[MPI_MAX_PROCESSOR_NAME];

  MPI_Comm_size(MPI_COMM_WORLD, np);
  MPI_Comm_rank(MPI_COMM_WORLD, rk);
  MPI_Get_processor_name (pname, len);

  for (i=0; i<(*len); i++)
	strn[i] = (int)pname[i];
#endif
}

void mpi_get_status_memsize(int* sl) 
{
#ifdef MPI_COMMU
  sl[0] = sizeof(MPI_Status);
#endif
}

void mpi_get_request_memsize(int* sl) 
{
#ifdef MPI_COMMU
  sl[0] = sizeof(MPI_Request);
#endif
}

//---------------------------------------------------------------
// Blocking P2P communication

//int MPI Send(void* buf, int count, MPI Datatype datatype, int dest,
//             int tag, MPI Comm comm)
void mpi_send_double(double* buf, int off, int cnt, int dst, int tag)
{
#ifdef MPI_COMMU
  double* pbuf = (off > 0)?(buf+off):buf;
  MPI_Send(pbuf, cnt, MPI_DOUBLE_PRECISION, dst, 
		   tag, MPI_COMM_WORLD); 
#endif
}

//int MPI Recv(void* buf, int count, MPI Datatype datatype, int source,
//             int tag, MPI Comm comm, MPI Status *status)
void mpi_recv_double(double* buf, int off, int cnt, int src, int tag)
{
#ifdef MPI_COMMU
  double* pbuf = (off>0)?(buf+off):buf;

  MPI_Status st;
  MPI_Recv(pbuf, cnt, MPI_DOUBLE_PRECISION, src, 
		   tag, MPI_COMM_WORLD, &st);
#endif
}


void mpi_send_int(int* buf, int off, int cnt, int dst, int tag)
{
#ifdef MPI_COMMU
  int* pbuf = (off>0)?(buf+off):buf;
  MPI_Send(pbuf, cnt, MPI_INT, dst, 
		   tag, MPI_COMM_WORLD); 
#endif
}
void mpi_recv_int(int* buf, int off, int cnt, int src, int tag)
{
#ifdef MPI_COMMU
  MPI_Status st;
  MPI_Recv(buf, cnt, MPI_INT, src, 
		   tag, MPI_COMM_WORLD, &st);
#endif
}


//----------------------------
// Non-blocking P2P double communication

// int MPI_Irsend(void* buf, int count, MPI_Datatype datatype, int dest, 
//               int tag, MPI_Comm comm, MPI_Request *request) 
void mpi_Isend_double(double* buf, int off, int cnt, int dst, int tag, void* req)
{
#ifdef MPI_COMMU
  double* pbuf = (off>0)?(buf+off):buf;

  MPI_Isend(pbuf, cnt, MPI_DOUBLE_PRECISION, dst, 
			tag, MPI_COMM_WORLD, (MPI_Request*) req); 
#endif
}

// int MPI_Irecv(void* buf, int count, MPI_Datatype datatype, int source, 
//	             int tag, MPI_Comm comm, MPI_Request *request) 
void mpi_Irecv_double(double* buf, int off, int cnt, int src, int tag, void* req) 
{
#ifdef MPI_COMMU
  double* pbuf = (off>0)?(buf+off):buf;

  MPI_Irecv(pbuf, cnt, MPI_DOUBLE_PRECISION, src, 
			tag,  MPI_COMM_WORLD, (MPI_Request*) req);
#endif

}

//----
void mpi_Isend_int(int* buf, int off, int cnt, int dst, int tag, void* req)
{
#ifdef MPI_COMMU
  int* pbuf = (off>0)?(buf+off):buf;

  MPI_Isend(pbuf, cnt, MPI_INT, dst, 
			tag, MPI_COMM_WORLD, (MPI_Request*) req); 
#endif
}

void mpi_Irecv_int(int* buf, int off, int cnt, int src, int tag, void* req) 
{
#ifdef MPI_COMMU
  int* pbuf = (off>0)?(buf+off):buf;
  
  MPI_Irecv(pbuf, cnt, MPI_INT, src, 
			tag,  MPI_COMM_WORLD, (MPI_Request*) req);

#endif
}
//-------------------------
void mpi_bcast_int(int* buf, int off, int cnt, int root) 
{
#ifdef MPI_COMMU
  int* pbuf = (off>0)?(buf+off):buf;
  // void *buffer, int count, MPI_Datatype datatype, int root, MPI_Comm comm);
  MPI_Bcast(pbuf, cnt, MPI_INT, root, MPI_COMM_WORLD);
#endif
}

void mpi_bcast_double(double* buf, int off, int cnt, int root)
{
#ifdef MPI_COMMU
  double* pbuf = (off>0)?(buf+off):buf;
  MPI_Bcast(pbuf, cnt, MPI_DOUBLE, root, MPI_COMM_WORLD);
#endif
}
//-------------------------
// Gather
void mpi_gatherv_double(double* sendbuf, int sendoff, int sendcnt, 
						double* recvbuf, int recvoff, int* recvcnts, int* displs, int root)
{
#ifdef MPI_COMMU
  double* sbuf = (sendoff>0)?(sendbuf+sendoff):sendbuf;
  double* rbuf = (recvoff>0)?(recvbuf+recvoff):recvbuf;
  //int np;
  //MPI_Comm_size(MPI_COMM_WORLD, &np);
  //static int* displs = new int(np);

  //displs[0]=0;
  // Make sure the proc mapping is correct
  //for (int i=1; i<np; i++) displs[i]=displs[i-1] + recvcnts[i-1];

  //printf("Sending %f %f %d\n", sbuf[0], sbuf[1], sendcnt);
  //fflush(stdout);
  MPI_Gatherv(sbuf, sendcnt, MPI_DOUBLE,
			  rbuf, recvcnts, displs, MPI_DOUBLE, 
			  root, MPI_COMM_WORLD); 
//  MPI_Allgather(sbuf, sendcnt, MPI_DOUBLE, 
//				rbuf, recvcnt, MPI_DOUBLE, MPI_COMM_WORLD);
  //printf("Recving off:%d val: %f %f %f %f cnt %d\n", 
  //		 recvoff, recvbuf[0], recvbuf[1], recvbuf[2], recvbuf[3], recvcnts[0]);
  //fflush(stdout);
  //MPI_Allgatherv(void *sendbuf, int sendcount, MPI_Datatype sendtype,
  //                              void *recvbuf, int *recvcounts,
  //                               int *displs, MPI_Datatype recvtype, MPI_Comm comm);
#endif
}

void mpi_gatherv_int(int* sendbuf, int sendoff, int sendcnt, 
					 int* recvbuf, int recvoff, int* recvcnts, int* displs, int root)
{
#ifdef MPI_COMMU
  int* sbuf = (sendoff>0)?(sendbuf+sendoff):sendbuf;
  int* rbuf = (recvoff>0)?(recvbuf+recvoff):recvbuf;

  MPI_Gatherv(sbuf, sendcnt, MPI_INT,
			  rbuf, recvcnts, displs, MPI_INT, 
			  root, MPI_COMM_WORLD); 
#endif
}

//----------------------
// Scatter
void mpi_scatterv_double(double* sendbuf, int* sendcnts, int* displs,
						 double* recvbuf, int recvcnt, int root)
{
#ifdef MPI_COMMU
  MPI_Scatterv(sendbuf, sendcnts, displs, MPI_DOUBLE,
			   recvbuf, recvcnt, MPI_DOUBLE, 
			   root, MPI_COMM_WORLD); 
#endif
}

void mpi_scatterv_int(int* sendbuf, int* sendcnts,  int* displs,
					  int* recvbuf, int recvcnt, int root)
{
#ifdef MPI_COMMU

  MPI_Scatterv(sendbuf, sendcnts, displs, MPI_INT, 
			   recvbuf, recvcnt, MPI_INT, 
			   root, MPI_COMM_WORLD); 
#endif
}

//---------------------------------------------------------------
void mpi_allgatherv_double(double* sendbuf, int sendoff, int sendcnt, 
						   double* recvbuf, int recvoff, int* recvcnts, int*displs)
{
#ifdef MPI_COMMU
  double* sbuf = (sendoff>0)?(sendbuf+sendoff):sendbuf;
  double* rbuf = (recvoff>0)?(recvbuf+recvoff):recvbuf;
  //int np;

  //MPI_Comm_size(MPI_COMM_WORLD, &np);
   //static int* displs = new int(np);

  //displs[0]=0;
  // Make sure the proc mapping is correct
  //for (int i=1; i<np; i++) displs[i]=displs[i-1] + recvcnts[i-1];

  //printf("Sending %f %d\n", sbuf[0], sendcnt);
  //fflush(stdout);
  MPI_Allgatherv(sbuf, sendcnt, MPI_DOUBLE,
 				 rbuf, recvcnts, displs, MPI_DOUBLE, MPI_COMM_WORLD); 
//  MPI_Allgather(sbuf, sendcnt, MPI_DOUBLE, 
//				rbuf, recvcnt, MPI_DOUBLE, MPI_COMM_WORLD);
  //printf("Recving off:%d val: %f %f %f %f cnt %d\n", 
  //		 recvoff, recvbuf[0], recvbuf[1], recvbuf[2], recvbuf[3], recvcnts[0]);
  //fflush(stdout);
  //MPI_Allgatherv(void *sendbuf, int sendcount, MPI_Datatype sendtype,
  //                              void *recvbuf, int *recvcounts,
  //                               int *displs, MPI_Datatype recvtype, MPI_Comm comm);
#endif
}

//--------------------------
void mpi_reduce_sum_int(int* sendbuf, int soff, int* recvbuf, int roff,  int cnt, int root)
{
#ifdef MPI_COMMU
  //int MPI_Reduce(void* sendbuf, void* recvbuf, int count, 
  //			   MPI_Datatype datatype, MPI_Op op, int root, MPI_Comm comm) 
  int* sbuf = (soff>0)?(sendbuf+soff):sendbuf;
  int* rbuf = (roff>0)?(recvbuf+roff):recvbuf;

  MPI_Reduce(sbuf, rbuf, cnt, MPI_INT, MPI_SUM, root, MPI_COMM_WORLD);
#endif
}

void mpi_reduce_sum_double(double* sendbuf, int soff, double* recvbuf, int roff,  int cnt, int root)
{
#ifdef MPI_COMMU
  //int MPI_Reduce(void* sendbuf, void* recvbuf, int count, 
  //			   MPI_Datatype datatype, MPI_Op op, int root, MPI_Comm comm) 
  double* sbuf = (soff>0)?(sendbuf+soff):sendbuf;
  double* rbuf = (roff>0)?(recvbuf+roff):recvbuf;

  MPI_Reduce(sbuf, rbuf, cnt, MPI_DOUBLE, MPI_SUM, root, MPI_COMM_WORLD);
#endif
}
//------------------------
void mpi_allreduce_sum_int(int*sendbuf, int soff, int* recvbuf, int roff, int cnt)
{
#ifdef MPI_COMMU
  //int MPI_Allreduce(void* sendbuf, void* recvbuf, int count, 
  //				  MPI_Datatype datatype, MPI_Op op, MPI_Comm comm) 
  int* sbuf = (soff>0)?(sendbuf+soff):sendbuf;
  int* rbuf = (roff>0)?(recvbuf+roff):recvbuf;
  MPI_Allreduce(sbuf, rbuf, cnt, MPI_INT, MPI_SUM, MPI_COMM_WORLD);
#endif
}

void mpi_allreduce_sum_double(double*sendbuf, int soff, double* recvbuf, int roff, int cnt)
{
#ifdef MPI_COMMU
  //int MPI_Allreduce(void* sendbuf, void* recvbuf, int count, 
  //				  MPI_Datatype datatype, MPI_Op op, MPI_Comm comm) 
  double* sbuf = (soff>0)?(sendbuf+soff):sendbuf;
  double* rbuf = (roff>0)?(recvbuf+roff):recvbuf;
  MPI_Allreduce(sbuf, rbuf, cnt, MPI_DOUBLE, MPI_SUM, MPI_COMM_WORLD);
#endif
}

//-------------------------
// Wait request
// int MPI_Wait(MPI_Request *request, MPI_Status *status) 
void mpi_wait_request(void* req)
{
#ifdef MPI_COMMU
  MPI_Status st;
  MPI_Request* r = (MPI_Request*) req;
  MPI_Wait(r, &st);
#endif
}
//
void mpi_test_request(void* req, int* flag)
{
#ifdef MPI_COMMU
  MPI_Status st;
  MPI_Request* r = (MPI_Request*) req;
  MPI_Test(r, flag, &st);
#endif
}
//-------------------------

