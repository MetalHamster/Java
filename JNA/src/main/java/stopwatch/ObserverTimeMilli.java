package stopwatch;

/**
 * @author Matthias.Flueckiger
 */
public interface ObserverTimeMilli {
    void update(String time);
    void currentTime(String time);
}
