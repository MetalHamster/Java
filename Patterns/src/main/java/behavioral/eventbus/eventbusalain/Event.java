package behavioral.eventbus.eventbusalain;

public class Event
{
  String event;  
  public Event(String event)
  {
    this.event=event;
  }

  @Override
  public String toString()
  {
    return event;
  }
}