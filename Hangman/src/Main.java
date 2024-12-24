// Awais Razaque
// Final Project: Hangman
// 5/5/24

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        String wordtoGuess = gameStart();
        userGuess(wordtoGuess);
        gameEnd();
    }

    public static String gameStart () {
        Scanner sc = new Scanner(System.in); // Strings
        Scanner scan = new Scanner (System.in); // Ints

        String start = "empty";
        while (start.equals("empty")) {
            System.out.println("Welcome to Hangman! Do you know how to play? (Y/N): ");
            start = sc.nextLine().toLowerCase();
            if (start.equals("y") || start.equals("n")) {
                break;
            } else {
                start = "empty";
                System.out.println("Invalid Input. Try again!");
                System.out.println();
            }
        }
        if (start.equals("n")) {
            System.out.println("Hangman is a guessing game for two or more players. One player thinks of a word, phrase, or sentence and the other(s) tries to guess it by suggesting letters or numbers within a certain number of guesses. Originally a paper-and-pencil game, there are now electronic versions. (Hangman (game) Wikipedia)");
            System.out.println("In this case, you will be trying to guess a word in 11 guesses (full picture of stick figure) that is randomly picked based on the difficulty or max word length you ask for!");
            System.out.println("Goodluck and have fun!");
        } else {
            System.out.println("Okay, have fun!");
        }
        System.out.println();

        System.out.println("Please choose a max value (word length will not pass this value) from 4 to 10: ");
        System.out.println("Examples: ");
        System.out.println("If you choose 4, you will be randomly given a word with length 1, 2, 3, or 4.");
        System.out.println("If you choose 10, you will be randomly given a word with length 1, 2, 3, 5, 6, 7, 8, 9 or 10.");
        String unverfieddifficulty = sc.nextLine();
        int verifieiddifficulty = 0;
        while (true) {
            if (isNumber(unverfieddifficulty)) {
                verifieiddifficulty = Integer.parseInt(unverfieddifficulty);
            }
            if (verifieiddifficulty >= 4 && verifieiddifficulty <= 10) {
                System.out.println("You have chosen the difficulty: " + verifieiddifficulty);
                System.out.println();
                break;
            } else {
                System.out.println("Invalid Input!");
                System.out.println();
                System.out.println("Please choose a max value (word length will not pass this value) from 4 to 10: ");
                System.out.println("Examples: ");
                System.out.println("If you choose 4, you will be randomly given a word with length 1, 2, 3, or 4.");
                System.out.println("If you choose 10, you will be randomly given a word with length 1, 2, 3, 5, 6, 7, 8, 9 or 10.");
                unverfieddifficulty = sc.nextLine();
            }

        }
        Hangman hang1 = new Hangman(verifieiddifficulty);
        String wordtoGuess = hang1.getWord();
        return wordtoGuess;
    }

    public static void userGuess (String w) {
        Scanner sc = new Scanner(System.in); // Strings
        List<String> wordSplit = new ArrayList<String>(); // Splits word into array to compare to
        Queue<String> guessTracker = new LinkedList<>(); // Tracks the users guesses in order
        List<String> fillIn = new ArrayList<String>(); // empty array _ _ _ of word length to fill in if the user's guess is correct
        int guessesLeft = 11; // standard guess count for stick figure
        String usersGuess;

        System.out.println("Your randomly chosen word has a length of: " + w.length());
        for (int i = 0; i < w.length(); i++) {
            fillIn.add("_");
        }
        System.out.println(fillIn);

        String[] arrOfStr = w.split("");
        for (String a : arrOfStr) {
            wordSplit.add(a);
        }
        System.out.println("You have " + guessesLeft + " guesses. Goodluck!");

        System.out.println();
        while (guessesLeft > 0) {
            while (true) {
                System.out.println("Give me a letter (a-z): ");
                usersGuess = sc.nextLine().toLowerCase();
                if (usersGuess.matches("[a-z]*") && usersGuess.length() == 1 && !guessTracker.contains(usersGuess)) {
                    System.out.println("You have chosen the letter: " + usersGuess);
                    guessTracker.add(usersGuess);
                    break;
                } else {
                    System.out.println("Invalid Input or letter already guessed. Try again!");
                    System.out.println();
                }
            }

            System.out.println();
            if (wordSplit.contains(usersGuess)) {
                System.out.println(usersGuess + " was in the word!");
                for (int i = 0; i < wordSplit.size(); i++) {
                    if (wordSplit.get(i).equals(usersGuess)) {
                        fillIn.set(i, usersGuess);
                    }
                }
                System.out.println("You have " + guessesLeft + " guesses left and have guesses " + guessTracker);
                System.out.println(fillIn);
                System.out.println();
            } else {
                System.out.println(usersGuess + " was not in the word!");
                guessesLeft = guessesLeft - 1;
                System.out.println("You have " + guessesLeft + " guesses left. So far you have guessed " + guessTracker);
                System.out.println(fillIn);
                System.out.println();
            }
            if (wordSplit.equals(fillIn)) {
                System.out.println("You have guessed the word. Congratulations, you still had " + guessesLeft + " guesses and made the guesses " + guessTracker + " in order.");
                System.out.println();
                break;
            }
        }
         if (guessesLeft == 0) {
             System.out.println("You were not able to guess the word. The word was: " + w);
             System.out.println("The guesses that you made were " + guessTracker + " in order.");
             System.out.println();
         }
    }

    public static void gameEnd() {
        System.out.println("Thank you for playing Hangman. Please consider playing again!");
        System.out.println("©2023 Awais Razaque, awaisrazaque05@gmail.com. All rights reserved."); //copyright notice is displayed (from intro project - python)
    }

    public static boolean isNumber (String input) {
        try {
            int converteduserNumber = Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}