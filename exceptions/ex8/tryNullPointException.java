package exceptions.ex8;
import exceptions.ex2.nullPointerException;

/**
 * Created by jack.zhang on 8/23/2016.
 */
public class tryNullPointException {
    public static void f() throws NullPointerException {
        throw new NullPointerException();
    }
    public static void main(String[] args) {
        try {
            f();
        } catch(NullPointerException e) {
            e.printStackTrace();
        }
    }
}
