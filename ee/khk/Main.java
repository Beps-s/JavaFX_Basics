package ee.khk;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.Scene;


public class Main extends Application {

    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {

        HBox hbox = new HBox();
        Button button1 = new Button("Add");
        Button button2 = new Button("Remove");
        hbox.getChildren().addAll(button1, button2);
        Scene scene = new Scene(hbox, 500, 150);
        stage.setScene(scene);

        stage.setTitle("HBOX in JavaFX");

        stage.show();
    }
}
