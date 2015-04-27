package me.sirlag.WarframeAlerts.Alert;

import java.util.ArrayList;

/**
 * Created by Matthew on 4/25/2015.
 */
public class WFAlert {
    //Strings
    private String guid;
    private String node;
    private String planet;
    private String description;
    private ArrayList<String> rewards;

    //Custom Enums. See the named class
    private ArrayList<Faction> factions;
    private WFAlertType WFAlertType;
    
    public WFAlert(String guid, String node, String planet, String description, ArrayList<String> rewards, ArrayList<Faction> factions,
                   WFAlertType WFAlertType) {
        this.guid = guid;
        this.node = node;
        this.planet = planet;
        this.description = description;
        this.rewards = rewards;
        this.factions = factions;
        this.WFAlertType = WFAlertType;
    }

    //Getters and Setters
    public String getGuid() {
        return guid;
    }

    public String getNode() {
        return node;
    }

    public String getPlanet() {
        return planet;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<String> getRewards() {
        return rewards;
    }

    public ArrayList<Faction> getFactions() {
        return factions;
    }

    public WFAlertType getWFAlertType() {
        return WFAlertType;
    }

}
