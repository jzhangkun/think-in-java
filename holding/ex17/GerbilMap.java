package holding.ex17;

import holding.ex1.Gerbil;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeSet;

/**
 * Created by jack.zhang on 8/18/2016.
 */
public class GerbilMap {
    public static void main(String[] args) {
        Map<String, Gerbil> gerbilPets = new HashMap<String, Gerbil>();
        gerbilPets.put("Fuzzy", new Gerbil(1));
        gerbilPets.put("Spot", new Gerbil(2));
        gerbilPets.put("Light", new Gerbil(3));
        for (String e : gerbilPets.keySet()) {
            Gerbil g = gerbilPets.get(e);
            System.out.print(e + " ");
            g.hop();
        }
        // ex18
        System.out.println(gerbilPets);
        Map<String, Gerbil> linkedHashMap = new LinkedHashMap<String, Gerbil>();
        for (String e : new TreeSet<String>(gerbilPets.keySet()))
            linkedHashMap.put(e, gerbilPets.get(e));
        System.out.println(linkedHashMap);
    }
}