package pl.SteamPricesFX.SteamPricesFx.MainSteamPricesFx;

import javafx.application.Application;
import javafx.stage.Stage;
import pl.SteamPricesFX.SteamPricesFx.Stages.ShowMainStage;

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
        ShowMainStage showMainStage = new ShowMainStage();
        showMainStage.showMainStage(stage);

    }

    @Override
    public void stop(){
        System.out.println("Stop");
    }

}
