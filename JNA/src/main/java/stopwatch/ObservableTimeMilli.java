package stopwatch;

/**
 * @author Matthias.Flueckiger
 */
public interface ObservableTimeMilli {
    public void addSubscriber(ObserverTimeMilli observerTimeMilli);
    public void removeSubscriber(ObserverTimeMilli observerTimeMilli);
    public void notifySubscribers();
}
