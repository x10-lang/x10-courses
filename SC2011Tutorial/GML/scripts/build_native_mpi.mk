#
#  This file is part of the X10 project (http://x10-lang.org).
#
#  This file is licensed to You under the Eclipse Public License (EPL);
#  You may not use this file except in compliance with the License.
#  You may obtain a copy of the License at
#      http://www.opensource.org/licenses/eclipse-1.0.php
#
#  (C) Copyright IBM Corporation 2006-2011.
#

###################################################
###################################################
## Name:  	X10 application test
## Created by: 	Juemin Zhang
## Contact:   	zhangj@us.ibm.com
###################################################
#This make file is used for building native backend
#running on MPI transport.
###################################################

##---------------
#Input settings
##---------------
#$(gml_path)    ## gml installation path
#$(gml_inc)     ## gml include path
#$(gml_lib)     ## gml library path
#$(build_path)  ## application target build path
#$(target)      ## application target name
#$(target_list) ## list of targets
#$(X10_FLAG)    ## X10 compiling option flags
#$(XC)          ## X10 compiler
#$(MCC)         ## Post MPI compiler
#$(POST_PATH)   ## Post compiling include path
#$(POST_LIBS)   ## Post compiling include libs.

###################################################
# Source files and paths
###################################################
x10src		= $(target).x10

cgml_prop	= $(gml_path)/cgml.so.properties
###################################################
## Compiler settings
###################################################


###################################################
##### Dependent library setting Atlas BLAS lib
###################################################

##----------------------------------

MPI_FLAG    = -define MPI_COMMU -cxx-prearg -DMPI_COMMU
MPI_GML_LIB	= -classpath $(gml_lib)/native_mpi_gml.jar -x10lib $(gml_path)/native_mpi_gml.properties

###################################################
# X10 file build rules
################################################### 
$(target)_mpi	: $(x10src) $(depend_src) $(gml_inc) check_gml_mpi
		$(XC)  -x10rt mpi $(MPI_GML_LIB) $(X10_FLAG) $(MPI_FLAG) $< -o $@ \
		-post '$(MCC) # $(POST_PATH) # $(POST_LIBS)'

###----------
mpi		: $(target)_mpi

all_mpi	:
		$(foreach src, $(target_list), $(MAKE) target=$(src) mpi; )

###---------

clean	::
		rm -f $(target)_mpi

clean_all ::
		$(foreach f, $(target_list), rm -f $(f)_mpi; )

###-----------
help	::
	@echo "----------------------------- build for native MPI transport --------------------------";
	@echo " make mpi       : build default test $(target) for native backend running on MPI transport";
	@echo " make all_mpi   : build all [ $(target_list) ] for native backend running on MPI transport";
	@echo " make clean     : remove default built binary $(target)_mpi";
	@echo " make clean_all : remove all built targets";
	@echo "";
		
