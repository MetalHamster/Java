package testingmaterial.viewer;

import testingmaterial.interfaces.Observer;

/**
 * @author Matthias.Flueckiger
 */
public class DiceViewNumberHistory implements Observer {
    private String message="Rolled: ";
    private String history="";

    public DiceViewNumberHistory() {
    }

    public DiceViewNumberHistory(String message) {
        this.message = message;
    }

    @Override
    public void update(int value) {
        history+=value+"|";
        System.out.println(message+history);
    }
}
