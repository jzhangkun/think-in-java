package innerclasses.ex2;
import innerclasses.Selector;
import innerclasses.Sequence;

/**
 * Created by jack.zhang on 8/9/2016.
 */
public class StringSequence {
    private String string;
    public StringSequence(String s) {
        string = s;
    }
    public String toString() {
       return string + " ";
    }
    public static void main(String[] args) {
        Sequence sequence = new Sequence(5);
        for (int i = 0; i < 5; i++)
            sequence.add(new StringSequence(Integer.toString(i)));
        Selector selector = sequence.selector();
        while(!selector.end()) {
            System.out.print(selector.current().toString());
            selector.next();
        }
    }
}
