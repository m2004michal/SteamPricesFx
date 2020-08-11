package pl.SteamPricesFX.SteamPricesFx.MainSteamPricesFx.Guis.MainGui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class ShowMainStage {

    public void showMainStage(Stage stage) throws IOException {
        Pane mainPane = FXMLLoader.load(getClass().getResource("/Gui.fxml"));
        Scene scene = new Scene(mainPane);

        stage.setTitle("STracker");
        stage.setScene(scene);
        stage.setMaxWidth(400);


        stage.show();
    }
}
