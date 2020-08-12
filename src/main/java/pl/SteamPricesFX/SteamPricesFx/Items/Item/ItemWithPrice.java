package pl.SteamPricesFX.SteamPricesFx.Items.Item;

import java.io.Serializable;

public class ItemWithPrice extends Item implements Serializable {

    private double price;
    private double totalPrice;


    public ItemWithPrice(String id, String marketName, int quantity, double price, double totalPrice) {
        super(id, marketName, quantity);
        this.price = price;
        this.totalPrice = totalPrice;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return getMarketName() +
                " Quantity: " +
                getQuantity() +
                " Price: " +
                getPrice() +
                " Total price " +
                getTotalPrice();
    }
}
