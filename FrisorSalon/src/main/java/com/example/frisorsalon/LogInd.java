package com.example.frisorsalon;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;


public class LogInd {

    private Stage stage;
    private Scene scene;
    private Parent root;
    public static Stage primaryStage;
    @FXML
    private Label welcomeText;

    public void LogindKnap(ActionEvent event) throws IOException {
        if (checkLogin == true) {
            root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        /*
        StageController.changeScene("hello-view.fxml");
*/
    }

    private void checkLogin() throws IOException{

        Main m = new Main();

    }

    public void BrugerNavn(ActionEvent actionEvent) {

    }

    public void Password(ActionEvent actionEvent) {

    }
}
