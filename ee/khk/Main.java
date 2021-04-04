package ee.khk;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Orientation;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class Main extends Application {

    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {

        Label lbl = new Label("Value");

        Slider slider = new Slider(0.0, 20.0, 10.0);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        slider.setBlockIncrement(2.0);
        slider.setMajorTickUnit(5.0);
        slider.setMinorTickCount(4);
        slider.setSnapToTicks(true);

        Button btn = new Button("Click");
        btn.setOnAction(event -> lbl.setText("Slider value: " + slider.getValue()));

        FlowPane root = new FlowPane(Orientation.VERTICAL, 10, 10, slider, lbl, btn);
        Scene scene = new Scene(root, 300, 250);

        stage.setScene(scene);
        stage.setTitle("Slider in JavaFX");
        stage.show();
    }
}