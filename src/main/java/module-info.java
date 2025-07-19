module code.weather {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens code.weather to javafx.fxml;
    exports code.weather;
}