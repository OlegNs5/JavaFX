package ro.ctrln.javafx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.Arrays;

public class JavaFX extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button buttonOne = new Button("Hello Bittnet !!!");
        buttonOne.setOnAction(event -> System.out.println("Hello from Bittnet about JavaFX !"));

        Button buttonTwo = new Button("Hello Bittnet again !!!");
        buttonTwo.setOnAction(event -> primaryStage.hide());

//        StackPane root = new StackPane();
//        HBox root = new HBox();
        VBox root = new VBox();
        root.setSpacing(20);
        root.setAlignment(Pos.TOP_CENTER);
        root.getChildren().addAll(Arrays.asList(buttonOne,buttonTwo));
        root.setStyle("-fx-border-width: 5px; -fx-border-color: blue; "); //cod CSS specific pentru java


        Scene scene = new Scene(root,500,500);
        primaryStage.setTitle("Learning about JavaFX");
        primaryStage.setScene(scene);
        primaryStage.setFullScreen(false);
        primaryStage.initStyle(StageStyle.DECORATED);

        primaryStage.setX(Screen.getScreens().get(0).getBounds().getMinX() + 200);//punem fereastra pe al doilea monitor daca il avem
        primaryStage.setY(Screen.getScreens().get(0).getBounds().getMinY() + 200);

        primaryStage.setOnCloseRequest(event -> System.out.println("Inchidere fereastra !"));
        primaryStage.setOnHiding(event -> System.out.println("Ascundere fereastra !"));
        primaryStage.setOnHidden(event -> System.out.println("Fereastra ascunsa !"));
        primaryStage.setOnShowing(event -> System.out.println("Afisare fereastra !"));
        primaryStage.setOnShown(event -> System.out.println("Fereastra afisata !" ));

        primaryStage.show();
    }

}
