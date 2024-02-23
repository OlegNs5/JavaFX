package ro.ctrln.javafx.shapes;

import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class ShapesUtils {
    public static PerspectiveCamera setPerspectiveCamera(double x,double y,double z){
        PerspectiveCamera camera = new PerspectiveCamera();
        camera.setTranslateX(x);
        camera.setTranslateY(y);
        camera.setTranslateZ(z);

        return camera;
    }
    public static void showPrimaryStage(Stage primaryStage, Scene scene,String title){
        primaryStage.setTitle(title);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

}
