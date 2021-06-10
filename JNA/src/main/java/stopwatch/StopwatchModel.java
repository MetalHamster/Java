package stopwatch;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;

/**
 * @author Matthias.Flueckiger
 */
public class StopwatchModel implements Runnable, ObservableTimeMilli {
    private long startingTime;
    private long finishingTime;
    private long timeStopped;
    private long lap;
    private long startTimeLap;
    private long finishTimeLap;
    private List<ObserverTimeMilli> list = new ArrayList<>();
    private String lastDigitalTime;

    public void startTimer() {
        startingTime = System.currentTimeMillis();
        startTimeLap = System.currentTimeMillis();
    }

    public void stopTimer() {
        finishingTime = System.currentTimeMillis();
        timeStopped = finishingTime - startingTime;
    }

    public long timeStopped() {
        return timeStopped;
    }

    public long lap() {
        finishTimeLap = System.currentTimeMillis();
        lap = finishTimeLap - startTimeLap;
        startTimeLap = finishTimeLap;
        return lap;
    }

    public String digitalTime(){
        return LocalDateTime.now().getHour()+":"+LocalDateTime.now().getMinute()+":"+LocalDateTime.now().getSecond();
    }


    @Override
    public void run() {
        while (true) {
            notifySubscribers();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void addSubscriber(ObserverTimeMilli observerTimeMilli) {
        list.add(observerTimeMilli);
    }

    @Override
    public void removeSubscriber(ObserverTimeMilli observerTimeMilli) {
        list.remove(observerTimeMilli);
    }

    @Override
    public void notifySubscribers() {
        if (lastDigitalTime!=digitalTime()){
            list.forEach(list -> list.update(digitalTime()));
        }
        lastDigitalTime = digitalTime();
        list.forEach(list->list.currentTime(String.valueOf(System.currentTimeMillis()- startingTime)));
    }
}
