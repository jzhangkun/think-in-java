package interfaces.ex13;

/**
 * Created by jack.zhang on 8/8/2016.
 */

interface A {
    void f();
}
interface B extends A {
    void g();
}
interface C extends A {
    void h();
}
interface D extends B, C {
    void u();
}

public class RhombusInterface implements D {
    public void f() { System.out.println("f()"); }
    public void g() { System.out.println("g()"); }
    public void h() { System.out.println("h()"); }
    public void u() { System.out.println("u()"); }
    public static void main(String[] args) {
        RhombusInterface in = new RhombusInterface();
        in.f();
        in.g();
        in.h();
        in.u();
    }
}
