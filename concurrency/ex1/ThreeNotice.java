package concurrency.ex1;

/**
 * @author: jzhangkun
 * @since: 1.0
 */
public class ThreeNotice implements Runnable {
    public ThreeNotice() {
        System.out.println("Task start");
    }
    public String notice(int i) {
        return Thread.currentThread() + " Notice " + i;
    }
    public void run() {
        for (int i = 0; i < 3; i ++) {
            //System.out.println("Notice " + i);
            System.out.println(notice(i));
            Thread.yield();
        }
        System.out.println("Task terminated!");
        return;
    }
}
