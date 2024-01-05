package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

public class ControllerContactMenu {

    Scene prev;

    @FXML
    private Button mainMenu;

    @FXML
    void backtoMainMenu(ActionEvent event) {
        mainMenu();
    }

    void initialize(){

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
