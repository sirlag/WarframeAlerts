/**
 * Created by Matthew on 4/25/2015.
 */
public enum AlertType {
    Alert       ("Alert"),
    Outbreak    ("Outbreak"),
    Invasion    ("Invasion"),
    Other       ("Someone Fucked up, again");

    private final String alertType;

    AlertType(String alertType){
        this.alertType = alertType;
    }
}
