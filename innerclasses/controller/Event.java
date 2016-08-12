package innerclasses.controller;

/**
 * Created by jack.zhang on 8/12/2016.
 */
public abstract class Event {
    private long eventTime;
    protected final long delayTime;
    public Event(long delayTime) {
        this.delayTime = delayTime;
        start();
    }
    public void start() {
        //eventTime = System.nanoTime() + delayTime;
        eventTime = System.currentTimeMillis() + delayTime;
    }
    public boolean ready() {
        //return System.nanoTime() >= eventTime;
        // nanotime is too soon to catch up on
        return System.currentTimeMillis() >= eventTime;

    }
    public long getEventTime() {
        return eventTime;
    }
    public abstract void action();
}
