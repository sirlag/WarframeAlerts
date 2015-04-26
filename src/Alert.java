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
    private List<String> rewards;

    //Custom Enums. See the named class
    private Faction faction;
    private AlertType alertType;


    public Alert(String guid, String node, String planet, String description, List<String> rewards, Faction faction,
                 AlertType alertType) {
        this.guid = guid;
        this.node = node;
        this.planet = planet;
        this.description = description;
        this.rewards = rewards;
        this.faction = faction;
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

    public List<String> getRewards() {
        return rewards;
    }

    public Faction getFaction() {
        return faction;
    }

    public AlertType getAlertType() {
        return alertType;
    }

}
