package exceptions;

/**
 * Created by jack.zhang on 8/25/2016.
 */
class NeedsCleanup {
    // Construcation can not fail
    private static long counter = 1;
    private final long id = counter++;
    public void dispose() {
        System.out.println("NeedsCleanup " + id + " disposed");
    }
}
class ConstructionException extends Exception {}
class NeedsCleanup2 extends NeedsCleanup {
    // Construction can fail:
    public NeedsCleanup2() throws ConstructionException {}
}
public class CleanupIdiom {
    public static void main(String[] args) {
        // Section 1:
        NeedsCleanup nc1 = new NeedsCleanup();
        try {
            // ...
        } finally {
            nc1.dispose();
        }

        // Section 2:
        NeedsCleanup nc2 = new NeedsCleanup();
        NeedsCleanup nc3 = new NeedsCleanup();
        try {
            //
        } finally {
            nc3.dispose(); // Reverse order of construction
            nc2.dispose();
        }

        // Section 3:
        // If construction can fail, you must guard each one:
        try {
            NeedsCleanup nc4 = new NeedsCleanup2();
            try {
                NeedsCleanup nc5 = new NeedsCleanup2();
                try {
                    //...
                } finally {
                    nc5.dispose();
                }
            } catch(ConstructionException e) { // nc5 constrctor
                System.out.println(e);
            } finally {
                nc4.dispose();
            }
        } catch(ConstructionException e) { // nc4 constructor
            System.out.println(e);
        }
    }
}
