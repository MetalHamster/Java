package behavioral.eventbus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * @author Matthias.Flueckiger
 */
public class DiceDisplayFx extends Application implements Subscriber {

    private TextField textField = new TextField();

    @Override
    public void start(Stage stage) throws Exception {
        EventBus.getInstance().subscribe(this);
        VBox pane = new VBox();
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        pane.getChildren().addAll(textField);
        stage.show();
    }

    @Override
    public void onReceive(Event event) {
        textField.appendText(event.valueDice() + "|");
    }

    public static void main(String[] args) {
        launch(args);
    }


}
