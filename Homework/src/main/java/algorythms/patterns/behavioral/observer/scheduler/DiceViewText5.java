package algorythms.patterns.behavioral.observer.scheduler;

import homework.algorythms.patterns.behavioral.observer.runnable.Observer4;

/**
 * @author Matthias.Flueckiger
 */
public class DiceViewText5 implements Observer5 {

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

