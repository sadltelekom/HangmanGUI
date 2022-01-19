package com.example.HangmanGUI;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class sceneChanger {
    public static void setNewScene(Stage stage, Scene scene) {
        stage.setScene(scene);
        stage.show();
    }
}
