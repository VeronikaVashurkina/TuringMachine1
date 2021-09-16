package ru.machine.techprog;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Main extends Application implements Initializable {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        URL xmlUrl = getClass().getResource("/FXML/mainVishual.fxml");
        loader.setLocation(xmlUrl);
        Parent root = loader.load();
//ты лох
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/CSS/stylesheets.css");

        stage.setScene(scene);

        stage.getIcons().add(new Image("/IMG/icon.jpg"));
        stage.setTitle("Turing Machine Simulation");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
