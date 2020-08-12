package pl.SteamPricesFX.SteamPricesFx.MainSteamPricesFx;

import javafx.application.Application;
import javafx.stage.Stage;
import pl.SteamPricesFX.SteamPricesFx.File.FileCreating.FileCreator;
import pl.SteamPricesFX.SteamPricesFx.File.FileReading.FileReader;
import pl.SteamPricesFX.SteamPricesFx.File.FileWriting.FileWriter;
import pl.SteamPricesFX.SteamPricesFx.Guis.MainGui.ShowMainStage;
import pl.SteamPricesFX.SteamPricesFx.Items.Item.ItemList;

public class MainSteamPricesFx extends Application {
    public MainSteamPricesFx(){
        System.out.println("Constructor");
}


    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        System.out.println(fileReader.readFile().toString());
        launch();
    }

    @Override
    public void init(){
        System.out.println("Init");
    }

    @Override
    public void start(Stage stage) throws Exception{
        System.out.println("Start");
        FileCreator fileCreator = new FileCreator();
        fileCreator.createFile();
        ShowMainStage showMainStage = new ShowMainStage();
        showMainStage.showMainStage(stage);
    }

    @Override
    public void stop(){
        FileWriter.writeFile(ItemList.itemsList);
    }


}
