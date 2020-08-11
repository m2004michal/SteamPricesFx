package pl.SteamPricesFX.SteamPricesFx.MainSteamPricesFx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
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
    public void init(){
        System.out.println("Init");
    }

    @Override
    public void start(Stage stage) throws Exception{
        System.out.println("Start");
        Parent root = FXMLLoader.load(getClass().getResource("/Gui.fxml"));

        Scene scene = new Scene(root);
        stage.setMaxWidth(700);
        stage.setMinWidth(700);
        stage.setTitle("STracker");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop(){
        System.out.println("Stop");
    }

}
