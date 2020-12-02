package main.java.com.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.Map;
import java.util.ResourceBundle;

public class ConnectionMacSettingController extends DashboardController implements Initializable {
    @FXML
    Label deviceId0;
    @FXML
    Label deviceId1;
    @FXML
    Label deviceId2;
    @FXML
    Label deviceId3;
    @FXML
    Label deviceId4;
    @FXML
    Label deviceId5;
    @FXML
    Label deviceId6;
    @FXML
    Label deviceId7;
    @FXML
    Label deviceId8;
    @FXML
    Label deviceId9;
    @FXML
    Label deviceId10;
    @FXML
    Label deviceId11;
    @FXML
    Label deviceId12;
    @FXML
    Label deviceId13;
    @FXML
    Label deviceId14;
    @FXML
    Label deviceId15;
    @FXML
    Label deviceId16;
    @FXML
    Label deviceId17;
    @FXML
    Label deviceId18;
    @FXML
    Label deviceId19;
    @FXML
    TextField macIdTextField0;
    @FXML
    TextField macIdTextField1;
    @FXML
    TextField macIdTextField2;
    @FXML
    TextField macIdTextField3;
    @FXML
    TextField macIdTextField4;
    @FXML
    TextField macIdTextField5;
    @FXML
    TextField macIdTextField6;
    @FXML
    TextField macIdTextField7;
    @FXML
    TextField macIdTextField8;
    @FXML
    TextField macIdTextField9;
    @FXML
    TextField macIdTextField10;
    @FXML
    TextField macIdTextField11;
    @FXML
    TextField macIdTextField12;
    @FXML
    TextField macIdTextField13;
    @FXML
    TextField macIdTextField14;
    @FXML
    TextField macIdTextField15;
    @FXML
    TextField macIdTextField16;
    @FXML
    TextField macIdTextField17;
    @FXML
    TextField macIdTextField18;
    @FXML
    TextField macIdTextField19;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        deviceIdMap.put(0, deviceId0);
        deviceIdMap.put(1, deviceId1);
        deviceIdMap.put(2, deviceId2);
        deviceIdMap.put(3, deviceId3);
        deviceIdMap.put(4, deviceId4);
        deviceIdMap.put(5, deviceId5);
        deviceIdMap.put(6, deviceId6);
        deviceIdMap.put(7, deviceId7);
        deviceIdMap.put(8, deviceId8);
        deviceIdMap.put(9, deviceId9);
        deviceIdMap.put(10, deviceId10);
        deviceIdMap.put(11, deviceId11);
        deviceIdMap.put(12, deviceId12);
        deviceIdMap.put(13, deviceId13);
        deviceIdMap.put(14, deviceId14);
        deviceIdMap.put(15, deviceId15);
        deviceIdMap.put(16, deviceId16);
        deviceIdMap.put(17, deviceId17);
        deviceIdMap.put(18, deviceId18);
        deviceIdMap.put(19, deviceId19);
        macIdTextFieldMap.put(0, macIdTextField0);
        macIdTextFieldMap.put(1, macIdTextField1);
        macIdTextFieldMap.put(2, macIdTextField2);
        macIdTextFieldMap.put(3, macIdTextField3);
        macIdTextFieldMap.put(4, macIdTextField4);
        macIdTextFieldMap.put(5, macIdTextField5);
        macIdTextFieldMap.put(6, macIdTextField6);
        macIdTextFieldMap.put(7, macIdTextField7);
        macIdTextFieldMap.put(8, macIdTextField8);
        macIdTextFieldMap.put(9, macIdTextField9);
        macIdTextFieldMap.put(10, macIdTextField10);
        macIdTextFieldMap.put(11, macIdTextField11);
        macIdTextFieldMap.put(12, macIdTextField12);
        macIdTextFieldMap.put(13, macIdTextField13);
        macIdTextFieldMap.put(14, macIdTextField14);
        macIdTextFieldMap.put(15, macIdTextField15);
        macIdTextFieldMap.put(16, macIdTextField16);
        macIdTextFieldMap.put(17, macIdTextField17);
        macIdTextFieldMap.put(18, macIdTextField18);
        macIdTextFieldMap.put(19, macIdTextField19);
        for (Map.Entry<Integer, TextField> entry : macIdTextFieldMap.entrySet()) {
            if (clientConn.containsKey(entry.getKey())) {
                macIdTextFieldMap.get(entry.getKey()).setDisable(!clientConn.get(entry.getKey()).isConnected());
                macIdTextFieldMap.get(entry.getKey()).setText(macAddressesMap.get(entry.getKey()));
                deviceIdMap.get(entry.getKey()).setText(deviceNames.get(entry.getKey()).getText());
                if (!pref.get("macAddress" + entry.getKey(), "root").equals("root")) {
                    macAddressesMap.put(entry.getKey(), pref.get("macAddress" + entry.getKey(), "root"));
                    macIdTextFieldMap.get(entry.getKey()).setText(pref.get("macAddress" + entry.getKey(), "root"));
                }
            } else {
                macIdTextFieldMap.get(entry.getKey()).setDisable(true);
                deviceIdMap.get(entry.getKey()).setText("Not Connected");
            }
        }
    }

    private Stage stage;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    void onClickCancel() {
        stage.close();
    }

    @FXML
    void onClickSubmit() {
        for (int i = 0; i < MAX_DEVICE_NUMBER; i++) {
            macAddressesMap.put(i, macIdTextFieldMap.get(i).getText());
            pref.put("macAddress" + i, macIdTextFieldMap.get(i).getText());
        }
        stage.close();
    }
}
