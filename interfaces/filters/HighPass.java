package interfaces.filters;

/**
 * Created by jack.zhang on 8/5/2016.
 */
public class HighPass extends Filter {
    private double cutoff;
    public HighPass(double cutoff) {
        this.cutoff = cutoff;
    }
    public Waveform process(Waveform input) {
        return input;
    }
}
