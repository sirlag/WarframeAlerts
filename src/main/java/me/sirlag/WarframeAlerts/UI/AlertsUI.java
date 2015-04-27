package me.sirlag.WarframeAlerts.UI;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import me.sirlag.WarframeAlerts.Faction;
import me.sirlag.WarframeAlerts.WFAlert;
import me.sirlag.WarframeAlerts.WFAlertType;
import org.controlsfx.tools.Borders;

import java.util.ArrayList;

public class AlertsUI extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        ArrayList<Faction> factions = new ArrayList<>();
        factions.add(Faction.GRINEER);
        ArrayList<String> rewards = new ArrayList<String>();
        rewards.add("Potato");

        WFAlert alert = new WFAlert("551", "E-Gate", "Mars", "some text", rewards, factions, WFAlertType.Alert);

        AlertPane testAlert = new AlertPane(alert);

        Node wrappedAlert = Borders.wrap(testAlert).lineBorder().build().build();

        FlowPane root = new FlowPane();
        root.getChildren().addAll(wrappedAlert, new SettingsView());

        Scene scene = new Scene(root, 300,250);

        Image icon = new Image("/Lotus_Icon.png");
        primaryStage.getIcons().add(icon);
        primaryStage.setTitle("Warframe Alerts");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
