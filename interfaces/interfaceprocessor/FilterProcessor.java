package interfaces.interfaceprocessor;
import interfaces.filters.*;

/**
 * Created by jack.zhang on 8/5/2016.
 */

// adaptor pattern
class FilterAdaptor implements Processor {
    Filter filter;
    FilterAdaptor(Filter filter) {
        this.filter = filter;
    }
    public String name() {
        return filter.name();
    }
    public Waveform process(Object input) {
        return filter.process((Waveform)input);
    }
}
public class FilterProcessor {;
    public static void main(String[] args) {
        Waveform w = new Waveform();
        Apply.process(new FilterAdaptor(new LowPass(1.0)), w);
        Apply.process(new FilterAdaptor(new HighPass(5.0)), w);
        Apply.process(new FilterAdaptor(new BrandPass(1.0, 3.0)), w);
    }
}
