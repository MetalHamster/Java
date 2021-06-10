package algorythms.patterns.behavioral.observer.runnable;

/**
 * @author Matthias.Flueckiger
 */
public interface Subject4 {
    public void addSubscriber(Observer4 observer);
    public void removeSubscriber(Observer4 observer);
    public void notifySubscribers();
}
