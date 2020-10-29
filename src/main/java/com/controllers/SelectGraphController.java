package main.java.com.controllers;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;

import javafx.event.ActionEvent;
import org.ini4j.Ini;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.URL;
import java.util.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SelectGraphController extends DashboardController implements Initializable {

    @FXML
    public ComboBox<Integer> deviceNumPicker0;

    @FXML
    public ComboBox<Integer> deviceNumPicker1;

    @FXML
    public ComboBox<Integer> deviceNumPicker2;

    @FXML
    public ComboBox<Integer> deviceNumPicker3;

    @FXML
    public ComboBox<Integer> deviceNumPicker4;

    @FXML
    public ComboBox<Integer> deviceNumPicker5;

    @FXML
    public ComboBox<Integer> deviceNumPicker6;

    @FXML
    public ComboBox<Integer> deviceNumPicker7;

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
    public TextField maxRpm0;
    @FXML
    public TextField maxRpm1;
    @FXML
    public TextField maxRpm2;
    @FXML
    public TextField maxRpm3;
    @FXML
    public TextField maxRpm4;
    @FXML
    public TextField maxRpm5;
    @FXML
    public TextField maxRpm6;
    @FXML
    public TextField maxRpm7;
    @FXML
    public TextField maxVib0;
    @FXML
    public TextField maxVib1;
    @FXML
    public TextField maxVib2;
    @FXML
    public TextField maxVib3;
    @FXML
    public TextField maxVib4;
    @FXML
    public TextField maxVib5;
    @FXML
    public TextField maxVib6;
    @FXML
    public TextField maxVib7;
    @FXML
    public CheckBox rpmAutoChkBox0;
    @FXML
    public CheckBox rpmAutoChkBox1;
    @FXML
    public CheckBox rpmAutoChkBox2;
    @FXML
    public CheckBox rpmAutoChkBox3;
    @FXML
    public CheckBox rpmAutoChkBox4;
    @FXML
    public CheckBox rpmAutoChkBox5;
    @FXML
    public CheckBox rpmAutoChkBox6;
    @FXML
    public CheckBox rpmAutoChkBox7;
    @FXML
    public CheckBox vibAutoChkBox0;
    @FXML
    public CheckBox vibAutoChkBox1;
    @FXML
    public CheckBox vibAutoChkBox2;
    @FXML
    public CheckBox vibAutoChkBox3;
    @FXML
    public CheckBox vibAutoChkBox4;
    @FXML
    public CheckBox vibAutoChkBox5;
    @FXML
    public CheckBox vibAutoChkBox6;
    @FXML
    public CheckBox vibAutoChkBox7;

    private List<Integer> comboBoxItems = new ArrayList<>();

    private Stage stage;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        deviceNumPickerMap.put(0, deviceNumPicker0);
        deviceNumPickerMap.put(1, deviceNumPicker1);
        deviceNumPickerMap.put(2, deviceNumPicker2);
        deviceNumPickerMap.put(3, deviceNumPicker3);
        deviceNumPickerMap.put(4, deviceNumPicker4);
        deviceNumPickerMap.put(5, deviceNumPicker5);
        deviceNumPickerMap.put(6, deviceNumPicker6);
        deviceNumPickerMap.put(7, deviceNumPicker7);
        graphSelectCheckboxMap.get(0).put("rpm1", ch1RpmChkBox0);
        graphSelectCheckboxMap.get(0).put("rpm2", ch2RpmChkBox0);
        graphSelectCheckboxMap.get(0).put("rpm3", ch3RpmChkBox0);
        graphSelectCheckboxMap.get(0).put("vib1", ch1VibChkBox0);
        graphSelectCheckboxMap.get(0).put("vib2", ch2VibChkBox0);
        graphSelectCheckboxMap.get(0).put("vib3", ch3VibChkBox0);
        graphSelectCheckboxMap.get(1).put("rpm1", ch1RpmChkBox1);
        graphSelectCheckboxMap.get(1).put("rpm2", ch2RpmChkBox1);
        graphSelectCheckboxMap.get(1).put("rpm3", ch3RpmChkBox1);
        graphSelectCheckboxMap.get(1).put("vib1", ch1VibChkBox1);
        graphSelectCheckboxMap.get(1).put("vib2", ch2VibChkBox1);
        graphSelectCheckboxMap.get(1).put("vib3", ch3VibChkBox1);
        graphSelectCheckboxMap.get(2).put("rpm1", ch1RpmChkBox2);
        graphSelectCheckboxMap.get(2).put("rpm2", ch2RpmChkBox2);
        graphSelectCheckboxMap.get(2).put("rpm3", ch3RpmChkBox2);
        graphSelectCheckboxMap.get(2).put("vib1", ch1VibChkBox2);
        graphSelectCheckboxMap.get(2).put("vib2", ch2VibChkBox2);
        graphSelectCheckboxMap.get(2).put("vib3", ch3VibChkBox2);
        graphSelectCheckboxMap.get(3).put("rpm1", ch1RpmChkBox3);
        graphSelectCheckboxMap.get(3).put("rpm2", ch2RpmChkBox3);
        graphSelectCheckboxMap.get(3).put("rpm3", ch3RpmChkBox3);
        graphSelectCheckboxMap.get(3).put("vib1", ch1VibChkBox3);
        graphSelectCheckboxMap.get(3).put("vib2", ch2VibChkBox3);
        graphSelectCheckboxMap.get(3).put("vib3", ch3VibChkBox3);
        graphSelectCheckboxMap.get(4).put("rpm1", ch1RpmChkBox4);
        graphSelectCheckboxMap.get(4).put("rpm2", ch2RpmChkBox4);
        graphSelectCheckboxMap.get(4).put("rpm3", ch3RpmChkBox4);
        graphSelectCheckboxMap.get(4).put("vib1", ch1VibChkBox4);
        graphSelectCheckboxMap.get(4).put("vib2", ch2VibChkBox4);
        graphSelectCheckboxMap.get(4).put("vib3", ch3VibChkBox4);
        graphSelectCheckboxMap.get(5).put("rpm1", ch1RpmChkBox5);
        graphSelectCheckboxMap.get(5).put("rpm2", ch2RpmChkBox5);
        graphSelectCheckboxMap.get(5).put("rpm3", ch3RpmChkBox5);
        graphSelectCheckboxMap.get(5).put("vib1", ch1VibChkBox5);
        graphSelectCheckboxMap.get(5).put("vib2", ch2VibChkBox5);
        graphSelectCheckboxMap.get(5).put("vib3", ch3VibChkBox5);
        graphSelectCheckboxMap.get(6).put("rpm1", ch1RpmChkBox6);
        graphSelectCheckboxMap.get(6).put("rpm2", ch2RpmChkBox6);
        graphSelectCheckboxMap.get(6).put("rpm3", ch3RpmChkBox6);
        graphSelectCheckboxMap.get(6).put("vib1", ch1VibChkBox6);
        graphSelectCheckboxMap.get(6).put("vib2", ch2VibChkBox6);
        graphSelectCheckboxMap.get(6).put("vib3", ch3VibChkBox6);
        graphSelectCheckboxMap.get(7).put("rpm1", ch1RpmChkBox7);
        graphSelectCheckboxMap.get(7).put("rpm2", ch2RpmChkBox7);
        graphSelectCheckboxMap.get(7).put("rpm3", ch3RpmChkBox7);
        graphSelectCheckboxMap.get(7).put("vib1", ch1VibChkBox7);
        graphSelectCheckboxMap.get(7).put("vib2", ch2VibChkBox7);
        graphSelectCheckboxMap.get(7).put("vib3", ch3VibChkBox7);
        maxRpmMap.put(0, maxRpm0);
        maxRpmMap.put(1, maxRpm1);
        maxRpmMap.put(2, maxRpm2);
        maxRpmMap.put(3, maxRpm3);
        maxRpmMap.put(4, maxRpm4);
        maxRpmMap.put(5, maxRpm5);
        maxRpmMap.put(6, maxRpm6);
        maxRpmMap.put(7, maxRpm7);
        maxVibMap.put(0, maxVib0);
        maxVibMap.put(1, maxVib1);
        maxVibMap.put(2, maxVib2);
        maxVibMap.put(3, maxVib3);
        maxVibMap.put(4, maxVib4);
        maxVibMap.put(5, maxVib5);
        maxVibMap.put(6, maxVib6);
        maxVibMap.put(7, maxVib7);
        rpmAutoChkBoxMap.put(0, rpmAutoChkBox0);
        rpmAutoChkBoxMap.put(1, rpmAutoChkBox1);
        rpmAutoChkBoxMap.put(2, rpmAutoChkBox2);
        rpmAutoChkBoxMap.put(3, rpmAutoChkBox3);
        rpmAutoChkBoxMap.put(4, rpmAutoChkBox4);
        rpmAutoChkBoxMap.put(5, rpmAutoChkBox5);
        rpmAutoChkBoxMap.put(6, rpmAutoChkBox6);
        rpmAutoChkBoxMap.put(7, rpmAutoChkBox7);
        vibAutoChkBoxMap.put(0, vibAutoChkBox0);
        vibAutoChkBoxMap.put(1, vibAutoChkBox1);
        vibAutoChkBoxMap.put(2, vibAutoChkBox2);
        vibAutoChkBoxMap.put(3, vibAutoChkBox3);
        vibAutoChkBoxMap.put(4, vibAutoChkBox4);
        vibAutoChkBoxMap.put(5, vibAutoChkBox5);
        vibAutoChkBoxMap.put(6, vibAutoChkBox6);
        vibAutoChkBoxMap.put(7, vibAutoChkBox7);

        comboBoxItems.add(null);
        for (Map.Entry<Integer, Socket> entry : clientConn.entrySet()) {
            if(entry.getValue().isConnected()) {
                comboBoxItems.add(entry.getKey() + 1);
            }
        }
        Platform.runLater(() -> {
            for (int i = 0; i < MAX_GRAPH_NUMBER; i ++) {
                deviceNumPickerMap.get(i).getItems().addAll(comboBoxItems);
            }
            for (int i = 0; i < MAX_GRAPH_NUMBER; i++) {
                Integer deviceNumber = null;
                for (Map.Entry<Integer, Integer> entry : chartAllocation.entrySet()) {
                    if (entry.getValue() == i) {
                        deviceNumber = entry.getKey();
                        break;
                    }
                }
                if (deviceNumber != null) {
                    deviceNumPickerMap.get(i).setValue(deviceNumber + 1);
                    List<Boolean> deviceConfig = chartConfigMap.get(deviceNumber);
                    if (maxRpmValueMap.containsKey(deviceNumber)) {
                        maxRpmMap.get(i).setText(maxRpmValueMap.get(deviceNumber).toString());
                    } else {
                        rpmAutoChkBoxMap.get(i).setSelected(true);
                        maxRpmMap.get(i).setDisable(true);
                    }
                    if (maxVibValueMap.containsKey(deviceNumber)) {
                        maxVibMap.get(i).setText(maxVibValueMap.get(deviceNumber).toString());
                    } else {
                        vibAutoChkBoxMap.get(i).setSelected(true);
                        maxVibMap.get(i).setDisable(true);
                    }
                    graphSelectCheckboxMap.get(i).get("rpm1").setSelected(deviceConfig.get(0));
                    graphSelectCheckboxMap.get(i).get("rpm2").setSelected(deviceConfig.get(1));
                    graphSelectCheckboxMap.get(i).get("rpm3").setSelected(deviceConfig.get(2));
                    graphSelectCheckboxMap.get(i).get("vib1").setSelected(deviceConfig.get(3));
                    graphSelectCheckboxMap.get(i).get("vib2").setSelected(deviceConfig.get(4));
                    graphSelectCheckboxMap.get(i).get("vib3").setSelected(deviceConfig.get(5));
                }
            }
        });
    }


    @FXML
    private void handleOnSubmit() {
        Platform.runLater(() -> {
            for (Map.Entry<Integer, ComboBox<Integer>> entry : deviceNumPickerMap.entrySet()) {
                int chartNumber = entry.getKey();
                for (Map.Entry<Integer, Integer> e : chartAllocation.entrySet()) {
                    if (e.getValue() == chartNumber) {
                        chartAllocation.remove(e.getKey());
                        break;
                    }
                }
                lineCharts.get(chartNumber).getData().clear();
                lineRightCharts.get(chartNumber).getData().clear();
                graphLabels.get(chartNumber).setText("Empty");
                graphPanelLabels.get(chartNumber).setText("Empty");
                lineRightCharts.get(chartNumber).getYAxis().setLabel("Vib");
                realTimeData.get(chartNumber).get(0).setText("0");
                realTimeData.get(chartNumber).get(1).setText("0");
                realTimeData.get(chartNumber).get(2).setText("0");
                realTimeData.get(chartNumber).get(3).setText("0");
                realTimeData.get(chartNumber).get(4).setText("0");
                realTimeData.get(chartNumber).get(5).setText("0");
                chartLabelMap.get(chartNumber).get(0).setText("");
                chartLabelMap.get(chartNumber).get(1).setText("");
                chartLabelMap.get(chartNumber).get(2).setText("");
                vibUnitLabelMap.get(chartNumber).setText("Disp.Peak");
                lineMap.get(chartNumber).setVisible(false);
                chartRectangleMap.get(chartNumber).setVisible(false);
                Integer newDeviceNumber = entry.getValue().getSelectionModel().getSelectedItem();
                if (newDeviceNumber != null) {
                    String maxRpm = maxRpmMap.get(chartNumber).getText();
                    String maxVib = maxVibMap.get(chartNumber).getText();
                    boolean rpmAutoRanging = rpmAutoChkBoxMap.get(chartNumber).isSelected();
                    boolean vibAutoRanging = vibAutoChkBoxMap.get(chartNumber).isSelected();
                    if (!maxRpm.equals("")) {
                        maxRpmValueMap.put(newDeviceNumber - 1, Integer.parseInt(maxRpm));
                    } else {
                        maxRpmMap.get(chartNumber).setText("");
                        maxRpmValueMap.remove(newDeviceNumber - 1);
                    }
                    if (!maxVib.equals("")) {
                        maxVibValueMap.put(newDeviceNumber - 1, Integer.parseInt(maxVib));
                    } else {
                        maxVibMap.get(chartNumber).setText("");
                        maxVibValueMap.remove(newDeviceNumber - 1);
                    }
                    if (rpmAutoRanging) {
                        maxRpmMap.get(chartNumber).setText("");
                        maxRpmValueMap.remove(newDeviceNumber - 1);
                    }
                    if (vibAutoRanging) {
                        maxVibMap.get(chartNumber).setText("");
                        maxVibValueMap.remove(newDeviceNumber - 1);
                    }
                    modifyGraphWithGivenConfig(newDeviceNumber - 1, chartNumber);
                    chartAllocation.put(newDeviceNumber - 1, chartNumber);
                }
            }
        });
        stage.close();
    }
    @FXML
    private void handleOnLoad() throws IOException {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Load Setting");
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("CFG files (*.cfg)", "*.cfg");
        fileChooser.getExtensionFilters().add(extFilter);
        //Show save file dialog
        File file = fileChooser.showOpenDialog(stage);

        if (file != null) {
            Ini ini = new Ini(file);
            Map<String, String> map = ini.get("ChartConfig");
            for (Map.Entry<String, String> entry : map.entrySet()) {
                int deviceIndex = Integer.parseInt(String.valueOf(entry.getKey().charAt(entry.getKey().length() - 1)));
                if (clientConn.containsKey(deviceIndex) && clientConn.get(deviceIndex).isConnected()) {
                    chartConfigMap.get(deviceIndex).set(0, entry.getValue().charAt(0) != '0');
                    chartConfigMap.get(deviceIndex).set(1, entry.getValue().charAt(1) != '0');
                    chartConfigMap.get(deviceIndex).set(2, entry.getValue().charAt(2) != '0');
                    chartConfigMap.get(deviceIndex).set(3, entry.getValue().charAt(3) != '0');
                    chartConfigMap.get(deviceIndex).set(4, entry.getValue().charAt(4) != '0');
                    chartConfigMap.get(deviceIndex).set(5, entry.getValue().charAt(5) != '0');
                    if (chartAllocation.containsKey(deviceIndex)) {
                        graphSelectCheckboxMap.get(chartAllocation.get(deviceIndex)).get("rpm1").setSelected(chartConfigMap.get(deviceIndex).get(0));
                        graphSelectCheckboxMap.get(chartAllocation.get(deviceIndex)).get("rpm2").setSelected(chartConfigMap.get(deviceIndex).get(1));
                        graphSelectCheckboxMap.get(chartAllocation.get(deviceIndex)).get("rpm3").setSelected(chartConfigMap.get(deviceIndex).get(2));
                        graphSelectCheckboxMap.get(chartAllocation.get(deviceIndex)).get("vib1").setSelected(chartConfigMap.get(deviceIndex).get(3));
                        graphSelectCheckboxMap.get(chartAllocation.get(deviceIndex)).get("vib2").setSelected(chartConfigMap.get(deviceIndex).get(4));
                        graphSelectCheckboxMap.get(chartAllocation.get(deviceIndex)).get("vib3").setSelected(chartConfigMap.get(deviceIndex).get(5));
                    }
                }
            }
            FXMLLoader saveSettingLoader = new FXMLLoader(getClass().getResource("/main/resources/fxml/loadsuccess.fxml"));
            VBox vbox = null;
            vbox = saveSettingLoader.load();
            Stage stage = new Stage();
            stage.initOwner(mainStage);
            Scene scene = new Scene(vbox);
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle("Setting Loaded");
            stage.setScene(scene);
            stage.show();
            return;
        }
        FXMLLoader saveSettingLoader = new FXMLLoader(getClass().getResource("/main/resources/fxml/loadfailed.fxml"));
        VBox vbox = null;
        vbox = saveSettingLoader.load();
        Stage stage = new Stage();
        stage.initOwner(mainStage);
        Scene scene = new Scene(vbox);
        stage.initModality(Modality.WINDOW_MODAL);
        stage.setTitle("Setting Load Failed");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void handleOnSave() throws IOException {
        StringBuilder configString = new StringBuilder();
        configString.append("[ChartConfig]\n");
        for (Map.Entry<Integer, String> entry : addresses.entrySet()) {
            pref.put("address" + entry.getKey(), entry.getValue());
            StringBuilder config = new StringBuilder();
            for (int i = 0; i < chartConfigMap.get(entry.getKey()).size(); i++) {
                if (chartConfigMap.get(entry.getKey()).get(i)) config.append("1");
                else config.append("0");
            }
            pref.put("chartConfig" + entry.getKey(), config.toString());
        }
        Platform.runLater(() -> {
            for (int i = 0; i < MAX_GRAPH_NUMBER; i++) {
                for (Map.Entry<Integer, Integer> e : chartAllocation.entrySet()) {
                    if (e.getValue() == i) {
                        chartAllocation.remove(e.getKey());
                        break;
                    }
                }
                Integer deviceIndex = deviceNumPickerMap.get(i).getValue();
                if (deviceIndex == null) {
                    lineCharts.get(i).getData().clear();
                    lineRightCharts.get(i).getData().clear();
                    graphLabels.get(i).setText("Empty");
                    graphPanelLabels.get(i).setText("Empty");
                    realTimeData.get(i).get(0).setText("0");
                    realTimeData.get(i).get(1).setText("0");
                    realTimeData.get(i).get(2).setText("0");
                    realTimeData.get(i).get(3).setText("0");
                    realTimeData.get(i).get(4).setText("0");
                    realTimeData.get(i).get(5).setText("0");
                    chartLabelMap.get(i).get(0).setText("");
                    chartLabelMap.get(i).get(1).setText("");
                    chartLabelMap.get(i).get(2).setText("");
                    vibUnitLabelMap.get(i).setText("Disp.Peak");
                    lineMap.get(i).setVisible(false);
                    chartRectangleMap.get(i).setVisible(false);
                }
                if (deviceIndex != null) {
                    boolean rpm1 = graphSelectCheckboxMap.get(i).get("rpm1").isSelected();
                    boolean rpm2 = graphSelectCheckboxMap.get(i).get("rpm2").isSelected();
                    boolean rpm3 = graphSelectCheckboxMap.get(i).get("rpm3").isSelected();
                    boolean vib1 = graphSelectCheckboxMap.get(i).get("vib1").isSelected();
                    boolean vib2 = graphSelectCheckboxMap.get(i).get("vib2").isSelected();
                    boolean vib3 = graphSelectCheckboxMap.get(i).get("vib3").isSelected();
                    String maxRpm = maxRpmMap.get(i).getText();
                    String maxVib = maxVibMap.get(i).getText();
                    boolean rpmAutoRanging = rpmAutoChkBoxMap.get(i).isSelected();
                    boolean vibAutoRanging = vibAutoChkBoxMap.get(i).isSelected();
                    if (!maxRpm.equals("")) {
                        maxRpmValueMap.put(deviceIndex - 1, Integer.parseInt(maxRpm));
                    } else {
                        maxRpmMap.get(i).setText("");
                        maxRpmValueMap.remove(deviceIndex - 1);
                    }
                    if (!maxVib.equals("")) {
                        maxVibValueMap.put(deviceIndex - 1, Integer.parseInt(maxVib));
                    } else {
                        maxVibMap.get(i).setText("");
                        maxVibValueMap.remove(deviceIndex - 1);
                    }
                    if (rpmAutoRanging) {
                        maxRpmMap.get(i).setText("");
                        maxRpmValueMap.remove(deviceIndex - 1);
                    }
                    if (vibAutoRanging) {
                        maxVibMap.get(i).setText("");
                        maxVibValueMap.remove(deviceIndex - 1);
                    }
                    chartConfigMap.get(deviceIndex - 1).set(0, rpm1);
                    chartConfigMap.get(deviceIndex - 1).set(1, rpm2);
                    chartConfigMap.get(deviceIndex - 1).set(2, rpm3);
                    chartConfigMap.get(deviceIndex - 1).set(3, vib1);
                    chartConfigMap.get(deviceIndex - 1).set(4, vib2);
                    chartConfigMap.get(deviceIndex - 1).set(5, vib3);
                    StringBuilder config = new StringBuilder();
                    for (int j = 0; j < chartConfigMap.get(deviceIndex - 1).size(); j++) {
                        if (chartConfigMap.get(deviceIndex - 1).get(j)) config.append("1");
                        else config.append("0");
                    }
                    pref.put("chartConfig" + (deviceIndex - 1), config.toString());
                    configString.append("chartConfig").append(deviceIndex - 1).append("=").append(config.toString()).append("\n");
                    modifyGraphWithGivenConfig(deviceIndex - 1, i);
                    chartAllocation.put(deviceIndex - 1, i);
                }
            }
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Save Setting");
            FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("CFG files (*.cfg)", "*.cfg");
            fileChooser.getExtensionFilters().add(extFilter);
            //Show save file dialog
            File file = fileChooser.showSaveDialog(stage);

            if (file != null) {
                saveTextToFile(configString.toString(), file);
                FXMLLoader saveSettingLoader = new FXMLLoader(getClass().getResource("/main/resources/fxml/settingsaved.fxml"));
                VBox vbox = null;
                try {
                    vbox = saveSettingLoader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Stage stage = new Stage();
                stage.initOwner(mainStage);
                assert vbox != null;
                Scene scene = new Scene(vbox);
                stage.initModality(Modality.WINDOW_MODAL);
                stage.setTitle("Setting Saved");
                stage.setScene(scene);
                stage.show();
            }
        });
    }
    private void saveTextToFile(String content, File file) {
        try {
            PrintWriter writer;
            writer = new PrintWriter(file);
            writer.println(content);
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();        }
    }
    @FXML
    void handleRpmAutoChkBox(ActionEvent event) {
        CheckBox chkBox = ((CheckBox)(event.getSource()));
        String chkBoxId = chkBox.getId();
        int chkBoxIndex = Character.getNumericValue(chkBoxId.charAt(chkBoxId.length() - 1));
        maxRpmMap.get(chkBoxIndex).setDisable(chkBox.isSelected());
    }
    @FXML
    void handleVibAutoChkBox(ActionEvent event) {
        CheckBox chkBox = ((CheckBox)(event.getSource()));
        String chkBoxId = chkBox.getId();
        int chkBoxIndex = Character.getNumericValue(chkBoxId.charAt(chkBoxId.length() - 1));
        maxVibMap.get(chkBoxIndex).setDisable(chkBox.isSelected());
    }

    private void modifyGraphWithGivenConfig(Integer deviceNumber, int chartNumber) {
        Platform.runLater(() -> {
            boolean rpm1 = graphSelectCheckboxMap.get(chartNumber).get("rpm1").isSelected();
            boolean rpm2 = graphSelectCheckboxMap.get(chartNumber).get("rpm2").isSelected();
            boolean rpm3 = graphSelectCheckboxMap.get(chartNumber).get("rpm3").isSelected();
            boolean vib1 = graphSelectCheckboxMap.get(chartNumber).get("vib1").isSelected();
            boolean vib2 = graphSelectCheckboxMap.get(chartNumber).get("vib2").isSelected();
            boolean vib3 = graphSelectCheckboxMap.get(chartNumber).get("vib3").isSelected();
            chartConfigMap.get(deviceNumber).set(0, rpm1);
            chartConfigMap.get(deviceNumber).set(1, rpm2);
            chartConfigMap.get(deviceNumber).set(2, rpm3);
            chartConfigMap.get(deviceNumber).set(3, vib1);
            chartConfigMap.get(deviceNumber).set(4, vib2);
            chartConfigMap.get(deviceNumber).set(5, vib3);
            vibUnitLabelMap.get(chartNumber).setText(vibUnitMap.get(deviceNumber));
            graphLabels.get(chartNumber).setText(deviceNames.get(deviceNumber).getText());
            graphPanelLabels.get(chartNumber).setText(deviceNames.get(deviceNumber).getText());
            if (maxRpmValueMap.containsKey(deviceNumber)) {
                lineCharts.get(chartNumber).getYAxis().setAutoRanging(false);
                ((NumberAxis) lineCharts.get(chartNumber).getYAxis()).setUpperBound(maxRpmValueMap.get(deviceNumber));
            } else {
                lineCharts.get(chartNumber).getYAxis().setAutoRanging(true);
            }
            if (maxVibValueMap.containsKey(deviceNumber)) {
                lineRightCharts.get(chartNumber).getYAxis().setAutoRanging(false);
                ((NumberAxis) lineRightCharts.get(chartNumber).getYAxis()).setUpperBound(maxVibValueMap.get(deviceNumber));
            } else {
                lineRightCharts.get(chartNumber).getYAxis().setAutoRanging(true);
            }
            if (!chartConfigMap.get(deviceNumber).get(0)) {
                lineCharts.get(chartNumber).getData().remove(chartDataMap.get(deviceNumber).get("rpm1"));
            } else if (chartConfigMap.get(deviceNumber).get(0) && !lineCharts.get(chartNumber).getData().contains(chartDataMap.get(deviceNumber).get("rpm1"))) {
                lineCharts.get(chartNumber).getData().add(chartDataMap.get(deviceNumber).get("rpm1"));
                chartDataMap.get(deviceNumber).get("rpm1").getNode().lookup(".chart-series-line").setStyle("-fx-stroke: rgba(" + rgbFormatter(Color.DEEPSKYBLUE) + ", 1.0);");
            }
            if (!chartConfigMap.get(deviceNumber).get(1)) {
                lineCharts.get(chartNumber).getData().remove(chartDataMap.get(deviceNumber).get("rpm2"));
            } else if (chartConfigMap.get(deviceNumber).get(1) && !lineCharts.get(chartNumber).getData().contains(chartDataMap.get(deviceNumber).get("rpm2"))) {
                lineCharts.get(chartNumber).getData().add(chartDataMap.get(deviceNumber).get("rpm2"));
                chartDataMap.get(deviceNumber).get("rpm2").getNode().lookup(".chart-series-line").setStyle("-fx-stroke: rgba(" + rgbFormatter(Color.DEEPPINK) + ", 1.0);");
            }
            if (!chartConfigMap.get(deviceNumber).get(2)) {
                lineCharts.get(chartNumber).getData().remove(chartDataMap.get(deviceNumber).get("rpm3"));
            } else if (chartConfigMap.get(deviceNumber).get(2) && !lineCharts.get(chartNumber).getData().contains(chartDataMap.get(deviceNumber).get("rpm3"))) {
                lineCharts.get(chartNumber).getData().add(chartDataMap.get(deviceNumber).get("rpm3"));
                chartDataMap.get(deviceNumber).get("rpm3").getNode().lookup(".chart-series-line").setStyle("-fx-stroke: rgba(" + rgbFormatter(Color.SLATEGRAY) + ", 1.0);");
            }
            if (!chartConfigMap.get(deviceNumber).get(3)) {
                lineRightCharts.get(chartNumber).getData().remove(chartDataMap.get(deviceNumber).get("vib1"));
            } else if (chartConfigMap.get(deviceNumber).get(3) && !lineCharts.get(chartNumber).getData().contains(chartDataMap.get(deviceNumber).get("vib1"))) {
                lineRightCharts.get(chartNumber).getData().add(chartDataMap.get(deviceNumber).get("vib1"));
                chartDataMap.get(deviceNumber).get("vib1").getNode().lookup(".chart-series-line").setStyle("-fx-stroke: rgba(" + rgbFormatter(Color.BLUE) + ", 1.0);");
            }
            if (!chartConfigMap.get(deviceNumber).get(4)) {
                lineRightCharts.get(chartNumber).getData().remove(chartDataMap.get(deviceNumber).get("vib2"));
            } else if (chartConfigMap.get(deviceNumber).get(4) && !lineCharts.get(chartNumber).getData().contains(chartDataMap.get(deviceNumber).get("vib2"))) {
                lineRightCharts.get(chartNumber).getData().add(chartDataMap.get(deviceNumber).get("vib2"));
                chartDataMap.get(deviceNumber).get("vib2").getNode().lookup(".chart-series-line").setStyle("-fx-stroke: rgba(" + rgbFormatter(Color.RED) + ", 1.0);");
            }
            if (!chartConfigMap.get(deviceNumber).get(5)) {
                lineRightCharts.get(chartNumber).getData().remove(chartDataMap.get(deviceNumber).get("vib3"));
            } else if (chartConfigMap.get(deviceNumber).get(5) && !lineCharts.get(chartNumber).getData().contains(chartDataMap.get(deviceNumber).get("vib3"))) {
                lineRightCharts.get(chartNumber).getData().add(chartDataMap.get(deviceNumber).get("vib3"));
                chartDataMap.get(deviceNumber).get("vib3").getNode().lookup(".chart-series-line").setStyle("-fx-stroke: rgba(" + rgbFormatter(Color.BLACK) + ", 1.0);");
            }
            if (!chartConfigMap.get(deviceNumber).get(0) && !chartConfigMap.get(deviceNumber).get(1) && !chartConfigMap.get(deviceNumber).get(2)) {
                lineRightCharts.get(chartNumber).getYAxis().setLabel(vibUnitMap.get(deviceNumber));
                lineRightCharts.get(chartNumber).setVisible(true);
                lineCharts.get(chartNumber).setVisible(false);
            }
            if (!chartConfigMap.get(deviceNumber).get(3) && !chartConfigMap.get(deviceNumber).get(4) && !chartConfigMap.get(deviceNumber).get(5)) {
                lineCharts.get(chartNumber).getYAxis().setLabel("Rpm");
                lineRightCharts.get(chartNumber).setVisible(false);
                lineCharts.get(chartNumber).setVisible(true);
            }
            if ((chartConfigMap.get(deviceNumber).get(0) || chartConfigMap.get(deviceNumber).get(1) || chartConfigMap.get(deviceNumber).get(2)) && (chartConfigMap.get(deviceNumber).get(3) || chartConfigMap.get(deviceNumber).get(4) || chartConfigMap.get(deviceNumber).get(5))) {
                lineCharts.get(chartNumber).getYAxis().setLabel("Rpm");
                lineRightCharts.get(chartNumber).getYAxis().setLabel(vibUnitMap.get(deviceNumber));
                lineCharts.get(chartNumber).setVisible(true);
                lineRightCharts.get(chartNumber).setVisible(true);
            }
        });
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    void onClose() {
        stage.close();
    }

    @FXML
    public void handleComboboxAction(ActionEvent actionEvent) {
        ComboBox comboBox = ((ComboBox)(actionEvent.getSource()));
        String comboBoxId = comboBox.getId();
        int comboBoxIndex = Character.getNumericValue(comboBoxId.charAt(comboBoxId.length() - 1));
        if (comboBox.getValue() == null) {
            Platform.runLater(() -> {
                graphSelectCheckboxMap.get(comboBoxIndex).get("rpm1").setSelected(false);
                graphSelectCheckboxMap.get(comboBoxIndex).get("rpm2").setSelected(false);
                graphSelectCheckboxMap.get(comboBoxIndex).get("rpm3").setSelected(false);
                graphSelectCheckboxMap.get(comboBoxIndex).get("vib1").setSelected(false);
                graphSelectCheckboxMap.get(comboBoxIndex).get("vib2").setSelected(false);
                graphSelectCheckboxMap.get(comboBoxIndex).get("vib3").setSelected(false);
                vibAutoChkBoxMap.get(comboBoxIndex).setSelected(false);
                maxVibMap.get(comboBoxIndex).setDisable(false);
                maxVibMap.get(comboBoxIndex).setText("");
                rpmAutoChkBoxMap.get(comboBoxIndex).setSelected(false);
                maxVibMap.get(comboBoxIndex).setDisable(false);
                maxRpmMap.get(comboBoxIndex).setText("");
            });
        } else {
            Platform.runLater(() -> {
                graphSelectCheckboxMap.get(comboBoxIndex).get("rpm1").setSelected(chartConfigMap.get((int) comboBox.getValue() - 1).get(0));
                graphSelectCheckboxMap.get(comboBoxIndex).get("rpm2").setSelected(chartConfigMap.get((int) comboBox.getValue() - 1).get(1));
                graphSelectCheckboxMap.get(comboBoxIndex).get("rpm3").setSelected(chartConfigMap.get((int) comboBox.getValue() - 1).get(2));
                graphSelectCheckboxMap.get(comboBoxIndex).get("vib1").setSelected(chartConfigMap.get((int) comboBox.getValue() - 1).get(3));
                graphSelectCheckboxMap.get(comboBoxIndex).get("vib2").setSelected(chartConfigMap.get((int) comboBox.getValue() - 1).get(4));
                graphSelectCheckboxMap.get(comboBoxIndex).get("vib3").setSelected(chartConfigMap.get((int) comboBox.getValue() - 1).get(5));
                if (maxRpmValueMap.containsKey((int) comboBox.getValue() - 1)) {
                    rpmAutoChkBoxMap.get(comboBoxIndex).setSelected(false);
                    maxRpmMap.get(comboBoxIndex).setDisable(false);
                    maxRpmMap.get(comboBoxIndex).setText(maxRpmValueMap.get((int) comboBox.getValue() - 1).toString());
                } else {
                    rpmAutoChkBoxMap.get(comboBoxIndex).setSelected(true);
                    maxRpmMap.get(comboBoxIndex).setDisable(true);
                    maxRpmMap.get(comboBoxIndex).setText("");
                }
                if (maxVibValueMap.containsKey((int) comboBox.getValue() - 1)) {
                    vibAutoChkBoxMap.get(comboBoxIndex).setSelected(false);
                    maxVibMap.get(comboBoxIndex).setDisable(false);
                    maxVibMap.get(comboBoxIndex).setText(maxVibValueMap.get((int) comboBox.getValue() - 1).toString());
                } else {
                    vibAutoChkBoxMap.get(comboBoxIndex).setSelected(true);
                    maxVibMap.get(comboBoxIndex).setDisable(true);
                    maxVibMap.get(comboBoxIndex).setText("");
                }
            });
        }
    }
}
