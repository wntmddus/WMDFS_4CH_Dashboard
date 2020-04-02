package main.java.com.controllers;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

import javafx.event.ActionEvent;
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

    @FXML
    private Button selectGraphCloseBtn;

    @FXML
    private Button selectGraphSubmitBtn;

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
        for (int i = 0; i < 8; i++) {
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
                System.out.println("ChartAllo111111" + chartAllocation);
                modifyGraphWithGivenConfig(deviceNumber, chartNumber);
                chartAllocation.put(deviceNumber, chartNumber);
                System.out.println("ChartAllo222222" + chartAllocation);
            }
            if (deviceNumber == null) {
                for (Map.Entry<Integer, Integer> e : chartAllocation.entrySet()) {
                    if (e.getValue() == chartNumber) {
                        deviceNumber = e.getKey();
                        System.out.println("DeviceData" + deviceNumber);
                        chartAllocation.remove(deviceNumber);
                        System.out.println("ChartData" + chartAllocation);
                        break;
                    }
                }
            }
        }
        stage.close();
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
            graphLabels.get(chartNumber).setText("Dev#" + deviceNumber);
            if (!chartConfigMap.get(deviceNumber).get(0)) {
                lineCharts.get(chartNumber).getData().remove(chartDataMap.get(deviceNumber).get("rpm1"));
            } else if (chartConfigMap.get(deviceNumber).get(0) && !lineCharts.get(chartNumber).getData().contains(chartDataMap.get(deviceNumber).get("rpm1"))) {
                lineCharts.get(chartNumber).getData().add(chartDataMap.get(deviceNumber).get("rpm1"));
            }
            if (!chartConfigMap.get(deviceNumber).get(1)) {
                lineCharts.get(chartNumber).getData().remove(chartDataMap.get(deviceNumber).get("rpm2"));
            } else if (chartConfigMap.get(deviceNumber).get(1) && !lineCharts.get(chartNumber).getData().contains(chartDataMap.get(deviceNumber).get("rpm2"))) {
                lineCharts.get(chartNumber).getData().add(chartDataMap.get(deviceNumber).get("rpm2"));
            }
            if (!chartConfigMap.get(deviceNumber).get(2)) {
                lineCharts.get(chartNumber).getData().remove(chartDataMap.get(deviceNumber).get("rpm3"));
            } else if (chartConfigMap.get(deviceNumber).get(2) && !lineCharts.get(chartNumber).getData().contains(chartDataMap.get(deviceNumber).get("rpm3"))) {
                lineCharts.get(chartNumber).getData().add(chartDataMap.get(deviceNumber).get("rpm3"));
            }
            if (!chartConfigMap.get(deviceNumber).get(3)) {
                lineCharts.get(chartNumber).getData().remove(chartDataMap.get(deviceNumber).get("vib1"));
            } else if (chartConfigMap.get(deviceNumber).get(3) && !lineCharts.get(chartNumber).getData().contains(chartDataMap.get(deviceNumber).get("vib1"))) {
                lineCharts.get(chartNumber).getData().add(chartDataMap.get(deviceNumber).get("vib1"));
            }
            if (!chartConfigMap.get(deviceNumber).get(4)) {
                lineCharts.get(chartNumber).getData().remove(chartDataMap.get(deviceNumber).get("vib2"));
            } else if (chartConfigMap.get(deviceNumber).get(4) && !lineCharts.get(chartNumber).getData().contains(chartDataMap.get(deviceNumber).get("vib2"))) {
                lineCharts.get(chartNumber).getData().add(chartDataMap.get(deviceNumber).get("vib2"));
            }
            if (!chartConfigMap.get(deviceNumber).get(5)) {
                lineCharts.get(chartNumber).getData().remove(chartDataMap.get(deviceNumber).get("vib3"));
            } else if (chartConfigMap.get(deviceNumber).get(5) && !lineCharts.get(chartNumber).getData().contains(chartDataMap.get(deviceNumber).get("vib3"))) {
                lineCharts.get(chartNumber).getData().add(chartDataMap.get(deviceNumber).get("vib3"));
            }
            if (!chartConfigMap.get(deviceNumber).get(0) && !chartConfigMap.get(deviceNumber).get(1) && !chartConfigMap.get(deviceNumber).get(2)) {
                lineCharts.get(chartNumber).getYAxis().setLabel("mm");
            }
            if (chartConfigMap.get(deviceNumber).get(0) || chartConfigMap.get(deviceNumber).get(1) || chartConfigMap.get(deviceNumber).get(2)) {
                lineCharts.get(chartNumber).getYAxis().setLabel("Rpm");
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
        System.out.println(comboBoxId);
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
//        if (((ComboBox)(actionEvent.getSource())).getValue() != null) {
//            int selectedItem = (Integer) ((ComboBox)(actionEvent.getSource())).getValue();
//            for (int i = 0; i < 8; i++) {
//                if (i != comboBoxIndex && selectedItem == deviceNumPickerMap.get(i).getSelectionModel().getSelectedItem()) {
//                    Platform.runLater(() -> {
//                        comboBox.getSelectionModel().select(null);
//                    });
//                    break;
//                }
//            }
//        }
    }
}
