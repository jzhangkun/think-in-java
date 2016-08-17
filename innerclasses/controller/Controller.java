package innerclasses.controller;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by jack.zhang on 8/12/2016.
 */
public class Controller {
    private List<Event> eventList = new LinkedList<Event>();
    public void addEvent(Event c) { eventList.add(c); }
    public void run() {
        while(eventList.size() > 0) {
            // do not get the iterator directly from eventList
            // get a copy or
            // you will get java.util.ConcurrentModificationException
            Iterator<Event> it = (new LinkedList<Event>(eventList)).iterator();
            while (it.hasNext()) {
                Event e = it.next();
                if (e.ready()) {
                    System.out.println(e);
                    //System.out.println(System.nanoTime() + " cmp " + e.getEventTime());
                    e.action();
                    eventList.remove(e);
                }
            }
        }

        /* old
        private List<Event> eventList = new ArrayList<Event>();
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
        */
    }
}
