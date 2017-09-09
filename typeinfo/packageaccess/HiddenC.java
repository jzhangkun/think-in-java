package typeinfo.packageaccess;
import typeinfo.interfaces.*;
/**
 * Created by jzhangkun on 23/05/2017.
 */

class C implements A {
    public void f()    { System.out.println("Public C.f()"); }
    public void g()    { System.out.println("Public C.g()"); }
    void u()           { System.out.println("package C.u()"); }
    protected void v() { System.out.println("protected C.v()"); }
    private void w()   { System.out.println("private C.W()"); }
}
public class HiddenC {
    public static A MakeA() { return new C(); }
    public static void main(String[] args) {
        A a = MakeA();
        a.f();
        // can't access method out of A
        //a.g();
    }
}
