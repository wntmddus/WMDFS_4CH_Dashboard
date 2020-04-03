package main.java.com.controllers;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.chart.*;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;
import main.java.com.util.SharedStorage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

public class DashboardController extends SharedStorage implements Initializable {

    @FXML
    Button closeBtn;

    @FXML
    Button devConfigBtn;

    @FXML
    public Label deviceName0;

    @FXML
    public Label deviceName1;

    @FXML
    public Label deviceName2;

    @FXML
    public Label deviceName3;

    @FXML
    public Label deviceName4;

    @FXML
    public Label deviceName5;

    @FXML
    public Label deviceName6;

    @FXML
    public Label deviceName7;

    @FXML
    public Label deviceName8;

    @FXML
    public Label deviceName9;

    @FXML
    public Label deviceName10;

    @FXML
    public Label deviceName11;

    @FXML
    public Label deviceName12;

    @FXML
    public Label deviceName13;

    @FXML
    public Label deviceName14;

    @FXML
    public Label deviceName15;

    @FXML
    public Label deviceName16;

    @FXML
    public Label deviceName17;

    @FXML
    public Label deviceName18;

    @FXML
    public Label deviceName19;

    @FXML
    public CheckBox recCheckbox0;

    @FXML
    public CheckBox recCheckbox1;

    @FXML
    public CheckBox recCheckbox2;

    @FXML
    public CheckBox recCheckbox3;

    @FXML
    public CheckBox recCheckbox4;

    @FXML
    public CheckBox recCheckbox5;

    @FXML
    public CheckBox recCheckbox6;

    @FXML
    public CheckBox recCheckbox7;

    @FXML
    public CheckBox recCheckbox8;

    @FXML
    public CheckBox recCheckbox9;

    @FXML
    public CheckBox recCheckbox10;

    @FXML
    public CheckBox recCheckbox11;

    @FXML
    public CheckBox recCheckbox12;

    @FXML
    public CheckBox recCheckbox13;

    @FXML
    public CheckBox recCheckbox14;

    @FXML
    public CheckBox recCheckbox15;

    @FXML
    public CheckBox recCheckbox16;

    @FXML
    public CheckBox recCheckbox17;

    @FXML
    public CheckBox recCheckbox18;

    @FXML
    public CheckBox recCheckbox19;

    @FXML
    public LineChart<String, Number> graph0;

    @FXML
    public LineChart<String, Number> graph1;

    @FXML
    public LineChart<String, Number> graph2;

    @FXML
    public LineChart<String, Number> graph3;

    @FXML
    public LineChart<String, Number> graph4;

    @FXML
    public LineChart<String, Number> graph5;

    @FXML
    public LineChart<String, Number> graph6;

    @FXML
    public LineChart<String, Number> graph7;

    @FXML
    public Label ch1VibValue0;

    @FXML
    public Label ch2VibValue0;

    @FXML
    public Label ch3VibValue0;

    @FXML
    public Label ch1RpmValue0;

    @FXML
    public Label ch2RpmValue0;

    @FXML
    public Label ch3RpmValue0;

    @FXML
    public Label ch1VibValue1;

    @FXML
    public Label ch2VibValue1;

    @FXML
    public Label ch3VibValue1;

    @FXML
    public Label ch1RpmValue1;

    @FXML
    public Label ch2RpmValue1;

    @FXML
    public Label ch3RpmValue1;

    @FXML
    public Label ch1VibValue2;

    @FXML
    public Label ch2VibValue2;

    @FXML
    public Label ch3VibValue2;

    @FXML
    public Label ch1RpmValue2;

    @FXML
    public Label ch2RpmValue2;

    @FXML
    public Label ch3RpmValue2;

    @FXML
    public Label ch1VibValue3;

    @FXML
    public Label ch2VibValue3;

    @FXML
    public Label ch3VibValue3;

    @FXML
    public Label ch1RpmValue3;

