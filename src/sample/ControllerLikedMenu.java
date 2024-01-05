package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ControllerLikedMenu {

    Scene prev;

    static ArrayList<Item> likedItems = new ArrayList<>();
    static ArrayList<Item> product = new ArrayList<>();


    @FXML
    private ListView<Item> listviewItems;

    @FXML
    private AnchorPane likeListAnchor;

    @FXML
    private Button mainMenu;

    @FXML
    void backtoMainMenu(ActionEvent event) {
        mainMenu();
    }

    @FXML
    private void initialize() {



        likedItems.add(new Item(900, 1, "Great condition camera. Comes with two extra batteries and lens. Works perfectly. In person transaction only. ", "Sony-Ismail Khan", "Sony a7ii with 24-70mm Lens", new Image(getClass().getResource("z.Sony a7ii.jpg").toString())));
        likedItems.add(new Item(120, 1, "Like new gaming chair, hardly used, in great condition. Smoke free home. \n", "S-Racer", "Gaming chair", new Image(getClass().getResource("z.Gaming Chair.jpg").toString())));
        likedItems.add(new Item(350, 1, "I had this computer last year, but only used for a couple times. If messages or any questions, not a computer master( probably doesn’t know much stuff about this computer) but i will try my best to answer all the questions you might have ", "Asus", "Gaming PC-Rainbow lighting", new Image(getClass().getResource("z.GamingPc.jpg").toString())));
        likedItems.add(new Item(229, 1, "\n"+"Shoot 4K videos, beautiful portraits, and sweeping landscapes with the all-new dual-camera system. Capture your best low-light photos with Night mode. See true-to-life color in your photos, videos, and games on the 6.5-inch Liquid Retina display. Experience unprecedented performance with A13 Bionic for gaming, augmented reality (AR), and photography. Do more and charge less with all-day battery life. And worry less with water resistance up to 2 meters for 30 minutes. Phones are in New Condition and are 100% Functional. These phones are Fully Unlocked and are Compatible with all major U.S. carriers, including Verizon, ATT, and T-Mobile.\n ", "Apple", "Iphone 11", new Image(getClass().getResource("z.Iphone 11.jpg").toString())));
        likedItems.add(new Item(850, 1, "Iphone 12 max, no low ball I know what i got bro ", "Apple New jersey", "Iphone 12 Max", new Image(getClass().getResource("z.Iphone 12 Max.jpg").toString())));



        listviewItems.getItems().addAll(likedItems);
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
