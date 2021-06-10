package algorythms.patterns.behavioral.eventbus;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Matthias.Flueckiger
 */
public class EventBus {
    //create an object of SingleObject
    private static final EventBus instance = new EventBus();

    //make the constructor private so that this class cannot be instantiated
    private EventBus() {
    }

    //Get the only object available
    public static EventBus getInstance() {
        return instance;
    }

    /*All other stuff below here ~~ */

    private List<Subscriber> list = new ArrayList<>();

    public void publish(Event event){
        //Send event to all subscriber
        for(Subscriber subscriber: list){
            subscriber.onReceive(event);
        }
    }

    public void subscribe(Subscriber subscriber){
        list.add(subscriber);
    }

    public void unsubscribe(Subscriber listener){
        list.remove(listener);
    }



}
