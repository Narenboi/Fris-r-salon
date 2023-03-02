package com.example.frisorsalon;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class Forside {

    private Stage stage;
    private Scene scene;
    private Parent root;
    public static Stage primaryStage;

    public void Tidsbestilling(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("Tidsbestilling.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void logud(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("LogInd.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void Redigering(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("Redigering.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
