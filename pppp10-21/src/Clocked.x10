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
    /** Read in the current phase without signaling
        that you are finished reading. */
    public def apply()=v;

    /** Write a value into the variable. Follow a two phase protocol.
        <p>Rising edge: Wait for readers to finish, so you are clear to write.
        <p>Write.
        <p> Falling edge: Signal to readers that they are clera to read, do not block.
    */
    public operator this() = (x:T) {
        clock.next(); // Rising edge
        this.v=x;  // Write
        clock.resume(); // Falling edge
    }
    /** Read a value from the variable. Complements the two phase write.
        <p> Falling edge: wait for writer to signal its clear to read
        <p> Read
        <p> Rising edge: signal that reading is completed, so writer is clear to write.
    */
    public def next():T {
        clock.next(); // Falling edge
        val n = v;   // Read
        clock.resume(); // Rising edge
        return n;
    }
    public def toString() =name;
}