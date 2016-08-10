package innerclasses.ex12;

/**
 * Created by jack.zhang on 8/9/2016.
 */
abstract class B {
    public abstract void set(String s);
}
class A {
    private String s;
    private void f() {
        System.out.println("A.f()");
    }
    public B inner() {
        return new B() {
            public void set(String input) {
                s = input;
                f();
            }
        };
    }
    public String toString() {
        return s;
    }
}

public class Test {
    public static void main(String[] args) {
        A a = new A();
        B b = a.inner();
        b.set("Hello");
        Class<?> wClass = A.class;
        System.out.print(wClass);
    }
}
