package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

public class ControllerOfferMenu {

    Scene prev;

    @FXML
    private Button mainMenu;

    @FXML
    private Button submitOfferButton;


    @FXML
    void backtoMainMenu(ActionEvent event) {
        mainMenu();
    }

    @FXML
    private TextField offerField;

    @FXML
    private Text resultText;

    @FXML
    void offerLoad(KeyEvent event) {

    }

    @FXML
    private Label label;


    @FXML
    void submitOffer(ActionEvent event) {

        offerField.getText();
        String price = offerField.getText();

        resultText.setText("Hello the offer of " + price + " was not enough sorry. Please enter an Higher amount");

    }

    private void initialize() {

        label.setText("$");

    }

    void mainMenu(){
        try {
            Stage currStage = (Stage)mainMenu.getScene().getWindow();// currentStage...
            prev = mainMenu.getScene();
            //Parent root = FXMLLoader.load(getClass().getResource("OrderConfirmation.fxml"));
            FXMLLoader loader = new FXMLLoader(getClass().getResource("MainMenu.fxml"));
            Parent root = loader.load();

            ControllerMainMenu ref = loader.getController();

            currStage.setTitle("Click-Shop");
            currStage.setScene(new Scene(root, 575, 425));
            //currStage.show();
        } catch (FileNotFoundException e) {

        } catch (Exception e) {

        }
    }

    public void setPrevScene(Scene scene) {
        prev = scene;
    }

}
