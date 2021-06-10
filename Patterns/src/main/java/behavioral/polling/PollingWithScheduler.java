package behavioral.polling;

import testingmaterial.models.DiceModelScheduler;

/**
 * @author Matthias.Flueckiger
 */
public class PollingWithScheduler {
    public static void main(String[] args) {
        DiceModelScheduler diceModel = new DiceModelScheduler(1000,2000);
        diceModel.setMessage("Rolled from DiceModelScheduler: ");

        PollingFromDice pollingFromDice = new PollingFromDice(1000,1000,diceModel);
        pollingFromDice.setMessage("Polled from PollingFromDice: ");
    }
}
