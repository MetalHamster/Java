package threads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorDice implements Runnable {
    private int min;
    private int max;

    public ExecutorDice() {
        min = 1;
        max = 6;
    }

    public int rollAndGetValue() {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    @Override
    public void run() {
            System.out.println("Rolled: "+rollAndGetValue());


    }


    public static void main(String[] args) {
        ExecutorDice d = new ExecutorDice();
        int delay = 0;
        int interval = 1;
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(d, delay, interval, TimeUnit.SECONDS);



    }
}
