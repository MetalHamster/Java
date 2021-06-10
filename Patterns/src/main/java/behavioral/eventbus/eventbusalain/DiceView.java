package behavioral.eventbus.eventbusalain;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DiceView extends Application implements Subscriber
{
    private final TextField textField = new TextField();

    @Override
    public void start(Stage stage) throws Exception
    {
        EventBus.INSTANCE.subscribe(this);
        VBox pane = new VBox();
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        pane.getChildren().addAll(textField);
        stage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void onReceive(Event message)
    {
        Platform.runLater(() ->
        {
            textField.appendText(message.toString() + "|");     //add actual to history
        });
    }
}
