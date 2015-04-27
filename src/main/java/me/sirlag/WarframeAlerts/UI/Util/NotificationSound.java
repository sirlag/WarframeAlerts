package me.sirlag.WarframeAlerts.UI.Util;

import javafx.event.ActionEvent;
import javafx.scene.media.AudioClip;

public class NotificationSound {
    public static void playNotification(ActionEvent e){
        final AudioClip alertSound = new AudioClip(NotificationSound.class.getResource("/alert.wav").toString());
        alertSound.play();
    }
}