    @FXML
    public Label ch2RpmValue3;

    @FXML
    public Label ch3RpmValue3;

    @FXML
    public Label ch1VibValue4;

    @FXML
    public Label ch2VibValue4;

    @FXML
    public Label ch3VibValue4;

    @FXML
    public Label ch1RpmValue4;

    @FXML
    public Label ch2RpmValue4;

    @FXML
    public Label ch3RpmValue4;

    @FXML
    public Label ch1VibValue5;

    @FXML
    public Label ch2VibValue5;

    @FXML
    public Label ch3VibValue5;

    @FXML
    public Label ch1RpmValue5;

    @FXML
    public Label ch2RpmValue5;

    @FXML
    public Label ch3RpmValue5;

    @FXML
    public Label ch1VibValue6;

    @FXML
    public Label ch2VibValue6;

    @FXML
    public Label ch3VibValue6;

    @FXML
    public Label ch1RpmValue6;

    @FXML
    public Label ch2RpmValue6;

    @FXML
    public Label ch3RpmValue6;

    @FXML
    public Label ch1VibValue7;

    @FXML
    public Label ch2VibValue7;

    @FXML
    public Label ch3VibValue7;

    @FXML
    public Label ch1RpmValue7;

    @FXML
    public Label ch2RpmValue7;

    @FXML
    public Label ch3RpmValue7;

    @FXML
    public Pane graphPane0;

    @FXML
    public Label graph0Label0;

    @FXML
    public Label graph0Label1;

    @FXML
    public Label graph0Label2;

    @FXML
    public Label graph1Label0;

    @FXML
    public Label graph1Label1;

    @FXML
    public Label graph1Label2;

    @FXML
    public Label graph2Label0;

    @FXML
    public Label graph2Label1;

    @FXML
    public Label graph2Label2;

    @FXML
    public Label graph3Label0;

    @FXML
    public Label graph3Label1;

    @FXML
    public Label graph3Label2;

    @FXML
    public Label graph4Label0;

    @FXML
    public Label graph4Label1;

    @FXML
    public Label graph4Label2;

    @FXML
    public Label graph5Label0;

    @FXML
    public Label graph5Label1;

    @FXML
    public Label graph5Label2;

    @FXML
    public Label graph6Label0;

    @FXML
    public Label graph6Label1;

    @FXML
    public Label graph6Label2;

    @FXML
    public Label graph7Label0;

    @FXML
    public Label graph7Label1;

    @FXML
    public Label graph7Label2;

    @FXML
    public Rectangle rectangle0;

    @FXML
    public Rectangle rectangle1;

    @FXML
    public Rectangle rectangle2;

    @FXML
    public Rectangle rectangle3;

    @FXML
    public Rectangle rectangle4;

    @FXML
    public Rectangle rectangle5;

    @FXML
    public Rectangle rectangle6;

    @FXML
    public Rectangle rectangle7;

    @FXML
    public Label graphLabel0;

    @FXML
    public Label graphLabel1;

    @FXML
    public Label graphLabel2;

    @FXML
    public Label graphLabel3;

    @FXML
    public Label graphLabel4;

    @FXML
    public Label graphLabel5;

    @FXML
    public Label graphLabel6;

    @FXML
    public Label graphLabel7;

    @FXML
    public Line line0;

    @FXML
    public Line line1;

    @FXML
    public Line line2;

    @FXML
    public Line line3;

    @FXML
    public Line line4;

    @FXML
    public Line line5;

    @FXML
    public Line line6;

    @FXML
    public Line line7;

    @FXML
    public Button save;

    @FXML
    public Button reset;

    @FXML
    public Label addLabel0;

    @FXML
    public Label addLabel1;

    @FXML
    public Label addLabel2;

    @FXML
    public Label addLabel3;

    @FXML
    public Label addLabel4;

    @FXML
    public Label addLabel5;

    @FXML
    public Label addLabel6;

    @FXML
    public Label addLabel7;

