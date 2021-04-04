package ee.khk;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.MultipleSelectionModel;

public class Main extends Application {

    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {

        Label selectedlbl = new Label();
        ObservableList<String> langs = FXCollections.observableArrayList("Java", "JavaScript", "C#", "Python");
        ListView<String> langsListView = new ListView<String>(langs);
        langsListView.setPrefSize(250, 150);

        final MultipleSelectionModel<String> langsSelecionModel = langsListView.getSelectionModel();
        langsSelecionModel.selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String oldValue, String newValue) {
                selectedlbl.setText("Selected: " + newValue);
            }
        });

        FlowPane root = new FlowPane(langsListView);
        Scene scene = new Scene(root, 250, 200);

        stage.setScene(scene);
        stage.setTitle("ListView in JavaFX");
        stage.show();
    }
}