package com.example.frisorsalon;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class Tidsbestilling {

    //Vælger hvilken frisør du vil bestille tid hos
    @FXML private CheckBox Frisor1;
    @FXML private CheckBox Frisor2;
    @FXML private CheckBox Frisor3;
    @FXML private CheckBox Frisor4;
    @FXML private CheckBox Frisor5;

    //Vælger hvilken tid du vil bestille.
    @FXML private Button t0930;
    @FXML private Button t1430;
    @FXML private Button t1030;
    @FXML private Button t1130;
    @FXML private Button t1230;
    @FXML private Button t1330;
    @FXML private Button t1530;
    @FXML private Button t1630;
    @FXML private Button t1730;
    @FXML private Button t1830;

    @FXML private DatePicker datePicker; // Declare the datePicker variable here
    @FXML private TextField nameField; // Declare the nameField variable here
    @FXML private TextField mnr; // Declare the medarbejderNummerField variable here
    @FXML private TextField kundeen; // Declare the kundeEfternavnField variable here
    @FXML private TextField kundefn; // Declare the kundeFornavnField variable here


    public Tidsbestilling() {
    }

    public void Vaelgfrioer(ActionEvent actionEvent) {
        // if (actionEvent.getSource().toString() == "frisor1CheckBox"){

        if (Frisor1.isSelected()){
            System.out.println("Du har valgt Frisør 1");
            Frisor2.setSelected(false);
            Frisor3.setSelected(false);
            Frisor4.setSelected(false);
            Frisor5.setSelected(false);

        }
        if (Frisor2.isSelected()) {
            System.out.println("Du har valgt Frisør 2");
            Frisor1.setSelected(false);
            Frisor3.setSelected(false);
            Frisor4.setSelected(false);
            Frisor5.setSelected(false);
        }
        if (Frisor3.isSelected()) {
            System.out.println("Du har valgt Frisør 3");
            Frisor1.setSelected(false);
            Frisor2.setSelected(false);
            Frisor4.setSelected(false);
            Frisor5.setSelected(false);

        }  if (Frisor4.isSelected()) {
            System.out.println("Du har valgt Frisør 4");
            Frisor1.setSelected(false);
            Frisor2.setSelected(false);
            Frisor3.setSelected(false);
            Frisor5.setSelected(false);

        }  if (Frisor5.isSelected()) {
            System.out.println("Du har valgt Frisør 5");
            Frisor1.setSelected(false);
            Frisor2.setSelected(false);
            Frisor3.setSelected(false);
            Frisor4.setSelected(false);


        } else {
            System.out.println("Du har ikke valgt en frisør endnu.");
        }
    }

    public void vælgtid(ActionEvent actionEvent) {
        Button clickedButton = (Button) actionEvent.getSource(); // Henter den klikkede knap

        if (clickedButton.isDisabled()) { // Tjekker om knappen allerede er deaktiveret
            System.out.println("Tidspunktet er allerede valgt."); // Udskriver en besked, hvis knappen allerede er deaktiveret
            return; // Afslutter funktionen uden at gøre mere
        }

        clickedButton.setDisable(true); // Deaktiverer den klikkede knap
        System.out.println("Tidspunktet " + clickedButton.getText() + " er nu valgt."); // Udskriver en besked om, at tidspunktet er valgt
    }

    @FXML private void handleBookButtonAction(ActionEvent event) {
        LocalDate selectedDate = datePicker.getValue();

        // Her kan du indsætte koden til at bekræfte de tidligere valg
        System.out.println("Reservation bekræftet for " + selectedDate);
    }
}
