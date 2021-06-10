package algorythms;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class DiceView extends Application
    {
        DiceModelAlain diceModelAlain;
        String history = "";
        int value;
        int pollTime = 2000;
        @Override
        public void start(Stage stage) throws Exception
        {
            diceModelAlain = new DiceModelAlain();
            ScheduledExecutorService s= Executors.newScheduledThreadPool(1);
            s.scheduleAtFixedRate(diceModelAlain,0,pollTime, TimeUnit.MILLISECONDS);
            VBox pane = new VBox();
            Button button = new Button("get Value from Dice");
            TextField textField = new TextField();
            Scene scene = new Scene(pane);
            stage.setScene(scene);
            pane.getChildren().addAll(textField, button);

            button.setOnAction((ActionEvent event) ->
            {
                int value = diceModelAlain.getValue(); //polling from dice
                textField.appendText(value+"|"); //add actual to history
            });
            stage.show();
        }
        public static void main(String[] args)
        {
            launch(args);
        }

}
