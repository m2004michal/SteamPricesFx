package pl.SteamPricesFX.SteamPricesFx.Items.Item;

import java.io.Serializable;
import java.util.Objects;

public class Item implements Serializable {
    private String id;
    private String marketName;
    private int quantity;


    public Item(String id, String marketName, int quantity) {
        this.id = id;
        this.marketName = marketName;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return quantity == item.quantity &&
                Objects.equals(id, item.id) &&
                Objects.equals(marketName, item.marketName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, marketName, quantity);
    }

    @Override
    public String toString() {
        return marketName + " Quantity: " +  quantity;
    }
}
