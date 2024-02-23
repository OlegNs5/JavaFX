package ro.ctrln.javafx.controls;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import ro.ctrln.javafx.shapes.ShapesUtils;

import java.io.File;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class JavaFXProgressBar extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Text text = new Text("Incarcare...");
        ProgressBar progressBar = new ProgressBar(0);
        progressBar.setTooltip(new Tooltip("Progress"));

        FileChooser fileChooser = new FileChooser();

        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Text Files", "*.txt"),
                new FileChooser.ExtensionFilter("HTML Files", "*.html"),
                new FileChooser.ExtensionFilter("Java Files", "*.java")
        );
            fileChooser.setInitialDirectory(new File("C:\\Users\\macar\\OneDrive\\Desktop\\CtrlN-code"));

        Button button = new Button("Incarca fisier !");
        button.setOnAction(event -> {
            File selectedFile = fileChooser.showOpenDialog(primaryStage);
            ExecutorService executorService = Executors.newSingleThreadExecutor();
            executorService.execute(new LoadingCommand(progressBar, selectedFile));
            executorService.shutdown();
        });



        VBox root = new VBox();
        root.setAlignment(Pos.TOP_CENTER);
        root.getChildren().addAll(Arrays.asList(text,progressBar,button));

        Scene scene = new Scene(root,500, 500);
        ShapesUtils.showPrimaryStage(primaryStage,scene,"JavaFX Progress Bar !");

    }
}
