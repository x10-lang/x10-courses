package pppp.lazystream.examples;
import pppp.lazystream.*;

import x10.util.Ordered;
import pppp.util.Logger;
/**
 * Some examples of filters on signals.
 * 
 * Some examples taken from Jack Dennis' MIT memo 362.
 */
public class Filters {
    static type Signal = Stream[Double];
    public static def Average(a:Signal):Signal= () => {
        val ac = a(), act=ac.t();
        new Cons((ac.h+act.h)/2, Average(act.t))
    };
       

    public static def Interpolant(a:Signal):Signal = () => {
        val a1 = a().h, t1=a().t,
            a2=t1().h, t2=t1().t, 
            a3=t2().h, t3=t2().t,
            a4=t3().h;
        new Cons[Double](a1, Stream.append([(a1+3*a2)/4, (a2+a3)/2, (3*a3+a4)/4], 
                Interpolant(t3)))
    };

}