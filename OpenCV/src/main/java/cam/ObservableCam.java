package cam;

public interface ObservableCam {
    void addSubscriber(ObserverCam observerCam);
    void removeSubscriber(ObserverCam observerCam);
    void notifySubscribers();
}
