package com.example.frisorsalon;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {


    static Stage primaryStage = null;
    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("logind.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 900, 900);
        primaryStage.setTitle("Er der mon nogen der læser denne tekst???");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
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



