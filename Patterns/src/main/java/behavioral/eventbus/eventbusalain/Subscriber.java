package behavioral.eventbus.eventbusalain;

public interface Subscriber
{
    public void onReceive(Event event);
}