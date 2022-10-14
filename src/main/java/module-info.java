module com.example.java {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.java to javafx.fxml;
    exports com.example.java;
}