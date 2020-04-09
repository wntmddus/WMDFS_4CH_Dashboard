package main.java.com.controllers;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;

import javafx.event.ActionEvent;

import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

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
        comboBoxItems.add(null);
        for (Map.Entry<Integer, Socket> entry : clientConn.entrySet()) {
            if(entry.getValue().isConnected()) {
                comboBoxItems.add(entry.getKey());
            }
        }
        for (int i = 0; i < MAX_GRAPH_NUMBER; i++) {
            int deviceNumber = -1;
            for (Map.Entry<Integer, Integer> entry : chartAllocation.entrySet()) {
                if (entry.getValue() == i) {
                    deviceNumber = entry.getKey();
                    break;
                }
            }
            deviceNumPickerMap.get(i).getItems().addAll(comboBoxItems);

            int finalDeviceNumber = deviceNumber;
            int finalI = i;
            if (deviceNumber > -1) {
                Platform.runLater(() -> {
                    if (chartAllocation.containsValue(finalI)) {
                        deviceNumPickerMap.get(finalI).setValue(finalDeviceNumber);
                        List<Boolean> deviceConfig = chartConfigMap.get(finalDeviceNumber);
                        graphSelectCheckboxMap.get(finalI).get("rpm1").setSelected(deviceConfig.get(0));
                        graphSelectCheckboxMap.get(finalI).get("rpm2").setSelected(deviceConfig.get(1));
                        graphSelectCheckboxMap.get(finalI).get("rpm3").setSelected(deviceConfig.get(2));
                        graphSelectCheckboxMap.get(finalI).get("vib1").setSelected(deviceConfig.get(3));
                        graphSelectCheckboxMap.get(finalI).get("vib2").setSelected(deviceConfig.get(4));
                        graphSelectCheckboxMap.get(finalI).get("vib3").setSelected(deviceConfig.get(5));
                    }
                });
            }
        }

    }


    @FXML
    private void handleOnSubmit() {
        for (Map.Entry<Integer, ComboBox<Integer>> entry : deviceNumPickerMap.entrySet()) {
            int chartNumber = entry.getKey();
            lineCharts.get(chartNumber).getData().clear();
            Platform.runLater(() -> {
                graphLabels.get(chartNumber).setText("Empty");
                realTimeData.get(chartNumber).get(0).setText("0");
                realTimeData.get(chartNumber).get(1).setText("0");
                realTimeData.get(chartNumber).get(2).setText("0");
                realTimeData.get(chartNumber).get(3).setText("0");
                realTimeData.get(chartNumber).get(4).setText("0");
                realTimeData.get(chartNumber).get(5).setText("0");
                chartLabelMap.get(chartNumber).get(0).setText("");
                chartLabelMap.get(chartNumber).get(1).setText("");
                chartLabelMap.get(chartNumber).get(2).setText("");
                lineMap.get(chartNumber).setVisible(false);
                chartRectangleMap.get(chartNumber).setVisible(false);
            });
            Integer deviceNumber = entry.getValue().getSelectionModel().getSelectedItem();
            if (deviceNumber != null) {
                modifyGraphWithGivenConfig(deviceNumber, chartNumber);
                chartAllocation.put(deviceNumber, chartNumber);
            }
            if (deviceNumber == null) {
                for (Map.Entry<Integer, Integer> e : chartAllocation.entrySet()) {
                    if (e.getValue() == chartNumber) {
                        deviceNumber = e.getKey();
                        chartAllocation.remove(deviceNumber);
                        break;
                    }
                }
            }
        }
        stage.close();
    }
    @FXML
    private void handleOnSave() throws IOException {
        for (Map.Entry<Integer, String> entry : addresses.entrySet()) {
            pref.put("address" + entry.getKey(), entry.getValue());
            pref.put("port" + entry.getKey(), ports.get(entry.getKey()));
            StringBuilder config = new StringBuilder();
            for (int i = 0; i < chartConfigMap.get(entry.getKey()).size(); i++) {
                if (chartConfigMap.get(entry.getKey()).get(i)) config.append("1");
                else config.append("0");
            }
            pref.put("chartConfig" + entry.getKey(), config.toString());
        }
        for (int i = 0; i < MAX_GRAPH_NUMBER; i++) {
            Integer deviceIndex = deviceNumPickerMap.get(i).getValue();
            if (deviceIndex == null) {
                for (Map.Entry<Integer, Integer> e : chartAllocation.entrySet()) {
                    if (e.getValue() == i) {
                        chartAllocation.remove(deviceIndex);
                        break;
                    }
                }
                lineCharts.get(i).getData().clear();
                int finalI = i;
                Platform.runLater(() -> {
                    graphLabels.get(finalI).setText("Empty");
                    realTimeData.get(finalI).get(0).setText("0");
                    realTimeData.get(finalI).get(1).setText("0");
                    realTimeData.get(finalI).get(2).setText("0");
                    realTimeData.get(finalI).get(3).setText("0");
                    realTimeData.get(finalI).get(4).setText("0");
                    realTimeData.get(finalI).get(5).setText("0");
                    chartLabelMap.get(finalI).get(0).setText("");
                    chartLabelMap.get(finalI).get(1).setText("");
                    chartLabelMap.get(finalI).get(2).setText("");
                    lineMap.get(finalI).setVisible(false);
                    chartRectangleMap.get(finalI).setVisible(false);
                });
            }
            if (deviceIndex != null) {
                boolean rpm1 = graphSelectCheckboxMap.get(i).get("rpm1").isSelected();
                boolean rpm2 = graphSelectCheckboxMap.get(i).get("rpm2").isSelected();
                boolean rpm3 = graphSelectCheckboxMap.get(i).get("rpm3").isSelected();
                boolean vib1 = graphSelectCheckboxMap.get(i).get("vib1").isSelected();
                boolean vib2 = graphSelectCheckboxMap.get(i).get("vib2").isSelected();
                boolean vib3 = graphSelectCheckboxMap.get(i).get("vib3").isSelected();
                chartConfigMap.get(deviceIndex).set(0, rpm1);
                chartConfigMap.get(deviceIndex).set(1, rpm2);
                chartConfigMap.get(deviceIndex).set(2, rpm3);
                chartConfigMap.get(deviceIndex).set(3, vib1);
                chartConfigMap.get(deviceIndex).set(4, vib2);
                chartConfigMap.get(deviceIndex).set(5, vib3);
                StringBuilder config = new StringBuilder();
                for (int j = 0; j < chartConfigMap.get(deviceIndex).size(); j++) {
                    if (chartConfigMap.get(deviceIndex).get(j)) config.append("1");
                    else config.append("0");
                }
                pref.put("chartConfig" + deviceIndex, config.toString());
                modifyGraphWithGivenConfig(deviceIndex, i);
                chartAllocation.put(deviceIndex, i);
            }
        }

        FXMLLoader saveSettingLoader = new FXMLLoader(getClass().getResource("/main/resources/fxml/settingsaved.fxml"));
        VBox vbox = saveSettingLoader.load();
        Stage stage = new Stage();
        stage.initOwner(mainStage);
        Scene scene = new Scene(vbox);
        stage.initModality(Modality.WINDOW_MODAL);
        stage.setTitle("Setting Saved");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void handleOnReset() throws IOException {
        for (Map.Entry<Integer, String> entry : addresses.entrySet()) {
            pref.remove("address" + entry.getKey());
            pref.remove("port" + entry.getKey());
            pref.remove("chartConfig" + entry.getKey());
        }
        FXMLLoader resetSettingLoader = new FXMLLoader(getClass().getResource("/main/resources/fxml/settingreset.fxml"));
        VBox vbox = resetSettingLoader.load();
        Stage stage = new Stage();
        stage.initOwner(mainStage);
        Scene scene = new Scene(vbox);
        stage.initModality(Modality.WINDOW_MODAL);
        stage.setTitle("Setting Reset");
        stage.setScene(scene);
        stage.show();
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
            graphLabels.get(chartNumber).setText(deviceNames.get(deviceNumber).getText());
            if (!chartConfigMap.get(deviceNumber).get(0)) {
                lineCharts.get(chartNumber).getData().remove(chartDataMap.get(deviceNumber).get("rpm1"));
            } else if (chartConfigMap.get(deviceNumber).get(0) && !lineCharts.get(chartNumber).getData().contains(chartDataMap.get(deviceNumber).get("rpm1"))) {
                lineCharts.get(chartNumber).getData().add(chartDataMap.get(deviceNumber).get("rpm1"));
                chartDataMap.get(deviceNumber).get("rpm1").getNode().lookup(".chart-series-line").setStyle("-fx-stroke: rgba(" + rgbFormatter(Color.CYAN) + ", 1.0);");
            }
            if (!chartConfigMap.get(deviceNumber).get(1)) {
                lineCharts.get(chartNumber).getData().remove(chartDataMap.get(deviceNumber).get("rpm2"));
            } else if (chartConfigMap.get(deviceNumber).get(1) && !lineCharts.get(chartNumber).getData().contains(chartDataMap.get(deviceNumber).get("rpm2"))) {
                lineCharts.get(chartNumber).getData().add(chartDataMap.get(deviceNumber).get("rpm2"));
                chartDataMap.get(deviceNumber).get("rpm2").getNode().lookup(".chart-series-line").setStyle("-fx-stroke: rgba(" + rgbFormatter(Color.PINK) + ", 1.0);");
            }
            if (!chartConfigMap.get(deviceNumber).get(2)) {
                lineCharts.get(chartNumber).getData().remove(chartDataMap.get(deviceNumber).get("rpm3"));
            } else if (chartConfigMap.get(deviceNumber).get(2) && !lineCharts.get(chartNumber).getData().contains(chartDataMap.get(deviceNumber).get("rpm3"))) {
                lineCharts.get(chartNumber).getData().add(chartDataMap.get(deviceNumber).get("rpm3"));
                chartDataMap.get(deviceNumber).get("rpm3").getNode().lookup(".chart-series-line").setStyle("-fx-stroke: rgba(" + rgbFormatter(Color.DARKGRAY) + ", 1.0);");
            }
            if (!chartConfigMap.get(deviceNumber).get(3)) {
                lineCharts.get(chartNumber).getData().remove(chartDataMap.get(deviceNumber).get("vib1"));
            } else if (chartConfigMap.get(deviceNumber).get(3) && !lineCharts.get(chartNumber).getData().contains(chartDataMap.get(deviceNumber).get("vib1"))) {
                lineCharts.get(chartNumber).getData().add(chartDataMap.get(deviceNumber).get("vib1"));
                chartDataMap.get(deviceNumber).get("vib1").getNode().lookup(".chart-series-line").setStyle("-fx-stroke: rgba(" + rgbFormatter(Color.BLUE) + ", 1.0);");
            }
            if (!chartConfigMap.get(deviceNumber).get(4)) {
                lineCharts.get(chartNumber).getData().remove(chartDataMap.get(deviceNumber).get("vib2"));
            } else if (chartConfigMap.get(deviceNumber).get(4) && !lineCharts.get(chartNumber).getData().contains(chartDataMap.get(deviceNumber).get("vib2"))) {
                lineCharts.get(chartNumber).getData().add(chartDataMap.get(deviceNumber).get("vib2"));
                chartDataMap.get(deviceNumber).get("vib2").getNode().lookup(".chart-series-line").setStyle("-fx-stroke: rgba(" + rgbFormatter(Color.RED) + ", 1.0);");
            }
            if (!chartConfigMap.get(deviceNumber).get(5)) {
                lineCharts.get(chartNumber).getData().remove(chartDataMap.get(deviceNumber).get("vib3"));
            } else if (chartConfigMap.get(deviceNumber).get(5) && !lineCharts.get(chartNumber).getData().contains(chartDataMap.get(deviceNumber).get("vib3"))) {
                lineCharts.get(chartNumber).getData().add(chartDataMap.get(deviceNumber).get("vib3"));
                chartDataMap.get(deviceNumber).get("vib3").getNode().lookup(".chart-series-line").setStyle("-fx-stroke: rgba(" + rgbFormatter(Color.BLACK) + ", 1.0);");
            }
            if (!chartConfigMap.get(deviceNumber).get(0) && !chartConfigMap.get(deviceNumber).get(1) && !chartConfigMap.get(deviceNumber).get(2)) {
                lineCharts.get(chartNumber).getYAxis().setLabel(vibUnitMap.get(deviceNumber));
            }
            if (!chartConfigMap.get(deviceNumber).get(3) && !chartConfigMap.get(deviceNumber).get(4) && !chartConfigMap.get(deviceNumber).get(5)) {
                lineCharts.get(chartNumber).getYAxis().setLabel("Rpm");
            }
            if ((chartConfigMap.get(deviceNumber).get(0) || chartConfigMap.get(deviceNumber).get(1) || chartConfigMap.get(deviceNumber).get(2)) && (chartConfigMap.get(deviceNumber).get(3) || chartConfigMap.get(deviceNumber).get(4) || chartConfigMap.get(deviceNumber).get(5))) {
                lineCharts.get(chartNumber).getYAxis().setLabel("Rpm & " + vibUnitMap.get(deviceNumber));
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
        if (((ComboBox)(actionEvent.getSource())).getValue() == null) {
            Platform.runLater(() -> {
                graphSelectCheckboxMap.get(comboBoxIndex).get("rpm1").setSelected(false);
                graphSelectCheckboxMap.get(comboBoxIndex).get("rpm2").setSelected(false);
                graphSelectCheckboxMap.get(comboBoxIndex).get("rpm3").setSelected(false);
                graphSelectCheckboxMap.get(comboBoxIndex).get("vib1").setSelected(false);
                graphSelectCheckboxMap.get(comboBoxIndex).get("vib2").setSelected(false);
                graphSelectCheckboxMap.get(comboBoxIndex).get("vib3").setSelected(false);
            });
        }
    }
}
