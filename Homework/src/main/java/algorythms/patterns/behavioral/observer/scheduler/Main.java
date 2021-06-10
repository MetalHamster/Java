package algorythms.patterns.behavioral.observer.scheduler;

/**
 * @author Matthias.Flueckiger
 */
public class Main {
    public static void main(String[] args) {
        DiceScheduler dice = new DiceScheduler();
        Observer5 viewer1 = new DiceViewText5();
        Observer5 viewer2 = new DiceViewNumber();

        dice.addSubscriber(viewer1);
        dice.addSubscriber(viewer2);
    }
}
