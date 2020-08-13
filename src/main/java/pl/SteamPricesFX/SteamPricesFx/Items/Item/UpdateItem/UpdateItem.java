package pl.SteamPricesFX.SteamPricesFx.Items.Item.UpdateItem;

import pl.SteamPricesFX.SteamPricesFx.Items.Item.Item;
import pl.SteamPricesFX.SteamPricesFx.Items.Item.ItemWithPrice;
import pl.SteamPricesFX.SteamPricesFx.Items.Item.ItemsWithPricesList;
import pl.SteamPricesFX.SteamPricesFx.Math.ConvertPriceStringToDouble;

import static pl.SteamPricesFX.SteamPricesFx.Items.Item.ItemsWithPricesList.itemsWithPriceObservableList;

public class UpdateItem {

    public void updateItem(ItemWithPrice item){
        itemsWithPriceObservableList.add(item);

    }
    public ItemWithPrice addPricesToItem(Item item){
        ConvertPriceStringToDouble convertPriceStringToDouble = new ConvertPriceStringToDouble();
        ItemWithPrice item2 =  new ItemWithPrice(item.getId(),
                item.getMarketName(),
                item.getQuantity(),
                convertPriceStringToDouble.convertPriceStringToDouble(new Item(item.getId(), item.getMarketName(), item.getQuantity())),
                convertPriceStringToDouble.convertPriceStringToDouble(new Item(item.getId(), item.getMarketName(), item.getQuantity())) * item.getQuantity());
        return item2;
    }

}
