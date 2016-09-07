package exceptions.ex28;

/**
 * Created with IntelliJ IDEA.
 * User: jzhangkun
 * Date: 8/20/16
 * Time: 3:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyException extends RuntimeException {
    private String exception;
    public MyException(String e) {
        exception = e;
    }
    public String toString() {
        return "MyException: " + exception;
    }
    public static void main(String[] args) {
        // Could neglect try/catch block
        //try {
            throw new MyException("internal error");
        //} catch(MyException e) {
        //    System.out.println(e);
        //}
    }
}
