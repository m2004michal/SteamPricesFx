package pl.SteamPricesFX.SteamPricesFx.Items.Item;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import pl.SteamPricesFX.SteamPricesFx.File.FileReading.FileReader;
import pl.SteamPricesFX.SteamPricesFx.JsonReader.JsonReader;
import pl.SteamPricesFX.SteamPricesFx.Math.ConvertPriceStringToDouble;

import java.util.ArrayList;


public class ItemsWithPricesList {

    public static ObservableList<ItemWithPrice> itemsWithPriceObservableList = FXCollections.observableArrayList();

    public static ObservableList<ItemWithPrice> updateList (ArrayList<Item> items){
        ConvertPriceStringToDouble convertPriceStringToDouble = new ConvertPriceStringToDouble();
        for (Item item : items) {
            itemsWithPriceObservableList.add(new ItemWithPrice(item.getId(),
                    item.getMarketName(),
                    item.getQuantity(),
                    convertPriceStringToDouble.convertPriceStringToDouble(new Item(item.getId(), item.getMarketName(), item.getQuantity())),
                    convertPriceStringToDouble.convertPriceStringToDouble(new Item(item.getId(), item.getMarketName(), item.getQuantity())) * item.getQuantity()));
        }
        return itemsWithPriceObservableList;
    }


    public String returnItemWithPrice(Item item){
        var convertPriceStringToDouble = new ConvertPriceStringToDouble();
        var convertPriceToString = new ConvertPriceToString();
        return "Quantity:" + item.getQuantity() + " Price: " + convertPriceToString.convertPriceToString(convertPriceStringToDouble.convertPriceStringToDouble(item));
    }


    public class ConvertPriceToString {
        public String convertPriceToString(double price){
            return price + "zł";
        }
    }



}


