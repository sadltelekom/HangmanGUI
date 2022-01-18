module com.example.javafxdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.HangmanGUI to javafx.fxml;
    exports com.example.HangmanGUI;
}