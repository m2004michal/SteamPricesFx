package pl.SteamPricesFX.SteamPricesFx.MainSteamPricesFx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.PopupWindow;
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
    public void init() throws Exception{
        System.out.println("Init");
    }

    @Override
    public void start(Stage stage) throws Exception{
        System.out.println("Start");
        ShowMainStage showMainStage = new ShowMainStage();
        showMainStage.showMainStage(stage);

    }

    @Override
    public void stop() throws Exception {
        System.out.println("Stop");
    }

}
