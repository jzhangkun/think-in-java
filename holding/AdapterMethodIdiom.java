package holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by jack.zhang on 8/19/2016.
 */

class ReversiableArrayList<T> extends ArrayList<T> {
    public ReversiableArrayList(Collection<T> c){
        super(c);
    }
    public Iterable<T> reversed() {
        return new Iterable<T>() {
            public Iterator<T> iterator() {
                return new Iterator<T>() {
                    int current = size() - 1;
                    public boolean hasNext() {
                        return current > -1;
                    }
                    public T next() {
                        return get(current--);
                    }
                    public void remove() { // not implemented
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }
}
public class AdapterMethodIdiom {
    public static void main(String[] args) {
        ReversiableArrayList<String> ral =
                new ReversiableArrayList<String>(Arrays.asList("To be or not to be".split(" ")));
        for(String s: ral)
            System.out.print(s + " ");
        System.out.println();
        for(String s: ral.reversed())
            System.out.print(s + " ");
        System.out.println();
    }
}
