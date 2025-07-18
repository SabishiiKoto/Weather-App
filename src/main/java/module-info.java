module code.weather {
    requires javafx.controls;
    requires javafx.fxml;


    opens code.weather to javafx.fxml;
    exports code.weather;
}