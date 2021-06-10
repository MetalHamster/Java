package eventhandler;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * @author Matthias.Flueckiger
 */
public class InGui extends Application implements EventHandler<ActionEvent> {
    private Button btn1 = new Button("button1");
    private CheckBox ckb1 = new CheckBox("checkBox1");
    @Override
    public void start(Stage stage) throws Exception
    {
        Pane pane = new FlowPane();
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        pane.getChildren().addAll(btn1,ckb1);
        btn1.setOnAction(this);
        stage.show();
    }
    @Override
    public void handle(ActionEvent event)
    {
        ckb1.setSelected(!ckb1.isSelected());
    }

    public static void main(String[] args)
    {
        launch();
    }
}
