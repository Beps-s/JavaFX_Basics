package ee.khk;

import javafx.application.Application;
import javafx.geometry.Orientation;
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
        Label label3 = new Label("Label3");
        Label label4 = new Label("Label4");
        Label label5 = new Label("Label5");
        Label label6 = new Label("Label6");
        Label label7 = new Label("Label7");
        Label label8 = new Label("Label8");
        Label label9 = new Label("Label9");



        FlowPane root = new FlowPane();
        root.setVgap(18);
        root.setHgap(15);
        root.setOrientation(Orientation.VERTICAL);
        root.getChildren().addAll(label1, label2, label3, label4, label5, label6, label7, label8, label9);
        Scene scene = new Scene(root, 300, 150);
        stage.setScene(scene);

        stage.setTitle("Flowpane in JavaFX");
        stage.setWidth(300);
        stage.setHeight(200);

        stage.show();
    }
}
