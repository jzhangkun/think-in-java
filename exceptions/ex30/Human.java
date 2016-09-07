package exceptions.ex30;

/**
 * Created with IntelliJ IDEA.
 * User: jzhangkun
 * Date: 8/26/16
 * Time: 10:14 PM
 * To change this template use File | Settings | File Templates.
 */

class Annoyance extends RuntimeException {}
class Sneeze extends Annoyance {}

public class Human {
    public static void main(String[] args) {
        // Catch the exact type
        try {
            throw new Sneeze();
        } catch(Sneeze s) {
             System.out.println("Caught Sneeze");
        } catch(Annoyance a) {
            System.out.println("Caught Annoyance");
        }
        // Catch the base type
        try {
            throw new Sneeze();
        } catch(Annoyance a) {
            System.out.println("Caught Annoyance");
        }
    }
}
