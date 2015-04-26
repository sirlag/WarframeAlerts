package me.sirlag.WarframeAlerts.UI;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

import me.sirlag.WarframeAlerts.Faction;
import me.sirlag.WarframeAlerts.UI.Util.FactionParser;
import me.sirlag.WarframeAlerts.WFAlert;

import java.util.ArrayList;

public class AlertPane extends Pane{

    private GridPane root;
    private GridPane leftPane;
    private GridPane rightPane;

    private ImageView factionIcon;

    private Label factionText;
    private Label planet;
    private Label node;

    private ArrayList<Text>  description;

    public AlertPane (WFAlert alert){

        //Creates Gridpane
        root = new GridPane();

        leftPane = new GridPane();

        factionIcon = new ImageView(new Image(FactionParser.parse(alert.getFactions().get(0))));
        factionText = new Label(alert.getFactions().get(0).getFaction());

        leftPane.getChildren().addAll(factionIcon);


    }
}
