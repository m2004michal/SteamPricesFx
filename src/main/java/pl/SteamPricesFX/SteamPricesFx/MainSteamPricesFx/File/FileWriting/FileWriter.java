package pl.SteamPricesFX.SteamPricesFx.MainSteamPricesFx.File.FileWriting;

import javafx.collections.ObservableList;
import pl.SteamPricesFX.SteamPricesFx.MainSteamPricesFx.Items.Item.ItemWithPrice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class FileWriter {

    public static void writeFile(ObservableList<ItemWithPrice> items) {
        String fileName = "followedItems.txt";
        try (
                var fs = new FileOutputStream(fileName);
                var os = new ObjectOutputStream(fs)
        ) {
            for (ItemWithPrice itemWithPrice : items) {
                os.writeObject(itemWithPrice);
            }

            System.out.println("Succesfuly saved file");

        } catch (IOException e) {
            System.err.println("Error occured while trying to save:  " + fileName);
            e.printStackTrace();
        }
    }
}
