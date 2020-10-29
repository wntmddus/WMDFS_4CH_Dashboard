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
    public static Map<Integer, String> ports = new HashMap<Integer, String>(){
        {
            put(0, "1470");
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
}
