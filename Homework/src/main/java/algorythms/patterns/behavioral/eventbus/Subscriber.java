package algorythms.patterns.behavioral.eventbus;

/**
 * @author Matthias.Flueckiger
 */
public interface Subscriber {
    void onReceive(Event event);
}
