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

        TreeItem<String> rootTreeNode = new TreeItem<>("Languages");

        TreeItem<String> germanics = new TreeItem<>("Germanic");
        germanics.getChildren().add(new TreeItem<>("German"));
        germanics.getChildren().add(new TreeItem<>("English"));

        TreeItem<String> romans = new TreeItem<>("Roman");
        romans.getChildren().add(new TreeItem<>("French"));
        romans.getChildren().add(new TreeItem<>("Spanish"));
        romans.getChildren().add(new TreeItem<>("Italian"));

        rootTreeNode.getChildren().add(germanics);
        rootTreeNode.getChildren().add(romans);

        TreeView<String> langsTreeView = new TreeView<>(rootTreeNode);
        langsTreeView.setPrefSize(150, 200);

        FlowPane root = new FlowPane(10, 10, langsTreeView);
        Scene scene = new Scene(root, 300, 250);
        stage.setScene(scene);
        stage.setTitle("TreeView in JavaFX");
        stage.show();
    }
}