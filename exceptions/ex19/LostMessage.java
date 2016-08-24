package exceptions.ex19;

/**
 * Created with IntelliJ IDEA.
 * User: jzhangkun
 * Date: 8/24/16
 * Time: 10:02 PM
 * To change this template use File | Settings | File Templates.
 */

class VeryImoortException extends Exception {
    public String toString() {
        return "A very important exception!";
    }
}

class HoHumException extends Exception {
    public String toString() {
        return "A trivial exception!";
    }
}

public class LostMessage {
    void f() throws VeryImoortException {
        throw new VeryImoortException();
    }
    void dispose() throws HoHumException {
        throw new HoHumException();
    }
    public static void main(String[] args) {
        try {
            LostMessage lm = new LostMessage();
            try {
                lm.f();
            } finally {
                try {
                    lm.dispose();
                } catch(Exception e) {
                    System.out.println(e);
                }
            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }

}
