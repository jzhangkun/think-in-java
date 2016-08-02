package polymorphism.ex11;

/**
 * Created by jack.zhang on 8/2/2016.
 */

class Meal {
    public Meal () { System.out.println("Meal()"); }
}
class Lunch extends Meal {
    public Lunch () { System.out.println("Lunch()"); }
}
class PortableLunch extends Lunch {
    public PortableLunch() { System.out.println("PortableLunch()"); }
}
class Bread  {
    public Bread () { System.out.println("Bread()"); }
}
class Cheese  {
    public Cheese () { System.out.println("Cheese()"); }
}
class Lettuce  {
    public Lettuce () { System.out.println("Lettuce()"); }
}
class Pickle {
    public Pickle() { System.out.println("Pickle()"); }
}
public class Sandwich extends PortableLunch {
    private Bread bread = new Bread();
    private Cheese cheese = new Cheese();
    private Lettuce lettuce = new Lettuce();
    public Sandwich () { System.out.println("Sandwich()"); }
    private Pickle pickle = new Pickle();
    public static void main(String[] args) {
        new Sandwich();
    }
}
