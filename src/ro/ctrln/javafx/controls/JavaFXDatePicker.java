package ro.ctrln.javafx.controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import ro.ctrln.javafx.shapes.ShapesUtils;

public class JavaFXDatePicker extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        DatePicker datePicker = new DatePicker();

        datePicker.setOnAction(event -> {
            System.out.println("Data selectata este: " + datePicker.getValue());
        });

        StackPane stackPane = new StackPane(datePicker);
        Scene scene = new Scene(stackPane,500,200);

        ShapesUtils.showPrimaryStage(primaryStage,scene,"JavaFX Data Picker !");

    }
}
