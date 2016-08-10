package innerclasses.ex7;

/**
 * Created by jack.zhang on 8/9/2016.
 */
class A {
    private String s;
    private void f() {
        System.out.println("A.f()");
    }
    class B {
        private String my = "secret";
        public void set(String input) {
            s = input;
            f();
        }
    }
    public void inner(String input) {
        B b = new B();
        b.set(input);
        System.out.println(b.my);
    }
    public String toString() {
        return s;
    }
}
public class Test {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a);
        a.inner("hello");
        System.out.println(a);
    }
}
