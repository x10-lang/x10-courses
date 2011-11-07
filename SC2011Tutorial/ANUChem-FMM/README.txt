Fast Multipole Method molecular mechanics code, part of ANU-Chem. 

This project contains a subset of the full ANUChem distribution for X10 2.2.1, reorganized to make
it into a simple X10DT Java backend project (for portability) fur use in the SC'11 X10 tutorial.  
For performance, this code should be built using the C++ backend of X10.

This program is controlled by the Eclipse Public Licence v1.0 http://www.eclipse.org/legal/epl-v10.html

Introduction:
------------

This code performs an electrostatic potential calculation using the 
Fast Multipole Method with analytic expansions.

The implementation basically follows White & Head-Gordon (1994), with some enhancements taken
from Lashuk et al. (2009) such as the use of Locally Essential Trees.

The potential calculation by itself is not very useful; in the future we hope to incorporate
it into a dynamics code.  For now, it provides an illustration of the possible use of X10 language 
constructs to construct a distributed tree code.

1. White & Head-Gordon (1994). "Derivation and efficient implementation of the fast multipole method". J Chem Phys 101 (8)
2. Lashuk et al. (2009). "A massively parallel adaptive fast-multipole method on heterogeneous architectures". Proceedings of SC 2009

ANUCHem:  http://cs.anu.edu.au/~Josh.Milthorpe/anuchem.html
--------
ANuChem is under active development. The current source is available in mercurial
at http://squirrel.anu.edu.au/hg/public/x10-apps/

In addition, there are tagged "release" versions of the source that compile against
each released version of X10.  See http://squirrel.anu.edu.au/hg/public/x10-apps/tags

For any questions about building, testing or extending ANUChem, please email josh.milthorpe@anu.edu.au
