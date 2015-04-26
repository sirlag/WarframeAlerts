package me.sirlag.WarframeAlerts.UI;/**
 * Created by Matthew on 4/26/2015.
 */

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.controlsfx.tools.Borders;

public class AlertsUI extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Button button = new Button("Empty Button");
        Node wrappedButton = Borders.wrap(button).lineBorder().build().build();

        StackPane root = new StackPane();
        root.getChildren().addAll(wrappedButton);

        Scene scene = new Scene(root, 300,250);

        primaryStage.setTitle("Warframe Alerts");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
