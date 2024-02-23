package ro.ctrln.javafx.controls.accordion;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ro.ctrln.javafx.shapes.ShapesUtils;

public class JavaFXLMAccordionFXLM extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("JavaFXAccordion.fxml"));

        Scene scene = new Scene(root,400,600);

        ShapesUtils.showPrimaryStage(primaryStage,scene,"JavaFXAccordion");
    }
}
