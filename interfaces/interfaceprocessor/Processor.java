package interfaces.interfaceprocessor;

/**
 * Created by jack.zhang on 8/5/2016.
 */
public interface Processor {
    String name();
    Object process(Object input);
}
