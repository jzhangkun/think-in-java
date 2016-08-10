package innerclasses;
import innerclasses.*;
import sun.security.krb5.internal.crypto.Des;

/**
 * Created by jack.zhang on 8/9/2016.
 */

class Parcel4 {
    private class PContents implements Contents {
        private int i = 11;
        public int value() { return i; }
    }
    protected class PDestination implements Destination {
        private String label;
        private PDestination(String whereTo) {
            label = whereTo;
        }
        public String readLabel() {
            return label;
        }
    }
    public PContents contents() {
        return new PContents();
    }
    public PDestination destination(String s) {
        return new PDestination(s);
    }
}

public class TestParcel4 {
    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        Contents c = p.contents();
        Destination d = p.destination("SFO");
        System.out.println("Content has " + c.value());
        System.out.println("Destination to " + d.readLabel());
    }
}
