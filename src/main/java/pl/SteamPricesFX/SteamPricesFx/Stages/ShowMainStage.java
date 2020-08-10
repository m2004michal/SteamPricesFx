package pl.SteamPricesFX.SteamPricesFx.Stages;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class ShowMainStage {

    public void showMainStage(Stage stage) throws IOException {
        Pane mainPane = FXMLLoader.load(getClass().getResource("/SteamPricesFxml.fxml"));
        Scene scene = new Scene(mainPane);
        stage.setScene(scene);
        stage.setMaxHeight(520);
        stage.setMaxWidth(400);
        stage.setMinHeight(520);
        stage.setMinWidth(400);
        stage.setTitle("STracker");
        stage.show();
    }
}
