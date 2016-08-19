package holding;
//import java.lang.Iterable;

import java.util.*;

/**
 * Created by jack.zhang on 8/19/2016.
 */
public class MultiIterableClass extends IterableClass {

    // construct iterator myself
    public Iterable<String> reversed() {
        return new Iterable<String>() {
            public Iterator<String> iterator() {
                return new Iterator<String>() {
                    private int index = words.length - 1;

                    public boolean hasNext() {
                        return index > -1;
                    }

                    public String next() {
                        return words[index--];
                    }

                    public void remove() { // not supported
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }

    // shuffle a new array
    // and return its iterator
    public Iterable<String> randomized() {
        return new Iterable<String>() {
            public Iterator<String> iterator () {
                List<String> shuffled = new ArrayList<String>(Arrays.asList(words));
                Collections.shuffle(shuffled, new Random(47));
                return shuffled.iterator();
            }
        };
    }

    public static void main(String[] args) {
        MultiIterableClass mic = new MultiIterableClass();

        for(String s : mic)
            System.out.print(s + " ");
        System.out.println();

        for(String s : mic.reversed())
            System.out.print(s + " ");
        System.out.println();

        for(String s : mic.randomized())
            System.out.print(s + " ");
        System.out.println();

    }
}

