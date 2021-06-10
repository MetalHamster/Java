package behavioral.eventbus;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author Matthias.Flueckiger
 */
public class DiceModelEB implements Runnable{
    private int value;
    private int min = 1;
    private int max = 6;

    public DiceModelEB(){
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(this, 0, 1, TimeUnit.SECONDS);
    }

    public void roll() {
        value = (int) (Math.random() * (max - min + 1) + min);
    }

    public void publish(){
        //Publish a new Event
        EventBus.getInstance().publish(new Event(String.valueOf(value)));
    }

    @Override
    public void run() {
        roll();
        publish();
    }
}
