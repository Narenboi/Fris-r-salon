package com.example.frisorsalon;

import javafx.scene.control.DatePicker;

import java.time.LocalDate;

public class DayPicker extends DatePicker {

    public DayPicker() {
        super();
        setOnAction(event -> handleAction());
    }
    private void handleAction() {
        LocalDate selectedDate = getValue();
        if (selectedDate != null) {
            switch (selectedDate.getDayOfWeek()) {
                case MONDAY:
                    Main.handleMonday();
                    break;
                case TUESDAY:
                    Main.handleTuesday();
                    break;
                // Add cases for other days of the week
                default:
                    break;
            }
        }
    }
}
