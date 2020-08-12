package pl.SteamPricesFX.SteamPricesFx.MainSteamPricesFx;

import javafx.application.Application;
import javafx.stage.Stage;
import pl.SteamPricesFX.SteamPricesFx.MainSteamPricesFx.File.FileCreating.FileCreator;
import pl.SteamPricesFX.SteamPricesFx.MainSteamPricesFx.Guis.MainGui.ShowMainStage;

public class MainSteamPricesFx extends Application {
    public MainSteamPricesFx(){
        System.out.println("Constructor");
}


    public static void main(String[] args) {
        System.out.println("Main");
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
        System.out.println("Stop");
    }

}
