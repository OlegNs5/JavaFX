package ro.ctrln.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import ro.ctrln.javafx.shapes.ShapesUtils;

public class JavaFXColorPicker extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        ColorPicker colorPicker = new ColorPicker();
        colorPicker.setOnAction(event -> {
            System.out.println("Culoarea selectata este: " + colorPicker.getValue());
        });
        StackPane stackPane = new StackPane(colorPicker);
        Scene scene = new Scene(stackPane,500,200);

        ShapesUtils.showPrimaryStage(primaryStage,scene,"JavaFX ColorPicker !");

    }
}
