package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TextField movieTitle;

    @FXML
    private ImageView movieImage;

    @FXML
    private ChoiceBox <String> genreChoiceBox;

    @FXML
    private Button movieImageButton;

    @FXML
    private Button submitMovie;

    @FXML
    private Label messageLabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        List movieGenre = Arrays.asList("action", "comedy", "drama");
        this.genreChoiceBox.getItems().addAll(movieGenre);

    }

    public void createSubmitMovie(){

        try {
            Movie newMovie = new Movie(this.movieTitle.getText(),
                    this.genreChoiceBox.getValue().toString());
            this.messageLabel.setText(newMovie.toString() + "was made");
        }catch (IllegalArgumentException e){
            System.err.println(e.getMessage());
            messageLabel.setText(e.getMessage());
        }

    }


    }

