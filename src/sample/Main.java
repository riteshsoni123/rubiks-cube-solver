package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        Controller cont = new Controller();
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("RUBIK'S CUBE INPUT");
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String[] args) throws Exception {

        launch(args);
    }
}