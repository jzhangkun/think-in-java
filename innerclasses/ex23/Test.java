package innerclasses.ex23;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * User: jzhangkun
 * Date: 8/11/16
 * Time: 7:11 AM
 * To change this template use File | Settings | File Templates.
 */
interface U {
    void f();
    void g();
    void h();
}
class A {
    public U makeU () {
        return new U() {
            public void f() { System.out.println("A.U.f()"); };
            public void g() { System.out.println("A.U.g()"); };
            public void h() { System.out.println("A.U.h()"); };
        };
    }
}
class B {
    private LinkedList<U> au = new LinkedList<U>();
    public void add(U u) {
        au.add(u);
    }
    public void remove(U u) {
        au.remove(u);
    }
    public void list() {
        for(U e: au) {
            e.f();
            e.g();
            e.h();
        }
    }
}

public class Test {
    public static void main(String[] args) {
        ArrayList<A> aa = new ArrayList<A>();
        B b = new B();
        for(int i = 0; i < 5; i++)
            aa.add(new A());
        for(A e: aa) {
            b.add(e.makeU());
        }
        b.list();
    }
}

