package concurrency.ex1;

/**
 * @author: jzhangkun
 * @since: 1.0
 */
public class MainThread {
    public static void main(String...args) {
        for(int i = 0; i < 5; i ++)
            new Thread(new ThreeNotice()).start();
    }
}
