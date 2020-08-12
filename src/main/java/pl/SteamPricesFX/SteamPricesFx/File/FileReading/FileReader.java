package pl.SteamPricesFX.SteamPricesFx.File.FileReading;


import pl.SteamPricesFX.SteamPricesFx.Items.Item.Item;
import pl.SteamPricesFX.SteamPricesFx.Items.Item.ItemList;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class FileReader {

    public ArrayList<Item> readFile() {

        String fileName = "followedItems.txt";
        try (
                FileInputStream fis = new FileInputStream(fileName);
                ObjectInputStream ois = new ObjectInputStream(fis)
        ) {
            Item item;

            do {
                item = (Item) ois.readObject();
                ItemList.itemsList.add(item);
            } while (item != null);
        } catch (ClassNotFoundException | IOException e) {
        }
        if (!ItemList.itemsList.isEmpty()) System.out.println("Wczytano dane");

        return ItemList.itemsList;
    }
}
