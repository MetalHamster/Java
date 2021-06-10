package behavioral.eventbus;

/**
 * @author Matthias.Flueckiger
 */
public class Event {
    private String event;

    Event(String event){
        this.event=event;
    }

    @Override
    public String toString() {
        return "Event{" +
                "event='" + event + '\'' +
                '}';
    }

    public int valueDice(){
        return Integer.parseInt(event);
    }
}
