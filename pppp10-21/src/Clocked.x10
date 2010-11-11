class Clocked[T](clock:Clock) implements ()=>T{
    var v:T;
    val name:String;
    def this(x:T) {
        this(x,Clock.make(), "");
    }
    def this(x:T, c:Clock) {
        this(x, c, "");
    }
    def this(x:T, c:Clock, s:String) {
        property(c);
        this.v=x; 
        this.name=s;
    }
    public def apply()=v;
    public operator this() = (x:T) {
        // readers must do a set 
        clock.next(); // wait for readers to finish, so you are clear to write
        this.v=x;  // write
        clock.next(); // wait for others to write, so u are clear to read
    }
    public def next():T {
        val n = v;
        clock.next();
        return n;
    }
    public def toString() =name;
}