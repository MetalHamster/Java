package behavioral.observer.scheduler;

import testingmaterial.interfaces.Observer;
import testingmaterial.models.DiceModelObsScheduler;
import testingmaterial.viewer.DiceViewNumber;
import testingmaterial.viewer.DiceViewNumberHistory;
import testingmaterial.viewer.DiceViewText;

/**
 * @author Matthias.Flueckiger
 */
public class Main {
    public static void main(String[] args) {
        DiceModelObsScheduler dice = new DiceModelObsScheduler("Dice Model: ");
        Observer viewer1 = new DiceViewText();
        Observer viewer2 = new DiceViewNumber("View number: ");
        Observer viewer3 = new DiceViewNumberHistory("View history");

        dice.addSubscriber(viewer1);
        dice.addSubscriber(viewer2);
        dice.addSubscriber(viewer3);

    }
}
