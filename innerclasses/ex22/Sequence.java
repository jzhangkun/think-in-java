package innerclasses.ex22;

import innerclasses.Selector;

/**
 * Created by jack.zhang on 8/9/2016.
 */

public class Sequence {
    private Object[] items;
    private int next = 0;
    public Sequence(int size) { items = new Object[size]; }
    public void add(Object x) {
        if (next < items.length) {
            items[next++] = x;
        }
    }
    private class SequenceSelector implements Selector {
        private int i = 0;
        public boolean end() { return i == items.length; }
        public Object current() { return items[i]; }
        public void next() { if (i < items.length ) i++; }
        // ex4
        public Sequence outer() {
            return Sequence.this;
        }
    }
    public Selector selector() {
        return new SequenceSelector();
    }
    public Selector reverseSelector() {
        return new Selector() {
            private int i = items.length;
            public boolean end() { return i == 0; }
            public Object current() { return items[i-1]; }
            public void next() { if (i > 0) i--; }
        };
    }
    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.selector();
        while(!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
        System.out.println("\n\nReverse selector and print");
        selector = sequence.reverseSelector();
        System.out.println("outside while " + selector.current());
        while(!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}
