package concurrency.ex3;

import concurrency.ex1.ThreeNotice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author: jzhangkun
 * @since: 1.0
 */
public class FixedThreadPool {
    public static void main(String... args) {
        ExecutorService exec = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++)
            exec.execute(new ThreeNotice());
        exec.shutdown();
    }
}
