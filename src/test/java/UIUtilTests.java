import javafx.event.ActionEvent;
import me.sirlag.WarframeAlerts.Alert.Faction;
import me.sirlag.WarframeAlerts.UI.Util.FactionParser;
import me.sirlag.WarframeAlerts.UI.Util.NotificationSound;

import static org.junit.Assert.assertEquals;

public class UIUtilTests {

    @org.junit.Test
    public void testSound(){
       assert(NotificationSound.playNotification(new ActionEvent()));
    }

    @org.junit.Test
    public  void testFactionParser(){
        assertEquals(FactionParser.parse(Faction.GRINEER), "/GrineerLogo.png");
    }
}
