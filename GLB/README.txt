For the purposes of the tutorial, we have configured this project as 
a Java backend project.  This will allow the project to build on any
computer where X10DT can be installed. 

The GLB Framework and the Ones, Fib, and Counts program will run
under the Java backend.  However the UTS program will only run
under the C++ backend because it uses a C implementation of SHA1.

If the C++ backend is working on your machine (or if you are going to 
run this program using remote execution to the provided cluster), and
you want to run UTS you can convert the project to a C++ backend project 
by selecting the project, right-clicking, and select 
Configure -> Convert to a C++ backend project.
