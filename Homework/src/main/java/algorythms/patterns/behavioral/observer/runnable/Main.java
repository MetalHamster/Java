package algorythms.patterns.behavioral.observer.runnable;

/**
 * @author Matthias.Flueckiger
 */
public class Main {
    public static void main(String[] args) {
        RunnableDice d1 = new RunnableDice();
        Observer4 viewer1 = new RunnableDiceViewer1();
        Observer4 viewer2 = new RunnableDiceViewer2();
        Observer4 viewer3 = new DiceViewText4();

        d1.addSubscriber(viewer1);
        d1.addSubscriber(viewer2);
        d1.addSubscriber(viewer3);

        Thread t1 = new Thread(d1);
        t1.start();



    }

}
