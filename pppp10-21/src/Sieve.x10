public class Sieve {

    public static def main(s:Array[String](1)) {
        val N = s.size > 0 ? Int.parseInt(s(0)) : 100;
        val primesO = new Clocked[Int](0);
        primes(gen(N));
    }
    static def gen(N:Int):Clocked[Int] {
        val x = new Clocked[Int](2);
        async clocked (x.clock) {
            for ([i] in 3..N) {
                x() = i;
            }
            x() = -1;
        }
        return x;
    }
    static def primes(nums:Clocked[Int]) {
        async clocked(nums.clock) {
            val n = nums();
            if (n >= 0) {
              Console.OUT.print(" " + n);
              primes(sieve(n, nums));
            } else {
                Console.OUT.println();
            }
        }
    }
    static def sieve(prime:Int, nums:Clocked[Int]):Clocked[Int] {
        val result:Clocked[Int];
        while (true) {
            val n = nums.next();
            if (n < 0) 
                return new Clocked[Int](-1);
            if (n % prime != 0) {
                result = new Clocked[Int](n);
                break;
            }
        }
        async clocked (nums.clock, result.clock) {
            while (true) {
                val n = nums.next();
                if (n < 0)
                    break;
                if (n % prime != 0) {
                    result() = n;
                }
            }
            result() = -1;
        }
        return result;
    }
}