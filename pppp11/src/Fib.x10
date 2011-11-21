public class Fib {
    def this() {}
	
    def fibo(n:Int):Int = {
        var x:Int=0, y:Int=1;
        for (var i:Int=2; i <= n; i++) {
            val t = x+y;
            x=y;
            y=t;
        }
        return y;
    }
    def fib(n:Int):Int = n < 2 ? n : fib(n-1)+fib(n-2);
	
    def fact(n:long):long = n < 2L ? 1L : n*fact(n-1);
	
    def afib(n:Int):Int {
    	if (n < 2)
    		return n;
    	val f1:Int;
    	val f2:Int;
    	finish {
    		async f1 = afib(n-1);
    		async f2 = afib(n-2);
    	}
    	return f1+f2;
    }
    public static def main(args:Array[String](1)) {
        if (args.size == 0) {
            Console.OUT.println("Sorry. Run fib <n:int>");
            return;
        }
        val n = Int.parseInt(args(0));
        val f = new Fib();
		
        for (var i:Int=2; i <= n; i++) {
            val fib = f.fib(i);
            val afib = f.afib(i);
            Console.OUT.print("fib(" + i + ")= " + fib );
            Console.OUT.println(fib == afib ? "(ok)" : " afib = " + afib);
        }
    }
}
