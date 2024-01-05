package sample;

import javafx.fxml.FXML;
import javafx.scene.text.Text;
import java.util.ArrayList;


public class ControllerOrderConfirmation {

    static ArrayList<Item> product = new ArrayList<>();

    @FXML
    private Text itemName;

    @FXML
    private Text itemPrice;

    @Override
    public String toString() {
        return
                "itemName=" + itemName +
                ", itemPrice=" + itemPrice ;
    }

    @FXML
    void initialize() {

        itemPrice.setText(itemPrice.toString());


    }
}

