package com.controllers;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import com.Main;
import com.util.SharedStorage;

import javax.sound.sampled.Line;
import java.io.*;
import java.net.*;
import java.nio.Buffer;
import java.util.*;
import java.util.concurrent.TimeUnit;

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
        clientConn.entrySet().iterator();
        for(Map.Entry<Integer, Socket> entry : clientConn.entrySet()) {
            if(entry.getValue().isConnected()) {
                Platform.runLater(() -> {
                    connAddTextFieldMap.get(entry.getKey()).setDisable(true);
                    connPortTextFieldMap.get(entry.getKey()).setDisable(true);
                    disconnectBtnMap.get(entry.getKey()).setDisable(false);
                });
            }
        }

        System.out.println(disconnectBtnMap.size());

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
    void handleOnConnect(ActionEvent event) {
        extractInformationFromTextField();
        connectValidAddressesToTCP();
        System.out.println(clientConn);
        stage.close();
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
        btn.setDisable(true);
        try {
            clientConn.get(index).close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    void executeFetching(int i, Socket sock) {
        Runnable task = () -> {
            try {
                int counter = 0;
                while (sock.isConnected()) {
                    outputList.get(i).writeChars("REC");
                    String line = "";
                    try {
                        line = inputList.get(i).readLine();
                    } catch (IOException e) {
                        System.err.println("Timed out waiting for the socket in input ReadLine" + i);
                        Thread.sleep(10000);
                        Socket newSock = new Socket();
                        newSock.connect(new InetSocketAddress(addresses.get(i), Integer.parseInt(ports.get(i))), 1000);
                        newSock.setSoTimeout(3000);
                        if (newSock.isConnected()) {
                            System.out.println("Connected " + newSock);
                            clientConn.put(i, newSock);
                            System.out.println("Assigning Input Output Stream");
                            outputList.put(i, new DataOutputStream(newSock.getOutputStream()));
                            inputList.put(i, new DataInputStream(newSock.getInputStream()));
                        }
                    }


                    List<String> arr = Arrays.asList(line.split("\\s+"));
                    if (deviceData.get(i).size() > 3600) {
                        deviceData.get(i).remove(0);
                    }
                    deviceData.get(i).add(arr);
                    int finalCounter = counter;
                    Platform.runLater(() -> {
                        if (!arr.isEmpty()) {
                            System.out.println(arr);
                            updateRealtimeDataUpdatePanel(arr, chartAllocation.get(i));
                            if (chartAllocation.containsKey(i) && finalCounter % 6 == 0) {
                                if (chartDataMap.get(i).get("rpm1").getData().size() > 600) {
                                    chartDataMap.get(i).get("rpm1").getData().remove(0);
                                    chartDataMap.get(i).get("rpm2").getData().remove(0);
                                    chartDataMap.get(i).get("rpm3").getData().remove(0);
                                    chartDataMap.get(i).get("vib1").getData().remove(0);
                                    chartDataMap.get(i).get("vib2").getData().remove(0);
                                    chartDataMap.get(i).get("vib3").getData().remove(0);
                                }
                                chartDataMap.get(i).get("rpm1").getData().add(new XYChart.Data<>(arr.get(0).substring(3), Integer.parseInt(arr.get(1))));
                                chartDataMap.get(i).get("rpm2").getData().add(new XYChart.Data<>(arr.get(0).substring(3), Integer.parseInt(arr.get(3))));
                                chartDataMap.get(i).get("rpm3").getData().add(new XYChart.Data<>(arr.get(0).substring(3), Integer.parseInt(arr.get(5))));
                                chartDataMap.get(i).get("vib1").getData().add(new XYChart.Data<>(arr.get(0).substring(3), Float.valueOf(arr.get(2))));
                                chartDataMap.get(i).get("vib2").getData().add(new XYChart.Data<>(arr.get(0).substring(3), Float.valueOf(arr.get(4))));
                                chartDataMap.get(i).get("vib3").getData().add(new XYChart.Data<>(arr.get(0).substring(3), Float.valueOf(arr.get(6))));
                            }
                        }
                    });
                    counter++;
                    TimeUnit.MILLISECONDS.sleep(600);
                }
            } catch (IOException | InterruptedException e) {
                System.err.println("Timed out waiting for the socket while in Execute Thread");
                e.printStackTrace();
                clientConn.remove(i);
                addresses.remove(i);
                ports.remove(i);
                deviceData.get(i).clear();
                Platform.runLater(() -> {
                    deviceNames.get(i).setText("Disconnected");
                    deviceNames.get(i).setTextFill(Color.RED);
                });
            }
        };

        Thread backgroundThread = new Thread(task);
        backgroundThread.setDaemon(true);
        backgroundThread.start();
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
            if(!clientConn.containsKey(i)) {
                // create a socket with a timeout
                Runnable task = () -> {
                    try {
                        // create and store Socket
                        Socket sock = new Socket();
                        sock.connect(new InetSocketAddress(addresses.get(i), Integer.parseInt(ports.get(i))), 2000);
                        sock.setSoTimeout(3000);
                        if (sock.isConnected()) {
                            try {
                                System.out.println("Connected " + sock);
                                clientConn.put(i, sock);
                                System.out.println("Assigning Input Output Stream");
                                outputList.put(i, new DataOutputStream(sock.getOutputStream()));
                                inputList.put(i, new DataInputStream(sock.getInputStream()));
                                deviceData.put(i, new ArrayList<>());
                                if (chartAllocation.size() <= 8) {
                                    for (int j = 0; j < 8; j++) {
                                        if (!chartAllocation.containsValue(j)) {
                                            chartAllocation.put(i, j);
                                            break;
                                        }
                                    }
                                }
                                Platform.runLater(() -> {
                                    deviceNames.get(i).setText("Connected");
                                    deviceNames.get(i).setTextFill(Color.GREEN);
                                    disconnectBtnMap.get(i).setDisable(false);
                                    deviceConnNumMap.get(i).setTextFill(Color.BLACK);
                                    initializeChartData(i);
                                });
                                int counter = 0;
                                while (sock.isConnected()) {
                                    outputList.get(i).writeChars("REC");
                                    String line = "";
                                    try {
                                        line = inputList.get(i).readLine();
                                    } catch (IOException e) {
                                        System.err.println("Timed out waiting for the socket in input ReadLine" + i);
                                        sock = reconnectOnSocketFailure(i, sock);
                                    }
                                    List<String> arr = Arrays.asList(line.split("\\s+"));
                                    if (deviceData.get(i).size() > 3600) deviceData.get(i).remove(0);
                                    deviceData.get(i).add(arr);
                                    int finalCounter = counter;
                                    System.out.println(!arr.isEmpty());
                                    if (arr.size() == 7) {
                                        System.out.println(arr);
                                        Platform.runLater(() -> {
                                            updateRealtimeDataUpdatePanel(arr, chartAllocation.get(i));
                                            sliceChartData(arr, i, finalCounter);
                                        });
                                    }
                                    counter++;
                                    TimeUnit.MILLISECONDS.sleep(600);
                                }
                            } catch (IOException | InterruptedException e) {
                                System.err.println("Timed out waiting for the socket while in Execute Thread");
                                e.printStackTrace();
                                clientConn.remove(i);
                                addresses.remove(i);
                                ports.remove(i);
                                deviceData.get(i).clear();
                                Platform.runLater(() -> {
                                    removeChartData(i);
                                });
                            }
                        }
                    } catch (IOException e) {
                        System.err.println("Timed out waiting for the socket on connection");
                        addresses.remove(i);
                        ports.remove(i);
                        Platform.runLater(() -> {
                            deviceConnNumMap.get(i).setTextFill(Color.RED);
                            deviceNames.get(i).setTextFill(Color.RED);
                            deviceNames.get(i).setText("Not Connected");

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

    private Socket reconnectOnSocketFailure(int i, Socket sock) throws IOException, InterruptedException {
        if(!disconnectBtnMap.get(i).isDisable()) {
            Thread.sleep(10000);
            System.out.println("DisableBtn: " + disconnectBtnMap.get(i).isDisable());
            Socket newSock = new Socket();
            newSock.connect(new InetSocketAddress(addresses.get(i), Integer.parseInt(ports.get(i))), 1000);
            newSock.setSoTimeout(2000);
            if (newSock.isConnected()) {
                clientConn.put(i, newSock);
                outputList.put(i, new DataOutputStream(newSock.getOutputStream()));
                inputList.put(i, new DataInputStream(newSock.getInputStream()));
                clientConn.put(i, newSock);
                return newSock;
            }
        }
        return sock;
    }

    private void sliceChartData(List<String> arr, int i, int counter) {
        if (chartAllocation.containsKey(i) && counter % 6 == 0) {
            if (chartDataMap.get(i).get("rpm1").getData().size() > 600) {
                chartDataMap.get(i).get("rpm1").getData().remove(0);
                chartDataMap.get(i).get("rpm2").getData().remove(0);
                chartDataMap.get(i).get("rpm3").getData().remove(0);
                chartDataMap.get(i).get("vib1").getData().remove(0);
                chartDataMap.get(i).get("vib2").getData().remove(0);
                chartDataMap.get(i).get("vib3").getData().remove(0);
            }
            chartDataMap.get(i).get("rpm1").getData().add(new XYChart.Data<>(arr.get(0).substring(3), Integer.parseInt(arr.get(1))));
            chartDataMap.get(i).get("rpm2").getData().add(new XYChart.Data<>(arr.get(0).substring(3), Integer.parseInt(arr.get(3))));
            chartDataMap.get(i).get("rpm3").getData().add(new XYChart.Data<>(arr.get(0).substring(3), Integer.parseInt(arr.get(5))));
            chartDataMap.get(i).get("vib1").getData().add(new XYChart.Data<>(arr.get(0).substring(3), Float.valueOf(arr.get(2))));
            chartDataMap.get(i).get("vib2").getData().add(new XYChart.Data<>(arr.get(0).substring(3), Float.valueOf(arr.get(4))));
            chartDataMap.get(i).get("vib3").getData().add(new XYChart.Data<>(arr.get(0).substring(3), Float.valueOf(arr.get(6))));
        }
    }

    private void removeChartData(int i) {
        int chartIndex = chartAllocation.get(i);
        if (!disconnectBtnMap.get(i).isDisable()) {
            deviceNames.get(i).setText("Disconnected");
            deviceNames.get(i).setTextFill(Color.RED);
        } else {
            deviceNames.get(i).setText("Not Connected");
            deviceNames.get(i).setTextFill(Color.BLACK);
        }
        chartDataMap.get(i).remove("rpm1");
        chartDataMap.get(i).remove("rpm2");
        chartDataMap.get(i).remove("rpm3");
        chartDataMap.get(i).remove("vib1");
        chartDataMap.get(i).remove("vib2");
        chartDataMap.get(i).remove("vib3");
        chartLabelMap.get(chartIndex).get(0).setText("");
        chartLabelMap.get(chartIndex).get(1).setText("");
        chartLabelMap.get(chartIndex).get(2).setText("");
        disconnectBtnMap.get(i).setDisable(true);
        connAddTextFieldMap.get(i).setDisable(false);
        connPortTextFieldMap.get(i).setDisable(false);
        connAddTextFieldMap.get(i).setText("");
        connPortTextFieldMap.get(i).setText("");
        realTimeData.get(chartIndex).get(0).setText("0");
        realTimeData.get(chartIndex).get(1).setText("0");
        realTimeData.get(chartIndex).get(2).setText("0");
        realTimeData.get(chartIndex).get(3).setText("0");
        realTimeData.get(chartIndex).get(4).setText("0");
        realTimeData.get(chartIndex).get(5).setText("0");
        graphLabels.get(chartIndex).setText("Empty");
        chartRectangleMap.get(chartIndex).setVisible(false);
        lineCharts.get(chartIndex).getData().clear();
        chartAllocation.remove(i);
    }

    private String rgbFormatter(Color color) {
        return String.format("%d, %d, %d",
                (int) (color.getRed() * 255),
                (int) (color.getGreen() * 255),
                (int) (color.getBlue() * 255));
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
        graphLabels.get(chartAllocation.get(index)).setText("Dev# " + index);
        if (chartAllocation.containsKey(index)) {
            lineCharts.get(chartAllocation.get(index)).getData().add(chartDataMap.get(index).get("rpm1"));
            lineCharts.get(chartAllocation.get(index)).getData().add(chartDataMap.get(index).get("rpm2"));
            lineCharts.get(chartAllocation.get(index)).getData().add(chartDataMap.get(index).get("rpm3"));
            lineCharts.get(chartAllocation.get(index)).getData().add(chartDataMap.get(index).get("vib1"));
            lineCharts.get(chartAllocation.get(index)).getData().add(chartDataMap.get(index).get("vib2"));
            lineCharts.get(chartAllocation.get(index)).getData().add(chartDataMap.get(index).get("vib3"));
        }
//        chartDataMap.get(index).get("rpm1").getNode().lookup(".chart-series-line").setStyle("-fx-stroke: rgba(" + rgbFormatter(Color.CYAN) + ", 1.0);");
//        chartDataMap.get(index).get("rpm2").getNode().lookup(".chart-series-line").setStyle("-fx-stroke: rgba(" + rgbFormatter(Color.PINK) + ", 1.0);");
//        chartDataMap.get(index).get("rpm3").getNode().lookup(".chart-series-line").setStyle("-fx-stroke: rgba(" + rgbFormatter(Color.DARKGRAY) + ", 1.0);");
//        chartDataMap.get(index).get("vib1").getNode().lookup(".chart-series-line").setStyle("-fx-stroke: rgba(" + rgbFormatter(Color.BLUE) + ", 1.0);");
//        chartDataMap.get(index).get("vib2").getNode().lookup(".chart-series-line").setStyle("-fx-stroke: rgba(" + rgbFormatter(Color.RED) + ", 1.0);");
//        chartDataMap.get(index).get("vib3").getNode().lookup(".chart-series-line").setStyle("-fx-stroke: rgba(" + rgbFormatter(Color.BLACK) + ", 1.0);");
//        chartDataMap.get(index).get("rpm1").getNode().lookup(".chart-line-symbol").setStyle("-fx-background-color: rgba(" + rgbFormatter(Color.CYAN) + ", 1.0);");
//        chartDataMap.get(index).get("rpm2").getNode().lookup(".chart-line-symbol").setStyle("-fx-background-color: rgba(" + rgbFormatter(Color.PINK) + ", 1.0);");
//        chartDataMap.get(index).get("rpm3").getNode().lookup(".chart-line-symbol").setStyle("-fx-background-color: rgba(" + rgbFormatter(Color.DARKGRAY) + ", 1.0);");
//        chartDataMap.get(index).get("vib1").getNode().lookup(".chart-line-symbol").setStyle("-fx-background-color: rgba(" + rgbFormatter(Color.BLUE) + ", 1.0);");
//        chartDataMap.get(index).get("vib2").getNode().lookup(".chart-line-symbol").setStyle("-fx-background-color: rgba(" + rgbFormatter(Color.RED) + ", 1.0);");
//        chartDataMap.get(index).get("vib3").getNode().lookup(".chart-line-symbol").setStyle("-fx-background-color: rgba(" + rgbFormatter(Color.BLACK) + ", 1.0);");
    }

    private void extractInformationFromTextField() {
        if (!inputAdd0.getText().isEmpty() && !inputPort0.getText().isEmpty()) {
            addresses.put(0, inputAdd0.getText());
            ports.put(0, inputPort0.getText());
        }
        if (!inputAdd1.getText().isEmpty() && !inputPort1.getText().isEmpty()) {
            addresses.put(1, inputAdd1.getText());
            ports.put(1, inputPort1.getText());
        }
        if (!inputAdd2.getText().isEmpty() && !inputPort2.getText().isEmpty()) {
            addresses.put(2, inputAdd2.getText());
            ports.put(2, inputPort2.getText());
        }
        if (!inputAdd3.getText().isEmpty() && !inputPort3.getText().isEmpty()) {
            addresses.put(3, inputAdd3.getText());
            ports.put(3, inputPort3.getText());
        }
        if (!inputAdd4.getText().isEmpty() && !inputPort4.getText().isEmpty()) {
            addresses.put(4, inputAdd4.getText());
            ports.put(4, inputPort4.getText());
        }
        if (!inputAdd5.getText().isEmpty() && !inputPort5.getText().isEmpty()) {
            addresses.put(5, inputAdd5.getText());
            ports.put(5, inputPort5.getText());
        }
        if (!inputAdd6.getText().isEmpty() && !inputPort6.getText().isEmpty()) {
            addresses.put(6, inputAdd6.getText());
            ports.put(6, inputPort6.getText());
        }
        if (!inputAdd7.getText().isEmpty() && !inputPort7.getText().isEmpty()) {
            addresses.put(7, inputAdd7.getText());
            ports.put(7, inputPort7.getText());
        }
        if (!inputAdd8.getText().isEmpty() && !inputPort8.getText().isEmpty()) {
            addresses.put(8, inputAdd8.getText());
            ports.put(8, inputPort8.getText());
        }
        if (!inputAdd9.getText().isEmpty() && !inputPort9.getText().isEmpty()) {
            addresses.put(9, inputAdd9.getText());
            ports.put(9, inputPort9.getText());
        }
        if (!inputAdd10.getText().isEmpty() && !inputPort10.getText().isEmpty()) {
            addresses.put(10, inputAdd10.getText());
            ports.put(10, inputPort10.getText());
        }
        if (!inputAdd11.getText().isEmpty() && !inputPort11.getText().isEmpty()) {
            addresses.put(11, inputAdd11.getText());
            ports.put(11, inputPort11.getText());
        }
        if (!inputAdd12.getText().isEmpty() && !inputPort12.getText().isEmpty()) {
            addresses.put(12, inputAdd12.getText());
            ports.put(12, inputPort12.getText());
        }
        if (!inputAdd13.getText().isEmpty() && !inputPort13.getText().isEmpty()) {
            addresses.put(13, inputAdd13.getText());
            ports.put(13, inputPort13.getText());
        }
        if (!inputAdd14.getText().isEmpty() && !inputPort14.getText().isEmpty()) {
            addresses.put(14, inputAdd14.getText());
            ports.put(14, inputPort14.getText());
        }
        if (!inputAdd15.getText().isEmpty() && !inputPort15.getText().isEmpty()) {
            addresses.put(15, inputAdd15.getText());
            ports.put(15, inputPort15.getText());
        }
        if (!inputAdd16.getText().isEmpty() && !inputPort16.getText().isEmpty()) {
            addresses.put(16, inputAdd16.getText());
            ports.put(16, inputPort16.getText());
        }
        if (!inputAdd17.getText().isEmpty() && !inputPort17.getText().isEmpty()) {
            addresses.put(17, inputAdd17.getText());
            ports.put(17, inputPort17.getText());
        }
        if (!inputAdd17.getText().isEmpty() && !inputPort17.getText().isEmpty()) {
            addresses.put(17, inputAdd17.getText());
            ports.put(17, inputPort17.getText());
        }
        if (!inputAdd18.getText().isEmpty() && !inputPort18.getText().isEmpty()) {
            addresses.put(18, inputAdd18.getText());
            ports.put(18, inputPort18.getText());
        }
        if (!inputAdd19.getText().isEmpty() && !inputPort19.getText().isEmpty()) {
            addresses.put(19, inputAdd19.getText());
            ports.put(19, inputPort19.getText());
        }
    }



}
