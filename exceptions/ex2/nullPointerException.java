package exceptions.ex2;

/**
 * Created with IntelliJ IDEA.
 * User: jzhangkun
 * Date: 8/20/16
 * Time: 2:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class nullPointerException {
    public static void main(String[] args) {
        String s = null;
        try {
            s.length();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
