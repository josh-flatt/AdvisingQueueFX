module com.example.advisingqueue {
    requires javafx.controls;
    requires javafx.fxml;

    opens advisingQueue to javafx.base;
    opens com.example.advisingqueue to javafx.fxml;
    exports com.example.advisingqueue;
}