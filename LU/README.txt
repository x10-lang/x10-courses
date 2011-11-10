For the purposes of the tutorial, we have configured this project as 
a Java backend project.  This will allow the project to build on any
computer where X10DT can be installed. 

However, to actually exeucte successfully, this version of the LU benchmark 
requires that you have the BLAS libraries installed and that you compile 
the X10 code with the C++ backend.

If the C++ backend is working on your machine (or if you are going to 
run this program using remote execution to the provided cluster), then 
you need to perform two steps.
  (1) Convert the project to a C++ backend project by selecting the project,
      right-clicking, and select Configure -> Convert to a C++ backend project.
  (2) After converting the project, edit the linking command in the 
      x10_platform_conf file to add any arguments needed to link in the BLAS libraries
      to the executable (eg -lblas)
