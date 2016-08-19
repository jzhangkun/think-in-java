package holding.ex27;

import java.util.Queue;

/**
 * Created by jack.zhang on 8/19/2016.
 */
public class QueueConsumer {
    public static void cmdConsumer(Queue<Command> queue) {
        while(queue.peek() != null) {
            queue.remove().operation();
        }
    }
    public static void main(String[] args) {
        CommandQueue queue = new CommandQueue();
        Queue<Command> producer = queue.fillQueue(new Command("ls"));

        QueueConsumer.cmdConsumer(producer);
    }
}
