package ee.khk;

import javafx.application.Application;
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

        Label headerLbl = new Label("ScrollPane");
        Label textLbl = new Label("jou \n" +
                "jou jou");

        ScrollPane scrollPane = new ScrollPane(textLbl);
        scrollPane.setPrefViewportHeight(150);
        scrollPane.setPrefViewportWidth(200);
        scrollPane.setPannable(false);
        scrollPane.setVvalue(0.5);
        scrollPane.setHvalue(0.5);

        FlowPane root = new FlowPane(Orientation.VERTICAL, 10, 10, headerLbl, scrollPane);
        Scene scene = new Scene(root, 250, 200);

        stage.setScene(scene);
        stage.setTitle("ScrollPane in JavaFX");
        stage.show();
    }
}