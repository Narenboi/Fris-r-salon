package com.example.frisorsalon;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class Tidsbestilling {

    @FXML
    private CheckBox frisor1CheckBox;

    @FXML
    private CheckBox frisor2CheckBox;

    @FXML
    private CheckBox frisor3CheckBox;

    @FXML
    private CheckBox frisor4CheckBox;

    @FXML
    private CheckBox frisor5CheckBox;

    public void Vaelgfrioer(ActionEvent actionEvent) {
        if (frisor1CheckBox.isSelected()) {
            System.out.println("Du har valgt Frisør 1");
        } else if (frisor2CheckBox.isSelected()) {
            System.out.println("Du har valgt Frisør 2");
        } else if (frisor3CheckBox.isSelected()) {
            System.out.println("Du har valgt Frisør 3");
        } else if (frisor4CheckBox.isSelected()) {
            System.out.println("Du har valgt Frisør 4");
        } else if (frisor5CheckBox.isSelected()) {
            System.out.println("Du har valgt Frisør 5");
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

    public class DatePickerExample {

        public static void main(String[] args) {

            // Opret en ny date picker
            DatePicker datePicker = new DatePicker();

            // Sæt en default dato (valgfrit)
            datePicker.setValue(LocalDate.now());

            // Tilføj en change listener til at få den valgte dato
            datePicker.setOnAction(event -> {
                LocalDate date = datePicker.getValue();
                System.out.println("Valgt dato: " + date);
            });
            @FXML
            private Button bookButton;

            @FXML
            private DatePicker datePicker;

            @FXML
            private TextField nameField;

            @FXML
            private void handleBookButtonAction(ActionEvent event) {
                LocalDate selectedDate = datePicker.getValue();
                String name = nameField.getText();
                // Her kan du indsætte koden til at bekræfte de tidligere valg
                System.out.println("Reservation bekræftet for " + name + " på " + selectedDate);
            }

        }
    }
}




