package examples;

/**
 * An illustration of how to do enum's in X10.
 * Implement an enum as a struct with private fields. It may have as many methods
 * as you want.
 * 
 * <p>Make the constructors private. Have public static fields for all the desired
 * values of the enum type. Have a static field (e.g. Planets below) that
 * contains an Iterator over the array of all the fields.
 * 
 * <p>Define an equals method if you wish equality to reflect equality on a subset
 * of the fields. Otherwise the default equality should suffice.
 * 
 */
public struct Planet {
	
	private val mass:Double;
	private val radius:Double;
	private val name:String;
	private def this(m:Double, r:Double,n:String) {
		this.mass=m;
		this.radius=r;
		this.name=n;
	}
	
	public static val G:Double=6.67e-11;
	
	public def mass():Double=mass;
	public def radius():Double=radius;
	public def name():String=name;
	
	public def gOnSurface():Double= G*mass/(radius*radius);
	public def weightOnSurface(m:Double):Double=m*gOnSurface();
	public def toString()=name;
	public static def toPlanet(s:String):Planet {
		for (p in Planets) 
			if (s.equalsIgnoreCase(p.name())) 
				return p;
		throw new RuntimeException("No such planet.");
	}
	public static val MERCURY=Planet(3.303e23,2.4937e6,"Mercury");
	public static val VENUS=Planet(4.869e24,6.0518e6,"Venus");
	public static val EARTH=Planet(5.976e24,6.37184e6,"Earth");
	public static val MARS=Planet(6.421e23,3.3972e6,"Mars");
	public static val JUPITER=Planet(1.9e27,7.1492e7,"Jupiter");
	public static val SATURN=Planet(5.688e26,6.0268e7,"Saturn");
	public static val URANUS=Planet(8.686e25,2.5559e7,"Uranus");
	public static val NEPTUNE=Planet(1.024e26,2.4746e7,"Neptune");
	public static val PLUTO=Planet(1.27e22,2.274e7,"Pluto");
	
	public static val Planets=[MERCURY,VENUS,EARTH,MARS,JUPITER,SATURN,
	                          URANUS,NEPTUNE,PLUTO].values();
	
	public static def main(args:Array[String](1)) {
		if (args.size !=2) {
			Console.OUT.println("Usage: <weight:Double> <name:String>");
			return;
		}
		val w = Int.parseInt(args(0));
		val q = toPlanet(args(1));
		for (p in Planets) {
			if (q !=p) 
				Console.OUT.printf("You weigh %s kg on %s.%n", [p.weightOnSurface(w),p]);
		}
	}
}