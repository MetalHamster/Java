package behavioral.eventbus;

import javafx.application.Application;

/**
 * @author Matthias.Flueckiger
 */
public class Main {
    public static void main(String[] args) {

        //Create Self rolling dice
        DiceModelEB diceModelEB = new DiceModelEB();

        //Create Viewer
        DiceDisplayEventText diceDisplayEventText = new DiceDisplayEventText();
        DiceDisplayHistory diceDisplayHistory = new DiceDisplayHistory();
        DiceDisplayNumber diceDisplayNumber = new DiceDisplayNumber();

        //add Viewer
        EventBus.getInstance().subscribe(diceDisplayEventText);
        EventBus.getInstance().subscribe(diceDisplayHistory);
        EventBus.getInstance().subscribe(diceDisplayNumber);

        //start Fx Class
        Application.launch(DiceDisplayFx.class,args);


    }
}
