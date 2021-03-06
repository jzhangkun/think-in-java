package polymorphism.ex13;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * Created with IntelliJ IDEA.
 * User: jzhangkun
 * Date: 8/4/16
 * Time: 8:00 AM
 * To change this template use File | Settings | File Templates.
 */


class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;
    public Shared() {
        System.out.println("Creating " + this);
    }
    public void addRef() { refcount++; }
    protected void dispose() {
        if (--refcount == 0)
            System.out.println("Disposing " + this);
        else
            System.out.println("Decreasing reference count to " + refcount);
    }
    @Override
    public String toString() {
        return "Shared " + id;
    }
    protected void finalize() {
        if (refcount != 0)
            System.out.println("Error: Shared object still got reference");
        else
            System.out.println("Shared object disposed");
    }
}

class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;
    public Composing(Shared shared) {
        System.out.println("Creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }
    protected void dispose() {
        System.out.println("disposing " + this);
        shared.dispose();
    }
    public String toString() {
        return "Composing " + id;
    }
}
public class ReferenceCountingValidation {
    public static void main(String [] args) {
        Shared shared = new Shared();
        Composing[] composing = {
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared)
        };
        for(Composing c: composing)
            c.dispose();

        Composing reference = new Composing(shared);
        WeakReference<Composing> weakRef = new WeakReference<Composing>(reference);
        reference = null;
        //Object myObject = new Object();
        //WeakReference<Object> weakreference = new WeakReference<Object>(myObject);
        //myObject = null;
        System.out.println("before gc = " + weakRef);
        // force garbage collection & finalization
        // not work any more?
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.gc();
        System.runFinalization();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("after gc = " + weakRef);
    }
}

