package com.example.frisorsalon;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("tidsbestilling.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 500);
        stage.setTitle("Hello bitch!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();

        User u1 = new User("a", "a", 1, "a", 1212, "a", "a", "11");

        System.out.println(u1);

    }




}

