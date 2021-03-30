package ee.khk;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.Scene;


public class Main extends Application {

    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        Label headlbl = new Label("Press the login button");
        Label statuslbl = new Label("Start screen");
        Button loginBtn = new Button("Login");

        StackPane root = new StackPane(headlbl, statuslbl, loginBtn);

        Scene scene = new Scene(root, 300, 150);
        stage.setScene(scene);

        stage.setTitle("StackPane in JavaFX");

        stage.show();
    }
}
