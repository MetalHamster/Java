package cam;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class CamRecoringFX extends Application implements ObserverCam{
    private ImageView imageView;
    private Image image = null;
    private Cam cam = new Cam(this,1,0,10);

    @Override
    public void start(Stage stage) {
        Group root = new Group();
        Scene scene = new Scene(root);

        imageView = new ImageView(image);
        imageView.setFitHeight(480);
        imageView.setFitWidth(640);


        root.getChildren().add(imageView);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void update(Image image) {
        imageView.setImage(image);
    }
}
