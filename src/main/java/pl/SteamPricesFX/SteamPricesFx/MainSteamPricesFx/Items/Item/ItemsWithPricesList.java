package pl.SteamPricesFX.SteamPricesFx.MainSteamPricesFx.Items.Item;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import pl.SteamPricesFX.SteamPricesFx.MainSteamPricesFx.File.FileReading.FileReader;
import pl.SteamPricesFX.SteamPricesFx.MainSteamPricesFx.File.FileWriting.FileWriter;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ItemsWithPricesList {

    public static ObservableList<ItemWithPrice> itemsWithPriceObservableList = FXCollections.observableArrayList();

    //public static ObservableList<ItemWithPrice> itemsWithPriceObservableList = FXCollections.observableArrayList();
    public static void main(String[] args) {
        ItemsWithPricesList.itemsWithPriceObservableList.add(new ItemWithPrice("730", "Shattered Web Case", 32, 2.38, 222.38));



        System.out.println(FileReader.readFile().toString());

    }

}


