package main.java.com.controllers;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.ini4j.Ini;

import java.io.*;
import java.net.*;
import java.util.*;

public class CreateConnectionController extends DashboardController implements Initializable {

    @FXML
    Label fixedAddress0;
    @FXML
    Label fixedAddress1;
    @FXML
    Label fixedAddress2;
    @FXML
    Label fixedAddress3;
    @FXML
    Label fixedAddress4;
    @FXML
    Label fixedAddress5;
    @FXML
    Label fixedAddress6;
    @FXML
    Label fixedAddress7;
    @FXML
    Label fixedAddress8;
    @FXML
    Label fixedAddress9;
    @FXML
    Label fixedAddress10;
    @FXML
    Label fixedAddress11;
    @FXML
    Label fixedAddress12;
    @FXML
    Label fixedAddress13;
    @FXML
    Label fixedAddress14;
    @FXML
    Label fixedAddress15;
    @FXML
    Label fixedAddress16;
    @FXML
    Label fixedAddress17;
    @FXML
    Label fixedAddress18;
    @FXML
    Label fixedAddress19;
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





    @Override
    public void initialize(URL url, ResourceBundle rb) {
        fixedAddressesMap.put(0, fixedAddress0);
        fixedAddressesMap.put(1, fixedAddress1);
        fixedAddressesMap.put(2, fixedAddress2);
        fixedAddressesMap.put(3, fixedAddress3);
        fixedAddressesMap.put(4, fixedAddress4);
        fixedAddressesMap.put(5, fixedAddress5);
        fixedAddressesMap.put(6, fixedAddress6);
        fixedAddressesMap.put(7, fixedAddress7);
        fixedAddressesMap.put(8, fixedAddress8);
        fixedAddressesMap.put(9, fixedAddress9);
        fixedAddressesMap.put(10, fixedAddress10);
        fixedAddressesMap.put(11, fixedAddress11);
        fixedAddressesMap.put(12, fixedAddress12);
        fixedAddressesMap.put(13, fixedAddress13);
        fixedAddressesMap.put(14, fixedAddress14);
        fixedAddressesMap.put(15, fixedAddress15);
        fixedAddressesMap.put(16, fixedAddress16);
        fixedAddressesMap.put(17, fixedAddress17);
        fixedAddressesMap.put(18, fixedAddress18);
        fixedAddressesMap.put(19, fixedAddress19);
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
        Platform.runLater(() -> {
            for(Map.Entry<Integer, Socket> entry : clientConn.entrySet()) {
                if(entry.getValue().isConnected()) {
                    connAddTextFieldMap.get(entry.getKey()).setDisable(true);
                    connPortTextFieldMap.get(entry.getKey()).setDisable(true);
                    disconnectBtnMap.get(entry.getKey()).setDisable(false);
                }
            }
            for(int i = 0; i < MAX_DEVICE_NUMBER; i++) {
                fixedAddressesMap.get(i).setText(BASE_IP_ADDRESS);
                connChkBoxMap.get(i).setSelected(connChkBoxStatusMap.get(i));
                if (addresses.containsKey(i)) connAddTextFieldMap.get(i).setText(addresses.get(i));
                if (ports.containsKey(i)) connPortTextFieldMap.get(i).setText(ports.get(i));
                if (!pref.get("address" + i, "root").equals("root")) {
                    connAddTextFieldMap.get(i).setText(pref.get("address" + i, "root"));
                }
            }
        });
    }

    private Stage stage;

