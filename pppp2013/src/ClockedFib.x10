public class ClockedFib {
    public static def main(s:Rail[String]) {
        val N:Int = s.size > 0 ? Int.parseInt(s(0)) : 1000n;
        Console.OUT.println("Started!");
        finish async {
            val x = new Clocked[Int](1n);
            val y = new Clocked[Int](1n);
            async clocked(x.clock, y.clock) {
                while (y() < N) {
                    x() = x() + y();
                    x.next();
                    y.next();
                }
                x() = (Int.MAX_VALUE);
            }
            async clocked(x.clock, y.clock) {
                while (x() < N) {
                    y() = x();
                    Console.OUT.print(" " +  x());
                    y.next();
                    x.next();
                    
                }
                y() = (Int.MAX_VALUE);
                Console.OUT.println();
            }
        }
    }
}