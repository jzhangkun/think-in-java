package exceptions;

/**
 * Created with IntelliJ IDEA.
 * User: jzhangkun
 * Date: 8/24/16
 * Time: 9:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class OnOffSwitch {
    private static Switch sw = new Switch();
    public static void f() throws OnOffException1, OnOffException2 {}

    public static void main(String[] args) {
        try {
            sw.on();
            f();
        } catch(OnOffException1 e) {
            System.out.println("OnOffException1");
        } catch(OnOffException2 e) {
            System.out.println("OnOffException2");
        } finally {
            sw.off();
        }

    }
}
