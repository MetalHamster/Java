package algorythms.patterns.behavioral.observer.scheduler;

import homework.algorythms.patterns.behavioral.observer.runnable.Observer4;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author Matthias.Flueckiger
 */
public class DiceScheduler implements Observable5, Runnable{
    private int value;
    private int min = 1;
    private int max = 6;
    private List<Observer5> list = new ArrayList<>();

    public DiceScheduler() {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(this, 0, 1, TimeUnit.SECONDS);
    }

    public void roll() {
        value = (int) (Math.random() * (max - min + 1) + min);
        notifySubscribers();
    }

    public int getValue() {
        return value;
    }



    @Override
    public void run() {
        roll();
    }

    @Override
    public void addSubscriber(Observer5 observer) {
        list.add(observer);
    }

    @Override
    public void removeSubscriber(Observer5 observer) {
        list.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(Observer5 list : list){
            list.update(getValue());
        }
    }
}
