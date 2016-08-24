package exceptions;

/**
 * Created with IntelliJ IDEA.
 * User: jzhangkun
 * Date: 8/24/16
 * Time: 9:17 PM
 * To change this template use File | Settings | File Templates.
 */

public class Switch {
    private boolean state = true;
    public boolean read() { return state; }
    public void on() { state = true; System.out.println(this); }
    public void off() { state = false; System.out.println(this); }
    public String toString() { return state ? "on" : "off"; }
}

