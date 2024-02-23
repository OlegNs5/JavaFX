package ro.ctrln.javafx.controls;

import javafx.scene.control.ProgressBar;

import java.io.File;

public class LoadingCommand implements Runnable {

    private ProgressBar progressBar;
    private File loadingFile;

    @Override
    public void run() {
        int i = 1;
        while (i <= 10) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            progressBar.setProgress(0.1 * i);
            i++;

        }

        if (loadingFile != null) {
            System.out.println("Am incarcat fisierul ! " + loadingFile.getName());
        }
    }

    public LoadingCommand(ProgressBar progressBar, File loadingFile) {
            this.progressBar = progressBar;
            this.loadingFile = loadingFile;
        }
    }
