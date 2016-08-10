package interfaces.filters;

/**
 * Created by jack.zhang on 8/5/2016.
 */
public class Waveform {
    private static long counter;
    private final long id = counter++;
    public String toString() { return "Waveform " + id; }
}
