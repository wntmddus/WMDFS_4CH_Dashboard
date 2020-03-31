package com.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;
import com.util.SharedStorage;

public class SelectGraphController extends DashboardController implements Initializable {

    @FXML
    public ComboBox<String> deviceNumPicker0;

    @FXML
    public ComboBox<String> deviceNumPicker1;

    @FXML
    public ComboBox<String> deviceNumPicker2;

    @FXML
    public ComboBox<String> deviceNumPicker3;

    @FXML
    public ComboBox<String> deviceNumPicker4;

    @FXML
    public ComboBox<String> deviceNumPicker5;

    @FXML
    public ComboBox<String> deviceNumPicker6;

    @FXML
    public ComboBox<String> deviceNumPicker7;

    @FXML
    public CheckBox ch1VibChkBox0;

    @FXML
    public CheckBox ch2VibChkBox0;

    @FXML
    public CheckBox ch3VibChkBox0;

    @FXML
    public CheckBox ch1RpmChkBox0;

    @FXML
    public CheckBox ch2RpmChkBox0;

    @FXML
    public CheckBox ch3RpmChkBox0;

    @FXML
    public CheckBox ch1VibChkBox1;

    @FXML
    public CheckBox ch2VibChkBox1;

    @FXML
    public CheckBox ch3VibChkBox1;

    @FXML
    public CheckBox ch1RpmChkBox1;

    @FXML
    public CheckBox ch2RpmChkBox1;

    @FXML
    public CheckBox ch3RpmChkBox1;

    @FXML
    public CheckBox ch1VibChkBox2;

    @FXML
    public CheckBox ch2VibChkBox2;

    @FXML
    public CheckBox ch3VibChkBox2;

    @FXML
    public CheckBox ch1RpmChkBox2;

    @FXML
    public CheckBox ch2RpmChkBox2;

    @FXML
    public CheckBox ch3RpmChkBox2;

    @FXML
    public CheckBox ch1VibChkBox3;

    @FXML
    public CheckBox ch2VibChkBox3;

    @FXML
    public CheckBox ch3VibChkBox3;

    @FXML
    public CheckBox ch1RpmChkBox3;

    @FXML
    public CheckBox ch2RpmChkBox3;

    @FXML
    public CheckBox ch3RpmChkBox3;

    @FXML
    public CheckBox ch1VibChkBox4;

    @FXML
    public CheckBox ch2VibChkBox4;

    @FXML
    public CheckBox ch3VibChkBox4;

    @FXML
    public CheckBox ch1RpmChkBox4;

    @FXML
    public CheckBox ch2RpmChkBox4;

    @FXML
    public CheckBox ch3RpmChkBox4;

    @FXML
    public CheckBox ch1VibChkBox5;

    @FXML
    public CheckBox ch2VibChkBox5;

    @FXML
    public CheckBox ch3VibChkBox5;

    @FXML
    public CheckBox ch1RpmChkBox5;

    @FXML
    public CheckBox ch2RpmChkBox5;

    @FXML
    public CheckBox ch3RpmChkBox5;

    @FXML
    public CheckBox ch1VibChkBox6;

    @FXML
    public CheckBox ch2VibChkBox6;

    @FXML
    public CheckBox ch3VibChkBox6;

    @FXML
    public CheckBox ch1RpmChkBox6;

    @FXML
    public CheckBox ch2RpmChkBox6;

    @FXML
    public CheckBox ch3RpmChkBox6;

    @FXML
    public CheckBox ch1VibChkBox7;

    @FXML
    public CheckBox ch2VibChkBox7;

    @FXML
    public CheckBox ch3VibChkBox7;

    @FXML
    public CheckBox ch1RpmChkBox7;

    @FXML
    public CheckBox ch2RpmChkBox7;

    @FXML
    public CheckBox ch3RpmChkBox7;

    @FXML
    private Button selectGraphCloseBtn;

    private Stage stage;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    void onClose() {
        System.out.println(mainStage);
        stage.close();
    }
}
