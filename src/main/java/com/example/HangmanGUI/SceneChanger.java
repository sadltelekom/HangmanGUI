package com.example.HangmanGUI;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneChanger {
    public static void setNewScene(Stage stage, Scene scene) {
        stage.setScene(scene);
        stage.show();
    }
}