    public void setStage(Stage stage) {
        this.stage = stage;
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
            disconnectAllBtnGlobal.setDisable(disconnectBtnMap.get(0).isDisabled() && disconnectBtnMap.get(1).isDisabled() && disconnectBtnMap.get(2).isDisabled() && disconnectBtnMap.get(3).isDisabled() && disconnectBtnMap.get(4).isDisabled() && disconnectBtnMap.get(5).isDisabled() && disconnectBtnMap.get(6).isDisabled() && disconnectBtnMap.get(7).isDisabled() && disconnectBtnMap.get(8).isDisabled() && disconnectBtnMap.get(9).isDisabled() && disconnectBtnMap.get(10).isDisabled() && disconnectBtnMap.get(11).isDisabled() && disconnectBtnMap.get(12).isDisabled() && disconnectBtnMap.get(13).isDisabled() && disconnectBtnMap.get(14).isDisabled() && disconnectBtnMap.get(15).isDisabled() && disconnectBtnMap.get(16).isDisabled() && disconnectBtnMap.get(17).isDisabled() && disconnectBtnMap.get(18).isDisabled() && disconnectBtnMap.get(19).isDisabled());
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

    @FXML
    private void handleOnLoad() throws IOException {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Load Setting");
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("CFG files (*.cfg)", "*.cfg");
        fileChooser.getExtensionFilters().add(extFilter);
        //Show save file dialog
        File file = fileChooser.showOpenDialog(stage);

        if (file != null) {
            Ini ini = new Ini(file);
            Map<String, String> map = ini.get("ChartConfig");
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey().contains("chartConfig")) {
                    int deviceIndex = Integer.parseInt(entry.getKey().substring(11));
                    if (clientConn.containsKey(deviceIndex) && clientConn.get(deviceIndex).isConnected()) {
                        chartConfigMap.get(deviceIndex).set(0, entry.getValue().charAt(0) != '0');
                        chartConfigMap.get(deviceIndex).set(1, entry.getValue().charAt(1) != '0');
                        chartConfigMap.get(deviceIndex).set(2, entry.getValue().charAt(2) != '0');
                        chartConfigMap.get(deviceIndex).set(3, entry.getValue().charAt(3) != '0');
                        chartConfigMap.get(deviceIndex).set(4, entry.getValue().charAt(4) != '0');
                        chartConfigMap.get(deviceIndex).set(5, entry.getValue().charAt(5) != '0');
                    }
                } else {
                    int deviceIndex = Integer.parseInt(entry.getKey().substring(7));
                    addresses.put(deviceIndex, entry.getValue());
                    connAddTextFieldMap.get(deviceIndex).setText(entry.getValue());
                }
            }
            FXMLLoader saveSettingLoader = new FXMLLoader(getClass().getResource("/main/resources/fxml/loadsuccess.fxml"));
            VBox vbox = null;
            vbox = saveSettingLoader.load();
            Stage stage = new Stage();
            stage.initOwner(mainStage);
            Scene scene = new Scene(vbox);
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle("Setting Loaded");
            stage.setScene(scene);
            stage.show();
            return;
        }
        FXMLLoader saveSettingLoader = new FXMLLoader(getClass().getResource("/main/resources/fxml/loadfailed.fxml"));
        VBox vbox = null;
        vbox = saveSettingLoader.load();
        Stage stage = new Stage();
        stage.initOwner(mainStage);
        Scene scene = new Scene(vbox);
        stage.initModality(Modality.WINDOW_MODAL);
        stage.setTitle("Setting Load Failed");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void handleOnSave() {
        StringBuilder configString = new StringBuilder();
        configString.append("[ChartConfig]\n");
        for (Map.Entry<Integer, String> entry : addresses.entrySet()) {
            pref.put("address" + entry.getKey(), entry.getValue());
            configString.append("address").append(entry.getKey()).append("=").append(entry.getValue()).append("\n");
            StringBuilder config = new StringBuilder();
            for (int i = 0; i < chartConfigMap.get(entry.getKey()).size(); i++) {
                if (chartConfigMap.get(entry.getKey()).get(i)) config.append("1");
                else config.append("0");
            }
            pref.put("chartConfig" + entry.getKey(), config.toString());
            configString.append("chartConfig").append(entry.getKey()).append("=").append(config.toString()).append("\n");
        }
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save Setting");
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("CFG files (*.cfg)", "*.cfg");
        fileChooser.getExtensionFilters().add(extFilter);
        //Show save file dialog
        File file = fileChooser.showSaveDialog(stage);

        if (file != null) {
            saveTextToFile(configString.toString(), file);
            FXMLLoader saveSettingLoader = new FXMLLoader(getClass().getResource("/main/resources/fxml/settingsaved.fxml"));
            VBox vbox = null;
            try {
                vbox = saveSettingLoader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Stage stage = new Stage();
            stage.initOwner(mainStage);
            assert vbox != null;
            Scene scene = new Scene(vbox);
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle("Setting Saved");
            stage.setScene(scene);
            stage.show();
        }
    }
    private void saveTextToFile(String content, File file) {
        try {
            PrintWriter writer;
            writer = new PrintWriter(file);
            writer.println(content);
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
