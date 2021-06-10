package stage;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


/**
 * @author Matthias.Flueckiger
 */
public class Stages extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();   // Its task is to arrange all nodes
        Scene scene = new Scene(root, Color.WHITE);

        //Image icon = new Image("path");
        //stage.getIcons().add(icon);
        //stage.setFullScreen(true);
        stage.setWidth(1000);
        stage.setHeight(1000);
        stage.setX(50);
        stage.setY(50);
        stage.setResizable(false);
        stage.setTitle("All about Stages");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);   // Static method from Application, calls start method
    }
}
