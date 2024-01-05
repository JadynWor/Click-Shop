package sample;

//super class every items will inherit

import javafx.scene.image.Image;

public class Item {


    //attributes

    private double price;
    private int stock;          //not every item has
    private String description;
    private String sellerUserName;
    private String itemName;
    private Image image;



    //Constructor
    public Item(double price, int stock, String description, String sellerUserName, String itemName,Image image) {
        this.price = price;
        this.stock = stock;
        this.description = description;
        this.sellerUserName = sellerUserName;
        this.itemName = itemName;
        this.image = image;
    }

    @Override
    public String toString() {
        return
                "itemName= " + itemName+
                "$" + price +
                ", description=" + description + '\'' +
                ", sellerUserName=" + sellerUserName + '\'';

    }

// Getters and Setters

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSellerUserName() {
        return sellerUserName;
    }

    public void setSellerUserName(String sellerUserName) {
        this.sellerUserName = sellerUserName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Image getImage() {return image;}

    public void setImage(Image image) {this.image = image;}
}
