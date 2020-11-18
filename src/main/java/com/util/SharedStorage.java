package main.java.com.util;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.*;
import java.net.Socket;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.prefs.Preferences;

public class SharedStorage {
    public final int MAX_DEVICE_NUMBER = 20;
    public final int MAX_GRAPH_NUMBER = 8;
    public final static String BASE_URL = "https://ddms-api.samsunghrm.com/v2/ddms/service/";
    public final static String BASE_IP_ADDRESS = "192.168.0.";
    public final static String APPLICATION_JSON = "application/json";
    public final static String AUTHORIZATION = "Authorization";
    public final static String ID = "id";
    public final static String SECRET = "secret";
    public static Stage mainStage;
    public static Preferences pref = Preferences.userNodeForPackage(SharedStorage.class);
    public static Map<Integer, Rectangle> boxes = new HashMap<>();
    public static Map<Integer, Socket> clientConn = new HashMap<>();
    public static Map<Integer, String> addresses = new HashMap<>();
    public static Map<Integer, Label> deviceIdMap = new HashMap<>();
    public static Map<Integer, TextField> macIdTextFieldMap = new HashMap<>();
    public static Map<Integer, String> macAddressesMap = new HashMap<Integer, String>(){
        {
            put(0, "");
            put(1, "");
            put(2, "");
            put(3, "");
            put(4, "");
            put(5, "");
            put(6, "");
            put(7, "");
            put(8, "");
            put(9, "");
            put(10, "");
            put(11, "");
            put(12, "");
            put(13, "");
            put(14, "");
            put(15, "");
            put(16, "");
            put(17, "");
            put(18, "");
            put(19, "");
        }
    };
    public static Map<Integer, String> ports = new HashMap<Integer, String>(){
        {
            put(0, "8080");
            put(1, "1470");
            put(2, "1470");
            put(3, "1470");
            put(4, "1470");
            put(5, "1470");
            put(6, "1470");
            put(7, "1470");
            put(8, "1470");
            put(9, "1470");
            put(10, "1470");
            put(11, "1470");
            put(12, "1470");
            put(13, "1470");
            put(14, "1470");
            put(15, "1470");
            put(16, "1470");
            put(17, "1470");
            put(18, "1470");
            put(19, "1470");
        }
    };
    public static Map<Integer, DataOutputStream> outputList = new HashMap<>();
    public static Map<Integer, DataInputStream> inputList = new HashMap<>();
    public static Map<Integer, TextField> connAddTextFieldMap = new HashMap<>();
    public static Map<Integer, TextField> connPortTextFieldMap = new HashMap<>();
    public static Map<Integer, Button> disconnectBtnMap = new HashMap<>();
    public static Map<Integer, String> vibUnitMap = new HashMap<>();
    public static Map<Integer, String> vibUnitDetailedMap = new HashMap<>();
    public static Map<Integer, Label> vibUnitLabelMap = new HashMap<>();
    public static List<CheckBox> recCheckboxArray = new ArrayList<>();
    public static List<Label> deviceNames = new ArrayList<>();
    public static Map<Integer, FileWriter> fileWriters = new HashMap<>();
    public static Map<Integer, Label> addressLabels = new HashMap<>();
    public static Map<Integer, List<List<String>>> deviceData = new HashMap<>();
    public static Map<Integer, Label> graphLabels = new HashMap<>();
    public static Map<Integer, Label> graphPanelLabels = new HashMap<>();
    public static Map<Integer, Integer> chartAllocation = new HashMap<>();
    public static Map<Integer, CheckBox> connChkBoxMap = new HashMap<>();
    public static Map<Integer, TextField> maxRpmMap = new HashMap<>();
    public static Map<Integer, TextField> maxVibMap = new HashMap<>();
    public static Map<Integer, CheckBox> rpmAutoChkBoxMap = new HashMap<>();
    public static Map<Integer, CheckBox> vibAutoChkBoxMap = new HashMap<>();
    public static Map<Integer, Integer> maxRpmValueMap = new HashMap<>();
    public static Map<Integer, Integer> maxVibValueMap = new HashMap<>();
    public static Map<Integer, Integer> totalCountMap = new HashMap<>();
    public static Map<Integer, Label> fixedAddressesMap = new HashMap<>();
    public static Integer whichGraphSelected = null;
    public static Map<Integer, Integer> currentGraphKeyIndex = new HashMap<Integer, Integer>(){
        {
            put(0, 1);
            put(1, 1);
            put(2, 1);
            put(3, 1);
            put(4, 1);
            put(5, 1);
            put(6, 1);
            put(7, 1);
        }
    };
    public static Map<Integer, Boolean> connChkBoxStatusMap = new HashMap<Integer, Boolean>(){
        {
            put(0, true);
            put(1, true);
            put(2, true);
            put(3, true);
            put(4, true);
            put(5, true);
            put(6, true);
            put(7, true);
            put(8, true);
            put(9, true);
            put(10, true);
            put(11, true);
            put(12, true);
            put(13, true);
            put(14, true);
            put(15, true);
            put(16, true);
            put(17, true);
            put(18, true);
            put(19, true);
        }
    };
    public static List<Boolean> isDisconnecting = new ArrayList<Boolean>() {
        {
            add(false);
            add(false);
            add(false);
            add(false);
            add(false);
            add(false);
            add(false);
            add(false);
            add(false);
            add(false);
            add(false);
            add(false);
            add(false);
            add(false);
            add(false);
            add(false);
            add(false);
            add(false);
            add(false);
            add(false);
        }
    };
    public static Button recordAllBtnGlobal;
    public static Button disconnectAllBtnGlobal;
    public static Map<Integer, Label> deviceConnNumMap = new HashMap<>();
    public static Map<Integer, String> dateTimeOnFileNameMap = new HashMap<>();
    public static Map<Integer, Boolean> isRecordingAll = new HashMap<Integer, Boolean>() {
        {
            put(0, false);
            put(1, false);
            put(2, false);
            put(3, false);
            put(4, false);
            put(5, false);
            put(6, false);
            put(7, false);
            put(8, false);
            put(9, false);
            put(10, false);
            put(11, false);
            put(12, false);
            put(13, false);
            put(14, false);
            put(15, false);
            put(16, false);
            put(17, false);
            put(18, false);
            put(19, false);
        }
    };
    public static Map<Integer, Map<String, XYChart.Series<String, Number>>> chartDataMap = new HashMap<>();
    public static Map<Integer, ComboBox<Integer>> deviceNumPickerMap = new HashMap<>();
    public static Map<Integer, Map<String, CheckBox>> graphSelectCheckboxMap = new HashMap<Integer, Map<String, CheckBox>>(){
        {
            put(0, new HashMap<>());
            put(1, new HashMap<>());
            put(2, new HashMap<>());
            put(3, new HashMap<>());
            put(4, new HashMap<>());
            put(5, new HashMap<>());
            put(6, new HashMap<>());
            put(7, new HashMap<>());

        }
    };
    public static Map<Integer, List<Boolean>> chartConfigMap = new HashMap<>();
    public static Map<Integer, Map<Integer, Label>> chartLabelMap = new HashMap<Integer, Map<Integer, Label>>() {
        {
            put(0, new HashMap<>());
            put(1, new HashMap<>());
            put(2, new HashMap<>());
            put(3, new HashMap<>());
            put(4, new HashMap<>());
            put(5, new HashMap<>());
            put(6, new HashMap<>());
            put(7, new HashMap<>());
        }
    };
    public static List<Rectangle> chartRectangleMap = new ArrayList<>();
    public static Map<Integer, Line> lineMap = new HashMap<>();
    public static Map<Integer, LineChart<String, Number>> lineCharts = new HashMap<>();
    public static Map<Integer, LineChart<String, Number>> lineRightCharts = new HashMap<>();

