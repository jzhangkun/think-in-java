package holding.ex29;

import java.util.PriorityQueue;

/**
 * Created with IntelliJ IDEA.
 * User: jzhangkun
 * Date: 8/19/16
 * Time: 7:32 AM
 * To change this template use File | Settings | File Templates.
 */
public class NotGood {

    public static void main(String[] args) {
        PriorityQueue<NotGood> Q = new PriorityQueue<NotGood>();
        Q.offer(new NotGood());
        Q.offer(new NotGood()); // failed to add
    }
}
