package com.example.HangmanGUI;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Hangman");
        // setting a vBOX Layout
        VBox box = new VBox();
        // Add label to box
        Label introLabel = new Label();
        introLabel.setTextAlignment(TextAlignment.CENTER);
        introLabel.setText("Hello fellow User.\nWelcome to our (Bojan, Szymon and Sebastian) Hangman Game.\n7 tries will determine if you live or die ... \nSo choose wise.");
        box.getChildren().addAll(introLabel);
        box.setSpacing(10);
        box.setPadding(new Insets(10, 10, 10, 10));



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
