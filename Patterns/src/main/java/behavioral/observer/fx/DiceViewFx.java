package behavioral.observer.fx;

import javafx.application.Application;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * @author Matthias.Flueckiger
 */
public class DiceViewFx extends Application implements InvalidationListener {

        DiceModelFx diceModelFx;
        private TextField textField = new TextField();
        private Button button;

        @Override
        public void start(Stage stage) throws Exception
        {
            diceModelFx = new DiceModelFx();
            diceModelFx.addListener(this);
            VBox pane = new VBox();
            Scene scene = new Scene(pane);
            stage.setScene(scene);
            pane.getChildren().addAll(textField);
            stage.show();
        }
        @Override
        public void invalidated(Observable o)
        {
            int value = ((DiceModelFx) o).getValue();
            textField.appendText(value + "|"); //add actual to history
        }

        public static void main(String[] args)
        {
            DiceViewTextFx diceViewText = new DiceViewTextFx();
            launch(args);
        }

}
