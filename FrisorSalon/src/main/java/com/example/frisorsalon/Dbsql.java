package com.example.frisorsalon;

import java.sql.*;

public class Dbsql {
    String connectString = "jdbc:mysql://localhost:3306/frisørsalon";
    String userName = "root";
    String passWord = "f4nt45y7";


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
    public boolean validate(String brugernavn, String password) {
        boolean status = false;
        try {
            // Query the database to retrieve the user's record
            Connection connection = DriverManager.getConnection(this.connectString, this.userName, this.passWord);
            PreparedStatement ps = connection.prepareStatement("select * from medarbejder where brugernavn=? and password=?");
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


    /*

    public Connection databaseLink;
    public Connection getConnection(){
        String databaseName = "JDBC-driver_til_MySql";
        String databaseUser = "brugernavn";
        String databasePassword = "password";
        String url = "jdbc:sqlite:FrisorSalon//src/main/resources/JDBC-driver_til_MySql";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            databaseLink = DriverManager.getConnection(url, databaseUser, databasePassword);
        } catch (Exception e){
            e.printStackTrace();
        }
        return databaseLink;
    }}
*/