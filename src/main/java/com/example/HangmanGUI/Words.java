package com.example.HangmanGUI;

import java.util.concurrent.ThreadLocalRandom;

public class Words {
    static String[] wordsArray = {"Xylophon","onyx","haphazard","puppy","kayak","jumbo","juicy","cycle","matrix","luxury","lucky","pneumonia","gazebo","galvanize","galaxy","avenue",
            "absurd","abyss","awkward","bandwagon","beekeeper","staff","stretch","gossip","scratch","icebox","blizzard","bookworm",
            "buffalo","buzzwords","buzzing","cobweb","keyhole","daiquiri","duplex","joyful","equip","dwarves","jigsaw","jawbreaker",
            "jackpot","injury","grogginess","stronghold","yachtsman","espionage","exodus","fishhook","fluffiness","kilobyte","oxidize","peekaboo","President","Carnival","oxygen",
            "Football","unknown","transplant","unworthy","vaporize","quizzes","whiskey","vodka","walkway","wave","witchcraft","wristwatch","zodiac","youthful","zigzagging","rhythm",
            "subway","quorum","nowadays","Spiderman","strength","lengths","transcript","syndrome","megahertz","microwave","nightclub","puzzling","schnapps","thumbscrew","transgress","jiujitsu","wyvern","curacao"};


    public static String getRandomWord() {
        int randomNumber = ThreadLocalRandom.current().nextInt(0,wordsArray.length);
        String randomWord = wordsArray[randomNumber].toUpperCase();
        return randomWord;
    }

    public static String drawGuessingDashes(String searchWord) {

        //System.out.println(searchWord);
        String underscoredWord ="";
        for (int i = 0;i <= searchWord.length() - 1;i++) {
            underscoredWord += "_ ";
        }
        return underscoredWord;
    }
    public static String getAlreadyGuessed(String searchWord) {
        String alreadyGuessed = "";
        for (int i = 0; i < searchWord.length(); i++) {
            alreadyGuessed = alreadyGuessed + "_";
        }
        return alreadyGuessed;
    }
}
