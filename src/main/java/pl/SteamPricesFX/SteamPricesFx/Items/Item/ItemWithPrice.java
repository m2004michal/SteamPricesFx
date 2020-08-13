package pl.SteamPricesFX.SteamPricesFx.Items.Item;

import java.io.Serializable;
import java.util.Objects;

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

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ItemWithPrice that = (ItemWithPrice) o;
        return Double.compare(that.price, price) == 0 &&
                Double.compare(that.totalPrice, totalPrice) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), price, totalPrice);
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
