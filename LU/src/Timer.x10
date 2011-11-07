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

final public class Timer {
    public val total:Array[Long](1);
    public val count:Array[Long](1);

    public def this(n:Int) {
        total = new Array[Long](n, (Int)=>0 as Long);
        count = new Array[Long](n, (Int)=>0 as Long);
    }

    public def start(id:Int) { total(id) -= System.nanoTime(); }
    public def clear(id:Int) { total(id) = 0; }
    public def stop(id:Int) { total(id) += System.nanoTime(); count(id)++; }
}
