package polymorphism;

/**
 * Created by jack.zhang on 8/5/2016.
 */

class Actor {
    public void act() {}
}
class HappyActor extends Actor {
    public void act() { System.out.println("HappyActor");}
}
class SadActor extends Actor {
    public void act() { System.out.println("SadActor"); }
}
class Stage {
    // upcasting for flexiable change
    private Actor actor = new HappyActor();
    public void change() { actor = new SadActor(); }
    public void performPlay() { actor.act(); }
}
public class Transmorgrify {
    public static void main(String[] args) {
        Stage stage = new Stage();
        stage.performPlay();
        stage.change();
        stage.performPlay();
    }
}
