package com.example.frisorsalon;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.time.DayOfWeek;
import java.time.LocalDate;



import java.io.IOException;

public class Main extends Application {

    static Stage primaryStage = null;


    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("LogInd.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 900, 900);
        primaryStage.setTitle("Hello bitch!");
        primaryStage.setScene(scene);
        primaryStage.show();


        DayPicker dayPicker = new DayPicker();
        dayPicker.setOnAction(event -> {
            LocalDate selectedDate = dayPicker.getValue();
            // Call a method in the Main class based on the selected day
            switch (selectedDate.getDayOfWeek()) {
                case MONDAY:
                    handleMonday();
                    break;
                case TUESDAY:
                    handleTuesday();
                    break;
                // Add cases for other days of the week
                default:
                    break;
            }
        });
    }
        static void handleMonday() {
            // Do something for Monday
            System.out.println("Monday");
        }

        static void handleTuesday() {
            // Do something for Tuesday
            System.out.println("Tuesday");
        }

        // Add methods for other days of the week

}



    /*
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("tidsbestilling.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 900, 900);

        stage.setTitle("Hello bitch!");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();

        User u1 = new User("a", "a", 1, "a", 1212, "a", "a", "11");

        System.out.println(u1);

    }

     */



