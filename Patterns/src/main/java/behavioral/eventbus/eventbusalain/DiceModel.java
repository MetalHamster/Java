package behavioral.eventbus.eventbusalain;

public class DiceModel implements Runnable
{
    private int value, min = 1, max = 6;

    public void roll()
    {
        value = (int) (Math.random() * (max - min + 1) + min);
        System.out.print(value + "/");
        Event event=new Event(""+value);
        EventBus.INSTANCE.publish(event);  
    }

    public int getValue()
    {
        return value;
    }

    @Override
    public void run()
    {
        roll();
    }
}
