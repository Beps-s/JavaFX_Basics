package ee.khk;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Scene;


public class Main extends Application {

    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {

        Button btn = new Button("Hello");
        VBox vbox = new VBox();
        VBox.setVgrow(btn, Priority.ALWAYS);
        btn.setMaxHeight(Double.MAX_VALUE);
        vbox.getChildren().addAll(btn);
        Scene scene = new Scene(vbox, 300, 150);
        stage.setScene(scene);

        stage.setTitle("VBox in JavaFX");

        stage.show();
    }
}
