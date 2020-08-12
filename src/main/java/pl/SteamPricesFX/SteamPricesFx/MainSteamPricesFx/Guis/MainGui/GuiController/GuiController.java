package pl.SteamPricesFX.SteamPricesFx.MainSteamPricesFx.Guis.MainGui.GuiController;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import pl.SteamPricesFX.SteamPricesFx.MainSteamPricesFx.Items.Item.ItemWithPrice;
import pl.SteamPricesFX.SteamPricesFx.MainSteamPricesFx.Items.Item.ItemsWithPricesList;


import java.net.URL;
import java.util.ResourceBundle;



public class GuiController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

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
        ItemsWithPricesList.itemsWithPriceObservableList.add(new ItemWithPrice(idPicker.getText(), namePicker.getText(), Integer.parseInt(quantityPicker.getText()), 2.38, 222.38));
        itemList.setItems(ItemsWithPricesList.itemsWithPriceObservableList);
    }



}
