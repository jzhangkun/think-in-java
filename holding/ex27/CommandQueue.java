package holding.ex27;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by jack.zhang on 8/19/2016.
 */
class Command {
    private String cmd;
    public Command(String cmd) {
        this.cmd = cmd;
    }
    public void operation() {
        System.out.println(cmd);
    }
}
public class CommandQueue {
    private Queue<Command> queue = new LinkedList<Command>();
    public static Queue<Command> cmdProducer () {
        Queue<Command> CQ = new LinkedList<Command>();
        CQ.offer(new Command("ls"));
        CQ.offer(new Command("cp"));
        return CQ;
    }
    public Queue<Command> fillQueue(Command cmd) {
        queue.offer(cmd);
        return queue;
    }
}
