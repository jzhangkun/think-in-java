package interfaces.filters;

/**
 * Created by jack.zhang on 8/5/2016.
 */
public class Filter {
    public String name() {
        return getClass().getSimpleName();
    }
    public Waveform process(Waveform input) { return input; }
}
