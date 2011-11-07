import x10.compiler.*;
import x10.util.OptionsParser;
import x10.util.Option;
import x10.lang.Math;
import x10.util.Random;
import x10.util.Stack;

//@x10.compiler.NativeCPPInclude("google/profiler.h")

public class UTSBin {
    
    private static val NORMALIZER = 2147483648.0; // does not depend on input parameters
    
    public static def main (args : Array[String](1)) {
        try {
            val opts = new OptionsParser(args, null,
                     [Option("b", "", "Root branching factor"),
                     Option("r", "", "Root seed (0 <= r <= 2^31"),
                     Option("q", "", "BIN: probability of a non-leaf node"),
                     Option("m", "", "BIN: number of children for non-leaf node"),
                     Option("k", "", "Number of items to steal; default 0. If 0, steal half. "),
                     Option("v", "", "Verbose, default 0 (no)."),
                     Option("n", "", "Number of nodes to process before probing."),
                     Option("w", "", "Number of thieves to send out, less 1. (Default 0, so 1 thief will be sent out."),
                     Option("l", "", "Lifeline method: 0 for linear, 1 for hypercube, 2 for sparse chunked, 3 for sparse embedding -- in which case also enter dimension"),
                     Option("z", "", "Dimension of the sparse hypercube")
                     ]);
            
            val t = opts ("-t", 0);
            val b0 = opts ("-b", 4);
            val r = opts ("-r", 0);
            val verbose = opts("-v",0)==1;
            val n = opts("-n",200);
            val w = opts("-w", 0);
            val e = opts("-e", 0)==1;
            
            // binomial options
            val q = opts ("-q", 15.0/64.0);
            val m = opts ("-m", 4);
            val k = opts ("-k", 0);
            
            // Figure out what kind of connectivity is needed.
            val l = opts ("-l", 3);
            val z = opts ("-z", 1);
            
            Console.OUT.println("--------");
            Console.OUT.println("Places="+Place.MAX_PLACES);
            Console.OUT.println("b0=" + b0 +
                    "   r=" + r +
                    "   m=" + m +
                    "   k=" + k +
                    "   w=" + w +
                    "   n=" + n +
                    "   q=" + q +
                    "   l=" + l + 
                    "   z=" + z +
                    (l==3 ? " base=" + (z==0 ? 0 : NetworkGenerator.findW(Place.MAX_PLACES, z)) : "")
            );
            
            val qq = (q*NORMALIZER) as Long;
            
            val P = Place.MAX_PLACES;
            
            // Generate the lifelines
            val lifelines:Rail[Rail[Int]] = 
                (0==l) ? NetworkGenerator.generateRing(P) :
                    (1==l) ? NetworkGenerator.generateHyperCube(P):
                        (2==l) ? NetworkGenerator.generateChunkedGraph (P, z):
                            NetworkGenerator.generateSparseEmbedding (P, z);
            
            val st = PlaceLocalHandle.make[ParUTSBin](Dist.makeUnique(), ()=>new ParUTSBin(b0, qq, m, k, n, w, e, l, lifelines(here.id)));
            
            Console.OUT.println("Starting...");
            //@Native("c++", "ProfilerStart(\"UTS.prof\");") {}
            var time:Long = System.nanoTime();
            st().main(st, SHA1Rand(r));
            //@Native("c++", "ProfilerStop();") {}
            time = System.nanoTime() - time;
            Console.OUT.println("Finished.");
            
            val allCounters = new Rail[Array[Counter](1){rail}](P,(i:Int) => at(Place(i)) st().counters());
            st().counter.stats(allCounters, time, verbose, false);
            
            Console.OUT.println("--------");
        } catch (e:Throwable) {
            e.printStackTrace();
        }
    }
}

// vim: ts=2:sw=2:et
