package ee.khk;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.MultipleSelectionModel;

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

        MultipleSelectionModel<TreeItem<String>> selectionModel = langsTreeView.getSelectionModel();

        Label lbl = new Label();
        selectionModel.selectedItemProperty().addListener((observableValue, oldValue, newValue) -> {
            if (newValue != null){
                StringBuilder path = new StringBuilder(newValue.getValue());
                TreeItem<String> parent = newValue.getParent();
                while (parent != null){
                    path.insert(0, parent.getValue() + " / ");
                    parent = parent.getParent();
                }
                lbl.setText(path.toString());
            }
        });

        FlowPane root = new FlowPane(Orientation.VERTICAL, 10, 10, langsTreeView, lbl);
        Scene scene = new Scene(root, 300, 250);
        stage.setScene(scene);
        stage.setTitle("TreeView in JavaFX");
        stage.show();
    }
}