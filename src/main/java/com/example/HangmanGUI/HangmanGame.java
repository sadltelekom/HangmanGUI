package com.example.HangmanGUI;

import java.util.Scanner;

public class HangmanGame {
    static Scanner scanner = new Scanner(System.in);
    static int numberOfErrors = 0;
    static String wordToGuess;
    static String alreadyGuessed = "";

    public static void startGame() {
        // Print Intro
        // get word from Words Class and drawGuessingDashes
        System.out.println("Hello fellow User.");
        System.out.println("Welcome to our (Bojan, Szymon and Sebastian) Hangman Game");
        System.out.println("7 tries will determine if you live or die ... ");
        System.out.println("So choose wise.");
        wordToGuess = Words.getRandomWord();
        // Initialise alreadyGuessed
        for (int i = 0; i < wordToGuess.length(); i++) {
            alreadyGuessed = alreadyGuessed + "_";
        }

        Words.drawGuessingDashes(wordToGuess);
        System.out.println();
        runGame();

    }

    public static void runGame() {
        // ask user for input ? If correct input showLetters.
        // if input wrong -> increase numberOfErrors and draw hangman
       while (numberOfErrors<=7){
           if(numberOfErrors==7){
               drawHangman(numberOfErrors);
               break;
           }
           drawHangman(numberOfErrors);
           getUserInput();
           if (checkWin()) {
               System.out.println("You Win!! You are still alive!!!");
               break;
           }
           drawAlreadyGuessed();

       }

    }

    public static void getUserInput() {
        // get input and check it.
        // ask for letter or solution to word.
        String guess = "";
        try {
            System.out.print("Give Word or Letter to check ");
            guess = scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Wrong input");
            getUserInput();
        }

        if (wordToGuess.toUpperCase().contains(guess.toUpperCase())) {
            replaceAlreadyGuessedLetters(guess.toUpperCase());

        } else {
            System.out.printf("%s not correct try again\n", guess);
            numberOfErrors++;
        }
    }

    public static boolean checkWin() {
        // Loose if number of errors >= 7
        // win if userguess matches with word
        if (alreadyGuessed.toUpperCase().equals(wordToGuess.toUpperCase())){
            return true;
        }
        return false;
    }

    public static String drawHangman(int numberOfErrors) {
        String Gallows ="";
        if (numberOfErrors == 0) {
            Gallows = "_____ \n" + "|    \n" + "|    \n" + "|       \n" + "|    \n" + "|      \n" + "________\n";
        } else if (numberOfErrors == 1) {
            Gallows = "_____ \n" + "|   |\n" + "|    \n" + "|       \n" + "|    \n" + "| _/  \n" + "________\n";
        } else if (numberOfErrors == 2) {
            Gallows = "_____ \n" + "|   |\n" + "|    \n" + "|       \n" + "|    \n" + "| _/ \\_\n" + "________\n";
        } else if (numberOfErrors == 3) {
            Gallows = "_____ \n" + "|   |\n" + "|    \n" + "|       \n" + "|   |\n" + "| _/ \\_\n" + "________\n";
        } else if (numberOfErrors == 4) {
            Gallows = "_____ \n" + "|   |\n" + "|    \n" + "|   | \n" + "|   |\n" + "| _/ \\_\n" + "________\n";
        } else if (numberOfErrors == 5) {
            Gallows = "_____ \n" + "|   |\n" + "|    \n" + "|  /|  \n" + "|   |\n" + "| _/ \\_\n" + "________\n";
        } else if (numberOfErrors == 6) {
            Gallows = "_____ \n" + "|   |\n" + "|    \n" + "|  /|\\ \n" + "|   |\n" + "| _/ \\_\n" + "________\n";
        } else if (numberOfErrors == 7) {
            Gallows = "_____ \n" + "|   |\n" + "|   O\n" + "|  /|\\ \n" + "|   |\n" + "| _/ \\_\n" + "________\n" + " Sorry you lost\n";
        } return Gallows;
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

    public static void drawAlreadyGuessed() {

        for (int i = 0; i <= alreadyGuessed.length() - 1; i++) {
            System.out.print(alreadyGuessed.charAt(i) + " ");
        }
        System.out.println();

    }
}