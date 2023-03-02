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

import java.sql.*;

import java.io.IOException;
import java.util.Objects;


public class LogInd extends Dbsql {

    private Stage stage;
    private Scene scene;
    private Parent root;
    public static Stage primaryStage;
    @FXML
    private Label welcomeText;
    @FXML
    public TextField UUsername;
    @FXML
    public PasswordField PPassword;
    @FXML
    private Label LoginMSG;



    public void LogindKnap(ActionEvent event) throws IOException {
        //validateLogin();
        Dbsql db = new Dbsql();
        db.Sql();
        //db.validate("nana", "nana1");

        if (validate(String.valueOf((UUsername)), String.valueOf(PPassword))) {
            System.out.println("You have been logged in");
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("hello-view.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } else {
            System.out.println("try again");

        }
    }

   /* public void validateLogin(){
        Dbsql connectNow = new Dbsql();
        Connection connectionDB = connectNow.getConnection();
        String verifyLogin = "SELECT count(1) FROM Medarbejder WHERE brugernavn = '" + username.getText() + "' AND password = '" + password.getText() + "'";
        try{
            Statement statement = connectionDB.createStatement();
            ResultSet queryResult = statement.executeQuery(verifyLogin);

            while(queryResult.next()){
                if (queryResult.getInt(1) ==1){
                    LoginMSG.setText("Welcome!");

                }else {
                    LoginMSG.setText("Invalid login please try again.");
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }





        /*
        StageController.changeScene("hello-view.fxml");
*/

   /* public LogInd() {
        // Establish a connection to the database
        String url = "C:\\Users\\Naren\\Desktop\\FrisørSalon\\Fris-r-salon\\FrisorSalon\\src\\main\\resources\\JDBC-driver_til_MySql";
        String username = "myusername";
        String password = "mypassword";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean validate(String username, String password) {
        boolean status = false;
        try {
            // Query the database to retrieve the user's record
            PreparedStatement ps = con.prepareStatement(
                    "select * from Medarbejder where brugernavn=? and password=?");
            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();
            status = rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return status;
        */





    }

