import me.sirlag.WarframeAlerts.*;
/**
 * @author Pieter Knickerbocker
 * @since 04/26/2015 16:47:24EST)
 */
public class WebInterfaceTest {
    @org.junit.Test
    public void Test() {
        WebInterface wI = new WebInterface("http://content.warframe.com/dynamic/rss.php");
        System.out.println(wI);
    }
}