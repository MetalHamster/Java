package eventhandler;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Demo extends Application {
    private Button button;
    private Pane pane;
    private Scene scene;

    @Override
    public void start(Stage stage) {
        button = new Button("up");
        button.setOnAction(new MyEventHandler());
        pane = new Pane();
        pane.getChildren().add(button);
        scene = new Scene(pane, 100, 40);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
