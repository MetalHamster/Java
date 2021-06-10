package behavioral.eventbus.eventbusalain;

import java.util.ArrayList;
import java.util.List;

public class EventBus
{

    public static final EventBus INSTANCE = new EventBus(); //Singleton
    private List<Subscriber> list = new ArrayList<>();

    private EventBus()
    {
    }

    public void publish(Event event)
    {
        list.forEach((subscriber) ->
        {
            subscriber.onReceive(event);
        });
        /*      for (Subscriber subscriber : list)
        {
            subscriber.onReceive(event);
        }*/
    }

    public void subscribe(Subscriber subscriber)
    {
        list.add(subscriber);
    }

    public void unsubscribe(Subscriber listener)
    {
        list.remove(listener);
    }
}
