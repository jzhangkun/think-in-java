package interfaces;

import java.awt.*;

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
class ActionCharactor {
    public void fight() { System.out.println("ActionCharactor.fight()"); };
}
class Hero extends ActionCharactor
        implements CanFight, CanSwim, CanFly {
    public void swim() { System.out.println("Hero.swim()"); }
    public void fly() { System.out.println("Hero.fly()"); }
    //@Override
    //public void fight() { System.out.println("Fight like a Hero!"); }
}
public class Adventure {
    public static void t(CanFight x) { x.fight(); }
    public static void u(CanSwim x) { x.swim(); }
    public static void v(CanFly x) { x.fly(); }
    public static void w(ActionCharactor x) { x.fight(); }
    public static void main(String[] args) {
        Hero h = new Hero();
        t(h); // Treat it as a CanFight. but fight() is from class ActionCharactor
        u(h); // Treat it as a CanSwim.
        v(h); // Treat it as a CanFly.
        w(h); // Treat it as an ActionCharactor
    }
}
