package ro.ctrln.javafx.controls;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import ro.ctrln.javafx.shapes.ShapesUtils;

import java.util.Arrays;

public class JavaFXRadioButtons extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        RadioButton radioButtonOne = new RadioButton("Radio1");
        RadioButton radioButtonTwo = new RadioButton("Radio2");
        RadioButton radioButtonThree = new RadioButton("Radio3");

        Text text = new Text("Nici o actiune ! ");


        ToggleGroup radioButtonsTouggle = new ToggleGroup();
        radioButtonOne.setToggleGroup(radioButtonsTouggle);
        radioButtonTwo.setToggleGroup(radioButtonsTouggle);
        radioButtonThree.setToggleGroup(radioButtonsTouggle);

        radioButtonOne.setOnAction(event -> text.setText(radioButtonOne.getText()));
        radioButtonTwo.setOnAction(event -> text.setText(radioButtonTwo.getText()));
        radioButtonThree.setOnAction(event -> text.setText(radioButtonThree.getText()));

        VBox root = new VBox(radioButtonOne,radioButtonTwo,radioButtonThree,text);
        root.setSpacing(10);
        root.setAlignment(Pos.TOP_CENTER);
//        root.getChildren().addAll(Arrays.asList(text,radioButtonOne,radioButtonTwo,radioButtonThree));

        Scene scene = new Scene(root,500, 500);
        ShapesUtils.showPrimaryStage(primaryStage,scene,"JavaFX Buttons !");

    }
}
