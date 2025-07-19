package code.weather;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.image.Image;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MainController {

    @FXML
    private ImageView imageForHumidity;

    @FXML
    private ImageView imageForSearching;

    @FXML
    private ImageView imageForWeather;

    @FXML
    private ImageView imageForWindSpeed;

    @FXML
    private Label labelForDate;

    @FXML
    private Label labelForHumidity;

    @FXML
    private Label labelForTemperature;

    @FXML
    private Label labelForWindSpeed;

    @FXML
    private TextField textFieldForArea;

    @FXML
    void searchImageTrigger(MouseEvent event) {

    }

    @FXML
    void initialize(){
        // Set local date
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        String formattedDate = date.format(formatter);
        labelForDate.setText(formattedDate);

        // Set Humidity Image
        Image image = new Image(getClass().getResource("/assets/water-drop.png").toExternalForm());
        imageForHumidity.setImage(image);

        // Set Wind Speed Image
        image = new Image(getClass().getResource("/assets/wind.png").toExternalForm());
        imageForWindSpeed.setImage(image);

        // Set Search Image
        image = new Image(getClass().getResource("/assets/search.png").toExternalForm());
        imageForSearching.setImage(image);

    }

}
