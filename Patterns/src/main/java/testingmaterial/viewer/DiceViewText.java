package testingmaterial.viewer;

import testingmaterial.interfaces.Observer;

/**
 * @author Matthias.Flueckiger
 */
public class DiceViewText implements Observer {

    @Override
    public void update(int value) {
        String txtRep;
        switch (value) {
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

