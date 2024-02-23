package ro.ctrln.javafx.shapes;

import javafx.application.Application;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Box;
import javafx.scene.shape.DrawMode;
import javafx.stage.Stage;

public class Box3D extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Box box = new Box();

        box.setWidth(100);
        box.setHeight(100);
        box.setDepth(100);

        box.setTranslateX(200);
        box.setTranslateY(150);
        box.setTranslateZ(50);

        box.setDrawMode(DrawMode.FILL);

        VBox root = new VBox(box);

        Scene scene = new Scene(root,500,500);


        scene.setCamera(ShapesUtils.setPerspectiveCamera(20,20,20));


        ShapesUtils.showPrimaryStage(primaryStage,scene,"\"Learning about javaFX Shapes - Box \"");

    }
}
