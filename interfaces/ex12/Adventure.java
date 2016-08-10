package interfaces.ex12;

/**
 * Created by jack.zhang on 8/8/2016.
 */

interface CanFight {
    void fight();
}

interface CanSwim {
    void swim();
}

interface CanFly {
    void fly();
}
interface CanClimb {
    void climb();
}
class ActionCharactor {
    public void fight() { System.out.println("ActionCharactor.fight()"); };
}

class Hero extends ActionCharactor
        implements CanFight, CanSwim, CanFly, CanClimb {
    public void swim() { System.out.println("Hero.swim()"); }
    public void fly() { System.out.println("Hero.fly()"); }
    public void climb() { System.out.println("Hero.climb()"); }
    //@Override
    //public void fight() { System.out.println("Fight like a Hero!"); }
}

public class Adventure {
    public static void t(CanFight x) { x.fight(); }
    public static void u(CanSwim x) { x.swim(); }
    public static void v(CanFly x) { x.fly(); }
    public static void z(CanClimb x) { x.climb(); }
    public static void w(ActionCharactor x) { x.fight(); }
    public static void main(String[] args) {
        Hero h = new Hero();
        t(h); // Treat it as a CanFight. but fight() is from class ActionCharactor
        u(h); // Treat it as a CanSwim.
        v(h); // Treat it as a CanFly.
        z(h); // Treat it as a CanClimb
        w(h); // Treat it as an ActionCharactor
    }
}
