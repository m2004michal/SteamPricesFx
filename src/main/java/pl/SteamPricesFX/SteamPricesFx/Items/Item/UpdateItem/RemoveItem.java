package pl.SteamPricesFX.SteamPricesFx.Items.Item.UpdateItem;

import pl.SteamPricesFX.SteamPricesFx.Items.Item.ItemList;
import pl.SteamPricesFX.SteamPricesFx.Items.Item.ItemsWithPricesList;

public class RemoveItem {
    public void removeItemFromLists(int index){
        ItemList.itemsList.remove(index -1);
        ItemsWithPricesList.itemsWithPriceObservableList.remove(index - 1);
    }
}
