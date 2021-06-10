package stopwatch;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * @author Matthias.Flueckiger
 */
public class StopwatchFX extends Application implements ObserverTimeMilli {
    TextField tfDigitalTime;
    StopwatchModel timer;

    @Override
    public void start(Stage stage) throws Exception {
        //Non FX objects
        timer = new StopwatchModel();
        timer.addSubscriber(this);

        //Create FX objects
        VBox root = new VBox();
        Scene scene = new Scene(root);
        Button btnStart = new Button("start");
        Button btnStop = new Button("stop");
        Button btnLap = new Button("lap");
        TextField tfTimeStopped = new TextField();
        TextField tfLap = new TextField();
        tfDigitalTime = new TextField();

        //FX objects properties
        stage.setTitle("Stopwatch");
        tfTimeStopped.minWidth(100);

        //Program logic
        tfTimeStopped.setText("Not Stopping");
        btnStart.setOnAction((event -> {
            timer.startTimer();
            tfTimeStopped.setText("Stopping time . . .");
        }));
        btnStop.setOnAction((event -> {
            timer.stopTimer();
            tfTimeStopped.setText(timer.timeStopped() +" Milliseconds");
        }));
        btnLap.setOnAction((event -> tfLap.appendText(timer.lap() +"|")));

        //Set FX stuff
        root.getChildren().addAll(btnStart,btnStop,btnLap,tfTimeStopped,tfLap,tfDigitalTime);
        stage.setScene(scene);
        Thread th = new Thread(timer);
        th.start();
        stage.show();
    }

    @Override
    public void update(String time) {
        tfDigitalTime.setText(time);
    }
    @Override
    public void currentTime(String time){
        System.out.println(time);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
