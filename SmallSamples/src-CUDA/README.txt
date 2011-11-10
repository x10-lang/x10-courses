For the purposes of the tutorial, we have configured this project as 
a Java backend project.  This will allow the project to build on any
computer where X10DT can be installed. 

However, these programs are really intended to be exeucted with
the C++/CUDA backend.  The default input sizes are set assuming this
and they are likely to execute quite slowly when run on Managed X10.

If the C++ backend is working on your machine (or if you are going to 
run this program using remote execution to the provided cluster), then 
you can convert the project to a C++ backend project 
by selecting the project, right-clicking, and select 
Configure -> Convert to a C++ backend project.