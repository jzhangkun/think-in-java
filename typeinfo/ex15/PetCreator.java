package typeinfo.ex15;
import java.util.*;
import typeinfo.factory.Factory;
import typeinfo.pets.*;

/**
 * Created by jzhangkun on 28/05/2017.
 */
public class PetCreator {
    Random rand = new Random();
    static List<Factory<? extends Pet>> petFactory
        = new ArrayList<Factory<? extends Pet>>();
    static {
        petFactory.add(new CatFactory());
        petFactory.add(new DogFactory());
        petFactory.add(new RatFactory());
    }
    public Pet randomPet() {
        int n = rand.nextInt(petFactory.size());
        return petFactory.get(n).create();
    }
    public Pet[] createArray(int size) {
        Pet[] result = new Pet[size];
        for(int i = 0; i < size; i++)
            result[i] = randomPet();
        return result;
    }
    public ArrayList<Pet> arrayList(int size) {
        ArrayList<Pet> result = new ArrayList<Pet>();
        Collections.addAll(result, createArray(size));
        return result;
    }
    public static void main(String[] args) {
        PetCreator creator = new PetCreator();
        System.out.println(creator.createArray(10));
    }
}

class CatFactory implements typeinfo.factory.Factory<Cat> {
    public Cat create() { return new Cat(); }
}
class DogFactory implements typeinfo.factory.Factory<Dog> {
    public Dog create() { return new Dog(); }
}
class RatFactory implements typeinfo.factory.Factory<Rat> {
    public Rat create() { return new Rat(); }
}
