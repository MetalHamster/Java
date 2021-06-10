package behavioral.eventbus;

/**
 * @author Matthias.Flueckiger
 */
public class DiceDisplayHistory implements Subscriber {
    private int value;


    @Override
    public void onReceive(Event event) {
        value = event.valueDice();

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

