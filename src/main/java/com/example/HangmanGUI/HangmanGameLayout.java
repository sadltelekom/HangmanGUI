package com.example.HangmanGUI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HangmanGameLayout {
    public static int numberOfErrors = 0;
    static String wordToGuess = Words.getRandomWord();
    public static String alreadyGuessed;

    public static Scene drawHangmanGameScene() {
        for (int i = 0; i < wordToGuess.length(); i++) {
            alreadyGuessed = alreadyGuessed + "_";
        }

        BorderPane panel = new BorderPane();


        HBox bottomHBox = new HBox();


        bottomHBox.setSpacing(10);
        bottomHBox.setPadding(new Insets(10, 10, 10, 10));



        Label solvingWord = new Label(Words.drawGuessingDashes(wordToGuess));
        solvingWord.setPadding(new Insets(100, 100, 100, 250));

        Label hangmanStatus = new Label(HangmanGame.drawHangman(0));
        hangmanStatus.setPadding(new Insets(100, 250, 100, 100));

        Button buttonA = new Button("A");
        Button buttonB = new Button("B");
        Button buttonC = new Button("C");
        Button buttonD = new Button("D");
        Button buttonE = new Button("E");
        Button buttonF = new Button("F");
        Button buttonG = new Button("G");
        Button buttonH = new Button("H");
        Button buttonI = new Button("I");
        Button buttonJ = new Button("J");
        Button buttonK = new Button("K");
        Button buttonL = new Button("L");
        Button buttonM = new Button("M");
        Button buttonN = new Button("N");
        Button buttonO = new Button("O");
        Button buttonP = new Button("P");
        Button buttonQ = new Button("Q");
        Button buttonR = new Button("R");
        Button buttonS = new Button("S");
        Button buttonT = new Button("T");
        Button buttonU = new Button("U");
        Button buttonV = new Button("V");
        Button buttonW = new Button("W");
        Button buttonX = new Button("X");
        Button buttonY = new Button("Y");
        Button buttonZ = new Button("Z");

        bottomHBox.getChildren().addAll(solvingWord,hangmanStatus,buttonA,buttonB,buttonC,buttonD,buttonE,buttonF,buttonG,
                buttonH,buttonI,buttonJ,buttonK,buttonL,buttonM,buttonN,buttonO,buttonP,buttonQ, buttonR,buttonS,buttonT
                ,buttonU,buttonV,buttonW,buttonX,buttonY,buttonZ);


        panel.setLeft(solvingWord);
        panel.setRight(hangmanStatus);

        panel.setBottom(bottomHBox);

        buttonA.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("User Pressed A");

                if (wordToGuess.toUpperCase().contains("A")) {
                    replaceAlreadyGuessedLetters("A");

                } else {
                    System.out.printf("%s not correct try again\n", "A");
                    numberOfErrors++;
                }
            }

        });
        buttonB.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("User Pressed B");

                if (wordToGuess.toUpperCase().contains("B")) {
                    replaceAlreadyGuessedLetters("B");

                } else {
                    System.out.printf("%s not correct try again\n", "B");
                    numberOfErrors++;
                }
            }
        });
        buttonC.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("User Pressed C");

                if (wordToGuess.toUpperCase().contains("C")) {
                    replaceAlreadyGuessedLetters("C");

                } else {
                    System.out.printf("%s not correct try again\n", "C");
                    numberOfErrors++;
                }
            }
        });
        buttonD.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("User Pressed D");

                if (wordToGuess.toUpperCase().contains("D")) {
                    replaceAlreadyGuessedLetters("D");

                } else {
                    System.out.printf("%s not correct try again\n", "D");
                    numberOfErrors++;
                }
            }
        });
        buttonE.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("User Pressed E");

                if (wordToGuess.toUpperCase().contains("E")) {
                    replaceAlreadyGuessedLetters("E");

                } else {
                    System.out.printf("%s not correct try again\n", "E");
                    numberOfErrors++;
                }
            }
        });
        buttonF.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("User Pressed F");

                if (wordToGuess.toUpperCase().contains("F")) {
                    replaceAlreadyGuessedLetters("F");

                } else {
                    System.out.printf("%s not correct try again\n", "F");
                    numberOfErrors++;
                }
            }
        });
        buttonG.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("User Pressed G");

                if (wordToGuess.toUpperCase().contains("G")) {
                    replaceAlreadyGuessedLetters("G");

                } else {
                    System.out.printf("%s not correct try again\n", "G");
                    numberOfErrors++;
                }
            }

        });

        System.out.println("Play Button pressed.");
        // put scene into this stage.
        Scene newScene = new Scene(panel,900,400);


        return newScene;
    }

    public static void replaceAlreadyGuessedLetters(String guess) {
        // For every letter in wordToGuess we need to check if guess is equal and return this String and add it to alreadyGUessed
        // If no match add an Underscore
        // Return the made up strings nd save it to another variable: alreadyGuessed
        // need to replace Chars instead of concatinating



        for (int i = 0; i < wordToGuess.length() ; i++) {

            if (wordToGuess.charAt(i) == guess.charAt(0)) {
                //go zamenuva karakterot sto e ednakov so karaterot na userot - go replace the character that is equal with the character of the user input
                alreadyGuessed = alreadyGuessed.substring(0,i)+ guess.charAt(0) +alreadyGuessed.substring(i+1);

            } else {
                alreadyGuessed = alreadyGuessed.substring(0,i)+alreadyGuessed.substring(i);
            }
        }


    }

}
