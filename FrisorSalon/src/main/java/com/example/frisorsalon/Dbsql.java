package com.example.frisorsalon;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.sql.*;
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

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;


public class Dbsql {
    public Connection databaseLink;
    private Connection conn;
    private Connection connection;
    private Statement stmt;
    private Statement stmt1;

        String connectString = "jdbc:mysql://eu-central.connect.psdb.cloud/harmonika?sslMode=VERIFY_IDENTITY";
        String userName = "fayleayqr2xop0tncwwh";
        String passWord = "pscale_pw_ln9EwoSa51WxRyfs6dcz9sPYCvPydEyNvwiHWYSi2eB";


        public void Sql() {
            try {
                Connection connection = DriverManager.getConnection(this.connectString, this.userName, this.passWord);

                if (connection == null) {
                    connection.close();
                }
            } catch (SQLException e) {
                throw new IllegalStateException("Cannot connect the database!", e);
            }
        }

    public boolean validate(String UUsername, String PPassword) {
        boolean status = false;
        try {
            // Query the database to retrieve the user's record
            Connection connection = DriverManager.getConnection(this.connectString, this.userName, this.passWord);
            PreparedStatement ps = connection.prepareStatement("select * from medarbejder where brugernavn=? and password=?");
            ps.setString(1, (UUsername));
            ps.setString(2, (PPassword));

            ResultSet rs = ps.executeQuery();
            status = rs.next();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return status;
    }

    public void indsaetKvittering(Kvittering k) {
        try {
            String sql = "INSERT INTO kvittering (kvitID, dato, tidspunkt, kfnavn, kenavn, mnr) VALUES('" + k.getKvitID() + "','" + k.getDato() + "','" + k.getTidspunkt() + "','" + k.getKfnavn() + "','" + k.getKenavn() + "','" + k.getMnr() + "')";
            Statement stmt = connection.createStatement();
            stmt.execute(sql);
            System.out.println("Connection to SQLite has been established.");
            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public Kvittering alleoplysninger() {
        String sql = "select * from kvittering";
        try {
            Statement stmt = connection.createStatement();
            Statement stmt1 = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Kvittering k = new Kvittering();
                int nr = rs.getInt("kvitID");
                k.setKvitID(nr);
                k.setDato(rs.getString("dato"));
                k.setTidspunkt(rs.getString("tidspunkt"));
                k.setKfnavn(rs.getString("kfnavn"));
                k.setKenavn(rs.getString("kenavn"));
                k.setMnr(rs.getInt("mnr"));
                String sql1 = "SELECT * from kvittering left join tidsbestilling on kvittering.kvitID=tidsbestilling.mnr where kvitID.mnr=" + nr;
                ResultSet rs1 = stmt1.executeQuery(sql1);
                //while (rs1.next()) {
                //kvittering kvit = new kvittering();
                //k..add(kvit);
                //}
            }
            stmt.close();
            stmt1.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return alleoplysninger();
    }

    }

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

  /*  public Dbsql() {
        // Establish a connection to the database
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://eu-central.connect.psdb.cloud/harmonika?sslMode=VERIFY_IDENTITY",
                    "nbb3rgarpob8kxfunlrp",
                    "pscale_pw_8RrTxiek2QWmtHq31RZveZPurBTZaIVKWZ6ICScFYB8");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }



    public boolean validate(String brugernavn, String password) {
        boolean status = false;
        try {
            // Query the database to retrieve the user's record
            PreparedStatement ps = conn.prepareStatement(
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

   */







