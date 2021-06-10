package algorythms.patterns.behavioral.observer.runnable;

/**
 * @author Matthias.Flueckiger
 */
public class RunnableDiceViewer1 implements Observer4 {

    @Override
    public void update(int value) {
        System.out.println("DiceViewer1: "+value);
    }
}
