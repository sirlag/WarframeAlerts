import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

public class AlertTest {

    @org.junit.Test
    public void Test(){
        ArrayList<Faction> factions = new ArrayList<>();
        factions.add(Faction.CORPUS);

        Alert alert = new Alert("551", "E-Gate", "Mars", "", null, factions, AlertType.Alert);
        assertEquals(alert.getGuid(), "551");
        assertEquals(alert.getNode(), "E-Gate");
        assertEquals(alert.getPlanet(), "Mars");
        assertEquals(alert.getDescription(), "");
        assert(alert.getFactions().contains(Faction.CORPUS));
        assertEquals(alert.getAlertType(), AlertType.Alert);
    }

}