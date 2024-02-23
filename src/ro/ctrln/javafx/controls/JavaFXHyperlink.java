package ro.ctrln.javafx.controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import ro.ctrln.javafx.shapes.ShapesUtils;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.util.Arrays;

public class JavaFXHyperlink extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Accordion accordion = new Accordion();

        TitledPane titledPaneOne = new TitledPane("Cursuri",new Button("Arata toate cursurile disponibile "));
        TitledPane titledPaneTwo = new TitledPane("Seminarii",new Label("Arata toate seminariile disponibile "));

        Accordion labAccordion = new Accordion();

        Hyperlink javaIntro = new Hyperlink("Introducere in java");
        Hyperlink javaCode = new Hyperlink("Gestionarea codului sursa ");
        Hyperlink javaClasses = new Hyperlink("Clase obiecte si variabile");

        javaIntro.setOnAction(event ->ControlsUtils.browseCourse("Deschid introducere in java !","https://docs.oracle.com/javase/8/docs/technotes/guides/awt/index.html"));
        javaCode.setOnAction(event -> ControlsUtils.browseCourse("Gestionarea codului sursa !","https://docs.oracle.com/javase/8/docs/technotes/guides/awt/index.html"));
        javaClasses.setOnAction(event -> ControlsUtils.browseCourse("Clase obiecte si variabile !","https://docs.oracle.com/javase/8/docs/technotes/guides/awt/index.html"));
                    // ↨ //
//        javaClasses.setOnAction(event -> {
//            System.out.println("Clase obiecte si variabile !");
//            if (Desktop.isDesktopSupported()){
//                try {
//                    Desktop.getDesktop().browse(URI.create("https://docs.oracle.com/javase/8/docs/technotes/guides/awt/index.html"));
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        });


        labAccordion.getPanes().add(new TitledPane("Lab 1",javaIntro));
        labAccordion.getPanes().add(new TitledPane("Lab 2",javaCode));
        labAccordion.getPanes().add(new TitledPane("Lab 3",javaClasses));
        TitledPane titledPaneThree = new TitledPane("Laboratoare",labAccordion);

        accordion.getPanes().addAll(Arrays.asList(titledPaneOne,titledPaneTwo,titledPaneThree));

        StackPane root = new StackPane(accordion); //se mai poate folosi "VBox" sau "HBox"
        Scene scene = new Scene(root,500,500);

        ShapesUtils.showPrimaryStage(primaryStage,scene,"JavaFX Hyperlink !");
    }




    }

