package me.sirlag.WarframeAlerts.UI.Util;

import com.esotericsoftware.minlog.Log;
import javafx.event.ActionEvent;
import javafx.scene.media.AudioClip;
import javafx.scene.media.MediaException;

public class NotificationSound {
    public static boolean playNotification(ActionEvent e) {
        try {
            final AudioClip alertSound = new AudioClip(NotificationSound.class.getResource("/alert.wav").toString());
            alertSound.play();
        } catch (MediaException ex) {
            Log.error("Alert.wav was unable to open", ex);
            return false;
        }
        return true;
    }
}
