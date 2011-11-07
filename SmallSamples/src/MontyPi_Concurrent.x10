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

import x10.io.Console;
import x10.util.Random;

/**
 * Calculation of an approximation to pi by using a Monte Carlo simulation
 * (throwing darts into the unit square and determining the fraction that land
 * in the unit circle).
 * 
 * This version is concurrent, but not distributed.
 */
class MontyPi_Concurrent {
	public static def main(args:Array[String](1)) {
		val N = Int.parse(args(0));
		val P = Int.parse(args(1));
		val result = new Cell[Double](0);
		finish for (1..P) async {
			val r = new Random();
			var myResult:Double = 0;
			for (1..(N/P)) {
				val x = r.nextDouble();
				val y = r.nextDouble();
				if (x*x + y*y <= 1) myResult++;
			}
			atomic result() += myResult;
		}
		val pi = 4*(result())/N;
		Console.OUT.println("The value of pi is " + pi);
	}
}


