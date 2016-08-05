package interfaces.interfaceprocessor;

/**
 * Created by jack.zhang on 8/5/2016.
 */
public class Apply {
    //? why makes process() "static"?
    public static void process(Processor p, Object s) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }
}
