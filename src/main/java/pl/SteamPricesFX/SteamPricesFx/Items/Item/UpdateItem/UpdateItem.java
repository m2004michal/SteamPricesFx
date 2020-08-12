package pl.SteamPricesFX.SteamPricesFx.Items.Item.UpdateItem;

import pl.SteamPricesFX.SteamPricesFx.Items.Item.Item;
import pl.SteamPricesFX.SteamPricesFx.Items.Item.ItemWithPrice;
import pl.SteamPricesFX.SteamPricesFx.Math.ConvertPriceStringToDouble;

import static pl.SteamPricesFX.SteamPricesFx.Items.Item.ItemsWithPricesList.itemsWithPriceObservableList;

public class UpdateItem {

    public void updateItem(Item item){
        ConvertPriceStringToDouble convertPriceStringToDouble = new ConvertPriceStringToDouble();
         itemsWithPriceObservableList.add(new ItemWithPrice(item.getId(),
                item.getMarketName(),
                item.getQuantity(),
                convertPriceStringToDouble.convertPriceStringToDouble(new Item(item.getId(), item.getMarketName(), item.getQuantity())),
                convertPriceStringToDouble.convertPriceStringToDouble(new Item(item.getId(), item.getMarketName(), item.getQuantity())) * item.getQuantity()));
    }

}
