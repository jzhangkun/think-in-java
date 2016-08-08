package interfaces.test;

/**
 * Created by jack.zhang on 8/8/2016.
 */
interface A {
    void f();
    void g();
}
interface B {
    void f();
    void h();
}
interface C extends A, B {
    void u();
}
public class TriangleInterface implements C {
    public void f() { System.out.println("f()"); }
    public void g() { System.out.println("g()"); }
    public void h() { System.out.println("h()"); }
    public void u() { System.out.println("u()"); }
    public static void main(String[] args) {
        TriangleInterface in = new TriangleInterface();
        in.f();
        in.g();
        in.h();
        in.u();
    }
}
