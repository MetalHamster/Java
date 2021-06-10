package algorythms.patterns.behavioral.observer.runnable;

import java.util.ArrayList;
import java.util.List;

public class RunnableDice implements Runnable, Subject4 {
    private int min;
    private int max;
    private int milliseconds;
    private int value;
    private List<Observer4> list = new ArrayList<>();

    public RunnableDice() {
        min = 1;
        max = 6;
        milliseconds=1000;
    }

    public RunnableDice(int milliseconds){
        min = 1;
        max = 6;
        this.milliseconds = milliseconds;
    }


    public int rollAndGetValue() {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    @Override
    public void run() {
        String n = Thread.currentThread().getName();
        for (int i = 1; i <= 10; i++) {
            try {
                value = rollAndGetValue();
                System.out.println("Rolled: "+value);
                notifySubscribers();
                Thread.sleep(milliseconds);
            } catch (InterruptedException e) {
            }
        }
    }


    @Override
    public void addSubscriber(Observer4 observer) {
        list.add(observer);
    }

    @Override
    public void removeSubscriber(Observer4 observer) {
        list.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(Observer4 list : list){
            list.update(value);
        }
    }
}
