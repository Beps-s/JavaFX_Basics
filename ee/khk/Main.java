package ee.khk;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.control.ToggleButton;
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

        ToggleButton lightbtn = new ToggleButton("Light");
        Label statelbl = new Label();
        lightbtn.setOnAction(event -> {
            if(lightbtn.isSelected()){
                statelbl.setText("Light on");
            }
            else{
                statelbl.setText("Light off...");
            }
        });



        FlowPane root = new FlowPane(10, 10);
        root.getChildren().addAll(lightbtn, statelbl);
        root.setPadding(new Insets(10));
        Scene scene = new Scene(root, 300, 150);
        stage.setScene(scene);

        stage.setTitle("Flowpane in JavaFX");
        stage.setWidth(300);
        stage.setHeight(200);

        stage.show();
    }
}