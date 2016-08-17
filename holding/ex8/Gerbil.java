package holding.ex8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;

/**
 * Created by jack.zhang on 8/16/2016.
 */
public class Gerbil {
    private int GerbilNumber;
    Gerbil(int n) {
        GerbilNumber = n;
    }
    public String toString() {
        return this.getClass().getSimpleName() + " " + GerbilNumber;
    }
    public static void hop(Iterator<Gerbil> it) {
        while(it.hasNext()) {
            Gerbil g = it.next();
            System.out.println(g + " is hopping");
        }
    }
    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
        for(int i = 0; i < 5; i++)
            gerbils.add(new Gerbil(i));
        hop(gerbils.iterator());
    }
}
