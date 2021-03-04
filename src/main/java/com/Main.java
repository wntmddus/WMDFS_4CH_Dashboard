package main.java.com;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import main.java.com.controllers.DashboardController;


import static main.java.com.util.SharedStorage.*;

public class Main extends Application {

    @Override
    public void init() throws Exception {
        super.init();
        System.setProperty( "sun.security.ssl.allowUnsafeRenegotiation", "true" );
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
        primaryStage.setTitle("WMDFS-4_Dashboard");
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
