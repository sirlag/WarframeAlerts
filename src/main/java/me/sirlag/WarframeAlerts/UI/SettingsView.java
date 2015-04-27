package me.sirlag.WarframeAlerts.UI;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import me.sirlag.WarframeAlerts.WFAlertType;

import java.util.ArrayList;

public class SettingsView extends FlowPane {

    private ChoiceBox choiceBox;
    private ArrayList<WFAlertType> alertTypes;

    private Label alertLabel, outbreakLabel, invasionLabel;
    private CheckBox alertBox, outbreakBox, invasionBox;



    public SettingsView() {
        VBox checks, lablels;

        ChoiceBox<String> choiceBox = new ChoiceBox<>(FXCollections.observableArrayList("PC", "PS4"));
        choiceBox.setValue("PC");

        checks = new VBox(10);
        checks.setPadding(new Insets(20));

        lablels = new VBox(10);
        lablels.setPadding(new Insets(20));

        alertBox = new CheckBox("Normal Alerts");
        alertBox.setOnAction(e -> markAlertType(e));
        alertBox.setSelected(true);

        outbreakBox = new CheckBox("Outbreaks");
        outbreakBox.setOnAction(e -> markAlertType(e));
        outbreakBox.setSelected(true);

        invasionBox = new CheckBox("Invasions");
        invasionBox.setOnAction(e -> markAlertType(e));
        invasionBox.setSelected(true);

        markAlertType(new ActionEvent());

        checks.getChildren().addAll(alertBox, outbreakBox, invasionBox);
        lablels.getChildren().addAll(new Label("Alerts"), new Label("Invasions"), new Label("Outbreaks"));

        this.getChildren().addAll(checks, lablels, choiceBox);
    }

    public String getChoice(){
        if (choiceBox.getValue().equals("PC"))
            return "http://content.warframe.com/dynamic/rss.php";
        else if (choiceBox.getValue().equals("PS$"))
            return "http://content.ps4.warframe.com/dynamic/rss.php";
        return null; //You should never be here.
    }

    public ArrayList<WFAlertType> getWFAlertTypes(){
        return alertTypes;
    }

    private void markAlertType(ActionEvent e){
        alertTypes = new ArrayList<>();
        if (alertBox.isSelected())
            alertTypes.add(WFAlertType.Alert);
        if (invasionBox.isSelected())
            alertTypes.add(WFAlertType.Invasion);
        if (outbreakBox.isSelected())
            alertTypes.add(WFAlertType.Outbreak);
    }
}
