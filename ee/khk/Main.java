package ee.khk;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;


public class Main extends Application {

    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {

        Label label1 = new Label("Label1");
        Label label2 = new Label("Label2");



        FlowPane root = new FlowPane(10, 10, label1, label2);
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, 300, 150);
        stage.setScene(scene);

        stage.setTitle("Flowpane in JavaFX");
        stage.setWidth(300);
        stage.setHeight(200);

        stage.show();
    }
}
