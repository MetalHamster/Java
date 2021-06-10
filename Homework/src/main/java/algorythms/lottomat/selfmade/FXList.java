package algorythms.lottomat.selfmade;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * @author Matthias.Flueckiger
 */
public class FXList extends Application {
    private LottomatSelfMade lottomat;
    private Scene scene;
    private ListView<String> lottoPoolView;
    private ListView<String> lottoNumbersView;
    private ObservableList<String> obsLottoPoolList;
    private ObservableList<String> obsLottoNumbersList;
    private Button rollBtn;
    private HBox root;

    @Override
    public void init() throws Exception {
        super.init();
        lottomat = new LottomatSelfMade(49);
    }

    @Override
    public void start(Stage stage) throws Exception {
        root = new HBox(5);
        scene = new Scene(root);

        rollBtn = new Button("Roll");
        //Create Lists
        obsLottoPoolList = FXCollections.observableList(lottomat.getNumberList());
        obsLottoNumbersList = FXCollections.observableArrayList();
        //Create ListViewers and pass the lists
        lottoPoolView = new ListView<>(obsLottoPoolList);
        lottoNumbersView = new ListView<>(obsLottoNumbersList);

        rollBtn.setOnAction((event -> {
            if (obsLottoNumbersList.size()< 6){
            String ball = lottomat.getNextRandomBall();
            obsLottoPoolList.remove(ball);
            obsLottoNumbersList.add(ball);
            };
        }));

        root.getChildren().addAll(lottoPoolView, rollBtn,lottoNumbersView);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
