package pl.SteamPricesFX.SteamPricesFx.MainSteamPricesFx;

import javafx.application.Application;
import javafx.stage.Stage;

public class MainSteamPricesFx extends Application {
    public MainSteamPricesFx(){
        System.out.println("Constructor");
    }


    public static void main(String[] args) {
        System.out.println("Main");
        launch();
    }
    @Override
    public void init() throws Exception{
        System.out.println("Init");
    }


    @Override
    public void start(Stage stage) throws Exception{
        stage.setTitle("STracker");
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        System.out.println("Stop");
    }
}
