package algorythms.patterns.behavioral.observer.scheduler;

import homework.algorythms.patterns.behavioral.observer.runnable.Observer4;

/**
 * @author Matthias.Flueckiger
 */
public class DiceViewNumber implements Observer5 {

    @Override
    public void update(int value) {
        System.out.println("Rolled: "+value);
    }
}
