import java.util.ArrayList;
import java.util.List;

/**
 * Created by Matthew on 4/25/2015.
 */
public class Alert {
    //Strings
    private String guid;
    private String node;
    private String planet;
    private String description;
    private ArrayList<String> rewards;

    //Custom Enums. See the named class
    private ArrayList<Faction> factions;
    private AlertType alertType;
    
    public Alert(String guid, String node, String planet, String description, ArrayList<String> rewards, ArrayList<Faction> factions,
                 AlertType alertType) {
        this.guid = guid;
        this.node = node;
        this.planet = planet;
        this.description = description;
        this.rewards = rewards;
        this.factions = factions;
        this.alertType = alertType;
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

    public AlertType getAlertType() {
        return alertType;
    }

}
