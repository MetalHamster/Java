package testingmaterial.models;

import testingmaterial.interfaces.Observable;
import testingmaterial.interfaces.Observer;

import java.util.ArrayList;
import java.util.List;

public class DiceModelObsRunnable implements Runnable, Observable {
    private int min;
    private int max;
    private int milliseconds;
    private int value;
    private List<Observer> list = new ArrayList<>();

    public DiceModelObsRunnable() {
        min = 1;
        max = 6;
        milliseconds=1000;
    }

    public DiceModelObsRunnable(int milliseconds){
        min = 1;
        max = 6;
        this.milliseconds = milliseconds;
    }


    public int rollAndGetValue() {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    @Override
    public void run() {
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
    public void addSubscriber(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeSubscriber(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(Observer list : list){
            list.update(value);
        }
    }
}
