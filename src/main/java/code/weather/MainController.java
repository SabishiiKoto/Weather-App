package code.weather;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

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
//        imageForHumidity.setImage();
    }

}
