package com.example.HangmanGUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Hangman");
        // setting a vBOX Layout
        VBox box = new VBox();
        // setting up a scene with that layout
        Scene firstScene = new Scene(box,640,480);
        // put scene into this stage.
        primaryStage.setScene(firstScene);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
