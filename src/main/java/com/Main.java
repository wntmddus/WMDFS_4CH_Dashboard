package main.java.com;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import main.java.com.controllers.DashboardController;
import main.java.com.util.GetNetworkAddress;
import main.java.com.util.SharedStorage;
import main.java.com.util.RestfulApi;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.*;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.BasicHttpClientConnectionManager;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.ssl.SSLContexts;
import org.json.JSONObject;
import org.omg.CORBA.NameValuePair;


import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import java.util.ArrayList;
import java.util.List;

import static main.java.com.util.SharedStorage.*;
import static org.apache.http.conn.ssl.SSLConnectionSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER;

public class Main extends Application {

    @Override
    public void init() throws Exception {
        super.init();
        String macAddress = GetNetworkAddress.getAddress();
        System.out.println(macAddress);
//        JSONObject requestBody1 = new JSONObject("{\n" +
//                "    \"extDeviceId\": \"Device1\"\n" +
//                "}");
//        JSONObject requestBody2 = new JSONObject("{\n" +
//                "    \"extDeviceId\": \"Device221\",\n" +
//                "    \"connectionMac\": \"" + macAddress + "\",\n" +
//                "    \"channelCount\": 6,\n" +
//                "    \"channelName\": [\"vib1\", \"Rpm1\", \"vib2\", \"Rpm2\", \"vib3\", \"Rpm3\"]\n" +
//                "}");
//        System.out.println(RestfulApi.post("extInit", requestBody1));

        System.out.println("Inside init() method! Perform necessary initializations here.");
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/main/resources/fxml/dashboard.fxml"));
        VBox vbox = loader.load();
        Scene scene = new Scene(vbox);
        DashboardController controller = loader.getController();
        controller.setStage(primaryStage);
        scene.getStylesheets().add(getClass().getResource("/main/resources/css/ChartStyle.css").toString());
        primaryStage.setTitle("WMDFS_Dashboard");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    @Override
    public void stop() throws Exception {
        super.stop();
        System.out.println("Inside stop() method! Destroy resources. Perform Cleanup.");
        for (int i = 0; i < 20; i++) {
            if (clientConn.containsKey(i)) {
                if (clientConn.get(i).isConnected()) {
                    outputList.get(i).writeBytes("STOP\0");
                    outputList.get(i).writeBytes("NO CARRIER\0");
                    clientConn.get(i).close();
                }
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
