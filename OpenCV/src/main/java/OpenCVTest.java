import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import utils.OpenCVUtils;

public class OpenCVTest extends Application {

    @Override
    public void start(Stage stage) {
        Group root = new Group();
        Scene scene = new Scene(root);

        // Convert and return image to imageView
        ImageView imageView = new ImageView(OpenCVUtils.captureFXImage(0));

        root.getChildren().add(imageView);
        stage.setScene(scene);
        stage.show();
    }
}
