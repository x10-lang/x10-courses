
/*
 *  This file is part of the X10 project (http://x10-lang.org).
 * 
 *  This file is licensed to You under the Eclipse Public License (EPL);
 *  You may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *      http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 *  (C) Copyright IBM Corporation 2006-2010.
 */

import x10.compiler.*;
import x10.util.OptionsParser;
import x10.util.Option;
import x10.lang.Math;
import x10.util.Random;
import x10.util.Stack;

public class UTS {
	
	static val NORMALIZER = 2147483648.0; // does not depend on input parameters
	
	public static struct Constants {
		public static val BINOMIAL = 0U;
		public static val GEOMETRIC = 1U;
		public static val HYBRID = 2U;
		
		public static val LINEAR = 0U;
		public static val EXPDEC = 1U;
		public static val CYCLIC = 2U;
		public static val FIXED = 3U;
	}
	@NativeRep ("c++", "UTS__SHA1Rand", "UTS__SHA1Rand", null)
	@NativeCPPCompilationUnit ("sha1.c")
	@NativeCPPCompilationUnit ("UTS__SHA1Rand.cc")
	public static struct SHA1Rand {
		public def this (seed:Int) { }
		public def this (parent:SHA1Rand) { }
		public def this (parent:SHA1Rand, spawnNumber:Int) { }
		@Native ("c++", "UTS__SHA1Rand_methods::apply(#0)")
		public def apply () : Int = 0;
	}
	
	public static def main (args : Array[String](1)) {
		try {
			val opts = new OptionsParser(args, null,
					[Option("t", "", "Tree type 0: BIN, 1: GEO, 2: HYBRID"),
					 Option("b", "", "Root branching factor"),
					 Option("r", "", "Root seed (0 <= r <= 2^31)"),
					 Option("a", "", "Tree shape function"),
					 Option("d", "", "Tree depth"),
					 Option("s", "", "Sequential"),
					 Option("q", "", "BIN: probability of a non-leaf node"),
					 Option("m", "", "BIN: number of children for non-leaf node")
					 ]);
			
			val t = opts ("-t", 0) as UInt;	
			val w = opts ("-w", 1) as UInt;	
			val nu = opts ("-n", 511) as UInt;	
			val b0 = opts ("-b", 4) as UInt;
			val seq = opts("-s", 0) as UInt;
			val r = opts ("-r", 0) as UInt;
			val verbose = opts("-v",0)==1;
			
			// geometric options
			val a = opts ("-a", 0) as UInt;
			val d = opts ("-d", 6) as UInt;
			
			// binomial options
			val q:Double = opts ("-q", 15.0/64.0);
			val mf = opts ("-m", 4) as UInt;
			val k = opts ("-k", 0) as UInt;
			
			// hybrid options
			val geo_to_bin_shift_depth_ratio:Double = opts ("-f", 0.5);
			
			// Figure out what kind of connectivity is needed.
			val l = opts ("-l", 3) as UInt;
			val z = opts ("-z", 1) as UInt;
			
			Console.OUT.println("--------");
			Console.OUT.println("Places="+Place.MAX_PLACES);
			if (Constants.BINOMIAL==t) {
				Binomial.usageLine(b0, r, mf, seq, w, nu, q, l, z);
			} else if (Constants.GEOMETRIC==t) {
				Geometric.usageLine(b0, r, a, d, seq, w, nu, l, z);
			} else {
				
			}
			val qq = (q*NORMALIZER) as Long;
			val reducer = new Reducible[UInt]() {
				public def zero()=0U;
				public def apply(a:UInt, b:UInt)=a+b;
			};
			if (seq != 0U) {
				var result:Int;
				Console.OUT.println("Starting...");
				var time:Long = System.nanoTime();
				if (Constants.BINOMIAL==t) {
					val runner = new SeqRunner[SHA1Rand,UInt](new Binomial(b0,qq,mf));
					result=runner(SHA1Rand(r), reducer);
				} else {
					val runner = new SeqRunner[TreeNode,UInt](new Geometric(b0,a,d));
					result=runner(TreeNode(0, SHA1Rand( r)), reducer);
				}
				time = System.nanoTime() - time;
				Console.OUT.println("Finished with result " + result + ".");
				Console.OUT.println("Performance = "+result+"/"+(time/1E9)
						+"="+ (result/(time/1E3)) + "M nodes/s");
				Console.OUT.println("--------");
				return;
			} 
			if (Constants.BINOMIAL==t) {
				val runner = new GlobalRunner[SHA1Rand, UInt](args, () => GlobalRef[TaskFrame[SHA1Rand, UInt]](new Binomial(b0, qq, mf)));
				Console.OUT.println("Starting...");
				var time:Long = System.nanoTime();
				val result = runner(SHA1Rand(r), reducer);
				time = System.nanoTime() - time;
				Console.OUT.println("Finished with result " + result + ".");
				runner.stats(time, verbose);
				Console.OUT.println("--------");
				return;
			} 
			val runner =  new GlobalRunner[TreeNode, UInt](args, ()=> GlobalRef[TaskFrame[TreeNode,UInt]](new Geometric(b0, a,d)));
			Console.OUT.println("Starting...");
			var time:Long = System.nanoTime();
			val result = runner(TreeNode(0,SHA1Rand(r)), reducer);
			time = System.nanoTime() - time;
			Console.OUT.println("Finished with result " + result + ".");
			runner.stats(time, verbose); 
			Console.OUT.println("--------");
		} catch (e:Throwable) {
			e.printStackTrace(Console.ERR);
		}
	}
}

// vim: ts=2:sw=2:et
