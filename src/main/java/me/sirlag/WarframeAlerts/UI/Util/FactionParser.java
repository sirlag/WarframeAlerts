package me.sirlag.WarframeAlerts.UI.Util;

import me.sirlag.WarframeAlerts.Alert.Faction;

public class FactionParser {

    public static String parse(Faction faction) {
        String url = null;
        switch (faction) {
            case CORPUS: url = "/CorpusLogo.png";
                            break;
            case GRINEER: url = "/GrineerLogo.png";
                            break;
            case INFESTED:  url = "InfestedLogo.png";
                            break;
        }
        return url;
    }
}
