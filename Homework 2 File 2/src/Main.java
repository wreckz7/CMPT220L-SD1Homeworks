// Awais Razaque
// Homework 2 File 2
// 1/30/24

import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    System.out.println("Welcome to this quiz game!");
    System.out.println();
    Scanner sc = new Scanner(System.in);
    System.out.println("The rules of this quiz game are simple in that you will be asked a question and then given choices a, b, c, etc.");
    System.out.println("After reading the question and choices you will type the letter of your choice and find out if you're correct.");
    System.out.println("If you are correct then you will gain one point.");
    System.out.println();
    System.out.println("The topic of this quiz will be Formula One. Goodluck and have fun!");
    System.out.println("Please type <Enter> when you are ready to start the game: ");
    String enter = sc.nextLine();

    String userAnswer;
    int score = 0;

    String[] questionList = {"Who is the 2023 Formula One World Drivers' Champion? This driver was crowned the Champion after placing second in the 2023 F1 Qatar GP Sprint on October 7th, 2023.", "How many drivers are tied for the most Formula One World Drivers' Championships?", "Who has raced the most Formula One races in their career?", "Who has the most total wins in their career?", "What team has won the most Formula One Grand Prix Races?"};
    String[] answerChoices = {"a) Lewis Hamilton b) Lando Norris c) Max Verstappen d) Fernando Alonso", "a) Four b) Two c) One d) Three", "a) Fernando Alonso b) Lewis Hamilton c) Rubens Barrichelo d) Kimi Räikkönen", "a) Michael Schumacher b) Lewis Hamilton c) Ayrton Senna", "a) Williams b) McLaren c) Mercedes d) Ferrari"};
    String[] correctAnswers = {"c", "b", "a", "b", "d"};
    System.out.println();

    for (int i = 0; i < questionList.length ; i++) {
        int temp = i + 1;
        System.out.println("Question " + temp + ":");
        System.out.println(questionList[i]);
        System.out.println("Your answer choices are: ");
        System.out.println(answerChoices[i]);
        System.out.println();
        System.out.println("What is your answer? ");
        userAnswer = sc.nextLine().toLowerCase(); //converts user answer to lowercase for the if/else part
        if (userAnswer.equals(correctAnswers[i])) {
            score = score + 1;
            System.out.println("Correct your score is now: " + score);
            System.out.println();
        } else {
            System.out.println("Sorry your choice was incorrect! Moving on to the next question...");
            System.out.println();
        }
    }
    System.out.println();
    System.out.println("Congratulations you have finished this quiz game!");
    System.out.println("Your final score was: " + score);
    System.out.println("Thanks for playing!");

    }
}