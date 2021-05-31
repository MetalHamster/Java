package qrcode.daniel;

import javafx.application.Application;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CamDanielFX extends Application implements ImgListener, InvalidationListener
{
    ImageView imageView;
    HBox hbox;
    Scene scene;
    CamDaniel cam;
    Text text;
    @Override
    public void init()
    {
        imageView = new ImageView();
        text = new Text();
        hbox = new HBox(imageView, text);
        scene = new Scene(hbox,800,500);
        cam=new CamDaniel(this);
        cam.addListener(this);             //adding listener to Cam
    }
    @Override
    public void start(Stage stage) throws Exception
    {
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void changeImage(Image img)
    {
        imageView.setImage(img);

    }
    public static void main(String[] args)
    {
        launch(args);
    }
    @Override
    public void invalidated(Observable observable)    //if the cam sees a new QRcode this method gets run
    {
        String qrWord= ((CamDaniel)observable).qrWorld;
        text.setText(qrWord);
    }
}