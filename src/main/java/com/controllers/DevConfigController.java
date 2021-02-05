package main.java.com.controllers;

//import io.restassured.response.Response;
import javafx.application.Platform;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import main.java.com.util.RestfulApi;
import main.java.com.util.SharedStorage;
import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URL;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public class DevConfigController extends SharedStorage implements Initializable {

    private static Logger log = Logger.getLogger(DevConfigController.class);

    @FXML
    public Tab createConnectionTab;
    @FXML
    public Tab selectGraphTab;
    @FXML
    public TabPane tabPane;
    private Stage stage;

    @FXML
    public Button disconnectAllBtn;

    public void setStage(Stage stage) {
        this.stage = stage;
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        disconnectAllBtnGlobal = disconnectAllBtn;
        tabPane.getSelectionModel().selectedItemProperty().addListener((ObservableValue<? extends Tab> observable, Tab oldValue, Tab newValue) -> {
            if (newValue == createConnectionTab) {
                disconnectAllBtn.setVisible(true);
            } else if (newValue == selectGraphTab) {
                disconnectAllBtn.setVisible(false);
            }
        });
        for (int i = 0; i < MAX_DEVICE_NUMBER; i++) {
            if (clientConn.containsKey(i)) {
                disconnectAllBtn.setDisable(false);
            }
        }
    }

    @FXML
    void onClose() {
        stage.close();
    }

    @FXML
    void handleOnSubmit() {
        if (tabPane.getSelectionModel().getSelectedIndex() == 0) {
            handleOnConnect();
        } else {
            handleOnSubmitGraph();
        }
    }

    private void handleOnSubmitGraph() {
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

    void handleOnConnect() {
        for (Map.Entry<Integer, CheckBox> entry : connChkBoxMap.entrySet()) {
            if (entry.getValue().isSelected()) {
                connChkBoxStatusMap.put(entry.getKey(), true);
            } else {
                connChkBoxStatusMap.put(entry.getKey(), false);
            }
        }
        extractInformationFromTextField();
        connectValidAddressesToTCP();
        stage.close();
    }

    private void extractInformationFromTextField() {
        for (int i = 0; i < MAX_DEVICE_NUMBER; i++) {
            if (!connAddTextFieldMap.get(i).getText().isEmpty() && !connPortTextFieldMap.get(i).getText().isEmpty()) {
                addresses.put(i, connAddTextFieldMap.get(i).getText());
                ports.put(i, connPortTextFieldMap.get(i).getText());
            }
        }
    }

    void updateRealtimeDataUpdatePanel(List<String> realTimeLine, int dataPanelLocationIndex) {
        List<Label> currentLabelObject = realTimeData.get(dataPanelLocationIndex);
        currentLabelObject.get(0).setText(realTimeLine.get(2));
        currentLabelObject.get(1).setText(realTimeLine.get(4));
        currentLabelObject.get(2).setText(realTimeLine.get(6));
        currentLabelObject.get(3).setText(realTimeLine.get(1));
        currentLabelObject.get(4).setText(realTimeLine.get(3));
        currentLabelObject.get(5).setText(realTimeLine.get(5));
    }


    private void connectValidAddressesToTCP() {
        addresses.forEach((i, value) -> {
            try {
                TimeUnit.MILLISECONDS.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(!clientConn.containsKey(i) && connChkBoxMap.get(i).isSelected()) {
                Runnable task = () -> {
                    try {
                        // create and store Socket
                        Socket sock = new Socket();
                        String address = BASE_IP_ADDRESS + addresses.get(i);
                        sock.connect(new InetSocketAddress(address, 1470), 5000);
                        sock.setSoTimeout(5000);
                        if (sock.isConnected()) {
                            try {
                                clientConn.put(i, sock);
                                outputList.put(i, new DataOutputStream(sock.getOutputStream()));
                                inputList.put(i, new DataInputStream(sock.getInputStream()));
                                deviceData.put(i, new ArrayList<>());
                                outputList.get(i).writeBytes("GET DEVNAME\0");
                                String devName = inputList.get(i).readLine();
                                outputList.get(i).writeBytes("GET STATE\0");
                                String devState = inputList.get(i).readLine();
                                outputList.get(i).writeBytes("GET SETTING\0");
                                String vibSetting = inputList.get(i).readLine();
                                vibUnitMap.put(i, vibSetting.substring(12));
                                maxRpmValueMap.put(i, 1200);
                                totalCountMap.put(i, 0);
                                // Post Init request
                                if (vibUnitMap.get(i).contains("Disp.Peak  (mm)")) maxVibValueMap.put(i, 2);
                                vibUnitDetailedMap.put(i, vibUnitMap.get(i).substring(vibUnitMap.get(i).indexOf('(') + 1, vibUnitMap.get(i).length() - 1));
                                if (devState.equals("SD")) {
                                    Platform.runLater(() -> addressLabels.get(i).setText("Device Not in SRV"));
                                    throw new IOException("Device is not in SRV Status");
                                }

                                if (chartAllocation.size() <= MAX_GRAPH_NUMBER) {
                                    for (int j = 0; j < MAX_GRAPH_NUMBER; j++) {
                                        if (!chartAllocation.containsValue(j)) {
                                            chartAllocation.put(i, j);
                                            break;
                                        }
                                    }
                                }
                                TimeUnit.MILLISECONDS.sleep(100);
                                outputList.get(i).writeBytes("REC\0");
                                Platform.runLater(() -> {
                                    addressLabels.get(i).setText(BASE_IP_ADDRESS + addresses.get(i) + ":" + ports.get(i));
                                    disconnectBtnMap.get(i).setDisable(false);
                                    deviceConnNumMap.get(i).setTextFill(Color.BLACK);
                                    recCheckboxArray.get(i).setTextFill(Color.RED);
                                    recCheckboxArray.get(i).setText("Recording");
                                    recCheckboxArray.get(i).setSelected(true);
                                    recCheckboxArray.get(i).setDisable(false);
                                    boxes.get(i).setFill(Color.GREEN);
                                    boxes.get(i).setOpacity(0.4);
                                    deviceNames.get(i).setText(devName);
                                    setGraphConfiguration(i);
                                    initializeChartData(i);
                                    if (chartAllocation.containsKey(i)) {
                                        vibUnitLabelMap.get(chartAllocation.get(i)).setText(vibUnitMap.get(i));
                                        graphPanelLabels.get(chartAllocation.get(i)).setText(devName);
                                    }
                                });
                                int counter = 0;
                                AtomicReference<List<Number>> tempArr = new AtomicReference<>();
                                tempArr.set(new ArrayList<Number>(){
                                    {
                                        add(0);
                                        add(0);
                                        add(0.0);
                                        add(0);
                                        add(0.0);
                                        add(0);
                                        add(0.0);
                                    }
                                });
                                while (clientConn.get(i).isConnected()) {
                                    String line = "";
                                    try {
                                        line = inputList.get(i).readLine();
                                    } catch (IOException e) {
                                        System.err.println("Timed out waiting for the socket in input ReadLine" + i);
                                        line = reconnectOnSocketFailure(i, devName);
                                    }

                                    List<String> arr = Arrays.asList(line.split("\\s+"));
                                    if (deviceData.get(i).size() > 3600) deviceData.get(i).remove(0);
                                    deviceData.get(i).add(arr);
                                    if (fileWriters.containsKey(i) && recCheckboxArray.get(i).isSelected()) {
                                        totalCountMap.put(i, totalCountMap.get(i) + 1);
                                        if (line.contains(":24:00:00")) {
                                            createNewFileWriter(i, getCurrentDateTime("yyyy-MM-dd-HH.mm.ss", false), false);
                                        }
                                        fileWriters.get(i).write(line + "\r\n");
                                        fileWriters.get(i).flush();
                                        if (totalCountMap.get(i) != 0 && totalCountMap.get(i) % 5 == 0) {
                                            Runnable postCallThread = () -> {
                                                StringBuilder str = new StringBuilder();
                                                JSONObject body = buildSensorDataObject(i, devName);
                                                String res = null;
                                                try {
                                                    res = RestfulApi.post("extLogs", body);
                                                } catch (Exception e) {
                                                    log.error(e);
                                                    System.err.println(e);
                                                }
                                                str.append(BASE_URL + "extLogs").append("\n")
                                                        .append(res).append("\n")
                                                        .append("-------------------------------------------").append("\n");
                                                log.info(str.toString());
                                                Platform.runLater(() -> {
                                                    if (logView != null) {
                                                        logView.appendText(str.toString());
                                                        if (logView.getText().length() > 30000) {
                                                            logView.deleteText(0, 1153);
                                                        }
                                                    }
                                                });
                                            };
                                            if (isSendingData) {
                                                Thread backgroundThread = new Thread(postCallThread);
                                                backgroundThread.setDaemon(true);
                                                backgroundThread.start();
                                            }
                                        }
                                    }
                                    int finalCounter = counter;
                                    if (arr.size() == 7) {
                                        Platform.runLater(() -> {
                                            if(chartAllocation.containsKey(i)) {
                                                updateRealtimeDataUpdatePanel(arr, chartAllocation.get(i));
                                            }
                                            tempArr.set(sliceChartData(tempArr.get(), arr, i, finalCounter));
                                        });
                                    }
                                    if (isRecordingAll.get(i)) {
                                        createNewFileWriter(i, getCurrentDateTime("yyyy-MM-dd-HH.mm.ss", false), false);
                                        chartDataMap.get(i).remove("rpm1");
                                        chartDataMap.get(i).remove("rpm2");
                                        chartDataMap.get(i).remove("rpm3");
                                        chartDataMap.get(i).remove("vib1");
                                        chartDataMap.get(i).remove("vib2");
                                        chartDataMap.get(i).remove("vib3");
                                        deviceData.get(i).clear();
                                        totalCountMap.put(i, 0);
                                        Platform.runLater(() -> {
                                            if (chartAllocation.containsKey(i)) {
                                                lineRightCharts.get(chartAllocation.get(i)).getData().clear();
                                                lineCharts.get(chartAllocation.get(i)).getData().clear();
                                            }
                                            initializeChartData(i);
                                        });
                                        Runnable postCallThread = () -> {
                                            StringBuilder str = new StringBuilder();
                                            JSONObject requestBody1 = new JSONObject("{\n" +
                                                    "    \"extDeviceId\": \"" + devName + "\"\n" +
                                                    "}");
                                            JSONObject requestBody2 = new JSONObject("{\n" +
                                                    "    \"extDeviceId\": \"" + devName + "\",\n" +
                                                    "    \"channelCount\": 7,\n" +
                                                    "    \"channelName\": [\"dd:hh:mm:ss\", \"vib1(" + vibUnitMap.get(i) + ")\", \"Rpm1\", \"vib2(" + vibUnitMap.get(i) + ")\", \"Rpm2\", \"vib3(" + vibUnitMap.get(i) + ")\", \"Rpm3\"]\n" +
                                                    "}");
                                            if (!macAddressesMap.get(i).equals("")) {
                                                requestBody2.put("connectionMac", macAddressesMap.get(i));
                                            }
                                            String res1 = null;
                                            try {
                                                res1 = RestfulApi.post("extInit", requestBody1);
                                            } catch (IOException e) {
                                                e.printStackTrace();
                                            }
                                            String res2 = null;
                                            try {
                                                res2 = RestfulApi.post("extRegistration", requestBody2);
                                            } catch (IOException e) {
                                                e.printStackTrace();
                                            }
                                            str.append(BASE_URL + "extInit").append("\n")
                                                    .append(res1).append("\n")
//                                                    .append(res1.headers().toString()).append("\n")
//                                                    .append(res1.body().toString()).append("\n")
                                                    .append("-------------------------------------------").append("\n");
                                            str.append(BASE_URL + "extRegistration").append("\n")
                                                    .append(res2).append("\n")
//                                                    .append(res2.headers().toString()).append("\n")
//                                                    .append(res2.body().toString()).append("\n")
                                                    .append("-------------------------------------------").append("\n");
                                            logStringBuilder.append(str);
                                            Platform.runLater(() -> {
                                                if (logView != null) {
                                                    logView.appendText(logStringBuilder.toString());
                                                }
                                            });
                                        };
                                        if (isSendingData) {
                                            Thread backgroundThread = new Thread(postCallThread);
                                            backgroundThread.setDaemon(true);
                                            backgroundThread.start();
                                            backgroundThread.join();
                                        }
                                        outputList.get(i).writeBytes("STOP\0");
                                        TimeUnit.MILLISECONDS.sleep(2000);
                                        outputList.get(i).writeBytes("REC\0");
                                        TimeUnit.MILLISECONDS.sleep(2000);
                                        isRecordingAll.put(i, false);
                                    } else {
                                        outputList.get(i).writeBytes("1\0");
                                    }
                                    TimeUnit.MILLISECONDS.sleep(600);
                                    counter++;
                                }
                            } catch (IOException | InterruptedException e) {
                                log.error("Timed out waiting for the socket while in Execute Thread", e);
                                if (!disconnectBtnMap.get(i).isDisable()) {
                                    clientConn.get(i).close();
                                }
                                Platform.runLater(() -> {
                                    if (!addressLabels.get(i).getText().equals("Device Not in SRV")) {
                                        addressLabels.get(i).setText("");
                                    }
                                    recCheckboxArray.get(i).setText("Not Recording");
                                    recCheckboxArray.get(i).setTextFill(Color.BLACK);
                                    recCheckboxArray.get(i).setSelected(false);
                                    recCheckboxArray.get(i).setDisable(true);
                                    boxes.get(i).setFill(Color.GRAY);
                                    boxes.get(i).setOpacity(0.3);
                                    if (chartAllocation.containsKey(i)) {
                                        graphSelectCheckboxMap.get(chartAllocation.get(i)).get("rpm1").setSelected(false);
                                        graphSelectCheckboxMap.get(chartAllocation.get(i)).get("rpm2").setSelected(false);
                                        graphSelectCheckboxMap.get(chartAllocation.get(i)).get("rpm3").setSelected(false);
                                        graphSelectCheckboxMap.get(chartAllocation.get(i)).get("vib1").setSelected(false);
                                        graphSelectCheckboxMap.get(chartAllocation.get(i)).get("vib2").setSelected(false);
                                        graphSelectCheckboxMap.get(chartAllocation.get(i)).get("vib3").setSelected(false);
                                    }
                                    maxRpmMap.get(i).setText("");
                                    maxVibMap.get(i).setText("");
                                    deviceNumPickerMap.get(i).setValue(null);
                                    removeChartData(i);
                                    removingDeviceDataOnDisconnect(i);
                                });
                                e.printStackTrace();
                            }
                        }
                    } catch (IOException e) {
                        log.error("Timed out waiting for the socket on connection", e);
                        addresses.remove(i);
                        Platform.runLater(() -> {
                            boxes.get(i).setFill(Color.GREY);
                            boxes.get(i).setOpacity(0.3);
                            deviceConnNumMap.get(i).setTextFill(Color.RED);
                            deviceNames.get(i).setText("Not Connected");
                            deviceNames.get(i).setFocusTraversable(true);
                        });
                        e.printStackTrace();
                    }
                };
                Thread backgroundThread = new Thread(task);
                backgroundThread.setDaemon(true);
                backgroundThread.start();
            }
        });
    }

    @FXML
    private void handleOnDisconnectAll() throws InterruptedException {
        Platform.runLater(() -> {
            disconnectAllBtn.setDisable(true);

            loadGlobal.setDisable(false);
        });
        Thread.sleep(100);
        clientConn.forEach((key, value) -> {
            try {
                Thread.sleep(100);
                isDisconnecting.set(key, true);
                outputList.get(key).writeBytes("STOP\0");
                outputList.get(key).writeBytes("NO CARRIER\0");
                clientConn.get(key).close();
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        });
    }


    private void setGraphConfiguration(int index) {
        if (!pref.get("chartConfig" + index, "root").equals("root")) {
            String config = pref.get("chartConfig" + index, "root");
            chartConfigMap.put(index, new ArrayList<>());
            for (int j = 0; j < config.length(); j++) {
                if (config.charAt(j) == '1') {
                    chartConfigMap.get(index).add(true);
                } else {
                    chartConfigMap.get(index).add(false);
                }
            }
        } else if (!chartConfigMap.containsKey(index)) {
            chartConfigMap.put(index, new ArrayList<Boolean>() {
                {
                    add(true);
                    add(true);
                    add(true);
                    add(true);
                    add(true);
                    add(true);
                }
            });
        }
    }
    private String reconnectOnSocketFailure(int i, String devName) throws IOException, InterruptedException {
        String line = "";
        int timeCounter = 0;
        while (line.equals("") && timeCounter < 20) {
            if (isDisconnecting.get(i)) {
                isDisconnecting.set(i, false);
                throw new IOException("Device is disconnected by user");
            }
            clientConn.get(i).close();
            Thread.sleep(10000);
            Socket newSock = new Socket();
            try {
                String address = BASE_IP_ADDRESS + addresses.get(i);
                newSock.connect(new InetSocketAddress(address, Integer.parseInt(ports.get(i))), 1000);
                newSock.setSoTimeout(5000);
            } catch (IOException e) {
                line = "";
            }
            if (newSock.isConnected()) {
                clientConn.put(i, newSock);
                outputList.put(i, new DataOutputStream(newSock.getOutputStream()));
                inputList.put(i, new DataInputStream(newSock.getInputStream()));
                TimeUnit.MILLISECONDS.sleep(1000);
                outputList.get(i).writeBytes("REC\0");
                TimeUnit.MILLISECONDS.sleep(1000);
                try {
                    line = inputList.get(i).readLine();
                } catch (IOException e) {
                    line = "";
                }
                if (recordAllBtnGlobal.getText().equals("Stop")) {
                    createNewFileWriter(i, getCurrentDateTime("yyyy-MM-dd-HH.mm.ss", false), true);
                }
                chartDataMap.get(i).remove("rpm1");
                chartDataMap.get(i).remove("rpm2");
                chartDataMap.get(i).remove("rpm3");
                chartDataMap.get(i).remove("vib1");
                chartDataMap.get(i).remove("vib2");
                chartDataMap.get(i).remove("vib3");
                deviceData.get(i).clear();
                Platform.runLater(() -> {
                    if (chartAllocation.containsKey(i)) {
                        lineCharts.get(chartAllocation.get(i)).getData().clear();
                        lineRightCharts.get(chartAllocation.get(i)).getData().clear();
                    }
                    initializeChartData(i);
                });
            }

            if (!line.equals("")) {
                Runnable postCallThread = () -> {
                    JSONObject requestBody1 = new JSONObject("{\n" +
                            "    \"extDeviceId\": \"" + devName + "\"\n" +
                            "}");
                    JSONObject requestBody2 = new JSONObject("{\n" +
                            "    \"extDeviceId\": \"" + devName + "\",\n" +
                            "    \"channelCount\": 7,\n" +
                            "    \"channelName\": [\"dd:hh:mm:ss\", \"vib1(" + vibUnitMap.get(i) + ")\", \"Rpm1\", \"vib2(" + vibUnitMap.get(i) + ")\", \"Rpm2\", \"vib3(" + vibUnitMap.get(i) + ")\", \"Rpm3\"]\n" +
                            "}");
                    if (!macAddressesMap.get(i).equals("")) {
                        requestBody2.put("connectionMac", macAddressesMap.get(i));
                    }
                    try {
                        RestfulApi.post("extInit", requestBody1);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        RestfulApi.post("extRegistration", requestBody2);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                };
                if (isSendingData) {
                    Thread backgroundThread = new Thread(postCallThread);
                    backgroundThread.setDaemon(true);
                    backgroundThread.start();
                    backgroundThread.join();
                }
                return line;
            }
            timeCounter++;
        }
        throw new IOException("Device is disconnected After 10 minutes of Retry");
    }

    private List<Number> sliceChartData(List<Number> tempArr, List<String> arr, int i, int counter) {
        tempArr.set(1, Math.max((Integer) tempArr.get(1), Integer.parseInt(arr.get(1))));
        tempArr.set(2, Math.max((Double) tempArr.get(2), Float.parseFloat(arr.get(2))));
        tempArr.set(3, Math.max((Integer) tempArr.get(3), Integer.parseInt(arr.get(3))));
        tempArr.set(4, Math.max((Double) tempArr.get(4), Float.parseFloat(arr.get(4))));
        tempArr.set(5, Math.max((Integer) tempArr.get(5), Integer.parseInt(arr.get(5))));
        tempArr.set(6, Math.max((Double) tempArr.get(6), Float.parseFloat(arr.get(6))));
        if (counter != 0 && counter % 6  == 0) {
            if (chartDataMap.get(i).get("rpm1").getData().size() > 600) {
                chartDataMap.get(i).get("rpm1").getData().remove(0);
                chartDataMap.get(i).get("rpm2").getData().remove(0);
                chartDataMap.get(i).get("rpm3").getData().remove(0);
                chartDataMap.get(i).get("vib1").getData().remove(0);
                chartDataMap.get(i).get("vib2").getData().remove(0);
                chartDataMap.get(i).get("vib3").getData().remove(0);
            }
            chartDataMap.get(i).get("rpm1").getData().add(new XYChart.Data<>(arr.get(0), tempArr.get(1)));
            chartDataMap.get(i).get("rpm2").getData().add(new XYChart.Data<>(arr.get(0), tempArr.get(3)));
            chartDataMap.get(i).get("rpm3").getData().add(new XYChart.Data<>(arr.get(0), tempArr.get(5)));
            chartDataMap.get(i).get("vib1").getData().add(new XYChart.Data<>(arr.get(0), tempArr.get(2)));
            chartDataMap.get(i).get("vib2").getData().add(new XYChart.Data<>(arr.get(0), tempArr.get(4)));
            chartDataMap.get(i).get("vib3").getData().add(new XYChart.Data<>(arr.get(0), tempArr.get(6)));
            return new ArrayList<Number>() {
                {
                    add(0);
                    add(0);
                    add(0.0);
                    add(0);
                    add(0.0);
                    add(0);
                    add(0.0);
                }
            };
        } else {
            return tempArr;
        }
    }

    public void createNewFileWriter(int index, String currentDate, boolean isReconnected) throws IOException {
        dateTimeOnFileNameMap.put(index, getCurrentDateTime("yyyy/MM/dd", false));
        String reconnected = "";
        if (isReconnected) {
            reconnected = "-Reconnected";
        }
        String path = "./SavedData/" + deviceNames.get(index).getText() + "-" + addresses.get(index) + "-" + ports.get(index) + "/" + deviceNames.get(index).getText() + "-" + currentDate + reconnected + ".txt";
        File file = new File(path);
        file.getParentFile().mkdirs();
        fileWriters.put(index, new FileWriter(file));
        fileWriters.get(index).write("Date: " + getCurrentDateTime("yyyy/MM/dd", false) + "\r\n");
        fileWriters.get(index).write("Time: " + getCurrentDateTime("HH:mm:ss", false) + "\r\n");
        fileWriters.get(index).write("\r\n");
        fileWriters.get(index).write("Vibration: " + vibUnitMap.get(index) + "\r\n");
        fileWriters.get(index).write("\r\n");
        fileWriters.get(index).write("dd:hh:mm:ss     RPM#1     Vib#1     RPM#2     Vib#2     RPM#3     Vib#3\r\n");
        fileWriters.get(index).flush();
    }

    private void initializeChartData(int index) {
        chartDataMap.put(index, new HashMap<>());
        chartDataMap.get(index).put("rpm1", new XYChart.Series<>());
        chartDataMap.get(index).put("rpm2", new XYChart.Series<>());
        chartDataMap.get(index).put("rpm3", new XYChart.Series<>());
        chartDataMap.get(index).put("vib1", new XYChart.Series<>());
        chartDataMap.get(index).put("vib2", new XYChart.Series<>());
        chartDataMap.get(index).put("vib3", new XYChart.Series<>());
        chartDataMap.get(index).get("rpm1").setName("rpm1");
        chartDataMap.get(index).get("rpm2").setName("rpm2");
        chartDataMap.get(index).get("rpm3").setName("rpm3");
        chartDataMap.get(index).get("vib1").setName("vib1");
        chartDataMap.get(index).get("vib2").setName("vib2");
        chartDataMap.get(index).get("vib3").setName("vib3");
        if (chartAllocation.containsKey(index)) {
            if (maxRpmValueMap.containsKey(index)) {
                lineCharts.get(chartAllocation.get(index)).getYAxis().setAutoRanging(false);
                ((NumberAxis) lineCharts.get(chartAllocation.get(index)).getYAxis()).setUpperBound(maxRpmValueMap.get(index));
            }
            if (maxVibValueMap.containsKey(index)) {
                lineRightCharts.get(chartAllocation.get(index)).getYAxis().setAutoRanging(false);
                ((NumberAxis) lineRightCharts.get(chartAllocation.get(index)).getYAxis()).setUpperBound(maxVibValueMap.get(index));
            }
            graphLabels.get(chartAllocation.get(index)).setText(deviceNames.get(index).getText());
            if (chartConfigMap.get(index).get(0)) {
                lineCharts.get(chartAllocation.get(index)).getData().add(chartDataMap.get(index).get("rpm1"));
                chartDataMap.get(index).get("rpm1").getNode().lookup(".chart-series-line").setStyle("-fx-stroke: rgba(" + rgbFormatter(Color.DEEPSKYBLUE) + ", 1.0);");
            }
            if (chartConfigMap.get(index).get(1)) {
                lineCharts.get(chartAllocation.get(index)).getData().add(chartDataMap.get(index).get("rpm2"));
                chartDataMap.get(index).get("rpm2").getNode().lookup(".chart-series-line").setStyle("-fx-stroke: rgba(" + rgbFormatter(Color.DEEPPINK) + ", 1.0);");
            }
            if (chartConfigMap.get(index).get(2)) {
                lineCharts.get(chartAllocation.get(index)).getData().add(chartDataMap.get(index).get("rpm3"));
                chartDataMap.get(index).get("rpm3").getNode().lookup(".chart-series-line").setStyle("-fx-stroke: rgba(" + rgbFormatter(Color.SLATEGRAY) + ", 1.0);");
            }
            if (chartConfigMap.get(index).get(3)) {
                lineRightCharts.get(chartAllocation.get(index)).getData().add(chartDataMap.get(index).get("vib1"));
                chartDataMap.get(index).get("vib1").getNode().lookup(".chart-series-line").setStyle("-fx-stroke: rgba(" + rgbFormatter(Color.BLUE) + ", 1.0);");
            }
            if (chartConfigMap.get(index).get(4)) {
                lineRightCharts.get(chartAllocation.get(index)).getData().add(chartDataMap.get(index).get("vib2"));
                chartDataMap.get(index).get("vib2").getNode().lookup(".chart-series-line").setStyle("-fx-stroke: rgba(" + rgbFormatter(Color.RED) + ", 1.0);");
            }
            if (chartConfigMap.get(index).get(5)) {
                lineRightCharts.get(chartAllocation.get(index)).getData().add(chartDataMap.get(index).get("vib3"));
                chartDataMap.get(index).get("vib3").getNode().lookup(".chart-series-line").setStyle("-fx-stroke: rgba(" + rgbFormatter(Color.BLACK) + ", 1.0);");
            }
            if (!chartConfigMap.get(index).get(0) && !chartConfigMap.get(index).get(1) && !chartConfigMap.get(index).get(2)) {
                lineRightCharts.get(chartAllocation.get(index)).getYAxis().setLabel(vibUnitMap.get(index));
            }
            if (!chartConfigMap.get(index).get(3) && !chartConfigMap.get(index).get(4) && !chartConfigMap.get(index).get(5)) {
                lineCharts.get(chartAllocation.get(index)).getYAxis().setLabel("Rpm");
            }
            if ((chartConfigMap.get(index).get(0) || chartConfigMap.get(index).get(1) || chartConfigMap.get(index).get(2)) && (chartConfigMap.get(index).get(3) || chartConfigMap.get(index).get(4) || chartConfigMap.get(index).get(5))) {
                lineCharts.get(chartAllocation.get(index)).getYAxis().setLabel("Rpm");
                lineRightCharts.get(chartAllocation.get(index)).getYAxis().setLabel(vibUnitMap.get(index));

            }
        }
    }
    public String rgbFormatter(Color color) {
        return String.format("%d, %d, %d",
                (int) (color.getRed() * 255),
                (int) (color.getGreen() * 255),
                (int) (color.getBlue() * 255));
    }
    private void removingDeviceDataOnDisconnect(int i) {
        clientConn.remove(i);
        addresses.remove(i);
        deviceData.get(i).clear();
        chartConfigMap.remove(i);
        vibUnitMap.remove(i);
        vibUnitDetailedMap.remove(i);
        chartConfigMap.remove(i);
        fileWriters.remove(i);
        fileWriters.remove(i);
        totalCountMap.put(i, 0);
    }
    private void removeChartData(int i) {
        if (!disconnectBtnMap.get(i).isDisable()) {
            boxes.get(i).setOpacity(0.3);
            boxes.get(i).setFill(Color.GRAY);
            deviceNames.get(i).setText("Disconnected");
            deviceNames.get(i).setFocusTraversable(true);
        } else {
            boxes.get(i).setOpacity(0.3);
            boxes.get(i).setFill(Color.GREY);
            deviceNames.get(i).setText("Not Connected");
            deviceNames.get(i).setFocusTraversable(true);
        }
        if (chartDataMap.containsKey(i)) {
            chartDataMap.get(i).remove("rpm1");
            chartDataMap.get(i).remove("rpm2");
            chartDataMap.get(i).remove("rpm3");
            chartDataMap.get(i).remove("vib1");
            chartDataMap.get(i).remove("vib2");
            chartDataMap.get(i).remove("vib3");
        }
        disconnectBtnMap.get(i).setDisable(true);
        connAddTextFieldMap.get(i).setDisable(false);
        if (chartAllocation.containsKey(i)) {
            int chartIndex = chartAllocation.get(i);
            chartLabelMap.get(chartIndex).get(0).setText("");
            chartLabelMap.get(chartIndex).get(1).setText("");
            chartLabelMap.get(chartIndex).get(2).setText("");
            realTimeData.get(chartIndex).get(0).setText("0");
            realTimeData.get(chartIndex).get(1).setText("0");
            realTimeData.get(chartIndex).get(2).setText("0");
            realTimeData.get(chartIndex).get(3).setText("0");
            realTimeData.get(chartIndex).get(4).setText("0");
            realTimeData.get(chartIndex).get(5).setText("0");
            graphLabels.get(chartIndex).setText("Empty");
            graphPanelLabels.get(chartIndex).setText("Empty");
            chartRectangleMap.get(chartIndex).setVisible(false);
            vibUnitLabelMap.get(chartIndex).setText("Disp.Peak");
            lineRightCharts.get(chartIndex).getYAxis().setLabel("Vib");
            lineCharts.get(chartIndex).getData().clear();
            lineRightCharts.get(chartIndex).getData().clear();
            chartAllocation.remove(i);
        }
    }

    private JSONObject buildSensorDataObject(int i, String devName) {
        JSONObject body = new JSONObject("{\n" +
                "    \"extDeviceId\": \"" + devName + "\",\n" +
                "    \"dateTime\": \"" + getCurrentDateTime("yyyy-MM-dd HH:mm:ss", true) + "\",\n" +
                "}");
        if (!macAddressesMap.get(i).equals("")) {
            body.put("connectionMac", macAddressesMap.get(i));
        }
        JSONArray rawData = new JSONArray();

        JSONObject sensorObject2 = new JSONObject();
        JSONArray sensorArray2 = new JSONArray();
        sensorArray2.put(deviceData.get(i).get(deviceData.get(i).size() - 5).get(0).replaceAll(":", ""));
        sensorArray2.put(deviceData.get(i).get(deviceData.get(i).size() - 5).get(1));
        sensorArray2.put(deviceData.get(i).get(deviceData.get(i).size() - 5).get(2));
        sensorArray2.put(deviceData.get(i).get(deviceData.get(i).size() - 5).get(3));
        sensorArray2.put(deviceData.get(i).get(deviceData.get(i).size() - 5).get(4));
        sensorArray2.put(deviceData.get(i).get(deviceData.get(i).size() - 5).get(5));
        sensorArray2.put(deviceData.get(i).get(deviceData.get(i).size() - 5).get(6));
        sensorObject2.put("sensorData", sensorArray2);

        JSONObject sensorObject3 = new JSONObject();
        JSONArray sensorArray3 = new JSONArray();
        sensorArray3.put(deviceData.get(i).get(deviceData.get(i).size() - 4).get(0).replaceAll(":", ""));
        sensorArray3.put(deviceData.get(i).get(deviceData.get(i).size() - 4).get(1));
        sensorArray3.put(deviceData.get(i).get(deviceData.get(i).size() - 4).get(2));
        sensorArray3.put(deviceData.get(i).get(deviceData.get(i).size() - 4).get(3));
        sensorArray3.put(deviceData.get(i).get(deviceData.get(i).size() - 4).get(4));
        sensorArray3.put(deviceData.get(i).get(deviceData.get(i).size() - 4).get(5));
        sensorArray3.put(deviceData.get(i).get(deviceData.get(i).size() - 4).get(6));
        sensorObject3.put("sensorData", sensorArray3);

        JSONObject sensorObject4 = new JSONObject();
        JSONArray sensorArray4 = new JSONArray();
        sensorArray4.put(deviceData.get(i).get(deviceData.get(i).size() - 3).get(0).replaceAll(":", ""));
        sensorArray4.put(deviceData.get(i).get(deviceData.get(i).size() - 3).get(1));
        sensorArray4.put(deviceData.get(i).get(deviceData.get(i).size() - 3).get(2));
        sensorArray4.put(deviceData.get(i).get(deviceData.get(i).size() - 3).get(3));
        sensorArray4.put(deviceData.get(i).get(deviceData.get(i).size() - 3).get(4));
        sensorArray4.put(deviceData.get(i).get(deviceData.get(i).size() - 3).get(5));
        sensorArray4.put(deviceData.get(i).get(deviceData.get(i).size() - 3).get(6));
        sensorObject4.put("sensorData", sensorArray4);

        JSONObject sensorObject5 = new JSONObject();
        JSONArray sensorArray5 = new JSONArray();
        sensorArray5.put(deviceData.get(i).get(deviceData.get(i).size() - 2).get(0).replaceAll(":", ""));
        sensorArray5.put(deviceData.get(i).get(deviceData.get(i).size() - 2).get(1));
        sensorArray5.put(deviceData.get(i).get(deviceData.get(i).size() - 2).get(2));
        sensorArray5.put(deviceData.get(i).get(deviceData.get(i).size() - 2).get(3));
        sensorArray5.put(deviceData.get(i).get(deviceData.get(i).size() - 2).get(4));
        sensorArray5.put(deviceData.get(i).get(deviceData.get(i).size() - 2).get(5));
        sensorArray5.put(deviceData.get(i).get(deviceData.get(i).size() - 2).get(6));
        sensorObject5.put("sensorData", sensorArray5);

        JSONObject sensorObject6 = new JSONObject();
        JSONArray sensorArray6 = new JSONArray();
        sensorArray6.put(deviceData.get(i).get(deviceData.get(i).size() - 1).get(0).replaceAll(":", ""));
        sensorArray6.put(deviceData.get(i).get(deviceData.get(i).size() - 1).get(1));
        sensorArray6.put(deviceData.get(i).get(deviceData.get(i).size() - 1).get(2));
        sensorArray6.put(deviceData.get(i).get(deviceData.get(i).size() - 1).get(3));
        sensorArray6.put(deviceData.get(i).get(deviceData.get(i).size() - 1).get(4));
        sensorArray6.put(deviceData.get(i).get(deviceData.get(i).size() - 1).get(5));
        sensorArray6.put(deviceData.get(i).get(deviceData.get(i).size() - 1).get(6));
        sensorObject6.put("sensorData", sensorArray6);

        rawData.put(sensorObject2);
        rawData.put(sensorObject3);
        rawData.put(sensorObject4);
        rawData.put(sensorObject5);
        rawData.put(sensorObject6);

        body.put("rawData", rawData);
        return body;
    }

}
