package pl.SteamPricesFX.SteamPricesFx.MainSteamPricesFx.Guis.MainGui.GuiController;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;


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
    ListView<String> itemList;




}
