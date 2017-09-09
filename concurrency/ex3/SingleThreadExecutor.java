package concurrency.ex3;

import concurrency.ex1.ThreeNotice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author: jzhangkun
 * @since: 1.0
 */
public class SingleThreadExecutor {
    public static void main(String...args) {
        ExecutorService exec = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++)
            exec.execute(new ThreeNotice());
        exec.shutdown();
    }
}
