package innerclasses.ex6;

/**
 * Created by jack.zhang on 8/9/2016.
 */
interface A {
    void f();
}

class B {
    protected class C implements A {
        public void f() { System.out.println("B.C.f()"); }
    }
}
public class Test extends B {
    public A af() {
        return new C();
    }
    public static void main(String[] args) {
        Test t = new Test();
        A a = t.af();
        a.f();
    }
}
