package typeinfo.pets;

import java.util.*;

/**
 * Created by jzhangkun on 27/05/2017.
 */
public class LiteralPetCreator  extends PetCreator {
    public static final List<Class<? extends Pet>> allTypes = Collections.unmodifiableList(Arrays.asList(
        Pet.class, Dog.class, Cat.class, Rodent.class,
        Mutt.class, Pug.class, EgyptianMau.class, Manx.class,
        Cymric.class, Rat.class, Mouse.class, Hamster.class,
        Gerbil.class // ex11
    ));
    private static final List<Class<? extends Pet>> types = allTypes.subList(allTypes.indexOf(Mutt.class), allTypes.size());
    public List<Class<? extends Pet>> types() {
        return types;
    }
    public static void main(String[] args) {
        System.out.println(types);
    }

}
