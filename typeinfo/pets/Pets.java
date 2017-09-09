package typeinfo.pets;

import java.util.ArrayList;
import typeinfo.ex15.PetCreator;

/**
 * Created by jzhangkun on 27/05/2017.
 */
public class Pets {
    //public static final PetCreator creator = new LiteralPetCreator();
    // ex15 registerred factory PetCreator
    public static final PetCreator creator = new PetCreator();
    public static Pet randomPet() {
        return creator.randomPet();
    }
    public static Pet[] createArray(int size) {
        return creator.createArray(size);
    }
    public static ArrayList<Pet> arrayList(int size) {
        return creator.arrayList(size);
    }
}
