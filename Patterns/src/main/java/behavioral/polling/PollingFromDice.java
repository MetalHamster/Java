package behavioral.polling;

import testingmaterial.models.DiceModelScheduler;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author Matthias.Flueckiger
 */
public class PollingFromDice implements Runnable{
    private DiceModelScheduler diceModelScheduler;
    private String message="";
    public PollingFromDice(int delayMilliSeconds, int intervalMilliSeconds, DiceModelScheduler diceModelScheduler){
        this.diceModelScheduler = diceModelScheduler;
        //individual delay and interval
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(this, delayMilliSeconds, intervalMilliSeconds, TimeUnit.MILLISECONDS);
    }

    public void setMessage(String message){
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println(message+diceModelScheduler.getValue());
    }
}
