package colorpicker;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.awt.*;


/**
 * @author Matthias.Flueckiger
 */
public class ColorFXViewFX extends Application implements ObserverColorAWT {
    private ColorFXPicker colorPicker2;
    private Color color;
    private Scene scene;
    private Rectangle rectangle;

    @Override
    public void start(Stage stage) throws Exception {
        colorPicker2 = new ColorFXPicker();
        colorPicker2.addSubscriber(this);
        VBox pane = new VBox();
        scene = new Scene(pane);
        rectangle = new Rectangle(0,0,200,200);
        pane.getChildren().add(rectangle);

        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void update(Color color) {
        this.color = color;
        System.out.println(color);
        //String colorHex = String.format("#%06X", color.getRGB());
        //Substring(2) removes first to letters
        String colorHex2="#"+Integer.toHexString(color.getRGB()).substring(2);
        //scene.setFill(Paint.valueOf(colorHex2));
        rectangle.setFill(Paint.valueOf(colorHex2));

    }

    public static void main(String[] args) {
        launch(args);
    }

}
