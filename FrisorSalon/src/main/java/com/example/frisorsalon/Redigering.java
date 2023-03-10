package com.example.frisorsalon;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Objects;

public class Redigering extends Tidsbestilling {
    //For at kunne ændre scene
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML private DatePicker datePicker; // Declare the datePicker variable here
    @FXML ToggleButton setTime0930 = new ToggleButton("t0930"); @FXML ToggleButton setTime1030 = new ToggleButton("t1030");
    @FXML ToggleButton setTime1130 = new ToggleButton("t1130"); @FXML ToggleButton setTime1230 = new ToggleButton("t1230");
    @FXML ToggleButton setTime1330 = new ToggleButton("t1330"); @FXML ToggleButton setTime1430 = new ToggleButton("t1430");
    @FXML ToggleButton setTime1530 = new ToggleButton("t1530"); @FXML ToggleButton setTime1630 = new ToggleButton("t1630");
    @FXML ToggleButton setTime1730 = new ToggleButton("t1730"); @FXML ToggleButton setTime1830 = new ToggleButton("t1830");

    public void redigereTid(ActionEvent actionEvent) {

        //ToggleGroup is a container that manages a group of ToggleButton objects, so that only one ToggleButton can be selected at a time
        ToggleGroup group = new ToggleGroup();
        setTime0930.setToggleGroup(group); setTime1030.setToggleGroup(group); setTime1130.setToggleGroup(group);
        setTime1230.setToggleGroup(group); setTime1330.setToggleGroup(group); setTime1430.setToggleGroup(group);
        setTime1530.setToggleGroup(group); setTime1630.setToggleGroup(group); setTime1730.setToggleGroup(group);
        setTime1830.setToggleGroup(group);


        ToggleButton clickedButton = (ToggleButton) actionEvent.getSource();
        System.out.println("Tidspunktet " + clickedButton.getText() + " er nu valgt.");

        //listener to the toggle group's selectedToggle property to be notified when the selected toggle changes:
        group.selectedToggleProperty().addListener((observable, oldToggle, newToggle) -> {
            if (newToggle != null) {
                // Do something with the selected button text

                // A toggle button has been selected
                ToggleButton selectedButton = (ToggleButton) newToggle;

            } else {
                // No toggle button is currently selected

            }
        });

    }
    @FXML private void handleBookButtonAction(ActionEvent event) {
        LocalDate selectedDate = datePicker.getValue();

        // Her kan du indsætte koden til at bekræfte de tidligere valg
        System.out.println("Reservation bekræftet for " + selectedDate);
    }

    public void Booking(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Forside.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void AflysTid(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Forside.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
