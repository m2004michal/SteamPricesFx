package pl.SteamPricesFX.SteamPricesFx.Math;

import pl.SteamPricesFX.SteamPricesFx.Items.Item.Item;
import pl.SteamPricesFX.SteamPricesFx.JsonReader.JsonReader;

public class ConvertPriceStringToDouble {
    public double convertPriceStringToDouble(Item item) {
        String price = JsonReader.returnPriceString(item.getId(), item.getMarketName());
        String[] result = price.split("z");
        String[] result1 = result[0].split(",");
        String price1 = result1[0] + result1[1];
        double priceDouble = (Double.parseDouble(price1) / 100);


        priceDouble = roundDouble(priceDouble);

        return priceDouble;
    }
    private static double roundDouble(double d){
        d = d*100;
        d = Math.round(d);
        d = d /100;
        return d;
    }

    public static void main(String[] args) {
        ConvertPriceStringToDouble convertPriceStringToDouble = new ConvertPriceStringToDouble();
        System.out.println(convertPriceStringToDouble.convertPriceStringToDouble(new Item("730", "Shattered Web Case", 10)));
    }
}
