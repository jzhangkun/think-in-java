package interfaces.ex3;

/**
 * Created by jack.zhang on 8/5/2016.
 */
abstract class AbstractSup {
    AbstractSup() {
        print();
    }
    abstract void print();
}
public class AbstractSub extends AbstractSup {
    private String str = "Hello World";
    @Override
    public void print() {
        System.out.println(str);
    }
    public static void main(String[] args) {
        AbstractSub sup = new AbstractSub();
        // print "null"
        // because AubstsractSub() calls print(), however
        // by that time, str is not initialized and is null

        sup.print();
        // print "Hello World"
    }
}