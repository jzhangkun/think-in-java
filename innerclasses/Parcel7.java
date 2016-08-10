package innerclasses;

/**
 * Created by jack.zhang on 8/9/2016.
 */

// anonymous inner class
public class Parcel7 {
    public Contents contents() {
        return new Contents() {
            private int i = 1;
            public int value() { return 1; }
        };
    }
    public static void main(String[] args) {
        Parcel7 p = new Parcel7();
        Contents c = p.contents();
    }

}
