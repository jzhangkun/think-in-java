package typeinfo;

/**
 * Created with IntelliJ IDEA.
 * User: jzhangkun
 * Date: 9/8/16
 * Time: 7:16 AM
 * To change this template use File | Settings | File Templates.
 */
interface HasBatteries {}
interface Waterproof {}
interface Shoots {}
interface Speakable {} // ex2

class Toy {
    Toy() {}
    Toy(int i) {}
}

class FancyToy extends Toy
        implements HasBatteries, Waterproof, Shoots, Speakable {
    FancyToy() { super(1); }
}

class ToyTest {
    static void printInfo(Class cc) {
        System.out.println("Class name: " + cc.getName() +
                " is interface? [" + cc.isInterface() + "]");
        System.out.println("Simple name: " + cc.getSimpleName());
        System.out.println("Canonical name: " + cc.getCanonicalName());
    }
    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("typeinfo.FancyToy");
        } catch(ClassNotFoundException e) {
            System.out.println("can't find FancyToy");
            System.exit(1);
        }
        printInfo(c);
        for(Class face: c.getInterfaces())
            printInfo(face);
        Class up = c.getSuperclass();
        Object obj = null;
        try {
            obj = up.newInstance();
        } catch(InstantiationException e) {
            System.out.println("Can't instantiate");
            System.exit(1);
        } catch(IllegalAccessException e) {
            System.out.println("Cannot access");
            System.exit(1);
        }
        printInfo(obj.getClass());
    }
}

