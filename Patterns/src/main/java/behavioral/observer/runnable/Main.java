package behavioral.observer.runnable;

import testingmaterial.interfaces.Observer;
import testingmaterial.models.DiceModelObsRunnable;
import testingmaterial.viewer.DiceViewNumber;
import testingmaterial.viewer.DiceViewText;

/**
 * @author Matthias.Flueckiger
 */
public class Main {
    public static void main(String[] args) {
        DiceModelObsRunnable d1 = new DiceModelObsRunnable();

        Observer viewer1 = new DiceViewNumber();
        Observer viewer2 = new DiceViewNumber();
        Observer viewer3 = new DiceViewText();

        d1.addSubscriber(viewer1);
        d1.addSubscriber(viewer2);
        d1.addSubscriber(viewer3);

        Thread t1 = new Thread(d1);
        t1.start();



    }

}
