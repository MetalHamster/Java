package colorpicker;

/**
 * @author Matthias.Flueckiger
 */
public interface ObservableColorAWT {
    void addSubscriber(ObserverColorAWT observerColorAWT);
    void removeSubscriber(ObserverColorAWT observerColorAWT);
    void notifySubscribers();
}
