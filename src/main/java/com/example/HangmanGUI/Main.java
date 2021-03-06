package com.example.HangmanGUI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;
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
        introLabel.setText("Hello dear User.\nWelcome to our (Bojan, Szymon and Sebastian) Hangman Game.\n7 tries will determine if you live or die ... \nSo choose wise.");

        box.setSpacing(10);
        box.setPadding(new Insets(10, 10, 10, 10));

        // Add Buttons to Box
        Button playGameButton = new Button();
        playGameButton.setText("Play Game!");;

        playGameButton.setAlignment(Pos.CENTER);

        Button exitGameButton = new Button("Quit Game!");
        exitGameButton.setAlignment(Pos.CENTER);
        box.getChildren().addAll(introLabel,playGameButton,exitGameButton);

        // Add Event Handlers to buttons:
        exitGameButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.exit(0);
            }
        });

        // add Event Handler to Playbutton

        playGameButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                Stage gameStage = new Stage();
                gameStage.setTitle("Hangman Game");
                gameStage.setScene(HangmanGameLayout.drawHangmanGameScene(gameStage));


            }
        });

        // setting up a scene with that layout
        Scene firstScene = new Scene(box,400,200);
        // put scene into this stage.



        primaryStage.setScene(firstScene);
        primaryStage.setResizable(false);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
