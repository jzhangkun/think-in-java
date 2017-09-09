package typeinfo;

/**
 * Created by jzhangkun on 23/10/2016.
 */

class Foo {}
class Bar extends Foo {}
public class ClassTest {
    public static void main(String[] args) {
        Foo f = null;
        try {
            f = Foo.class.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println("f isInstance Foo: " + Foo.class.isInstance(f));

    }
}
