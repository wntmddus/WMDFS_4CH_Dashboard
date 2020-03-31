package com.util;

import javafx.fxml.FXMLLoader;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import com.controllers.DashboardController;

import java.awt.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SharedStorage {
    public static Stage mainStage;
    public static Map<Integer, Socket> clientConn = new HashMap<>();
    public static Map<Integer, String> addresses = new HashMap<>();
    public static Map<Integer, String> ports = new HashMap<>();
    public static Map<Integer, DataOutputStream> outputList = new HashMap<>();
    public static Map<Integer, DataInputStream> inputList = new HashMap<>();
    public static Map<Integer, TextField> connAddTextFieldMap = new HashMap<>();
    public static Map<Integer, TextField> connPortTextFieldMap = new HashMap<>();
    public static Map<Integer, Button> disconnectBtnMap = new HashMap<>();
    public static List<CheckBox> recCheckboxArray = new ArrayList<>();
    public static List<Label> deviceNames = new ArrayList<>();
    public static Map<Integer, List<List<String>>> deviceData = new HashMap<>();
    public static Map<Integer, Label> graphLabels = new HashMap<>();
    public static Map<Integer, Integer> chartAllocation = new HashMap<Integer, Integer>() {
        {
        }
    };
    public static Map<Integer, Label> deviceConnNumMap = new HashMap<>();
    public static Map<Integer, Map<String, XYChart.Series<String, Number>>> chartDataMap = new HashMap<>();
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
    //    public static List<LineChart<String, Number>> lineCharts = new ArrayList<>();
    public static Map<Integer, LineChart<String, Number>> lineCharts = new HashMap<>();

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


    public void initialize() {

    }
}
