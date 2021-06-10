package algorythms.patterns.behavioral.observer.scheduler;

import homework.algorythms.patterns.behavioral.observer.runnable.Observer4;

/**
 * @author Matthias.Flueckiger
 */
public interface Observable5 {
    public void addSubscriber(Observer5 observer);
    public void removeSubscriber(Observer5 observer);
    public void notifySubscribers();
}
