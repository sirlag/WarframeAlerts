package me.sirlag.WarframeAlerts.Alert;

/**
 * Created by Matthew on 4/25/2015.
 */
public enum WFAlertType {
    Alert       ("Alert"),
    Outbreak    ("Outbreak"),
    Invasion    ("Invasion"),
    Other       ("Someone Fucked up, again");

    private final String alertType;

    WFAlertType(String alertType){
        this.alertType = alertType;
    }
}
