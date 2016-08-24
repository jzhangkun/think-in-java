package innerclasses;

/**
 * Created by jack.zhang on 8/9/2016.
 */

class ItemIndexOutOfBoundException extends Exception {}

public class Sequence {
    private Object[] items;
    private int next = 0;
    public Sequence(int size) { items = new Object[size]; }
    public void add(Object x) throws ItemIndexOutOfBoundException {
        if (next < items.length) {
            items[next++] = x;
        } else {
            throw new ItemIndexOutOfBoundException();
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
    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        try {
            for (int i = 0; i < 10; i++)
                sequence.add(Integer.toString(i));
            // make exception
            sequence.add(Integer.toString(1));
        } catch (ItemIndexOutOfBoundException e) {
            e.printStackTrace();
        }

        Selector selector = sequence.selector();
        while(!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}
