package behavioral.observer.fx;

import javafx.application.Platform;
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
public class DiceModelFx implements Observable, Runnable{
    private int value;
    private int min = 1; 
    private int max = 6;
    List<InvalidationListener> listeners = new ArrayList<>();

    public DiceModelFx() {
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
    public void addListener(InvalidationListener listener) {
        listeners.add(listener);
    }

    @Override
    public void removeListener(InvalidationListener listener) {
        listeners.remove(listener);
    }

    private void notifySubscribers() {
        Platform.runLater(new Runnable()
        {
            @Override
            public void run()
            {
                for (InvalidationListener iL : listeners)
                {
                    iL.invalidated(DiceModelFx.this);
                }
            }
        });
    }

    @Override
    public void run() {
        roll();
    }


}
