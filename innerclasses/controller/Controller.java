package innerclasses.controller;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jack.zhang on 8/12/2016.
 */
public class Controller {
    private List<Event> eventList = new ArrayList<Event>();
    public void addEvent(Event c) { eventList.add(c); }
    public void run() {
        while(eventList.size() > 0) {
            // get a new copy for events
            for(Event e: new ArrayList<Event>(eventList)) {
                if (e.ready()) {
                    System.out.println(e);
                    //System.out.println(System.nanoTime() + " cmp " + e.getEventTime());
                    e.action();
                    eventList.remove(e);
                }
            }
        }
    }
}
