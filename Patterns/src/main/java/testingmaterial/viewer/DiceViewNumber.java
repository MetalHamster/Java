package testingmaterial.viewer;

import testingmaterial.interfaces.Observer;

/**
 * @author Matthias.Flueckiger
 */
public class DiceViewNumber implements Observer {
    private String message="Rolled: ";

    public DiceViewNumber(){

    }

    public DiceViewNumber(String message){
        this.message = message;
    }

    @Override
    public void update(int value) {
        System.out.println(message+value);
    }
}
