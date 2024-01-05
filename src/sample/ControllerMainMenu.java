package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static sample.ControllerLikedMenu.likedItems;


public class ControllerMainMenu {


    //sum databse
    private int currentItem = 0;
    List<Image> images = new ArrayList();
    static ArrayList<Item> product = new ArrayList<>();


    @FXML
    private Button forwardButton;

    @FXML
    private Button backwardButton;

    @FXML
    private Text itemDescription;

    @FXML
    private Button likeList;

    @FXML
    private Button likeItemButton;

    @FXML
    private Button contactItemButton;

    @FXML
    private Button buyItemButton;

    //create actionevent event thingy that will save the item to likeditem arraylist then the likedMenu will just print those items in a listview

    @FXML
    private Button offerItemButton;

    @FXML
    private ImageView imageView;

    @FXML
    void backwardAction(ActionEvent event) {
        if (currentItem > 0) {
            imageView.setImage(product.get(--currentItem).getImage());
        }
    }

    @FXML
    void forwardAction(ActionEvent event) {
        if (currentItem < 99) {
            imageView.setImage(product.get(++currentItem).getImage());
        }
    }

    @FXML
    void offerAction(ActionEvent event) {offerMenu(); }

    @FXML
    void contactAction(ActionEvent event) {
        contactMenu();
    }


    @FXML
    void buyItem(ActionEvent event) {
        orderConfirmationScene();
    }

    @FXML
    void likeAction(ActionEvent event) {


    }

    @FXML
    void goToLikedList(ActionEvent event) {
        likeMenuScene();
    }

    @FXML
    private void initialize() {

        // initialize your product ArrayList
        product.add(new Item(900, 1, "Great condition camera. Comes with two extra batteries and lens. Works perfectly. In person transaction only. ", "Sony-Ismail Khan", "Sony a7ii with 24-70mm Lens", new Image(getClass().getResource("z.Sony a7ii.jpg").toString())));
        product.add(new Item(120, 1, "Like new gaming chair, hardly used, in great condition. Smoke free home. \n", "S-Racer", "Gaming chair", new Image(getClass().getResource("z.Gaming Chair.jpg").toString())));
        product.add(new Item(350, 1, "I had this computer last year, but only used for a couple times. If messages or any questions, not a computer master( probably doesn’t know much stuff about this computer) but i will try my best to answer all the questions you might have ", "Asus", "Gaming PC-Rainbow lighting", new Image(getClass().getResource("z.GamingPc.jpg").toString())));
        product.add(new Item(229, 1, "\n"+"Shoot 4K videos, beautiful portraits, and sweeping landscapes with the all-new dual-camera system. Capture your best low-light photos with Night mode. See true-to-life color in your photos, videos, and games on the 6.5-inch Liquid Retina display. Experience unprecedented performance with A13 Bionic for gaming, augmented reality (AR), and photography. Do more and charge less with all-day battery life. And worry less with water resistance up to 2 meters for 30 minutes. Phones are in New Condition and are 100% Functional. These phones are Fully Unlocked and are Compatible with all major U.S. carriers, including Verizon, ATT, and T-Mobile.\n ", "Apple", "Iphone 11", new Image(getClass().getResource("z.Iphone 11.jpg").toString())));
        product.add(new Item(850, 1, "Iphone 12 max, no low ball I know what i got bro ", "Apple New jersey", "Iphone 12 Max", new Image(getClass().getResource("z.Iphone 12 Max.jpg").toString())));
        product.add(new Item(850, 1, "Iphone 12 max, no low ball I know what i got bro ", "Apple New jersey", "Iphone 12 Max", new Image(getClass().getResource("z.IMG_5988.jpeg").toString())));
        product.add(new Item(850, 1, "Iphone 12 max, no low ball I know what i got bro ", "Apple New jersey", "Iphone 12 Max", new Image(getClass().getResource("z.IMG_7052.jpeg").toString())));
        product.add(new Item(850, 1, "Iphone 12 max, no low ball I know what i got bro ", "Apple New jersey", "Iphone 12 Max", new Image(getClass().getResource("z.lilbabyIMG_7322.jpeg").toString())));
        product.add(new Item(850, 1, "Iphone 12 max, no low ball I know what i got bro ", "Apple New jersey", "Iphone 12 Max", new Image(getClass().getResource("z.lilbabyIMG_7322.jpeg").toString())));
        product.add(new Item(850, 1, "Iphone 12 max, no low ball I know what i got bro ", "Apple New jersey", "Iphone 12 Max", new Image(getClass().getResource("z.bidIMG_7331.jpeg").toString())));



        currentItem = 0;

        //System.out.println(product);

        imageView.setImage(product.get(currentItem).getImage());

    }

    public void start(Stage stage) throws Exception {

    }

    void likeMenuScene() {
        try {
            Stage currStage = (Stage) likeList.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("LikedMenu.fxml"));
            Parent root = loader.load();
            ControllerLikedMenu ref = loader.getController();
            currStage.setTitle("Liked-Items");
            currStage.setScene(new Scene(root, 575, 425));

        } catch (FileNotFoundException e) {

            System.out.printf("Likemenu filenot found EXP e ");
        } catch (Exception e) {
            System.out.println("likeMenu EXP e thrown");
        }
    }

    void orderConfirmationScene(){
        try {
            Stage currStage = (Stage) buyItemButton.getScene().getWindow();
            Stage newStage = new Stage();
            //Parent root = FXMLLoader.load(getClass().getResource("orderConfirmation.fxml"));
            FXMLLoader loader = new FXMLLoader(getClass().getResource("OrderConfirmation.fxml"));
            Parent root = loader.load();

            ControllerOrderConfirmation ref = loader.getController();

            newStage.setTitle("Order-Confirmation");
            newStage.setScene(new Scene(root, 250, 151));
            newStage.show();
        } catch (FileNotFoundException e) {
            System.out.printf("orderConfirmation filenot found EXP e ");
        } catch (Exception e) {
            System.out.println("orderConfirmation EXP e thrown");
        }
    }


    void contactMenu(){
        try {
            Stage currStage = (Stage) contactItemButton.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ContactMenu.fxml"));
            Parent root = loader.load();
            ControllerContactMenu ref = loader.getController();
            currStage.setTitle("Contact-Menu");
            currStage.setScene(new Scene(root, 575, 425));

        } catch (FileNotFoundException e) {
            System.out.printf("contactMenu filenot found EXP e ");
        } catch (Exception e) {
            System.out.println("contactMenu EXP e thrown");
        }
    }

    void offerMenu(){
        try {
            Stage currStage = (Stage) offerItemButton.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("OfferMenu.fxml"));
            Parent root = loader.load();
            ControllerOfferMenu ref = loader.getController();
            currStage.setTitle("Offer-Menu");
            currStage.setScene(new Scene(root, 575, 425));

        } catch (FileNotFoundException e) {
            System.out.printf("offerMenu filenot found EXP e ");
        } catch (Exception e) {
            System.out.println("offerMenu EXP e thrown");
        }
    }
}