    public static List<List<Label>> realTimeData = new ArrayList<List<Label>>() {
        {
            add(new ArrayList<>());
            add(new ArrayList<>());
            add(new ArrayList<>());
            add(new ArrayList<>());
            add(new ArrayList<>());
            add(new ArrayList<>());
            add(new ArrayList<>());
            add(new ArrayList<>());

        }
    };


    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void handleOnReset() throws IOException {
        for (Map.Entry<Integer, TextField> entry : connAddTextFieldMap.entrySet()) {
            if (!entry.getValue().getText().equals("")) {
                pref.remove("address" + entry.getKey());
                pref.remove("chartConfig" + entry.getKey());
                chartConfigMap.remove(entry.getKey());
                if (!clientConn.containsKey(entry.getKey())) {
                    addresses.remove(entry.getKey());
                    connAddTextFieldMap.get(entry.getKey()).setText("");
                }
                connChkBoxStatusMap.put(entry.getKey(), true);
            }
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

    public String rgbFormatter(Color color) {
        return String.format("%d, %d, %d",
                (int) (color.getRed() * 255),
                (int) (color.getGreen() * 255),
                (int) (color.getBlue() * 255));
    }

    public void modifyGraphWithGivenConfig(Integer deviceNumber, int chartNumber) {
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
    public String getCurrentDateTime(String pattern) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }
}
