/**
 * Created by Matthew on 4/25/2015.
 */
public enum Faction {
    GRINEER         ("Grineer"),
    CORPUS          ("Corpus"),
    INFESTED        ("Infested"),
    CORRUPTED       ("Corrupted"),
    SENTIENTS       ("Sentients"),          //These things aren't here yet. Just saying
    OTHER           ("Someone Fucked up");  //It's true

    private final String faction;
    Faction(String faction) {
        this.faction = faction;
    }
}

