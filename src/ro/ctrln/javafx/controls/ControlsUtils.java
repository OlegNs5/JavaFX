package ro.ctrln.javafx.controls;

import java.awt.*;
import java.io.IOException;
import java.net.URI;

public class ControlsUtils {
    public static void browseCourse(String message,String link) {
        System.out.println(message);
        try {
            Desktop.getDesktop().browse(URI.create(link));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }}