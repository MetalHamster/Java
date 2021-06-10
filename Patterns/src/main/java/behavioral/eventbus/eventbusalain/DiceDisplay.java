package behavioral.eventbus.eventbusalain;

public class DiceDisplay implements Subscriber
{
    @Override
    public void onReceive(Event event)
    {        
        System.out.println("\n["+event.toString()+"]");
    }    
}