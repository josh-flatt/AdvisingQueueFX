module net.incandescently.advisingqueuefx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens net.incandescently.advisingqueuefx to javafx.fxml;
    exports net.incandescently.advisingqueuefx;
}