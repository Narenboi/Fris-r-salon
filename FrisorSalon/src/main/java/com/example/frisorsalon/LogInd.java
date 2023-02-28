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
import java.sql.*;


public class LogInd extends Dbsql{

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

    private Label LoginMSG;
    private Connection con;

    public void LogindKnap(ActionEvent event) throws IOException {
//        validateLogin();
        Dbsql db = new Dbsql();
        db.Sql();
        //db.validate("nana", "nana1");

        if (validate(String.valueOf(username), String.valueOf(password)) == true) {
            root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }



        /*
        StageController.changeScene("hello-view.fxml");
*/



    private void checkLogin() throws IOException{

        Main m = new Main();

    }

    public void BrugerNavn(ActionEvent actionEvent) {

    }

    public void Password(ActionEvent actionEvent) {

    }
}
