package ro.ctrln.javafx.controls.accordion;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import ro.ctrln.javafx.shapes.ShapesUtils;

import java.util.Arrays;

public class JavaFXAccordion extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Accordion accordion = new Accordion();

        TitledPane titledPaneOne = new TitledPane("Cursuri",new Button("Arata toate cursurile disponibile "));
        TitledPane titledPaneTwo = new TitledPane("Seminarii",new Label("Arata toate seminariile disponibile "));

        Accordion labAccordion = new Accordion();
        labAccordion.getPanes().add(new TitledPane("Lab 1",new Label("Introducere in Java !")));
        labAccordion.getPanes().add(new TitledPane("Lab 2",new Label("Gestionarea codului sursa !")));
        labAccordion.getPanes().add(new TitledPane("Lab 3",new Label("Clase obiecte si variabile !")));
        TitledPane titledPaneThree = new TitledPane("Laboratoare",labAccordion);

        accordion.getPanes().addAll(Arrays.asList(titledPaneOne,titledPaneTwo,titledPaneThree));

        StackPane root = new StackPane(accordion); //se mai poate folosi "VBox" sau "HBox"
        Scene scene = new Scene(root,500,500);

        ShapesUtils.showPrimaryStage(primaryStage,scene,"JavaFX accordion !");
    }
}
