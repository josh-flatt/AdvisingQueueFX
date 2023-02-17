module com.example.advisingqueue {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.advisingqueue to javafx.fxml;
    exports com.example.advisingqueue;
}