package com.example.frisorsalon;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.sql.Connection;

import javax.swing.*;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.Statement;


public class LogInd {

    private Stage stage;
    private Scene scene;
    private Parent root;
    public static Stage primaryStage;
    @FXML
    private Label welcomeText;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Label LoginFailed;

    public void LogindKnap(ActionEvent event) throws IOException {

        if (username.getText().isBlank() == false && password.getText().isBlank() == false){
            LoginFailed.setText("logging in bitch!");

        }else {
            LoginFailed.setText("You fucked up bitch, try again");
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
