module com.example.frisorsalon {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.frisorsalon to javafx.fxml;
    exports com.example.frisorsalon;
}