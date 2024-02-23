package ro.ctrln.javafx.fxml;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class EventController {

    @FXML
    private Text changedText; //O facem "pulic" sau adaugam adnotarea  "@FXML"

    @FXML
    protected void changeTextOnPane(ActionEvent event){
        changedText.setText("Text modificat de buton !");
    }
}
