package interfaces.filters;

/**
 * Created by jack.zhang on 8/5/2016.
 */
public class BrandPass extends Filter {
    private double lowCutoff, highCutoff;
    public BrandPass(double lowCutoff, double highCutoff) {
        this.lowCutoff = lowCutoff;
        this.highCutoff = highCutoff;
    }
    public Waveform process(Waveform input) {
        return input;
    }
}
