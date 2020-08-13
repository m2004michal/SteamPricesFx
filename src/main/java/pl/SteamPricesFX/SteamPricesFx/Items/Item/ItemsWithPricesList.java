package pl.SteamPricesFX.SteamPricesFx.Items.Item;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import pl.SteamPricesFX.SteamPricesFx.Items.Item.UpdateItem.UpdateItem;

import java.util.ArrayList;


public class ItemsWithPricesList {
    public static ObservableList<ItemWithPrice> itemsWithPriceObservableList = FXCollections.observableArrayList();


    public static ObservableList<ItemWithPrice> updateList (ArrayList<Item> items){
        UpdateItem updateItem = new UpdateItem();
        System.out.println(itemsWithPriceObservableList.toString());
        items.forEach(item -> updateItem.updateItem(updateItem.addPricesToItem(item)));
        return itemsWithPriceObservableList;
    }
}


