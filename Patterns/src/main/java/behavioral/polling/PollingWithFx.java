package behavioral.polling;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import testingmaterial.models.DiceModelScheduler;

/**
 * @author Matthias.Flueckiger
 */
public class PollingWithFx extends Application {
    DiceModelScheduler diceModel;
    String history="";
    int value;
    int pollTime=2000;

    @Override
    public void start(Stage stage) throws Exception {
        diceModel = new DiceModelScheduler(0,pollTime);

        VBox pane = new VBox();
        Button button = new Button("get Value from Dice");
        TextField textField = new TextField();
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        pane.getChildren().addAll(textField, button);

        button.setOnAction((event) -> {
            value = diceModel.getValue(); //polling from dice
            textField.appendText(value+"|"); //add actual to history
        });
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}



