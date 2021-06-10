package lambda.eventhandler;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * @author Matthias.Flueckiger
 */
public class Main extends Application {
    private Scene scene;
    private Button button1;
    private Button button2;
    private Pane pane;

    @Override
    public void start(Stage stage) throws Exception {
        pane = new FlowPane();
        scene = new Scene(pane);
        button1 = new Button("Button 1");
        button2 = new Button("Button 2");

        button1.setOnAction((event)-> System.out.println("button 1 clicked"));
        button2.setOnAction((event)-> System.out.println("button 2 clicked"));

        pane.getChildren().addAll(button1,button2);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
