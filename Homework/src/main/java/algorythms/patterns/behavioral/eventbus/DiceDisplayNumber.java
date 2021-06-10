package algorythms.patterns.behavioral.eventbus;

/**
 * @author Matthias.Flueckiger
 */
public class DiceDisplayNumber implements Subscriber{
    private int value;
    private String history="";

    @Override
    public void onReceive(Event event) {
        value= event.valueDice();
        history += value+"|";

        System.out.println(history);
    }
}
