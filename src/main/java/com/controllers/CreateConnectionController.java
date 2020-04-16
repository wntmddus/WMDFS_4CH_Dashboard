package main.java.com.controllers;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public class CreateConnectionController extends DashboardController implements Initializable {

    @FXML
    Button connectionCloseBtn;
    @FXML
    Button connectBtn;
    @FXML
    TextField inputAdd0;
    @FXML
    TextField inputPort0;
    @FXML
    TextField inputAdd1;
    @FXML
    TextField inputPort1;
    @FXML
    TextField inputAdd2;
    @FXML
    TextField inputPort2;
    @FXML
    TextField inputAdd3;
    @FXML
    TextField inputPort3;
    @FXML
    TextField inputAdd4;
    @FXML
    TextField inputPort4;
    @FXML
    TextField inputAdd5;
    @FXML
    TextField inputPort5;
    @FXML
    TextField inputAdd6;
    @FXML
    TextField inputPort6;
    @FXML
    TextField inputAdd7;
    @FXML
    TextField inputPort7;
    @FXML
    TextField inputAdd8;
    @FXML
    TextField inputPort8;
    @FXML
    TextField inputAdd9;
    @FXML
    TextField inputPort9;
    @FXML
    TextField inputAdd10;
    @FXML
    TextField inputPort10;
    @FXML
    TextField inputAdd11;
    @FXML
    TextField inputPort11;
    @FXML
    TextField inputAdd12;
    @FXML
    TextField inputPort12;
    @FXML
    TextField inputAdd13;
    @FXML
    TextField inputPort13;
    @FXML
    TextField inputAdd14;
    @FXML
    TextField inputPort14;
    @FXML
    TextField inputAdd15;
    @FXML
    TextField inputPort15;
    @FXML
    TextField inputAdd16;
    @FXML
    TextField inputPort16;
    @FXML
    TextField inputAdd17;
    @FXML
    TextField inputPort17;
    @FXML
    TextField inputAdd18;
    @FXML
    TextField inputPort18;
    @FXML
    TextField inputAdd19;
    @FXML
    TextField inputPort19;
    @FXML
    Button disconnect0;
    @FXML
    Button disconnect1;
    @FXML
    Button disconnect2;
    @FXML
    Button disconnect3;
    @FXML
    Button disconnect4;
    @FXML
    Button disconnect5;
    @FXML
    Button disconnect6;
    @FXML
    Button disconnect7;
    @FXML
    Button disconnect8;
    @FXML
    Button disconnect9;
    @FXML
    Button disconnect10;
    @FXML
    Button disconnect11;
    @FXML
    Button disconnect12;
    @FXML
    Button disconnect13;
    @FXML
    Button disconnect14;
    @FXML
    Button disconnect15;
    @FXML
    Button disconnect16;
    @FXML
    Button disconnect17;
    @FXML
    Button disconnect18;
    @FXML
    Button disconnect19;
    @FXML
    Label deviceConnNum0;
    @FXML
    Label deviceConnNum1;
    @FXML
    Label deviceConnNum2;
    @FXML
    Label deviceConnNum3;
    @FXML
    Label deviceConnNum4;
    @FXML
    Label deviceConnNum5;
    @FXML
    Label deviceConnNum6;
    @FXML
    Label deviceConnNum7;
    @FXML
    Label deviceConnNum8;
    @FXML
    Label deviceConnNum9;
    @FXML
    Label deviceConnNum10;
    @FXML
    Label deviceConnNum11;
    @FXML
    Label deviceConnNum12;
    @FXML
    Label deviceConnNum13;
    @FXML
    Label deviceConnNum14;
    @FXML
    Label deviceConnNum15;
    @FXML
    Label deviceConnNum16;
    @FXML
    Label deviceConnNum17;
    @FXML
    Label deviceConnNum18;
    @FXML
    Label deviceConnNum19;
    @FXML
    Button disconnectAllBtn;
    @FXML
    CheckBox connChkBox0;
    @FXML
    CheckBox connChkBox1;
    @FXML
    CheckBox connChkBox2;
    @FXML
    CheckBox connChkBox3;
    @FXML
    CheckBox connChkBox4;
    @FXML
    CheckBox connChkBox5;
    @FXML
    CheckBox connChkBox6;
    @FXML
    CheckBox connChkBox7;
    @FXML
    CheckBox connChkBox8;
    @FXML
    CheckBox connChkBox9;
    @FXML
    CheckBox connChkBox10;
    @FXML
    CheckBox connChkBox11;
    @FXML
    CheckBox connChkBox12;
    @FXML
    CheckBox connChkBox13;
    @FXML
    CheckBox connChkBox14;
    @FXML
    CheckBox connChkBox15;
    @FXML
    CheckBox connChkBox16;
    @FXML
    CheckBox connChkBox17;
    @FXML
    CheckBox connChkBox18;
    @FXML
    CheckBox connChkBox19;
    @FXML
    CheckBox connChkBox20;





    @Override
    public void initialize(URL url, ResourceBundle rb) {
        connAddTextFieldMap.put(0, inputAdd0);
        connAddTextFieldMap.put(1, inputAdd1);
        connAddTextFieldMap.put(2, inputAdd2);
        connAddTextFieldMap.put(3, inputAdd3);
        connAddTextFieldMap.put(4, inputAdd4);
        connAddTextFieldMap.put(5, inputAdd5);
        connAddTextFieldMap.put(6, inputAdd6);
        connAddTextFieldMap.put(7, inputAdd7);
        connAddTextFieldMap.put(8, inputAdd8);
        connAddTextFieldMap.put(9, inputAdd9);
        connAddTextFieldMap.put(10, inputAdd10);
        connAddTextFieldMap.put(11, inputAdd11);
        connAddTextFieldMap.put(12, inputAdd12);
        connAddTextFieldMap.put(13, inputAdd13);
        connAddTextFieldMap.put(14, inputAdd14);
        connAddTextFieldMap.put(15, inputAdd15);
        connAddTextFieldMap.put(16, inputAdd16);
        connAddTextFieldMap.put(17, inputAdd17);
        connAddTextFieldMap.put(18, inputAdd18);
        connAddTextFieldMap.put(19, inputAdd19);
        connPortTextFieldMap.put(0, inputPort0);
        connPortTextFieldMap.put(1, inputPort1);
        connPortTextFieldMap.put(2, inputPort2);
        connPortTextFieldMap.put(3, inputPort3);
        connPortTextFieldMap.put(4, inputPort4);
        connPortTextFieldMap.put(5, inputPort5);
        connPortTextFieldMap.put(6, inputPort6);
        connPortTextFieldMap.put(7, inputPort7);
        connPortTextFieldMap.put(8, inputPort8);
        connPortTextFieldMap.put(9, inputPort9);
        connPortTextFieldMap.put(10, inputPort10);
        connPortTextFieldMap.put(11, inputPort11);
        connPortTextFieldMap.put(12, inputPort12);
        connPortTextFieldMap.put(13, inputPort13);
        connPortTextFieldMap.put(14, inputPort14);
        connPortTextFieldMap.put(15, inputPort15);
        connPortTextFieldMap.put(16, inputPort16);
        connPortTextFieldMap.put(17, inputPort17);
        connPortTextFieldMap.put(18, inputPort18);
        connPortTextFieldMap.put(19, inputPort19);
        disconnectBtnMap.put(0, disconnect0);
        disconnectBtnMap.put(1, disconnect1);
        disconnectBtnMap.put(2, disconnect2);
        disconnectBtnMap.put(3, disconnect3);
        disconnectBtnMap.put(4, disconnect4);
        disconnectBtnMap.put(5, disconnect5);
        disconnectBtnMap.put(6, disconnect6);
        disconnectBtnMap.put(7, disconnect7);
        disconnectBtnMap.put(8, disconnect8);
        disconnectBtnMap.put(9, disconnect9);
        disconnectBtnMap.put(10, disconnect10);
        disconnectBtnMap.put(11, disconnect11);
        disconnectBtnMap.put(12, disconnect12);
        disconnectBtnMap.put(13, disconnect13);
        disconnectBtnMap.put(14, disconnect14);
        disconnectBtnMap.put(15, disconnect15);
        disconnectBtnMap.put(16, disconnect16);
        disconnectBtnMap.put(17, disconnect17);
        disconnectBtnMap.put(18, disconnect18);
        disconnectBtnMap.put(19, disconnect19);
        deviceConnNumMap.put(0, deviceConnNum0);
        deviceConnNumMap.put(1, deviceConnNum1);
        deviceConnNumMap.put(2, deviceConnNum2);
        deviceConnNumMap.put(3, deviceConnNum3);
        deviceConnNumMap.put(4, deviceConnNum4);
        deviceConnNumMap.put(5, deviceConnNum5);
        deviceConnNumMap.put(6, deviceConnNum6);
        deviceConnNumMap.put(7, deviceConnNum7);
        deviceConnNumMap.put(8, deviceConnNum8);
        deviceConnNumMap.put(9, deviceConnNum9);
        deviceConnNumMap.put(10, deviceConnNum10);
        deviceConnNumMap.put(11, deviceConnNum11);
        deviceConnNumMap.put(12, deviceConnNum12);
        deviceConnNumMap.put(13, deviceConnNum13);
        deviceConnNumMap.put(14, deviceConnNum14);
        deviceConnNumMap.put(15, deviceConnNum15);
        deviceConnNumMap.put(16, deviceConnNum16);
        deviceConnNumMap.put(17, deviceConnNum17);
        deviceConnNumMap.put(18, deviceConnNum18);
        deviceConnNumMap.put(19, deviceConnNum19);
        connChkBoxMap.put(0, connChkBox0);
        connChkBoxMap.put(1, connChkBox1);
        connChkBoxMap.put(2, connChkBox2);
        connChkBoxMap.put(3, connChkBox3);
        connChkBoxMap.put(4, connChkBox4);
        connChkBoxMap.put(5, connChkBox5);
        connChkBoxMap.put(6, connChkBox6);
        connChkBoxMap.put(7, connChkBox7);
        connChkBoxMap.put(8, connChkBox8);
        connChkBoxMap.put(9, connChkBox9);
        connChkBoxMap.put(10, connChkBox10);
        connChkBoxMap.put(11, connChkBox11);
        connChkBoxMap.put(12, connChkBox12);
        connChkBoxMap.put(13, connChkBox13);
        connChkBoxMap.put(14, connChkBox14);
        connChkBoxMap.put(15, connChkBox15);
        connChkBoxMap.put(16, connChkBox16);
        connChkBoxMap.put(17, connChkBox17);
        connChkBoxMap.put(18, connChkBox18);
        connChkBoxMap.put(19, connChkBox19);
        disconnectAllBtnGlobal = disconnectAllBtn;
        Platform.runLater(() -> {
            for(Map.Entry<Integer, Socket> entry : clientConn.entrySet()) {
                if(entry.getValue().isConnected()) {
                    connAddTextFieldMap.get(entry.getKey()).setDisable(true);
                    connPortTextFieldMap.get(entry.getKey()).setDisable(true);
                    disconnectBtnMap.get(entry.getKey()).setDisable(false);
                    disconnectAllBtnGlobal.setDisable(false);
                }
            }
            for(int i = 0; i < MAX_DEVICE_NUMBER; i++) {
                connChkBoxMap.get(i).setSelected(connChkBoxStatusMap.get(i));
                if (addresses.containsKey(i) && ports.containsKey(i)) {
                    connAddTextFieldMap.get(i).setText(addresses.get(i));
                    connPortTextFieldMap.get(i).setText(ports.get(i));
                }
                if (!pref.get("address" + i, "root").equals("root") && !pref.get("port" + i, "root").equals("root")) {
                    connAddTextFieldMap.get(i).setText(pref.get("address" + i, "root"));
                    connPortTextFieldMap.get(i).setText(pref.get("port" + i, "root"));
                }
            }
        });
    }

    private Stage stage;

    public void setStage(Stage stage) {
        this.stage = stage;
    }


    @FXML
    void onClose() {
        stage.close();
    }

    @FXML
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

    @FXML
    void handleOnCheckBoxClick(ActionEvent event) {
//        CheckBox chkBox = ((CheckBox)(event.getSource()));
//        String chkBoxId = chkBox.getId();
//        int index;
//        if (chkBoxId.length() == 11) {
//            index = Character.getNumericValue(chkBoxId.charAt(chkBoxId.length() - 1));
//        } else {
//            index = Integer.parseInt(chkBoxId.substring(chkBoxId.length() - 2));
//        }
//        if (((CheckBox)(event.getSource())).isSelected()) {
//            connChkBoxStatusMap.put(index, true);
//        } else {
//            connChkBoxStatusMap.put(index, false);
//        }
    }

    @FXML
    void handleOnDisconnect(ActionEvent event) {
        Button btn = ((Button)(event.getSource()));
        String btnId = btn.getId();
        int index;
        if (btnId.length() == 11) {
            index = Character.getNumericValue(btnId.charAt(btnId.length() - 1));
        } else {
            index = Integer.parseInt(btnId.substring(btnId.length() - 2));
        }
        Platform.runLater(() -> {
            btn.setDisable(true);
        });
        try {
            isDisconnecting.set(index, true);
            outputList.get(index).writeBytes("STOP\0");
            outputList.get(index).writeBytes("NO CARRIER\0");
            clientConn.get(index).close();
        } catch (IOException e) {
            e.printStackTrace();
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
                        sock.connect(new InetSocketAddress(addresses.get(i), Integer.parseInt(ports.get(i))), 5000);
                        sock.setSoTimeout(5000);
                        if (sock.isConnected()) {
                            try {
                                clientConn.put(i, sock);
                                outputList.put(i, new DataOutputStream(sock.getOutputStream()));
                                inputList.put(i, new DataInputStream(sock.getInputStream()));
                                deviceData.put(i, new ArrayList<>());
                                outputList.get(i).writeBytes("GET DEVNAME\0");
                                String devName = inputList.get(i).  readLine();
                                outputList.get(i).writeBytes("GET STATE\0");
                                String devState = inputList.get(i).readLine();
                                outputList.get(i).writeBytes("GET SETTING\0");
                                String vibSetting = inputList.get(i).readLine();
                                vibUnitMap.put(i, vibSetting.substring(12));
                                maxRpmValueMap.put(i, 1200);
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
                                    addressLabels.get(i).setText(addresses.get(i) + ":" + ports.get(i));
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
                                        line = reconnectOnSocketFailure(i);
                                    }
                                    if (fileWriters.containsKey(i) && recCheckboxArray.get(i).isSelected()) {
                                        if (line.contains(":24:00:00")) {
                                            createNewFileWriter(i, getCurrentDateTime("yyyy-MM-dd-HH.mm.ss"), false);
                                        }
                                        fileWriters.get(i).write(line + "\r\n");
                                        fileWriters.get(i).flush();
                                    }
                                    List<String> arr = Arrays.asList(line.split("\\s+"));
                                    if (deviceData.get(i).size() > 3600) deviceData.get(i).remove(0);
                                    deviceData.get(i).add(arr);
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
                                        createNewFileWriter(i, getCurrentDateTime("yyyy-MM-dd-HH.mm.ss"), false);
                                        chartDataMap.get(i).remove("rpm1");
                                        chartDataMap.get(i).remove("rpm2");
                                        chartDataMap.get(i).remove("rpm3");
                                        chartDataMap.get(i).remove("vib1");
                                        chartDataMap.get(i).remove("vib2");
                                        chartDataMap.get(i).remove("vib3");
                                        deviceData.get(i).clear();
                                        Platform.runLater(() -> {
                                            if (chartAllocation.containsKey(i)) {
                                                lineRightCharts.get(chartAllocation.get(i)).getData().clear();
                                                lineCharts.get(chartAllocation.get(i)).getData().clear();
                                            }
                                            initializeChartData(i);
                                        });
                                        outputList.get(i).writeBytes("STOP\0");
                                        TimeUnit.MILLISECONDS.sleep(300);
                                        outputList.get(i).writeBytes("REC\0");
                                        TimeUnit.MILLISECONDS.sleep(300);
                                        isRecordingAll.put(i, false);
                                    } else {
                                        outputList.get(i).writeBytes("1\0");
                                    }
                                    TimeUnit.MILLISECONDS.sleep(600);
                                    counter++;
                                }
                            } catch (IOException | InterruptedException e) {
                                System.err.println("Timed out waiting for the socket while in Execute Thread");
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
                                    removeChartData(i);
                                    removingDeviceDataOnDisconnect(i);
                                });
                                e.printStackTrace();
                            }
                        }
                    } catch (IOException e) {
                        System.err.println("Timed out waiting for the socket on connection");
                        addresses.remove(i);
                        ports.remove(i);
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
    private void handleOnSave() throws IOException {
        for (Map.Entry<Integer, TextField> entry : connAddTextFieldMap.entrySet()) {
            pref.put("address" + entry.getKey(), entry.getValue().getText());
            pref.put("port" + entry.getKey(), connPortTextFieldMap.get(entry.getKey()).getText());
            if (connChkBoxMap.get(entry.getKey()).isSelected()) {
                connChkBoxStatusMap.put(entry.getKey(), true);
            } else {
                connChkBoxStatusMap.put(entry.getKey(), false);
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
    private void handleOnDisconnectAll() throws InterruptedException {
        Platform.runLater(() -> {
            disconnectAllBtn.setDisable(true);
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

    @FXML
    private void handleOnReset() throws IOException {
        for (Map.Entry<Integer, TextField> entry : connAddTextFieldMap.entrySet()) {
            if (!entry.getValue().getText().equals("")) {
                pref.remove("address" + entry.getKey());
                pref.remove("port" + entry.getKey());
                pref.remove("chartConfig" + entry.getKey());
                chartConfigMap.remove(entry.getKey());
                if (!clientConn.containsKey(entry.getKey())) {
                    addresses.remove(entry.getKey());
                    ports.remove(entry.getKey());
                    connPortTextFieldMap.get(entry.getKey()).setText("");
                    connAddTextFieldMap.get(entry.getKey()).setText("");
                }
                connChkBoxStatusMap.put(entry.getKey(), true);
            }
        }
//        for (Map.Entry<Integer, String> entry : addresses.entrySet()) {
//            pref.remove("address" + entry.getKey());
//            pref.remove("port" + entry.getKey());
//            if (!clientConn.containsKey(entry.getKey())) {
//                addresses.remove(entry.getKey());
//                ports.remove(entry.getKey());
//                connPortTextFieldMap.get(entry.getKey()).setText("");
//                connAddTextFieldMap.get(entry.getKey()).setText("");
//            }
//            pref.remove("chartConfig" + entry.getKey());
//            chartConfigMap.remove(entry.getKey());
//        }
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

    private void removingDeviceDataOnDisconnect(int i) {
        clientConn.remove(i);
        addresses.remove(i);
        ports.remove(i);
        deviceData.get(i).clear();
        vibUnitMap.remove(i);
        vibUnitDetailedMap.remove(i);
        chartConfigMap.remove(i);
        fileWriters.remove(i);
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
        } else {
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

    private String reconnectOnSocketFailure(int i) throws IOException, InterruptedException {
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
                newSock.connect(new InetSocketAddress(addresses.get(i), Integer.parseInt(ports.get(i))), 1000);
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
                    createNewFileWriter(i, getCurrentDateTime("yyyy-MM-dd-HH.mm.ss"), true);
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
            if (!line.equals("")) return line;
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
        chartDataMap.get(i).remove("rpm1");
        chartDataMap.get(i).remove("rpm2");
        chartDataMap.get(i).remove("rpm3");
        chartDataMap.get(i).remove("vib1");
        chartDataMap.get(i).remove("vib2");
        chartDataMap.get(i).remove("vib3");
        disconnectBtnMap.get(i).setDisable(true);
        connAddTextFieldMap.get(i).setDisable(false);
        connPortTextFieldMap.get(i).setDisable(false);
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

    private void extractInformationFromTextField() {
        for (int i = 0; i < MAX_DEVICE_NUMBER; i++) {
            if (!connAddTextFieldMap.get(i).getText().isEmpty() && !connPortTextFieldMap.get(i).getText().isEmpty()) {
                addresses.put(i, connAddTextFieldMap.get(i).getText());
                ports.put(i, connPortTextFieldMap.get(i).getText());
            }
        }
    }
}
