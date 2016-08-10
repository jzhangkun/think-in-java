package interfaces.test;

/**
 * Created by jack.zhang on 8/8/2016.
 */
interface A {
    void f();
    void f(String s);
    void g();
}
interface B {
    void f();
    void f(int i);
    void h();
}
interface C extends A, B {
    void u();
}
public class TriangleInterface implements C {
    public void f() { System.out.println("void f()"); }
    public void f(String s) { System.out.println("String f()"); }
    public void f(int i) { System.out.println("Int f()"); }
    public void g() { System.out.println("g()"); }
    public void h() { System.out.println("h()"); }
    public void u() { System.out.println("u()"); }
    public static void main(String[] args) {
        TriangleInterface in = new TriangleInterface();
        in.f();
        in.f("Hello");
        in.f(5);
        in.g();
        in.h();
        in.u();
    }
}
