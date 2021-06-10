package threads.strun.dice;

/**
 * @author Matthias.Flueckiger
 */
public class RunDice {
    public static void main(String[] args) {
        RunnableDice r1 = new RunnableDice(1000);
        Thread t1 = new Thread(r1);
        t1.start();
    }
}
