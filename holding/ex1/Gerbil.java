package holding.ex1;

import java.util.ArrayList;

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
    public void hop() {
        System.out.println(this + " is hopping");
    }
    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
        for(int i = 0; i < 5; i++)
            gerbils.add(new Gerbil(i));
        for(int i = 0; i < gerbils.size(); i++)
            gerbils.get(i).hop();
        //for(Gerbil e: gerbils)
        //    e.hop();
    }
}
