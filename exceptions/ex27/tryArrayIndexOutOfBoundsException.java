package exceptions.ex27;

/**
 * Created with IntelliJ IDEA.
 * User: jzhangkun
 * Date: 8/20/16
 * Time: 3:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class tryArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        String[] ss = "To be or not to be".split(" ");
        try {
            ss[6] = ".";
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
