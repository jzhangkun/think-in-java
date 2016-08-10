package interfaces.filters;

/**
 * Created by jack.zhang on 8/5/2016.
 */
public class LowPass extends Filter {
    private double cutoff;
    public LowPass(double cutoff) {
        this.cutoff = cutoff;
    }
    public Waveform process(Waveform input) {
        return input;
    }
}
