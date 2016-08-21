package holding;

import java.util.Collection;
import java.util.LinkedList;
/**
 * Created with IntelliJ IDEA.
 * User: jzhangkun
 * Date: 8/17/16
 * Time: 7:57 AM
 * To change this template use File | Settings | File Templates.
 */
public class Stack<T> {
    private LinkedList<T> storage = new LinkedList<T>();
    public void push(T v) { storage.addFirst(v); }
    public T peek() { return storage.getFirst(); }
    public T pop() { return storage.removeFirst(); }
    public boolean empty() { return storage.isEmpty(); }
    public String toString() { return storage.toString(); }

}
