package ee.khk;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.Scene;

import java.util.concurrent.Flow;

public class Main extends Application {

    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {

        ObservableList<String> langs = FXCollections.observableArrayList("Java", "JavaScript", "C#", "Python");
        ComboBox<String> langsComboBox = new ComboBox<>(langs);
        langsComboBox.setValue("Java");

        Label lbl = new Label();

        langsComboBox.setOnAction(event -> lbl.setText(langsComboBox.getValue()));

        FlowPane root = new FlowPane(10, 10, langsComboBox, lbl);
        Scene scene = new Scene(root, 250, 200);
        stage.setScene(scene);
        stage.setTitle("ComboBox in JavaFX");
        stage.show();
    }
}