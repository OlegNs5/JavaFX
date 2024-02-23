
package ro.ctrln.javafx.controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import ro.ctrln.javafx.shapes.ShapesUtils;

import java.util.Arrays;

public class JavaFXChoiceBox extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        choiceBox.getItems().addAll(Arrays.asList("Lab1","Lab2","Lab3","Lab4"));
        choiceBox.setVisible(false);

        choiceBox.setOnAction(event -> {
            int index = choiceBox.getSelectionModel().getSelectedIndex();
            String selection = choiceBox.getSelectionModel().getSelectedItem();
            System.out.println("Am selectat optiunea " + selection + " cu indexul " + index);
        });

        CheckBox checkBox = new CheckBox("Arata ChoiceBox !");
        checkBox.setSelected(false);
        checkBox.setOnAction(event -> choiceBox.setVisible(!choiceBox.isVisible()));


        VBox root = new VBox();
        root.setSpacing(20);
        root.getChildren().addAll(Arrays.asList(checkBox,choiceBox));
        Scene scene = new Scene(root,500,200);

        ShapesUtils.showPrimaryStage(primaryStage,scene,"JavaFX ChoiceBox !");

    }
}
