package pl.SteamPricesFX.SteamPricesFx.Guis.MainGui.GuiController;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import pl.SteamPricesFX.SteamPricesFx.File.FileReading.FileReader;
import pl.SteamPricesFX.SteamPricesFx.Items.Item.Item;
import pl.SteamPricesFX.SteamPricesFx.Items.Item.ItemList;
import pl.SteamPricesFX.SteamPricesFx.Items.Item.ItemWithPrice;
import pl.SteamPricesFX.SteamPricesFx.Items.Item.ItemsWithPricesList;
import pl.SteamPricesFX.SteamPricesFx.Items.Item.UpdateItem.UpdateItem;


import java.net.URL;
import java.util.ResourceBundle;

import static pl.SteamPricesFX.SteamPricesFx.Items.Item.ItemsWithPricesList.updateList;


public class GuiController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        updateList(ItemList.itemsList);
        itemList.setItems(ItemsWithPricesList.itemsWithPriceObservableList);
    }
    @FXML
    Button addButton;

    @FXML
    TextField idPicker;
    @FXML
    TextField namePicker;
    @FXML
    TextField quantityPicker;
    @FXML
    ListView<ItemWithPrice> itemList;



    @FXML
    private void addItem(Event e){
        UpdateItem updateItem = new UpdateItem();
        Item item = new Item(idPicker.getText(), namePicker.getText(), Integer.parseInt(quantityPicker.getText()));
        ItemList.itemsList.add(item);
        updateItem.updateItem(updateItem.addPricesToItem(item));
        itemList.setItems(ItemsWithPricesList.itemsWithPriceObservableList);
    }
    @FXML
    private void removeItem(Event e){
        Item item = new Item(idPicker.getText(), namePicker.getText(), Integer.parseInt(quantityPicker.getText()));

    }



}
