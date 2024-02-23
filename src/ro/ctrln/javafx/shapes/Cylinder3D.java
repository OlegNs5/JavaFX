package ro.ctrln.javafx.shapes;

import javafx.application.Application;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.DrawMode;
import javafx.stage.Stage;

public class Cylinder3D extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        Cylinder cylinder = new Cylinder();

        cylinder.setHeight(100);
        cylinder.setRadius(50);

        cylinder.setTranslateX(200);
        cylinder.setTranslateY(150);
        cylinder.setTranslateZ(50);

        VBox root = new VBox(cylinder);

        cylinder.setDrawMode(DrawMode.FILL);

        Scene scene = new Scene(root,500,500);
/**
       PerspectiveCamera camera = new PerspectiveCamera();
        camera.setTranslateX(20);
        camera.setTranslateY(20);
        camera.setTranslateZ(20);
        scene.setCamera(camera);
**/ scene.setCamera(ShapesUtils.setPerspectiveCamera(20,20,20));//Acest cod poate fi refactorizat astfel

//        primaryStage.setTitle("Learning about javaFX Shapes - Cylinder ");
//        primaryStage.setScene(scene);
//        primaryStage.show();

        ShapesUtils.showPrimaryStage(primaryStage,scene,"Learning about javaFX Shapes - Cylinder ");
    }
}
