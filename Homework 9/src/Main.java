// Awais Razaque
// Homework 9
// 4/15/24

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        String[] friendsNames = {"Evan", "Andrew", "Anthony", "Jackson", "Sam", "Dylan"};
        for (int i = 0; i < friendsNames.length; i++) {
            System.out.println(friendsNames[i]);
        }
        System.out.println();
        for (String i : friendsNames) {
            System.out.println(i);
        }

        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your grade in Software Development (rounded down) and I and I will convert it to a letter grade: ");
        int numberbeingChecked = sc.nextInt();
        switch (numberbeingChecked) {
            case 100:
                System.out.println("You got an A+!");
                break;
            case 90:
                System.out.println("You got an A!");
                break;
            case 80:
                System.out.println("You got a B!");
                break;
            case 70:
                System.out.println("You got a C!");
                break;
            case 60:
                System.out.println("You got a D!");
                break;
            case 50:
                System.out.println("You got an F!");
                break;
            default:
                System.out.println("Invalid Input. You probably didnt round your grade down!");
        }

        System.out.println();

        System.out.println("Please enter your age to the lowest 10 (so 15 becomes 10, 24 becomes 20) and I will tell you if you can drink: ");
        numberbeingChecked = sc.nextInt();
        switch (numberbeingChecked) {
            case 0:
            case 10:
                System.out.println("You cannot drink!");
                break;
            case 20:
                System.out.println("You may be able to drink!");
                break;
            case 30:
            case 40:
            case 50:
            case 60:
            case 70:
            case 80:
            case 90:
                System.out.println("You can drink!");
                break;
            default:
                System.out.println("Invalid Input. You probably didn't round your age!");
        }

        System.out.println();

        Random rand = new Random();
        int originalVariable = 100;
        System.out.println("Original Variable: " + originalVariable);
        originalVariable += rand.nextInt(1000);
        System.out.println("Addition: " + originalVariable);
        originalVariable -= rand.nextInt(200);
        System.out.println("Subtraction: " + originalVariable);
        originalVariable *= rand.nextInt(4);
        System.out.println("Multiplication: " + originalVariable);
        originalVariable /= 5;
        System.out.println("Division: " + originalVariable);

        System.out.println();
        System.out.println("What is your age? ");
        int age = sc.nextInt();
        String result = (age >= 21) ? ("You can drink with the age of: " + age): ("You cannot drink with the age of: " + age);
        System.out.println(result);
    }
}