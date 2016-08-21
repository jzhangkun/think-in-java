package exceptions.ex4;

/**
 * Created with IntelliJ IDEA.
 * User: jzhangkun
 * Date: 8/20/16
 * Time: 3:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyException extends Exception {
    private String exception;
    public MyException(String e) {
        exception = e;
    }
    public String toString() {
        return "MyException: " + exception;
    }
    public static void main(String[] args) {
        try {
            throw new MyException("internal error");
        } catch(MyException e) {
            System.out.println(e);
        }
    }
}
