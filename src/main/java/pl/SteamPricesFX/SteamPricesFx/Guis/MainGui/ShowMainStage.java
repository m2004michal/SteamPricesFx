package pl.SteamPricesFX.SteamPricesFx.Guis.MainGui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ShowMainStage {

    public void showMainStage(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/Gui.fxml"));
        Scene scene = new Scene(root);
        stage.setMaxWidth(700);
        stage.setMinWidth(700);
        stage.setTitle("STracker");
        stage.setScene(scene);
        stage.show();
    }
}
