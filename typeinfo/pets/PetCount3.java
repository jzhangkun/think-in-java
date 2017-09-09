package typeinfo.pets;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by jzhangkun on 27/05/2017.
 */
public class PetCount3 {
    static class PetCounter extends LinkedHashMap<Class<? extends Pet>, Integer> {
        public PetCounter() {
            super();
            for(Class<? extends Pet> type: LiteralPetCreator.allTypes)
                this.put(type, 0);
        }
        public void count(Pet pet) {
            for (Map.Entry<Class<? extends Pet>, Integer> pair: entrySet())
                if (pair.getKey().isInstance(pet))
                    put(pair.getKey(), pair.getValue()+1);
        }
    }
    public static void main(String[] args) {
        PetCounter petCount = new PetCounter();
        for (Pet pet: Pets.createArray(20)) {
            System.out.print(pet.getClass().getSimpleName() + " ");
            petCount.count(pet);
        }
        System.out.println();
        System.out.println(petCount);
    }
}
