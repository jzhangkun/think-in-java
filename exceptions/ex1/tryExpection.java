package exceptions.ex1;

/**
 * Created with IntelliJ IDEA.
 * User: jzhangkun
 * Date: 8/20/16
 * Time: 2:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class tryExpection {
    public static void main(String[] args) {
        try {
            throw new Exception("exception");
        } catch(Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("final exception");
        }
    }
}
