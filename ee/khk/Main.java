package ee.khk;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class Main extends Application {

    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {

        ObservableList<Person> people = FXCollections.observableArrayList(
                new Person("Tom", 34),
                new Person("Bob", 22),
                new Person("Sam", 28),
                new Person("Alice", 29)
        );

        Label lbl = new Label();
        TableView<Person> table = new TableView<>(people);
        table.setPrefHeight(200);
        table.setPrefWidth(250);

        TableColumn<Person, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        table.getColumns().add(nameColumn);

        TableColumn<Person, Integer> ageColumn = new TableColumn<>("Age");
        ageColumn.setCellValueFactory(new PropertyValueFactory<>("age"));
        table.getColumns().add(ageColumn);

        TableView.TableViewSelectionModel<Person> selectionModel = table.getSelectionModel();
        selectionModel.selectedItemProperty().addListener((observableValue, oldVal, newVal) -> {
            if (newVal != null) lbl.setText("Selected: " + newVal.getName());
        });

        FlowPane root = new FlowPane(Orientation.VERTICAL, 10, 10, lbl, table);
        Scene scene = new Scene(root, 300, 250);
        stage.setScene(scene);
        stage.setTitle("TableView in JavaFX");
        stage.show();
    }
}