    @FXML
    public Label addLabel8;

    @FXML
    public Label addLabel9;

    @FXML
    public Label addLabel10;

    @FXML
    public Label addLabel11;

    @FXML
    public Label addLabel12;

    @FXML
    public Label addLabel13;

    @FXML
    public Label addLabel14;

    @FXML
    public Label addLabel15;

    @FXML
    public Label addLabel16;

    @FXML
    public Label addLabel17;

    @FXML
    public Label addLabel18;

    @FXML
    public Label addLabel19;

    private double rectangleStart;

    private int startIndexOnGraph;

    final private double CHART_Y_START_COORDINATE = 15;

    final private double CHART_Y_END_COORDINATE = 120;

    final private double CHART_X_START_COORDINATE = 65;

    final private double CHART_X_END_COORDINATE = 460;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        deviceNames.add(deviceName0);
        deviceNames.add(deviceName1);
        deviceNames.add(deviceName2);
        deviceNames.add(deviceName3);
        deviceNames.add(deviceName4);
        deviceNames.add(deviceName5);
        deviceNames.add(deviceName6);
        deviceNames.add(deviceName7);
        deviceNames.add(deviceName8);
        deviceNames.add(deviceName9);
        deviceNames.add(deviceName10);
        deviceNames.add(deviceName11);
        deviceNames.add(deviceName12);
        deviceNames.add(deviceName13);
        deviceNames.add(deviceName14);
        deviceNames.add(deviceName15);
        deviceNames.add(deviceName16);
        deviceNames.add(deviceName17);
        deviceNames.add(deviceName18);
        deviceNames.add(deviceName19);
        recCheckboxArray.add(recCheckbox0);
        recCheckboxArray.add(recCheckbox1);
        recCheckboxArray.add(recCheckbox2);
        recCheckboxArray.add(recCheckbox3);
        recCheckboxArray.add(recCheckbox4);
        recCheckboxArray.add(recCheckbox5);
        recCheckboxArray.add(recCheckbox6);
        recCheckboxArray.add(recCheckbox7);
        recCheckboxArray.add(recCheckbox8);
        recCheckboxArray.add(recCheckbox9);
        recCheckboxArray.add(recCheckbox10);
        recCheckboxArray.add(recCheckbox11);
        recCheckboxArray.add(recCheckbox12);
        recCheckboxArray.add(recCheckbox13);
        recCheckboxArray.add(recCheckbox14);
        recCheckboxArray.add(recCheckbox15);
        recCheckboxArray.add(recCheckbox16);
        recCheckboxArray.add(recCheckbox17);
        recCheckboxArray.add(recCheckbox18);
        recCheckboxArray.add(recCheckbox19);
        lineCharts.put(0, graph0);
        lineCharts.put(1, graph1);
        lineCharts.put(2, graph2);
        lineCharts.put(3, graph3);
        lineCharts.put(4, graph4);
        lineCharts.put(5, graph5);
        lineCharts.put(6, graph6);
        lineCharts.put(7, graph7);
        realTimeData.get(0).add(ch1VibValue0);
        realTimeData.get(0).add(ch2VibValue0);
        realTimeData.get(0).add(ch3VibValue0);
        realTimeData.get(0).add(ch1RpmValue0);
        realTimeData.get(0).add(ch2RpmValue0);
        realTimeData.get(0).add(ch3RpmValue0);
        realTimeData.get(1).add(ch1VibValue1);
        realTimeData.get(1).add(ch2VibValue1);
        realTimeData.get(1).add(ch3VibValue1);
        realTimeData.get(1).add(ch1RpmValue1);
        realTimeData.get(1).add(ch2RpmValue1);
        realTimeData.get(1).add(ch3RpmValue1);
        realTimeData.get(2).add(ch1VibValue2);
        realTimeData.get(2).add(ch2VibValue2);
        realTimeData.get(2).add(ch3VibValue2);
        realTimeData.get(2).add(ch1RpmValue2);
        realTimeData.get(2).add(ch2RpmValue2);
        realTimeData.get(2).add(ch3RpmValue2);
        realTimeData.get(3).add(ch1VibValue3);
        realTimeData.get(3).add(ch2VibValue3);
        realTimeData.get(3).add(ch3VibValue3);
        realTimeData.get(3).add(ch1RpmValue3);
        realTimeData.get(3).add(ch2RpmValue3);
        realTimeData.get(3).add(ch3RpmValue3);
        realTimeData.get(4).add(ch1VibValue4);
        realTimeData.get(4).add(ch2VibValue4);
        realTimeData.get(4).add(ch3VibValue4);
        realTimeData.get(4).add(ch1RpmValue4);
        realTimeData.get(4).add(ch2RpmValue4);
        realTimeData.get(4).add(ch3RpmValue4);
        realTimeData.get(5).add(ch1VibValue5);
        realTimeData.get(5).add(ch2VibValue5);
        realTimeData.get(5).add(ch3VibValue5);
        realTimeData.get(5).add(ch1RpmValue5);
        realTimeData.get(5).add(ch2RpmValue5);
        realTimeData.get(5).add(ch3RpmValue5);
        realTimeData.get(6).add(ch1VibValue6);
        realTimeData.get(6).add(ch2VibValue6);
        realTimeData.get(6).add(ch3VibValue6);
        realTimeData.get(6).add(ch1RpmValue6);
        realTimeData.get(6).add(ch2RpmValue6);
        realTimeData.get(6).add(ch3RpmValue6);
        realTimeData.get(7).add(ch1VibValue7);
        realTimeData.get(7).add(ch2VibValue7);
        realTimeData.get(7).add(ch3VibValue7);
        realTimeData.get(7).add(ch1RpmValue7);
        realTimeData.get(7).add(ch2RpmValue7);
        realTimeData.get(7).add(ch3RpmValue7);
        chartRectangleMap.add(rectangle0);
        chartRectangleMap.add(rectangle1);
        chartRectangleMap.add(rectangle2);
        chartRectangleMap.add(rectangle3);
        chartRectangleMap.add(rectangle4);
        chartRectangleMap.add(rectangle5);
        chartRectangleMap.add(rectangle6);
        chartRectangleMap.add(rectangle7);
        Platform.runLater(() -> {
            for (int i = 0; i < 8; i++) {
                lineCharts.get(i).setCreateSymbols(false);
                lineCharts.get(i).setCreateSymbols(false);
                lineCharts.get(i).getStyleClass().add("thick-chart");
                lineCharts.get(i).setAnimated(false);
                lineCharts.get(i).getXAxis().setAnimated(false);
                lineCharts.get(i).getXAxis().setTickLabelsVisible(false);
                lineCharts.get(i).getYAxis().setAnimated(false);
                lineCharts.get(i).getXAxis().setTickLabelFont(Font.font(9));
                lineCharts.get(i).getXAxis().setTickMarkVisible(false);
                lineCharts.get(i).getYAxis().setLabel("RPM");
            }
        });
        chartLabelMap.get(0).put(0, graph0Label0);
        chartLabelMap.get(0).put(1, graph0Label1);
        chartLabelMap.get(0).put(2, graph0Label2);
        chartLabelMap.get(1).put(0, graph1Label0);
        chartLabelMap.get(1).put(1, graph1Label1);
        chartLabelMap.get(1).put(2, graph1Label2);
        chartLabelMap.get(2).put(0, graph2Label0);
        chartLabelMap.get(2).put(1, graph2Label1);
        chartLabelMap.get(2).put(2, graph2Label2);
        chartLabelMap.get(3).put(0, graph3Label0);
        chartLabelMap.get(3).put(1, graph3Label1);
        chartLabelMap.get(3).put(2, graph3Label2);
        chartLabelMap.get(4).put(0, graph4Label0);
        chartLabelMap.get(4).put(1, graph4Label1);
        chartLabelMap.get(4).put(2, graph4Label2);
        chartLabelMap.get(5).put(0, graph5Label0);
        chartLabelMap.get(5).put(1, graph5Label1);
        chartLabelMap.get(5).put(2, graph5Label2);
        chartLabelMap.get(6).put(0, graph6Label0);
        chartLabelMap.get(6).put(1, graph6Label1);
        chartLabelMap.get(6).put(2, graph6Label2);
        chartLabelMap.get(7).put(0, graph7Label0);
        chartLabelMap.get(7).put(1, graph7Label1);
        chartLabelMap.get(7).put(2, graph7Label2);
        graphLabels.put(0, graphLabel0);
        graphLabels.put(1, graphLabel1);
        graphLabels.put(2, graphLabel2);
        graphLabels.put(3, graphLabel3);
        graphLabels.put(4, graphLabel4);
        graphLabels.put(5, graphLabel5);
        graphLabels.put(6, graphLabel6);
        graphLabels.put(7, graphLabel7);
        lineMap.put(0, line0);
        lineMap.put(1, line1);
        lineMap.put(2, line2);
        lineMap.put(3, line3);
        lineMap.put(4, line4);
        lineMap.put(5, line5);
        lineMap.put(6, line6);
        lineMap.put(7, line7);
        addressLabels.put(0, addLabel0);
        addressLabels.put(1, addLabel1);
        addressLabels.put(2, addLabel2);
        addressLabels.put(3, addLabel3);
        addressLabels.put(4, addLabel4);
        addressLabels.put(5, addLabel5);
        addressLabels.put(6, addLabel6);
        addressLabels.put(7, addLabel7);
        addressLabels.put(8, addLabel8);
        addressLabels.put(9, addLabel9);
        addressLabels.put(10, addLabel10);
        addressLabels.put(11, addLabel11);
        addressLabels.put(12, addLabel12);
        addressLabels.put(13, addLabel13);
        addressLabels.put(14, addLabel14);
        addressLabels.put(15, addLabel15);
        addressLabels.put(16, addLabel16);
        addressLabels.put(17, addLabel17);
        addressLabels.put(18, addLabel18);
        addressLabels.put(19, addLabel19);
        for(int i = 0; i < MAX_DEVICE_NUMBER; i++) {
            if (!pref.get("address" + i, "root").equals("root") && !pref.get("port" + i, "root").equals("root")) {
                addresses.put(i, pref.get("address" + i, "root"));
                ports.put(i, pref.get("port" + i, "root"));
            }
        }
    }

    public void setStage(Stage stage) {
        mainStage = stage;
    }

    @FXML
    private void handleOnMouseHover(MouseEvent event) {
        LineChart chart = ((LineChart) (event.getSource()));
        String chartId = chart.getId();
        int chartIndex = Character.getNumericValue(chartId.charAt(chartId.length() - 1));
        int dataIndex = -1;
        for(Map.Entry<Integer, Integer> entry: chartAllocation.entrySet()){
            if (chartIndex == entry.getValue()){
                dataIndex = entry.getKey();
            }
        }
        if (dataIndex == -1) {
            return;
        }
        if (event.getX() > CHART_X_START_COORDINATE && event.getX() < CHART_X_END_COORDINATE && event.getY() > CHART_Y_START_COORDINATE && event.getY() < CHART_Y_END_COORDINATE && chartAllocation.containsKey(dataIndex) && !chartRectangleMap.get(chartIndex).isVisible()) {
            int index = (int) Math.floor((deviceData.get(dataIndex).size() - 1) * ((event.getX() - CHART_X_START_COORDINATE) / (CHART_X_END_COORDINATE - CHART_X_START_COORDINATE)));
            List<String> lineData = deviceData.get(dataIndex).get(index);
            Label ch1Label = chartLabelMap.get(chartIndex).get(0);
            Label ch2Label = chartLabelMap.get(chartIndex).get(1);
            Label ch3Label = chartLabelMap.get(chartIndex).get(2);
            Platform.runLater(() -> {
                createLine(chartIndex, (int)event.getX(), 47, (int)event.getX(), 187);
                ch1Label.setText("CH1 [" + lineData.get(0) + "] : " + lineData.get(1) + " Rpm : " + lineData.get(2) + " mm");
                ch2Label.setText("CH2 [" + lineData.get(0) + "] : " + lineData.get(3) + " Rpm : " + lineData.get(4) + " mm");
                ch3Label.setText("CH3 [" + lineData.get(0) + "] : " + lineData.get(5) + " Rpm : " + lineData.get(6) + " mm");
            });
        } else {
            lineMap.get(chartIndex).setVisible(false);
        }
    }

    @FXML
    private void handleOnSave() throws IOException {
        for (Map.Entry<Integer, String> entry : addresses.entrySet()) {
            pref.put("address" + entry.getKey(), entry.getValue());
            pref.put("port" + entry.getKey(), ports.get(entry.getKey()));
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

    private void createLine(int index, int startX, int startY, int endX, int endY) {
        lineMap.get(index).setStartX(startX);
        lineMap.get(index).setStartY(startY);
        lineMap.get(index).setEndX(endX);
        lineMap.get(index).setEndY(endY);
        lineMap.get(index).setFill(Color.LIGHTGREY);
        lineMap.get(index).setOpacity(0.5);
        lineMap.get(index).setVisible(true);
    }

    @FXML
    private void handleOnMouseDragEntered(MouseEvent event) {

    }

    @FXML
    private void handleOnMouseDragged(MouseEvent event) {
        LineChart chart = ((LineChart) (event.getSource()));
        String chartId = chart.getId();
        int chartIndex = Character.getNumericValue(chartId.charAt(chartId.length() - 1));
        int dataIndex = -1;
        for(Map.Entry<Integer, Integer> entry: chartAllocation.entrySet()){
            if (chartIndex == entry.getValue()){
                dataIndex = entry.getKey();
            }
        }
        if (dataIndex == -1) {
            return;
        }
        int deviceDataLength = deviceData.get(dataIndex).size();
        List<List<String>> currentDeviceData = deviceData.get(dataIndex);
        int currentIndex = (int) Math.floor(deviceDataLength * ((event.getX() - CHART_X_START_COORDINATE) / (CHART_X_END_COORDINATE - CHART_X_START_COORDINATE)));
        Label ch1Label = chartLabelMap.get(chartIndex).get(0);
        Label ch2Label = chartLabelMap.get(chartIndex).get(1);
        Label ch3Label = chartLabelMap.get(chartIndex).get(2);
        double maxRpm1 = 0;
        double maxRpm2 = 0;
        double maxRpm3 = 0;
        double maxVib1 = 0;
        double maxVib2 = 0;
        double maxVib3 = 0;
        // Y start 15 end 120
        if (event.isSecondaryButtonDown()) {
            return;
        }
        if (event.getX() > CHART_X_START_COORDINATE && event.getX() < CHART_X_END_COORDINATE && event.getY() > CHART_Y_START_COORDINATE && event.getY() < CHART_Y_END_COORDINATE && chartAllocation.containsKey(dataIndex)) {
            double x = Math.min(event.getX(), rectangleStart);
            double y = 47;
            double width = Math.abs(event.getX() - rectangleStart);
            double height = Math.abs(140);
            int start = Math.min(startIndexOnGraph, currentIndex);
            int end = Math.max(startIndexOnGraph, currentIndex);
            for (int i = start; i < end; i++) {
                maxRpm1 = Math.max(Double.parseDouble(currentDeviceData.get(i).get(1)), maxRpm1);
                maxRpm2 = Math.max(Double.parseDouble(currentDeviceData.get(i).get(3)), maxRpm2);
                maxRpm3 = Math.max(Double.parseDouble(currentDeviceData.get(i).get(5)), maxRpm3);
                maxVib1 = Math.max(Double.parseDouble(currentDeviceData.get(i).get(2)), maxVib1);
                maxVib2 = Math.max(Double.parseDouble(currentDeviceData.get(i).get(4)), maxVib2);
                maxVib3 = Math.max(Double.parseDouble(currentDeviceData.get(i).get(6)), maxVib3);
            }
            double finalMaxRpm = maxRpm1;
            double finalMaxRpm1 = maxRpm2;
            double finalMaxRpm2 = maxRpm3;
            double finalMaxVib = maxVib1;
            double finalMaxVib1 = maxVib2;
            double finalMaxVib2 = maxVib3;
            Platform.runLater(() -> {
                createRectangle(chartRectangleMap.get(chartIndex), x, y, width, height);
                ch1Label.setText("CH1 [" + currentDeviceData.get(start).get(0) + "-" + currentDeviceData.get(end).get(0) + "] : " + "Max RPM: " + finalMaxRpm + ", Max Vib: " + finalMaxVib + " mm");
                ch2Label.setText("CH2 [" + currentDeviceData.get(start).get(0) + "-" + currentDeviceData.get(end).get(0) + "] : " + "Max RPM: " + finalMaxRpm1 + ", Max Vib: " + finalMaxVib1 + " mm");
                ch3Label.setText("CH3 [" + currentDeviceData.get(start).get(0) + "-" + currentDeviceData.get(end).get(0) + "] : " + "Max RPM: " + finalMaxRpm2 + ", Max Vib: " + finalMaxVib2 + " mm");
            });
        }

    }

    private void createRectangle(Rectangle rect, double x, double y, double width, double height) {
        rect.setVisible(true);
        rect.setX(x);
        rect.setY(y);
        rect.setWidth(width);
        rect.setHeight(height);
        rect.setFill(Color.LIGHTGREY);
        rect.setOpacity(0.5);
    }


    @FXML
    private void handleOnMousePressed(MouseEvent event) {
        LineChart chart = ((LineChart)(event.getSource()));
        String chartId = chart.getId();
        int chartIndex = Character.getNumericValue(chartId.charAt(chartId.length() - 1));
        int dataIndex = -1;
        for(Map.Entry<Integer, Integer> entry: chartAllocation.entrySet()){
            if (chartIndex == entry.getValue()){
                dataIndex = entry.getKey();
            }
        }
        if (dataIndex == -1) {
            return;
        }
        startIndexOnGraph = (int) Math.floor(deviceData.get(dataIndex).size() * ((event.getX() - CHART_X_START_COORDINATE) / (CHART_X_END_COORDINATE - CHART_X_START_COORDINATE)));
        if (event.isSecondaryButtonDown()) {
            return;
        }
        if (chartRectangleMap.get(chartIndex).isVisible()) {
            chartRectangleMap.get(chartIndex).setVisible(false);
            return;
        }
        rectangleStart = event.getX();
        lineMap.get(chartIndex).setVisible(false);
    }
    @FXML
    private void handleOnMouseReleased(MouseEvent event) {
    }


    @FXML
    void closeAction(ActionEvent event) {
        mainStage.close();
    }

    @FXML
    public void handleOnClickDevConfigBtn(ActionEvent event) throws IOException {
        FXMLLoader createConnectionLoader = new FXMLLoader(getClass().getResource("/main/resources/fxml/createconnection.fxml"));
        VBox vbox = createConnectionLoader.load();
        CreateConnectionController createConnectionController = createConnectionLoader.getController();
        Stage stage = new Stage();
        stage.initOwner(mainStage);
        Scene scene = new Scene(vbox);
        stage.initModality(Modality.WINDOW_MODAL);
        stage.setTitle("Create Connection");
        stage.setScene(scene);
        createConnectionController.setStage(stage);
        stage.show();
    }


    @FXML
    public void handleOnClickGraphBtn(ActionEvent event) throws IOException {
        FXMLLoader selectGraphLoader = new FXMLLoader(getClass().getResource("/main/resources/fxml/selectgraph.fxml"));
        VBox vbox = selectGraphLoader.load();
        SelectGraphController selectGraphController = selectGraphLoader.getController();
        Stage stage = new Stage();
        stage.initOwner(mainStage);
        Scene scene = new Scene(vbox);
        stage.initModality(Modality.WINDOW_MODAL);
        stage.setTitle("Select Graph");
        stage.setScene(scene);
        selectGraphController.setStage(stage);
        stage.show();
    }

    @FXML
    public void handleOnClickRecordAllBtn(ActionEvent event) {
        Platform.runLater(() -> {
            for (int i = 0; i < MAX_DEVICE_NUMBER; i++) {
                if (addresses.containsKey(i)) {
                    recCheckboxArray.get(i).setSelected(!recCheckboxArray.get(i).isSelected());
                    if (recCheckboxArray.get(i).isSelected()) {
                        try {
                            createNewFileWriter(i, getCurrentDateTime("yyyy-MM-dd-HH.mm.ss"));
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        recCheckboxArray.get(i).setText("Recording");
                        recCheckboxArray.get(i).setTextFill(Color.RED);
                    } else {
                        recCheckboxArray.get(i).setText("Not Recording");
                        recCheckboxArray.get(i).setTextFill(Color.BLACK);
                    }
                }
            }
        });
    }
    public String getCurrentDateTime(String pattern) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }


    public void createNewFileWriter(int index, String currentDate) throws IOException {
        dateTimeOnFileNameMap.put(index, getCurrentDateTime("yyyy/MM/dd"));
        String path = "../SavedData/" + deviceNames.get(index).getText() + "-" + addresses.get(index) + "-" + ports.get(index) + "/" + deviceNames.get(index).getText() + "-" + currentDate + ".txt";
        File file = new File(path);
        file.getParentFile().mkdirs();
        fileWriters.put(index, new FileWriter(file));
        fileWriters.get(index).write("Date: " + getCurrentDateTime("yyyy/MM/dd") + "\n");
        fileWriters.get(index).write("Time: " + getCurrentDateTime("HH:mm:ss") + "\n");
        fileWriters.get(index).write("\n");
        fileWriters.get(index).write("Vibration:  Disp.Peak  (mm)\n");
        fileWriters.get(index).write("\n");
        fileWriters.get(index).write("dd:hh:mm:ss     RPM#1     Vib#1     RPM#2     Vib#2     RPM#3     Vib#3\n");
        fileWriters.get(index).flush();
    }

    @FXML
    public void handleOnClickRecordBtn(ActionEvent event) {
        String currentDate = getCurrentDateTime("yyyy-MM-dd-HH.mm.ss");
        CheckBox checkBox = ((CheckBox)(event.getSource()));
        String checkBoxId = checkBox.getId();
        int index;
        if (checkBoxId.length() == 12) {
            index = Character.getNumericValue(checkBoxId.charAt(checkBoxId.length() - 1));
        } else {
            index = Integer.parseInt(checkBoxId.substring(checkBoxId.length() - 2));
        }

        Platform.runLater(() -> {
            if (!clientConn.containsKey(index)) {
                checkBox.setSelected(false);
                return;
            }
            if (((CheckBox)(event.getSource())).isSelected()) {
                try {
                    createNewFileWriter(index, currentDate);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                ((CheckBox)(event.getSource())).setText("Recording");
                ((CheckBox)(event.getSource())).setTextFill(Color.RED);
            } else {
                ((CheckBox)(event.getSource())).setText("Not Recording");
                ((CheckBox)(event.getSource())).setTextFill(Color.BLACK);
            }
        });
    }

}
