package pl.SteamPricesFX.SteamPricesFx.JsonReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import org.json.JSONException;
import org.json.JSONObject;
import pl.SteamPricesFX.SteamPricesFx.Url.UrlCreator;


public class JsonReader {

    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }

    public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
        try (InputStream is = new URL(url).openStream()) {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));
            String jsonText = readAll(rd);
            return new JSONObject(jsonText);
        }
    }

    public String readPriceFromName(String id, String market_hash_name) {
        String lowestPrice;
        try {
            JSONObject json = readJsonFromUrl(UrlCreator.createURL(id, market_hash_name));
            lowestPrice = json.get("lowest_price").toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lowestPrice;
    }
    public static String returnPriceString(String id, String marketName){
        JsonReader jsonReader = new JsonReader();
        try {
            return jsonReader.readPriceFromName(id, marketName);
        }catch (RuntimeException e){
            System.err.println("error");
        }
        return jsonReader.readPriceFromName(id, marketName);
    }

    public static void main(String[] args) {
        JsonReader jsonReader = new JsonReader();
        System.out.println(jsonReader.readPriceFromName("730", "Shattered Web Case"));
    }


}
