package algorythms.lottomat.alain;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ObserverListDemo extends Application
{

    public Lottomat lottery;

    public static void main(String[] args)
    {
        Application.launch(args);
    }

    @Override
    public void init() throws Exception
    {
        super.init();
        lottery = new Lottomat(49);
    }

    @Override
    public void start(Stage primaryStage)
    {
        primaryStage.setTitle("Lottomat");
        HBox root = new HBox();
        Scene scene = new Scene(root, 250, 600, Color.WHITE);

        // create a grid pane
        GridPane gridpane = new GridPane();
        gridpane.setPadding(new Insets(5));
        gridpane.setHgap(10);
        gridpane.setVgap(10);

        Label poolLabel = new Label("LottoPool");
        GridPane.setHalignment(poolLabel, HPos.CENTER);
        gridpane.add(poolLabel, 0, 0);

        Label destLabel = new Label("6 aus 49");
        gridpane.add(destLabel, 2, 0);
        GridPane.setHalignment(destLabel, HPos.CENTER);

        final ObservableList<String> obsNumberList = FXCollections.observableList(lottery.getNumberList());
        ListView<String> numberListView = new ListView<String>(obsNumberList);
        numberListView.setPrefWidth(10);
        numberListView.setPrefHeight(600);

        gridpane.add(numberListView, 0, 1);

        final ObservableList<String> finalNumbers = FXCollections.observableArrayList();
        ListView<String> finalNumbersView = new ListView<String>(finalNumbers);
        finalNumbersView.setPrefWidth(10);
        finalNumbersView.setPrefHeight(120);

        gridpane.add(finalNumbersView, 2, 1);

        Button rollBtn = new Button("roll");
        rollBtn.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
                String ball = lottery.getNextRandomBall();
                obsNumberList.remove(ball);
                finalNumbers.add(ball);
            }
        });

        VBox vbox = new VBox(5);
        vbox.getChildren().add(rollBtn);

        gridpane.add(vbox, 1, 1);
        GridPane.setConstraints(vbox, 1, 1, 1, 2, HPos.CENTER, VPos.CENTER);

        root.getChildren().add(gridpane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}