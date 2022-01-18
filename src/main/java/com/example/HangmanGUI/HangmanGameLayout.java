package com.example.HangmanGUI;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class HangmanGameLayout {
    public static Scene drawHangmanGameScene() {
        BorderPane panel = new BorderPane();


        HBox newHBox = new HBox();

        newHBox.setSpacing(10);
        newHBox.setPadding(new Insets(10, 10, 10, 10));
        Label solvingWord = new Label("Test");
        Label hangmanStatus = new Label("_____\n" +
                                          "|    \n"   +
                                          "|    \n"   +
                                          "|    \n"   +
                                          "|    \n"   +
                                          "|    \n"   +
                                          "________");
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

        newHBox.getChildren().addAll(solvingWord,hangmanStatus,buttonA,buttonB,buttonC,buttonD,buttonE,buttonF);

        panel.setLeft(solvingWord);
        panel.setRight(hangmanStatus);
        panel.setBottom(newHBox);



        System.out.println("Play Button pressed.");
        // put scene into this stage.
        Scene newScene = new Scene(panel,640,480);


        return newScene;
    }
}
