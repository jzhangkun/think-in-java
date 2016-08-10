package innerclasses;

/**
 * Created by jack.zhang on 8/9/2016.
 */
public interface Selector {
    boolean end();
    Object current();
    void next();
}