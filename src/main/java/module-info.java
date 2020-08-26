module SteamPricesFx {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires org.json;


    exports pl.SteamPricesFX.SteamPricesFx.MainSteamPricesFx to javafx.graphics;
    exports pl.SteamPricesFX.SteamPricesFx.Guis.MainGui.GuiController to javafx.fxml;

    opens pl.SteamPricesFX.SteamPricesFx.Guis.MainGui.GuiController to javafx.fxml;
}