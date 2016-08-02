package polymorphism.ex10;

/**
 * Created by jack.zhang on 8/2/2016.
 */

    class Foo {
        public Foo () {}
        public void f() {
            System.out.println("Foo.f()");
            g();
        }
        public void g() {
            System.out.println("Foo.g()");
        }
    }
    class Bar extends Foo {
        @Override
        public void g() {
            System.out.println("Bar.g()");
        }
    }

    public class Entry {
        public static void main(String[] args) {
            Bar bar = new Bar();
            bar.f();
        }
    }
