import me.sirlag.WarframeAlerts.Alert.WFAlert;
import me.sirlag.WarframeAlerts.Alert.WFAlertType;
import me.sirlag.WarframeAlerts.Alert.Faction;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

public class WFAlertTest {

    @org.junit.Test
    public void Test(){
        ArrayList<Faction> factions = new ArrayList<>();
        factions.add(Faction.CORPUS);

        WFAlert alert = new WFAlert("551", "E-Gate", "Mars", "", null, factions, WFAlertType.Alert);
        assertEquals(alert.getGuid(), "551");
        assertEquals(alert.getNode(), "E-Gate");
        assertEquals(alert.getPlanet(), "Mars");
        assertEquals(alert.getDescription(), "");
        assert(alert.getFactions().contains(Faction.CORPUS));
        assertEquals(alert.getWFAlertType(), WFAlertType.Alert);
    }

}