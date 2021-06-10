package mqtt.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author Matthias.Flueckiger
 */
public class DiceModelObsScheduler implements Runnable, Observable {
    private int value;
    private int min=1;
    private int max=6;
    private String message="Rolled: ";
    private List<Observer> list = new ArrayList<>();

    public DiceModelObsScheduler() {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(this, 0, 1, TimeUnit.SECONDS);
    }
    public DiceModelObsScheduler(String message) {
        this.message = message;
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(this, 0, 1, TimeUnit.SECONDS);
    }

    public DiceModelObsScheduler(int delay, int interval) {
        //individual delay and interval
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(this, delay, interval, TimeUnit.SECONDS);
    }

    public void roll() {
        value = (int) (Math.random() * (max - min + 1) + min);
    }

    public int getValue() {
        return value;
    }

    @Override
    public void run() {
        roll();
        notifySubscribers();
        System.out.println(message + getValue());
    }

    @Override
    public void addSubscriber(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeSubscriber(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        /*
            for(Observer list : list){
            list.update(getValue());
        }
         */
        list.forEach(list -> list.update(getValue()));
    }
}


