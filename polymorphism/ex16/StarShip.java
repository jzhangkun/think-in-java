package polymorphism.ex16;

/**
 * Created by jack.zhang on 8/5/2016.
 */
class AlertStatus {
    public void status () {}
}
class AlertGreen extends AlertStatus {
    public void status() { System.out.println("Green Alert"); }
}
class AlertRed extends AlertStatus {
    public void status() { System.out.println("Red Alert"); }
}
class AlertYellow extends AlertStatus {
    public void status() { System.out.println("Yellow Alert"); }
}
public class StarShip {
    private AlertStatus alertStatus = new AlertGreen();
    public void alertClear() {
        alertStatus = new AlertGreen();
    }
    public void alertWarning() {
        alertStatus = new AlertYellow();
    }
    public void alertSound() {
        alertStatus = new AlertRed();
    }
    public void status() {
        alertStatus.status();
    }

    public static void main(String[] args) {
        StarShip starship = new StarShip();
        starship.status();
        starship.alertWarning();
        starship.status();
        starship.alertSound();
        starship.status();
        starship.alertWarning();
        starship.status();
        starship.alertClear();
        starship.status();
    }
}
