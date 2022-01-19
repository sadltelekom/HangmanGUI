package com.example.HangmanGUI;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HangmanGameLayout {
    public static int numberOfErrors = 0;
    static String wordToGuess = Words.getRandomWord();
    public static String alreadyGuessed = Words.getAlreadyGuessed(wordToGuess);
    public static Stage gameStage;

    public static Scene drawHangmanGameScene(Stage newStage) {
        if (alreadyGuessed.toUpperCase().equals(wordToGuess.toUpperCase())){
            System.out.println("You won");
            wordToGuess = Words.getRandomWord();
            alreadyGuessed = Words.getAlreadyGuessed(wordToGuess);
            // show winner scene
            // close game
            System.exit(0);
        }
        if(numberOfErrors == 7) {
            System.out.println("You lost");
            // show winner scene
            // close game
            System.exit(0);
        }

        gameStage = newStage;
        gameStage.setResizable(false);
        gameStage.show();
        System.out.println(wordToGuess);
        BorderPane panel = new BorderPane();


        HBox bottomHBox = new HBox();


        bottomHBox.setSpacing(10);
        bottomHBox.setPadding(new Insets(10, 10, 10, 10));



        Label solvingWord = new Label(alreadyGuessed);
        solvingWord.setPadding(new Insets(100, 100, 100, 250));

        Label hangmanStatus = new Label(HangmanGame.drawHangman(numberOfErrors));
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
                sceneChanger.setNewScene(gameStage,drawHangmanGameScene(gameStage));

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
                sceneChanger.setNewScene(gameStage,drawHangmanGameScene(gameStage));
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
                sceneChanger.setNewScene(gameStage,drawHangmanGameScene(gameStage));
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
                sceneChanger.setNewScene(gameStage,drawHangmanGameScene(gameStage));
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
                sceneChanger.setNewScene(gameStage,drawHangmanGameScene(gameStage));
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
                sceneChanger.setNewScene(gameStage,drawHangmanGameScene(gameStage));
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
                sceneChanger.setNewScene(gameStage,drawHangmanGameScene(gameStage));
            }

        });
        buttonH.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("User Pressed H");

                if (wordToGuess.toUpperCase().contains("H")) {
                    replaceAlreadyGuessedLetters("H");

                } else {
                    System.out.printf("%s not correct try again\n", "H");
                    numberOfErrors++;
                }
                sceneChanger.setNewScene(gameStage,drawHangmanGameScene(gameStage));
            }

        });
        buttonI.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("User Pressed I");

                if (wordToGuess.toUpperCase().contains("I")) {
                    replaceAlreadyGuessedLetters("I");

                } else {
                    System.out.printf("%s not correct try again\n", "I");
                    numberOfErrors++;
                }
                sceneChanger.setNewScene(gameStage,drawHangmanGameScene(gameStage));
            }

        });
        buttonJ.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("User Pressed J");

                if (wordToGuess.toUpperCase().contains("J")) {
                    replaceAlreadyGuessedLetters("J");

                } else {
                    System.out.printf("%s not correct try again\n", "J");
                    numberOfErrors++;
                }
                sceneChanger.setNewScene(gameStage,drawHangmanGameScene(gameStage));
            }

        });
        buttonK.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("User Pressed K");

                if (wordToGuess.toUpperCase().contains("K")) {
                    replaceAlreadyGuessedLetters("K");

                } else {
                    System.out.printf("%s not correct try again\n", "K");
                    numberOfErrors++;
                }
                sceneChanger.setNewScene(gameStage,drawHangmanGameScene(gameStage));
            }

        });
        buttonL.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("User Pressed L");

                if (wordToGuess.toUpperCase().contains("L")) {
                    replaceAlreadyGuessedLetters("L");

                } else {
                    System.out.printf("%s not correct try again\n", "L");
                    numberOfErrors++;
                }
                sceneChanger.setNewScene(gameStage,drawHangmanGameScene(gameStage));
            }

        });
        buttonM.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("User Pressed M");

                if (wordToGuess.toUpperCase().contains("M")) {
                    replaceAlreadyGuessedLetters("M");

                } else {
                    System.out.printf("%s not correct try again\n", "M");
                    numberOfErrors++;
                }
                sceneChanger.setNewScene(gameStage,drawHangmanGameScene(gameStage));
            }

        });
        buttonN.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("User Pressed N");

                if (wordToGuess.toUpperCase().contains("N")) {
                    replaceAlreadyGuessedLetters("N");

                } else {
                    System.out.printf("%s not correct try again\n", "N");
                    numberOfErrors++;
                }
                sceneChanger.setNewScene(gameStage,drawHangmanGameScene(gameStage));
            }

        });
        buttonO.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("User Pressed O");

                if (wordToGuess.toUpperCase().contains("O")) {
                    replaceAlreadyGuessedLetters("O");

                } else {
                    System.out.printf("%s not correct try again\n", "O");
                    numberOfErrors++;
                }
                sceneChanger.setNewScene(gameStage,drawHangmanGameScene(gameStage));
            }

        });
        buttonP.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("User Pressed P");

                if (wordToGuess.toUpperCase().contains("P")) {
                    replaceAlreadyGuessedLetters("P");

                } else {
                    System.out.printf("%s not correct try again\n", "P");
                    numberOfErrors++;
                }
                sceneChanger.setNewScene(gameStage,drawHangmanGameScene(gameStage));
            }
        });
        buttonQ.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("User Pressed Q");

                if (wordToGuess.toUpperCase().contains("Q")) {
                    replaceAlreadyGuessedLetters("Q");

                } else {
                    System.out.printf("%s not correct try again\n", "Q");
                    numberOfErrors++;
                }
                sceneChanger.setNewScene(gameStage,drawHangmanGameScene(gameStage));
            }

        });
        buttonR.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("User Pressed R");

                if (wordToGuess.toUpperCase().contains("R")) {
                    replaceAlreadyGuessedLetters("R");

                } else {
                    System.out.printf("%s not correct try again\n", "R");
                    numberOfErrors++;
                }
                sceneChanger.setNewScene(gameStage,drawHangmanGameScene(gameStage));
            }

        });
        buttonS.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("User Pressed S");

                if (wordToGuess.toUpperCase().contains("S")) {
                    replaceAlreadyGuessedLetters("S");

                } else {
                    System.out.printf("%s not correct try again\n", "S");
                    numberOfErrors++;
                }
                sceneChanger.setNewScene(gameStage,drawHangmanGameScene(gameStage));
            }

        });
        buttonT.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("User Pressed T");

                if (wordToGuess.toUpperCase().contains("T")) {
                    replaceAlreadyGuessedLetters("T");

                } else {
                    System.out.printf("%s not correct try again\n", "T");
                    numberOfErrors++;
                }
                sceneChanger.setNewScene(gameStage,drawHangmanGameScene(gameStage));
            }

        });
        buttonU.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("User Pressed U");

                if (wordToGuess.toUpperCase().contains("U")) {
                    replaceAlreadyGuessedLetters("U");

                } else {
                    System.out.printf("%s not correct try again\n", "U");
                    numberOfErrors++;
                }
                sceneChanger.setNewScene(gameStage,drawHangmanGameScene(gameStage));
            }

        });
        buttonV.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("User Pressed V");

                if (wordToGuess.toUpperCase().contains("V")) {
                    replaceAlreadyGuessedLetters("V");

                } else {
                    System.out.printf("%s not correct try again\n", "V");
                    numberOfErrors++;
                }
                sceneChanger.setNewScene(gameStage,drawHangmanGameScene(gameStage));
            }

        });
        buttonW.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("User Pressed W");

                if (wordToGuess.toUpperCase().contains("W")) {
                    replaceAlreadyGuessedLetters("W");

                } else {
                    System.out.printf("%s not correct try again\n", "W");
                    numberOfErrors++;
                }
                sceneChanger.setNewScene(gameStage,drawHangmanGameScene(gameStage));
            }

        });
        buttonX.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("User Pressed X");

                if (wordToGuess.toUpperCase().contains("X")) {
                    replaceAlreadyGuessedLetters("X");

                } else {
                    System.out.printf("%s not correct try again\n", "X");
                    numberOfErrors++;
                }
                sceneChanger.setNewScene(gameStage,drawHangmanGameScene(gameStage));
            }

        });
        buttonY.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("User Pressed Y");

                if (wordToGuess.toUpperCase().contains("Y")) {
                    replaceAlreadyGuessedLetters("Y");

                } else {
                    System.out.printf("%s not correct try again\n", "Y");
                    numberOfErrors++;
                }
                sceneChanger.setNewScene(gameStage,drawHangmanGameScene(gameStage));
            }

        });
        buttonZ.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("User Pressed Z");

                if (wordToGuess.toUpperCase().contains("Z")) {
                    replaceAlreadyGuessedLetters("Z");

                } else {
                    System.out.printf("%s not correct try again\n", "Z");
                    numberOfErrors++;
                }
                sceneChanger.setNewScene(gameStage,drawHangmanGameScene(gameStage));
            }

        });


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
