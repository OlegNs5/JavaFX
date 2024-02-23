package ro.ctrln.javafx.fxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ro.ctrln.javafx.shapes.ShapesUtils;

public class SceneBuilderApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FirstJavaFXApp.fxml")); // "FXMLLoader" este Clasa utilitara care ne ajuta la gestionarea fisierelor .fxml

        Scene scene = new Scene(root,600,500);
        ShapesUtils.showPrimaryStage(primaryStage,scene,"JavaFX Accordion with Scene Builder ");
    }
}
