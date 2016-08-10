package innerclasses.ex9;

/**
 * Created by jack.zhang on 8/9/2016.
 */

interface A {
    void f();
}

class B {
    public A af() {
        class F implements A {
            public void f() {
                System.out.println("B.af().F.f()");
            }
        }
        return new F();
    }

}
public class Test {
    public static void main(String[] args) {
        B b = new B();
        b.af().f();
    }
}
