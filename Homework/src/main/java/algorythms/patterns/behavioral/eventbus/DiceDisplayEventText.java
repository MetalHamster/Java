package algorythms.patterns.behavioral.eventbus;

/**
 * @author Matthias.Flueckiger
 */
public class DiceDisplayEventText implements Subscriber{

    @Override
    public void onReceive(Event event) {
        System.out.println(event.toString());
    }
}
