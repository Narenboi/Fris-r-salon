package com.example.frisorsalon;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.sql.*;

public class Dbsql {
    public Connection databaseLink;

    private Connection con;
    private Connection connection;
    private Statement stmt;
    private Statement stmt1;

/*
    Dbsql() {
        connection = null;
        stmt = null;
        try {
            String url = "jdbc:sqlite:C:\\\\Users\\\\Naren\\\\Desktop\\\\FrisørSalon\\\\Fris-r-salon\\\\FrisorSalon\\\\src\\\\main\\\\resources\\\\JDBC-driver_til_MySql";
            connection = DriverManager.getConnection(url);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }*/
/*
    public Dbsql() {
        // Establish a connection to the database
        String url = "jdbc:sqlite:C:\\Users\\Naren\\Desktop\\FrisørSalon\\Fris-r-salon\\FrisorSalon\\src\\main\\resources\\JDBC-driver_til_MySql";
        String username = "myusername";
        String password = "mypassword";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
*/


/*
    public Connection getConnection(){
        String databaseName = "JDBC-driver_til_MySql";
        String databaseUser = "brugernavn";
        String databasePassword = "password";
        String url = "jdbc:sqlite:C:\\Users\\Naren\\Desktop\\FrisørSalon\\Fris-r-salon\\FrisorSalon\\src\\main\\resources\\JDBC-driver_til_MySql";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            databaseLink = DriverManager.getConnection(url, databaseUser, databasePassword);
        } catch (Exception e){
            e.printStackTrace();
        }
        return databaseLink;
    }

 */


   /* public Dbsql() {
        connection = null;
        stmt = null;
        try {
            String url = "C:\\Users\\Naren\\Desktop\\FrisørSalon\\Fris-r-salon\\FrisorSalon\\src\\main\\resources\\JDBC-driver_til_MySql";
            connection = DriverManager.getConnection(url);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
            Connection connection = DriverManager.getConnection("jdbc:mysql\\:C:\\Users\\Naren\\Desktop\\FrisørSalon\\Fris-r-salon\\FrisorSalon\\src\\main\\resources\\JDBC-driver_til_MySql","root","");

    */

    public Dbsql() {
        // Establish a connection to the database
        String url = "C:\\Users\\Naren\\Desktop\\FrisørSalon\\Fris-r-salon\\FrisorSalon\\src\\main\\resources\\JDBC-driver_til_MySql";
        String username = "myusername";
        String password = "mypassword";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }



    public boolean validate(TextField brugernavn, PasswordField password) {
        boolean status = false;
        try {
            // Query the database to retrieve the user's record
            PreparedStatement ps = con.prepareStatement(
                    "select * from Medarbejder where brugernavn=? and password=?");
            ps.setString(1, String.valueOf(brugernavn));
            ps.setString(2, String.valueOf(password));

            ResultSet rs = ps.executeQuery();
            status = rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return status;
    }
}






