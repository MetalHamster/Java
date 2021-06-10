package behavioral.observer.fx;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;

/**
 * @author Matthias.Flueckiger
 */
public class DiceViewTextFx implements InvalidationListener {
    DiceModelFx diceModelFx = new DiceModelFx();

    DiceViewTextFx() {
        diceModelFx.addListener(this);
    }

    @Override
    public void invalidated(Observable observable) {
        String txtRep;
        switch (((DiceModelFx) observable).getValue()) {
            case 1:
                txtRep = "\n *";
                break;
            case 2:
                txtRep = "*\n\n  *";
                break;
            case 3:
                txtRep = "*\n *\n  *";
                break;
            case 4:
                txtRep = "* *\n\n* *";
                break;
            case 5:
                txtRep = "* *\n *\n* *";
                break;
            case 6:
                txtRep = "* *\n* *\n* *";
                break;
            default:
                txtRep = toString();
        }
        System.out.println('\n' + txtRep + '\n');
    }
}

