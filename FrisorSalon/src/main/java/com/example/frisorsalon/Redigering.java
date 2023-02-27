package com.example.frisorsalon;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

public class Redigering extends Tidsbestilling{
    @FXML ToggleButton setTime0930 = new ToggleButton("09:30"); @FXML ToggleButton setTime1030 = new ToggleButton("10:30");
    @FXML ToggleButton setTime1130 = new ToggleButton("11:30"); @FXML ToggleButton setTime1230 = new ToggleButton("12:30");
    @FXML ToggleButton setTime1330 = new ToggleButton("13:30"); @FXML ToggleButton setTime1430 = new ToggleButton("14:30");
    @FXML ToggleButton setTime1530 = new ToggleButton("15:30"); @FXML ToggleButton setTime1630 = new ToggleButton("16:30");
    @FXML ToggleButton setTime1730 = new ToggleButton("17:30"); @FXML ToggleButton setTime1830 = new ToggleButton("18:30");

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
    public void Booking(ActionEvent actionEvent) {

    }
}
