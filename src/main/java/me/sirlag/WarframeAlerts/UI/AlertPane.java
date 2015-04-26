package me.sirlag.WarframeAlerts.UI;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import me.sirlag.WarframeAlerts.UI.Util.FactionParser;
import me.sirlag.WarframeAlerts.WFAlert;

import java.util.ArrayList;


public class AlertPane extends GridPane{

    private GridPane leftPane;
    private GridPane rightPane;

    private ImageView factionIcon;

    private Label factionText;
    private Label planet;
    private Label node;
    private Label description;

    private ArrayList<Label> rewards;

    public AlertPane (WFAlert alert){

        //Start of the logo side
        leftPane = new GridPane();

        factionIcon = new ImageView(new Image(FactionParser.parse(alert.getFactions().get(0))));
        factionText = new Label(alert.getFactions().get(0).getFaction());
        factionText.setAlignment(Pos.CENTER);

        leftPane.setRowIndex(factionIcon, 1);
        leftPane.getChildren().addAll(factionIcon,factionText);
        //Logo is done

        //Start of info side
        rightPane = new GridPane();
        Label title = new Label("ALERT");
        planet = new Label(alert.getPlanet());
        node = new Label(alert.getNode());
        description = new Label(alert.getDescription());

        rightPane.getChildren().addAll(title, planet, node, description);

        for(String s : alert.getRewards())
            rightPane.getChildren().addAll(new Label(s));

        this.setColumnIndex(leftPane, 0);
        this.setColumnIndex(rightPane, 1);

        this.getChildren().addAll(leftPane, rightPane);
    }
}
