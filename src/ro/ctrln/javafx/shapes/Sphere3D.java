package ro.ctrln.javafx.shapes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.shape.DrawMode;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;

public class Sphere3D extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Sphere sphere = new Sphere();

        sphere.setLayoutX(50);
        sphere.setLayoutY(50);
        sphere.setRadius(150);

        sphere.setTranslateX(100); //Aici setam pozitia in fereastra
        sphere.setTranslateY(100);
        sphere.setTranslateZ(100);

        sphere.setDrawMode(DrawMode.FILL);

        VBox root = new VBox(sphere);

        Scene scene = new Scene(root,500,500);

        scene.setCamera(ShapesUtils.setPerspectiveCamera(20,20,20));


        ShapesUtils.showPrimaryStage(primaryStage,scene,"Learning about javaFX Shapes - Sphere ");

    }
}
