module com.mtpns.cruddeusuarios {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    requires java.dotenv;
    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.mtpns.cruddeusuarios to javafx.fxml;
    opens com.mtpns.cruddeusuarios.controller to javafx.fxml;
    opens com.mtpns.cruddeusuarios.model to javafx.base;

    exports com.mtpns.cruddeusuarios;
}