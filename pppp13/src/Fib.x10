public class Fib {
    def this() {}
	
    def fibo(n:Int):Int = {
        var x:Int=0n, y:Int=1n;
        for (var i:Int=2n; i <= n; i++) {
            val t = x+y;
            x=y;
            y=t;
        }
        return y;
    }
    def fib(n:Int):Int = n < 2n ? n : fib(n-1n)+fib(n-2n);
	
    def fact(n:long):long = n < 2L ? 1L : n*fact(n-1);
	
    def afib(n:Int):Int {
    	if (n < 2n)
    		return n;
    	val f1:Int;
    	val f2:Int;
    	finish {
    		async f1 = afib(n-1n);
    		async f2 = afib(n-2n);
    	}
    	return f1+f2;
    }
    public static def main(args:Rail[String]) {
        if (args.size == 0) {
            Console.OUT.println("Sorry. Run fib <n:int>");
            return;
        }
        val n = Int.parseInt(args(0n));
        val f = new Fib();
		
        for (var i:Int=2n; i <= n; i++) {
            val fib = f.fib(i);
            val afib = f.afib(i);
            Console.OUT.print("fib(" + i + ")= " + fib );
            Console.OUT.println(fib == afib ? "(ok)" : " afib = " + afib);
        }
    }
}
