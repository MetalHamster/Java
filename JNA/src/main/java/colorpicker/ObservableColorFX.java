package colorpicker;

/**
 * @author Matthias.Flueckiger
 */
public interface ObservableColorFX {
    void addSubscriber(ObserverColorFX observerColorFX);
    void removeSubscriber(ObserverColorFX observerColorFX);
    void notifySubscribers();
}
