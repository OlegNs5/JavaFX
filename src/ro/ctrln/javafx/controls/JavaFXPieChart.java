package ro.ctrln.javafx.controls;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import ro.ctrln.javafx.shapes.ShapesUtils;

import java.util.Arrays;

public class JavaFXPieChart extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        PieChart pieChart = new PieChart();

        PieChart.Data java = new PieChart.Data("Java",523);
        PieChart.Data python = new PieChart.Data("Python",103);
        PieChart.Data kotlin = new PieChart.Data("Kotlin",57);
        PieChart.Data cSharp = new PieChart.Data("CSharp",87);
        PieChart.Data pascal = new PieChart.Data("Pascal",15);

        pieChart.getData().addAll(Arrays.asList(java,python,kotlin,cSharp,pascal));

        VBox root = new VBox(pieChart);
        root.setAlignment(Pos.TOP_CENTER);
//        root.getChildren().addAll(Arrays.asList(text,radioButtonOne,radioButtonTwo,radioButtonThree));

        Scene scene = new Scene(root,500, 500);
        ShapesUtils.showPrimaryStage(primaryStage,scene,"JavaFX Pie Chart !");
    }
}
