package innerclasses.ex11;

/**
 * Created by jack.zhang on 8/9/2016.
 */

interface I {
    void f();
}

class A {
    private class B implements I {
        public void f() { System.out.println("A.B.f()"); }
    }
    public I inner() {
        return new B();
    }
}

public class Test {
    public static void main(String[] args) {
        A a = new A();
        I inner = a.inner();
        // can not downcast
        //A.B inner = a.inner();
        inner.f();
    }
}
