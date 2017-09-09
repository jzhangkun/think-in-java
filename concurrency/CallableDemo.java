package concurrency;

import java.util.List;
import java.util.concurrent.*;

import com.google.common.collect.*;


/**
 * @author: jzhangkun
 * @since: 1.0
 */
class TaskWithResult implements Callable<String> {
    private int id;
    public TaskWithResult(int id) {
        this.id = id;
    }
    public String call() {
        return "result of TaskWithResult " + id;
    }
}
public class CallableDemo {
    public static void main(String...args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        List<Future<String>> results = Lists.newArrayList();
        for (int i = 0; i < 10; i ++)
            results.add(exec.submit(new TaskWithResult(i)));
        for (Future<String> fs: results)
            try {
                System.out.println(fs.get());
            } catch(InterruptedException e) {
                e.printStackTrace();
            } catch(ExecutionException e) {
                e.printStackTrace();
            } finally {
                exec.shutdown();
            }
    }

}
