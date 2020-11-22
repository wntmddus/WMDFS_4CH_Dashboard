package main.java.com.controllers;

import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextFormatter;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class ViewLogsController extends DashboardController implements Initializable {
    @FXML
    TextArea logTextArea;

    private Stage stage;

    public void setStage(Stage stage) {
        this.stage = stage;
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        logView = logTextArea;
    }

}
