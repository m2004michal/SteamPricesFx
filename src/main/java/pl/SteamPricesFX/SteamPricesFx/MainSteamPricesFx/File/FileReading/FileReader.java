package pl.SteamPricesFX.SteamPricesFx.MainSteamPricesFx.File.FileReading;

import javafx.collections.ObservableList;
import pl.SteamPricesFX.SteamPricesFx.MainSteamPricesFx.Items.Item.ItemWithPrice;
import pl.SteamPricesFX.SteamPricesFx.MainSteamPricesFx.Items.Item.ItemsWithPricesList;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FileReader {

    public ObservableList<ItemWithPrice> readFile() {

        String fileName = "followedItems.txt";
        try (
                FileInputStream fis = new FileInputStream(fileName);
                ObjectInputStream ois = new ObjectInputStream(fis)
        ) {
            ItemWithPrice itemWithPrice;

            do {
                itemWithPrice = (ItemWithPrice) ois.readObject();
                ItemsWithPricesList.itemsWithPriceObservableList.add(itemWithPrice);
            } while (itemWithPrice != null);
        } catch (ClassNotFoundException | IOException e) {
        }
        if (!ItemsWithPricesList.itemsWithPriceObservableList.isEmpty()) System.out.println("data loaded");

        return ItemsWithPricesList.itemsWithPriceObservableList;
    }
}
