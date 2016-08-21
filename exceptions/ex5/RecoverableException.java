package exceptions.ex5;

/**
 * Created with IntelliJ IDEA.
 * User: jzhangkun
 * Date: 8/20/16
 * Time: 3:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class RecoverableException {
    public static void main(String[] args) {
        boolean has_exception = true;
        int count = 0;
        while(has_exception) {
             try {
                 count++;
                 throw new Exception("error " + count);
             } catch (Exception e) {
                 System.out.println(e);
                 if (count >= 5) {
                     has_exception = false;
                 }
             }
        }
        System.out.println("no exceptions");
    }
}
