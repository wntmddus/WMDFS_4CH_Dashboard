package main.java.com;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import main.java.com.controllers.DashboardController;

public class Main extends Application {

    @Override
    public void init() throws Exception {
        super.init();
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
        primaryStage.setTitle("SV Dashboard Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    @Override
    public void stop() throws Exception {
        super.stop();
        System.out.println("Inside stop() method! Destroy resources. Perform Cleanup.");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
