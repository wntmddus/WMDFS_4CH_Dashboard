package main.java.com.controllers;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.chart.*;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.*;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;
import main.java.com.util.SharedStorage;

import java.io.*;
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
    Button connectionMacBtn;

    @FXML
    Menu logMenu;

    @FXML
    MenuItem logMenuSub;

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

    @FXML
    public Rectangle box0;

    @FXML
    public Rectangle box1;

    @FXML
    public Rectangle box2;

    @FXML
    public Rectangle box3;

    @FXML
    public Rectangle box4;

    @FXML
    public Rectangle box5;

    @FXML
    public Rectangle box6;

    @FXML
    public Rectangle box7;

    @FXML
    public Rectangle box8;

    @FXML
    public Rectangle box9;

    @FXML
    public Rectangle box10;

    @FXML
    public Rectangle box11;

    @FXML
    public Rectangle box12;

    @FXML
    public Rectangle box13;

    @FXML
    public Rectangle box14;

    @FXML
    public Rectangle box15;

    @FXML
    public Rectangle box16;

    @FXML
    public Rectangle box17;

    @FXML
    public Rectangle box18;

    @FXML
    public Rectangle box19;

    @FXML
    public Label vibUnit0;

    @FXML
    public Label vibUnit1;

    @FXML
    public Label vibUnit2;

    @FXML
    public Label vibUnit3;

    @FXML
    public Label vibUnit4;

    @FXML
    public Label vibUnit5;

    @FXML
    public Label vibUnit6;

    @FXML
    public Label vibUnit7;

    @FXML
    public Button graphBtn;

    @FXML
    public ImageView recordDot;

    @FXML
    public Button recordAllBtn;

    @FXML
    public Label graphPanelLabel0;

    @FXML
    public Label graphPanelLabel1;

    @FXML
    public Label graphPanelLabel2;

    @FXML
    public Label graphPanelLabel3;

    @FXML
    public Label graphPanelLabel4;

    @FXML
    public Label graphPanelLabel5;

    @FXML
    public Label graphPanelLabel6;

    @FXML
    public Label graphPanelLabel7;

    @FXML
    public LineChart<String, Number> graphRight0;

    @FXML
    public LineChart<String, Number> graphRight1;

    @FXML
    public LineChart<String, Number> graphRight2;

    @FXML
    public LineChart<String, Number> graphRight3;

    @FXML
    public LineChart<String, Number> graphRight4;

    @FXML
    public LineChart<String, Number> graphRight5;

    @FXML
    public LineChart<String, Number> graphRight6;

    @FXML
    public LineChart<String, Number> graphRight7;

    private double rectangleStart;

    private int startIndexOnGraph;

    final private double CHART_Y_START_COORDINATE = 15;

    final private double CHART_Y_END_COORDINATE = 186;

    final private double CHART_X_START_COORDINATE = 54;

    final private double CHART_X_END_COORDINATE = 428;
    void dataSendingToggle(Boolean flag) {
        if (flag) {
            isSendingData = true;
            connectionMacBtn.setDisable(false);
            logMenu.setDisable(false);
            logMenuSub.setDisable(false);
        } else {
            isSendingData = false;
            connectionMacBtn.setDisable(true);
            logMenu.setDisable(true);
            logMenuSub.setDisable(true);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        dataSendingToggle(false);
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
        lineRightCharts.put(0, graphRight0);
        lineRightCharts.put(1, graphRight1);
        lineRightCharts.put(2, graphRight2);
        lineRightCharts.put(3, graphRight3);
        lineRightCharts.put(4, graphRight4);
        lineRightCharts.put(5, graphRight5);
        lineRightCharts.put(6, graphRight6);
        lineRightCharts.put(7, graphRight7);
        Platform.runLater(() -> {
            for (int i = 0; i < MAX_GRAPH_NUMBER; i++) {
                lineCharts.get(i).setCreateSymbols(false);
                lineCharts.get(i).getStyleClass().add("thick-chart");
                lineCharts.get(i).setAnimated(false);
                lineCharts.get(i).getXAxis().setAnimated(false);
                lineCharts.get(i).getXAxis().setTickLabelsVisible(false);
                lineCharts.get(i).getYAxis().setAnimated(false);
                lineCharts.get(i).setVerticalGridLinesVisible(false);
                lineCharts.get(i).setHorizontalGridLinesVisible(false);
                lineCharts.get(i).setAlternativeRowFillVisible(false);
                lineCharts.get(i).getXAxis().setOpacity(0.0);
                lineCharts.get(i).getYAxis().setOpacity(1.0);
                lineCharts.get(i).getYAxis().setTickLabelFont(Font.font(9));
                lineCharts.get(i).getYAxis().setTickLength(2);
                lineCharts.get(i).getXAxis().setTickMarkVisible(false);
                lineCharts.get(i).setBackground(Background.EMPTY);
                lineCharts.get(i).setLegendVisible(false);
                lineRightCharts.get(i).setCreateSymbols(false);
                lineRightCharts.get(i).getStyleClass().add("thick-chart");
                lineRightCharts.get(i).setAnimated(false);
                lineRightCharts.get(i).getXAxis().setAnimated(false);
                lineRightCharts.get(i).setVerticalGridLinesVisible(false);
                lineRightCharts.get(i).setHorizontalGridLinesVisible(false);
                lineRightCharts.get(i).setAlternativeRowFillVisible(false);
                lineRightCharts.get(i).getXAxis().setOpacity(0.0);
                lineRightCharts.get(i).getXAxis().setTickLabelsVisible(false);
                lineRightCharts.get(i).getYAxis().setAnimated(false);
                lineRightCharts.get(i).getYAxis().setTickLabelFont(Font.font(9));
                lineRightCharts.get(i).getYAxis().setTickLength(2);
                lineRightCharts.get(i).getXAxis().setTickMarkVisible(false);
                lineRightCharts.get(i).setLegendVisible(false);
                lineRightCharts.get(i).setBackground(Background.EMPTY);
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
//        chartLabelMap.get(7).get(2).setText(System.getProperty("java.home"));
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
        boxes.put(0, box0);
        boxes.put(1, box1);
        boxes.put(2, box2);
        boxes.put(3, box3);
        boxes.put(4, box4);
        boxes.put(5, box5);
        boxes.put(6, box6);
        boxes.put(7, box7);
        boxes.put(8, box8);
        boxes.put(9, box9);
        boxes.put(10, box10);
        boxes.put(11, box11);
        boxes.put(12, box12);
        boxes.put(13, box13);
        boxes.put(14, box14);
        boxes.put(15, box15);
        boxes.put(16, box16);
        boxes.put(17, box17);
        boxes.put(18, box18);
        boxes.put(19, box19);
        vibUnitLabelMap.put(0, vibUnit0);
        vibUnitLabelMap.put(1, vibUnit1);
        vibUnitLabelMap.put(2, vibUnit2);
        vibUnitLabelMap.put(3, vibUnit3);
        vibUnitLabelMap.put(4, vibUnit4);
        vibUnitLabelMap.put(5, vibUnit5);
        vibUnitLabelMap.put(6, vibUnit6);
        vibUnitLabelMap.put(7, vibUnit7);
        graphPanelLabels.put(0, graphPanelLabel0);
        graphPanelLabels.put(1, graphPanelLabel1);
        graphPanelLabels.put(2, graphPanelLabel2);
        graphPanelLabels.put(3, graphPanelLabel3);
        graphPanelLabels.put(4, graphPanelLabel4);
        graphPanelLabels.put(5, graphPanelLabel5);
        graphPanelLabels.put(6, graphPanelLabel6);
        graphPanelLabels.put(7, graphPanelLabel7);
        recordAllBtnGlobal = recordAllBtn;
    }

    public void setStage(Stage stage) {
        mainStage = stage;
    }

    @FXML
    private void handleOnMouseHover(MouseEvent event) {
        LineChart chart = ((LineChart) (event.getSource()));
        String chartId = chart.getId();
        int chartIndex = Character.getNumericValue(chartId.charAt(chartId.length() - 1));
        whichGraphSelected = chartIndex;
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
            if (index != -1) {
                List<String> lineData = deviceData.get(dataIndex).get(index);
                currentGraphKeyIndex.put(chartIndex, index);
                Label ch1Label = chartLabelMap.get(chartIndex).get(0);
                Label ch2Label = chartLabelMap.get(chartIndex).get(1);
                Label ch3Label = chartLabelMap.get(chartIndex).get(2);
                int finalDataIndex = dataIndex;
                Platform.runLater(() -> {
                    createLine(chartIndex, (int) event.getX(), 54, (int) event.getX(), 224);
                    if (chartConfigMap.get(finalDataIndex).get(0) || chartConfigMap.get(finalDataIndex).get(3)) {
                        ch1Label.setText("CH1 [" + lineData.get(0) + "] : " + lineData.get(1) + " Rpm : " + lineData.get(2) + " " + vibUnitDetailedMap.get(finalDataIndex));
                    }
                    if (chartConfigMap.get(finalDataIndex).get(1) || chartConfigMap.get(finalDataIndex).get(4)) {
                        ch2Label.setText("CH2 [" + lineData.get(0) + "] : " + lineData.get(3) + " Rpm : " + lineData.get(4) + " " + vibUnitDetailedMap.get(finalDataIndex));
                    }
                    if (chartConfigMap.get(finalDataIndex).get(2) || chartConfigMap.get(finalDataIndex).get(5)) {
                        ch3Label.setText("CH3 [" + lineData.get(0) + "] : " + lineData.get(5) + " Rpm : " + lineData.get(6) + " " + vibUnitDetailedMap.get(finalDataIndex));
                    }
                });
            }
        } else {
            lineMap.get(chartIndex).setVisible(false);
        }
    }

    @FXML
    private void onGraphClicked(MouseEvent event) {
        LineChart chart = ((LineChart)(event.getSource()));
        String chartId = chart.getId();
        whichGraphSelected = Character.getNumericValue(chartId.charAt(chartId.length() - 1));
    }

    @FXML
    private void handleOnKeyPressed(KeyEvent event) {
        if (whichGraphSelected == null) return;
        int deviceIndex = -1;
        for(Map.Entry<Integer, Integer> entry: chartAllocation.entrySet()){
            if (whichGraphSelected == entry.getValue()){
                deviceIndex = entry.getKey();
                break;
            }
        }
        if (deviceIndex == -1) return;
        if (!chartRectangleMap.get(whichGraphSelected).isVisible()) {
            double currentDeviceIndex = currentGraphKeyIndex.get(whichGraphSelected);
            double deviceDataSize = deviceData.get(deviceIndex).size();
            double xCoordinate;
            if (currentDeviceIndex == 0) {
                xCoordinate = CHART_X_START_COORDINATE;
            } else {
                xCoordinate = ((currentDeviceIndex / deviceDataSize) * (CHART_X_END_COORDINATE - CHART_X_START_COORDINATE) + CHART_X_START_COORDINATE);
            }
            int finalDeviceIndex = deviceIndex;
            switch (event.getCode()) {
                case LEFT:
                    if (currentDeviceIndex > 0) {
                        currentGraphKeyIndex.put(whichGraphSelected, currentGraphKeyIndex.get(whichGraphSelected) - 1);
                    }
                    Platform.runLater(() -> {
                        List<String> lineData = deviceData.get(finalDeviceIndex).get((int) currentDeviceIndex);
                        Label ch1Label = chartLabelMap.get(whichGraphSelected).get(0);
                        Label ch2Label = chartLabelMap.get(whichGraphSelected).get(1);
                        Label ch3Label = chartLabelMap.get(whichGraphSelected).get(2);
                        createLine(whichGraphSelected, xCoordinate, 54, xCoordinate, 224);
                        if (chartConfigMap.get(finalDeviceIndex).get(0) || chartConfigMap.get(finalDeviceIndex).get(3)) {
                            ch1Label.setText("CH1 [" + lineData.get(0) + "] : " + lineData.get(1) + " Rpm : " + lineData.get(2) + " " + vibUnitDetailedMap.get(finalDeviceIndex));
                        }
                        if (chartConfigMap.get(finalDeviceIndex).get(1) || chartConfigMap.get(finalDeviceIndex).get(4)) {
                            ch2Label.setText("CH2 [" + lineData.get(0) + "] : " + lineData.get(3) + " Rpm : " + lineData.get(4) + " " + vibUnitDetailedMap.get(finalDeviceIndex));
                        }
                        if (chartConfigMap.get(finalDeviceIndex).get(2) || chartConfigMap.get(finalDeviceIndex).get(5)) {
                            ch3Label.setText("CH3 [" + lineData.get(0) + "] : " + lineData.get(5) + " Rpm : " + lineData.get(6) + " " + vibUnitDetailedMap.get(finalDeviceIndex));
                        }
                    });
                    break;
                case RIGHT:
                    if (currentDeviceIndex < deviceDataSize - 1) {
                        currentGraphKeyIndex.put(whichGraphSelected, currentGraphKeyIndex.get(whichGraphSelected) + 1);
                    }
                    Platform.runLater(() -> {
                        List<String> lineData = deviceData.get(finalDeviceIndex).get((int) currentDeviceIndex);
                        Label ch1Label = chartLabelMap.get(whichGraphSelected).get(0);
                        Label ch2Label = chartLabelMap.get(whichGraphSelected).get(1);
                        Label ch3Label = chartLabelMap.get(whichGraphSelected).get(2);
                        createLine(whichGraphSelected, xCoordinate, 54, xCoordinate, 224);
                        if (chartConfigMap.get(finalDeviceIndex).get(0) || chartConfigMap.get(finalDeviceIndex).get(3)) {
                            ch1Label.setText("CH1 [" + lineData.get(0) + "] : " + lineData.get(1) + " Rpm : " + lineData.get(2) + " " + vibUnitDetailedMap.get(finalDeviceIndex));
                        }
                        if (chartConfigMap.get(finalDeviceIndex).get(1) || chartConfigMap.get(finalDeviceIndex).get(4)) {
                            ch2Label.setText("CH2 [" + lineData.get(0) + "] : " + lineData.get(3) + " Rpm : " + lineData.get(4) + " " + vibUnitDetailedMap.get(finalDeviceIndex));
                        }
                        if (chartConfigMap.get(finalDeviceIndex).get(2) || chartConfigMap.get(finalDeviceIndex).get(5)) {
                            ch3Label.setText("CH3 [" + lineData.get(0) + "] : " + lineData.get(5) + " Rpm : " + lineData.get(6) + " " + vibUnitDetailedMap.get(finalDeviceIndex));
                        }
                    });
                    break;
                default:
                    lineMap.get(whichGraphSelected).setVisible(false);
            }
        }
    }

    @FXML
    private void handleAbout() throws IOException {
        FXMLLoader aboutLoader = new FXMLLoader(getClass().getResource("/main/resources/fxml/about.fxml"));
        VBox vbox = aboutLoader.load();
        Stage stage = new Stage();
        stage.initOwner(mainStage);
        Scene scene = new Scene(vbox);
        stage.initModality(Modality.WINDOW_MODAL);
        stage.setTitle("About");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void handleViewLogs() throws IOException {
        FXMLLoader viewLogsLoader = new FXMLLoader(getClass().getResource("/main/resources/fxml/logview.fxml"));
        ViewLogsController viewLogsController = viewLogsLoader.getController();
        VBox vbox = viewLogsLoader.load();
        Stage stage = new Stage();
        stage.initOwner(mainStage);
        Scene scene = new Scene(vbox);
        stage.initModality(Modality.WINDOW_MODAL);
        stage.setTitle("View Logs");
        stage.setScene(scene);
        stage.show();
    }

        private void createLine(int index, double startX, int startY, double endX, int endY) {
            lineMap.get(index).setStartX(startX);
            lineMap.get(index).setStartY(startY);
            lineMap.get(index).setEndX(endX);
            lineMap.get(index).setEndY(endY);
            lineMap.get(index).setFill(Color.LIGHTGREY);
            lineMap.get(index).setOpacity(0.9);
            lineMap.get(index).setVisible(true);
        }

    @FXML
    private void handleDragDropped(DragEvent event) {
        System.out.println("Dropped");
        int fromIndex = Integer.parseInt(event.getDragboard().getString());
        int toIndex = Integer.parseInt(((GridPane)(event.getSource())).getId());
        if (!clientConn.containsKey(fromIndex) && !clientConn.containsKey(toIndex)) return;
        if (!clientConn.containsKey(toIndex) && clientConn.containsKey(fromIndex)) {
            moveDataFromIndexToEmptyIndex(fromIndex, toIndex);
        } // when both devices are connected and available


        event.consume();
    }

    private void moveDataFromIndexToEmptyIndex(int fromIndex, int toIndex) {
        clientConn.put(toIndex, clientConn.get(fromIndex));
        addresses.put(toIndex, addresses.get(fromIndex));
        ports.put(toIndex, ports.get(fromIndex));
        outputList.put(toIndex, outputList.get(fromIndex));
        inputList.put(toIndex, inputList.get(fromIndex));
        chartDataMap.put(toIndex, chartDataMap.get(fromIndex));
        chartConfigMap.put(toIndex, chartConfigMap.get(fromIndex));
        if (chartAllocation.containsKey(fromIndex)) chartAllocation.put(toIndex, chartAllocation.get(fromIndex));
        if (recCheckboxArray.get(fromIndex).isSelected()) {
            dateTimeOnFileNameMap.put(toIndex, dateTimeOnFileNameMap.get(fromIndex));
            fileWriters.put(toIndex, fileWriters.get(fromIndex));
        }
        clientConn.remove(fromIndex);
        addresses.remove(fromIndex);
        ports.remove(fromIndex);
        outputList.remove(fromIndex);
        inputList.remove(fromIndex);
        chartAllocation.remove(fromIndex);
        dateTimeOnFileNameMap.remove(fromIndex);
        fileWriters.remove(fromIndex);
        chartDataMap.remove(fromIndex);
        chartConfigMap.remove(fromIndex);
        deviceNames.get(toIndex).setText(deviceNames.get(fromIndex).getText());
        deviceNames.get(toIndex).setTextFill(Color.GREEN);
        addressLabels.get(toIndex).setText(addressLabels.get(fromIndex).getText());
        recCheckboxArray.get(toIndex).setSelected(recCheckboxArray.get(fromIndex).isSelected());
        if (recCheckboxArray.get(fromIndex).isSelected()) {
            recCheckboxArray.get(toIndex).setText(recCheckboxArray.get(fromIndex).getText());
            recCheckboxArray.get(toIndex).setTextFill(recCheckboxArray.get(fromIndex).getTextFill());
        }
        deviceNames.get(fromIndex).setText("Not Connected");
        deviceNames.get(fromIndex).setTextFill(Color.BLACK);
        addressLabels.get(fromIndex).setText("");
        recCheckboxArray.get(fromIndex).setSelected(false);
        recCheckboxArray.get(fromIndex).setText("Not Recording");
        recCheckboxArray.get(fromIndex).setTextFill(Color.BLACK);
    }

    @FXML
    private void handleDragOver(DragEvent event) {
        event.acceptTransferModes(TransferMode.COPY_OR_MOVE);
        event.consume();
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
        double rpm1 = 0;
        double rpm2 = 0;
        double rpm3 = 0;
        double maxVib1 = 0;
        double maxVib2 = 0;
        double maxVib3 = 0;

        // Y start 15 end 120
        if (event.isSecondaryButtonDown()) {
            return;
        }
        if (event.getX() > CHART_X_START_COORDINATE && event.getX() < CHART_X_END_COORDINATE && event.getY() > CHART_Y_START_COORDINATE && event.getY() < CHART_Y_END_COORDINATE && chartAllocation.containsKey(dataIndex)) {
            double x = Math.min(event.getX(), rectangleStart);
            double y = 54;
            double width = Math.abs(event.getX() - rectangleStart);
            double height = Math.abs(172);
            int start = Math.min(startIndexOnGraph, currentIndex);
            int end = Math.max(startIndexOnGraph, currentIndex);
            for (int i = start; i < end; i++) {
                if (Double.parseDouble(currentDeviceData.get(i).get(2)) > maxVib1) {
                    maxVib1 = Double.parseDouble(currentDeviceData.get(i).get(2));
                    rpm1 = Integer.parseInt(currentDeviceData.get(i).get(1));
                }
                if (Double.parseDouble(currentDeviceData.get(i).get(4)) > maxVib2) {
                    maxVib2 = Double.parseDouble(currentDeviceData.get(i).get(4));
                    rpm2 = Integer.parseInt(currentDeviceData.get(i).get(3));
                }
                if (Double.parseDouble(currentDeviceData.get(i).get(6)) > maxVib3) {
                    maxVib3 = Double.parseDouble(currentDeviceData.get(i).get(6));
                    rpm3 = Integer.parseInt(currentDeviceData.get(i).get(5));
                }
            }
            int finalRpm = (int) rpm1;
            int finalRpm1 = (int) rpm2;
            int finalRpm2 = (int) rpm3;
            double finalMaxVib = maxVib1;
            double finalMaxVib1 = maxVib2;
            double finalMaxVib2 = maxVib3;
            int finalDataIndex = dataIndex;
            Platform.runLater(() -> {
                createRectangle(chartRectangleMap.get(chartIndex), x, y, width, height);
                if (chartConfigMap.get(finalDataIndex).get(0) || chartConfigMap.get(finalDataIndex).get(3)) {
                    ch1Label.setText("CH1 [" + currentDeviceData.get(start).get(0) + "-" + currentDeviceData.get(end).get(0) + "] : " + "Max Vib: " + finalMaxVib + " " + vibUnitDetailedMap.get(finalDataIndex) + ", RPM: " + finalRpm);
                }
                if (chartConfigMap.get(finalDataIndex).get(1) || chartConfigMap.get(finalDataIndex).get(4)) {
                    ch2Label.setText("CH2 [" + currentDeviceData.get(start).get(0) + "-" + currentDeviceData.get(end).get(0) + "] : " + "Max Vib: " + finalMaxVib1 + " " + vibUnitDetailedMap.get(finalDataIndex) + ", RPM: " + finalRpm1);
                }
                if (chartConfigMap.get(finalDataIndex).get(2) || chartConfigMap.get(finalDataIndex).get(5)) {
                    ch3Label.setText("CH3 [" + currentDeviceData.get(start).get(0) + "-" + currentDeviceData.get(end).get(0) + "] : " + "Max Vib: " + finalMaxVib2 + " " + vibUnitDetailedMap.get(finalDataIndex) + ", RPM: " + finalRpm2);
                }
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
        rect.setOpacity(0.8);
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
        if (event.isSecondaryButtonDown()) {
            return;
        }
        startIndexOnGraph = (int) Math.floor(deviceData.get(dataIndex).size() * ((event.getX() - CHART_X_START_COORDINATE) / (CHART_X_END_COORDINATE - CHART_X_START_COORDINATE)));
        Platform.runLater(() -> {
            if (chartRectangleMap.get(chartIndex).isVisible()) {
                chartRectangleMap.get(chartIndex).setVisible(false);
                return;
            }
            rectangleStart = event.getX();
            lineMap.get(chartIndex).setVisible(false);
        });
    }
    @FXML
    private void handleOnMouseReleased(MouseEvent event) {
    }

    @FXML
    public void handleOnClickDevConfigBtn(ActionEvent event) throws IOException {
        FXMLLoader devConfigLoader = new FXMLLoader(getClass().getResource("/main/resources/fxml/devconfig.fxml"));
        VBox vbox = devConfigLoader.load();
        DevConfigController devConfigController = devConfigLoader.getController();
        Stage stage = new Stage();
        stage.initOwner(mainStage);
        Scene scene = new Scene(vbox);
        stage.initModality(Modality.WINDOW_MODAL);
        stage.setTitle("Dev Config");
        stage.setScene(scene);
        devConfigController.setStage(stage);
        stage.show();
    }

    @FXML
    public void handleOnClickConnectionMacBtn(ActionEvent event) throws IOException {
        FXMLLoader connectionMacSettingLoader = new FXMLLoader(getClass().getResource("/main/resources/fxml/connectionmacsetting.fxml"));
        VBox vbox = connectionMacSettingLoader.load();
        ConnectionMacSettingController connectionMacSettingController = connectionMacSettingLoader.getController();
        Stage stage = new Stage();
        stage.initOwner(mainStage);
        Scene scene = new Scene(vbox);
        stage.initModality(Modality.WINDOW_MODAL);
        stage.setTitle("Connection Mac.");
        stage.setScene(scene);
        connectionMacSettingController.setStage(stage);
        stage.show();
    }

    @FXML
    public void handleOnClickRecordAllBtn(ActionEvent event) {
        if (((Button) (event.getSource())).getText().equals("Record All")) {
            Platform.runLater(() -> {
                boolean isNothingRecording = false;
                for (int i = 0; i < MAX_DEVICE_NUMBER; i++) {
                    if (clientConn.containsKey(i) && recCheckboxArray.get(i).isSelected()) {
                        boxes.get(i).setFill(Color.RED);
                        boxes.get(i).setOpacity(0.3);
                        recCheckboxArray.get(i).setDisable(true);
                        isRecordingAll.put(i, true);
                        isNothingRecording = true;
                    }
                }
                if (!isNothingRecording) {
                    FXMLLoader saveSettingLoader = new FXMLLoader(getClass().getResource("/main/resources/fxml/notrecordingwarning.fxml"));
                    VBox vbox = null;
                    try {
                        vbox = saveSettingLoader.load();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    Stage stage = new Stage();
                    stage.initOwner(mainStage);
                    Scene scene = new Scene(vbox);
                    stage.initModality(Modality.WINDOW_MODAL);
                    stage.setTitle("Warning!");
                    stage.setScene(scene);
                    stage.show();
                    return;
                }
                ((Button) (event.getSource())).setText("Stop");
                devConfigBtn.setDisable(true);
                recordDot.setVisible(false);
                connectionMacBtn.setDisable(true);
            });
        } else {
            Platform.runLater(() -> {
                for (int i = 0; i < MAX_DEVICE_NUMBER; i++) {
                    if (clientConn.containsKey(i)) {
                        fileWriters.remove(i);
                        recCheckboxArray.get(i).setDisable(false);
                        boxes.get(i).setFill(Color.GREEN);
                        boxes.get(i).setOpacity(0.3);
                    }
                }
                recordDot.setVisible(true);
                ((Button) (event.getSource())).setText("Record All");
                devConfigBtn.setDisable(false);
                connectionMacBtn.setDisable(false);
            });
        }
    }
    public String getCurrentDateTime(String pattern) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }


    public void createNewFileWriter(int index, String currentDate, boolean isReconnected) throws IOException {
        dateTimeOnFileNameMap.put(index, getCurrentDateTime("yyyy/MM/dd"));
        String reconnected = "";
        if (isReconnected) {
            reconnected = "-Reconnected";
        }
        String path = "./SavedData/" + deviceNames.get(index).getText() + "-" + addresses.get(index) + "-" + ports.get(index) + "/" + deviceNames.get(index).getText() + "-" + currentDate + reconnected + ".txt";
        File file = new File(path);
        file.getParentFile().mkdirs();
        fileWriters.put(index, new FileWriter(file));
        fileWriters.get(index).write("Date: " + getCurrentDateTime("yyyy/MM/dd") + "\r\n");
        fileWriters.get(index).write("Time: " + getCurrentDateTime("HH:mm:ss") + "\r\n");
        fileWriters.get(index).write("\r\n");
        fileWriters.get(index).write("Vibration: " + vibUnitMap.get(index) + "\r\n");
        fileWriters.get(index).write("\r\n");
        fileWriters.get(index).write("dd:hh:mm:ss     RPM#1     Vib#1     RPM#2     Vib#2     RPM#3     Vib#3\r\n");
        fileWriters.get(index).flush();
    }

    @FXML
    public void handleOnClickRecordBtn(ActionEvent event) {
        Platform.runLater(() -> {
            if (((CheckBox)(event.getSource())).isSelected()) {
                ((CheckBox)(event.getSource())).setText("Recording");
                ((CheckBox)(event.getSource())).setTextFill(Color.RED);

            } else {
                ((CheckBox)(event.getSource())).setText("Not Recording");
                ((CheckBox)(event.getSource())).setTextFill(Color.BLACK);
            }
        });
    }

}
