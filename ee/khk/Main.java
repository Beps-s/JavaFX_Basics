package ee.khk;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
        StackPane.setAlignment(headlbl, Pos.TOP_CENTER);
        StackPane.setMargin(headlbl, new Insets(10, 0, 0, 0));

        Label statuslbl = new Label("Start screen");
        StackPane.setAlignment(statuslbl, Pos.BOTTOM_CENTER);
        StackPane.setMargin(statuslbl, new Insets(0, 0, 10, 0));

        Button loginBtn = new Button("Login");

        StackPane root = new StackPane(headlbl, statuslbl, loginBtn);

        Scene scene = new Scene(root, 300, 150);
        stage.setScene(scene);

        stage.setTitle("StackPane in JavaFX");

        stage.show();
    }
}
