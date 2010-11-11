public class ClockedFib {
    public static def main(s:Array[String](1)) {
        val N:Int = s.size > 0 ? Int.parseInt(s(0)) : 1000;
        clocked finish {
            val x = new Clocked[Int](1);
            val y = new Clocked[Int](1);
            clocked async {
                while (y() < N) {
                    x() = x() + y();
                }
                x() = (Int.MAX_VALUE);
            }
            clocked async {
                while (x() < N) {
                    y() = x();
                    Console.OUT.print(" " +  x());
                }
                y() = (Int.MAX_VALUE);
                Console.OUT.println();
            }
        }
    }
}