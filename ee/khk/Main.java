package ee.khk;

import javafx.application.Application;
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

        Label lbl = new Label("Label");
        lbl.setTooltip(new Tooltip("This is a label"));

        Button btn = new Button("Click");
        btn.setTooltip(new Tooltip("Click the button \nto start an action"));
        FlowPane root = new FlowPane(10, 10, btn, lbl);

        Scene scene = new Scene(root, 250, 250);

        stage.setScene(scene);
        stage.setTitle("Tooltip in JavaFX");
        stage.show();
    }
}