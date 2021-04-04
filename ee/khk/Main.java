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

        slider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> changed, Number oldValue, Number newValue) {
                lbl.setText("Slider value: " + newValue);
            }
        });

        FlowPane root = new FlowPane(Orientation.VERTICAL, 10, 10, slider, lbl);
        Scene scene = new Scene(root, 300, 250);

        stage.setScene(scene);
        stage.setTitle("Slider in JavaFX");
        stage.show();
    }
}