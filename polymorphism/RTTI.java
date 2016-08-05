package polymorphism;

// RTTI: runtime type identification?

/**
 * Created by jack.zhang on 8/5/2016.
 */
class Useful {
    public void f() {}
    public void g() {}
}
class MoreUseful extends Useful {

    public void f() {}
    public void g() {}
    public void u() {}
    public void v() {}
    public void w() {}
}
public class RTTI {
    public static void main(String[] args) {
        Useful[] x = {
                new Useful(),
                new MoreUseful()
        };
        x[0].f();
        x[1].f();
        ((MoreUseful)x[1]).u();
        //((MoreUseful)x[0]).u(); // downcast/RTTI, exception thrown
    }
}
