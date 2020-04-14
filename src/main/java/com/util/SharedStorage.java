package main.java.com.util;

import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.*;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileWriter;
import java.net.Socket;
import java.net.URL;
import java.util.*;
import java.util.prefs.Preferences;

public class SharedStorage {
    public final int MAX_DEVICE_NUMBER = 20;
    public final int MAX_GRAPH_NUMBER = 8;
    public static Stage mainStage;
    public static Preferences pref = Preferences.userNodeForPackage(SharedStorage.class);
    public static Map<Integer, Rectangle> boxes = new HashMap<>();
    public static Map<Integer, Socket> clientConn = new HashMap<>();
    public static Map<Integer, String> addresses = new HashMap<>();
    public static Map<Integer, String> ports = new HashMap<>();
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
    public static Button recordAllBtnGlobal;
    public static Label chartLabel;
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
    public static boolean isSwitching = false;
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
}
