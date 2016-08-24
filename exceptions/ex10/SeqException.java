package exceptions.ex10;

/**
 * Created with IntelliJ IDEA.
 * User: jzhangkun
 * Date: 8/24/16
 * Time: 8:48 PM
 * To change this template use File | Settings | File Templates.
 */
class MyException1 extends Exception {}
class MyException2 extends Exception {}

public class SeqException {
    public static void f() throws MyException2 {
        try {
            g();
        } catch(Exception e) {
            throw new MyException2();
        }
    }
    public static void g() throws MyException1 {
        throw new MyException1();
    }
    public static void main(String[] args) {
        try {
            f();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
