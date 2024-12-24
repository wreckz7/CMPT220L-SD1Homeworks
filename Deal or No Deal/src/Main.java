// Awais Razaque
// Deal or No Deal
// 2/23/24

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // Initialize Cases
        Random rand = new Random();
        int[] cases = {1, 5, 10, 25, 50, 75, 100, 200, 300, 400, 500, 750, 1000, 3000, 5000, 10000, 25000, 50000, 75000, 100000, 200000, 300000, 400000, 500000, 750000, 1000000};

        // Shuffle Cases
        for (int i = 0; i < cases.length; i++) {
            int randomIndex = rand.nextInt(cases.length);
            int temp = cases[randomIndex];
            cases[randomIndex] = cases[i];
            cases[i] = temp;
        }

        // Introduction
        Scanner sc = new Scanner(System.in); // for ints
        Scanner scan = new Scanner(System.in); // for Strings

        System.out.println("Welcome to Deal or No Deal!");
        String userInfo;
        System.out.println("If you know how Deal or No Deal works please press 1, if you want some information press 2: ");
        userInfo = scan.nextLine();
        while (true) {
            if (userInfo.equals("1") || userInfo.equals("2")) {
                break;
            } else {
                System.out.println("Invalid Input! If you know how Deal or No Deal works please press 1, if you want some information press 2: ");
                userInfo = sc.nextLine();
            }
        }
        if (userInfo.equals("2")) {
            System.out.println("This game is a simplified version of the popular TV show, Deal or No Deal. You as the contestant will be choosing from 26 briefcases with different values of $ in them.");
            System.out.println("The values of money in each case are from anywhere from $1 to $1 million. You will pick one case at the start (1-26) that you will not know the money value of.");
            System.out.println("The game works by you opening other cases and seeing their value combined, and after a certain amount of cases are opened,");
            System.out.println("a banker will tempt you with a cash offer in exchange for not continuing the game and possibly winning a larger sum of money.");
            System.out.println("If you go through to the last case, then you will decide whether you want your first chosen case or the last remaining case. ");
            System.out.println("Goodluck and Have Fun!");
        }
        System.out.println();

        // Ask User Their First Case
        int casesSelected = 0;
        System.out.println("Please type the number of the case you want to keep as your first case (1 - 26): ");
        int usercase = sc.nextInt() - 1;
        int usercaseValue = cases[usercase];
        cases[usercase] = -1;
        casesSelected++;
        System.out.println();

        // Ask the User for More Cases + Keep Sum of Cases - Until 6 have been chosen
        int count = 0;
        int sum = 0;
        while (casesSelected < 25) {
            if (count == 0) {
                sum = 0;
            }
            System.out.println("Please choose case number: " + (casesSelected + 1) + " (1 - 26): ");
            int case2 = sc.nextInt();
            while (cases[case2 - 1] == -1) {
                System.out.println("You already chose this case before! Try again.");
                System.out.println("Please choose another case (1 - 26): ");
                case2 = sc.nextInt();
            }
            casesSelected++;
            count++;
            sum += cases[case2 - 1];
            System.out.println("The value of case number this case is: $" + cases[case2 - 1]);
            System.out.println();
            cases[case2 - 1] = -1;
            if (count == 6) {
                System.out.println("You have opened 6 cases! The sum of these cases is: $" + sum);
                int bankerOffer = 0;
                int amountCases = 0;
                for (int i = 0; i < cases.length; i++) { // find average of every case that has not been chosen yet
                    if (cases[i] != -1) {
                        bankerOffer = bankerOffer + cases[i]; // sum of all case values that has not been chosen yet
                        amountCases++;
                    }
                }
                bankerOffer = bankerOffer / amountCases; // divide sum by amount of values not chosen to make banker offer
                System.out.println("The banker is on the phone and would like to offer you : $" + bankerOffer);
                System.out.println("Deal or No Deal? (Y/N):  ");
                String userResponse = scan.nextLine();
                while (true) {
                    if (userResponse.equals("y") || userResponse.equals("Y") || userResponse.equals("N") || userResponse.equals("n")) {
                        break;
                    } else {
                        System.out.println("Invalid Input! Deal or No Deal? (Y/N):  ");
                        userResponse = scan.nextLine();
                    }
                }
                if (userResponse.equals("y") || userResponse.equals("Y")) { // user decides whether or not to take offer or continue playing
                    System.out.println();
                    System.out.println("Congratulations on taking home the bankers offer of: $" + bankerOffer);
                    System.out.println("Note: The value of your first chosen case was: $" + usercaseValue);
                    break;
                } else {
                    count = 0;
                    System.out.println();
                }
            }
        }
        // Last Case vs First Case
        while (casesSelected == 25) {
            int lastcaseValue = 0;
            for (int i = 0; i < cases.length; i++) {
                if (cases[i] != -1) {
                    lastcaseValue = cases[i];
                }
            }
            System.out.println("You have made it to the last case!");
            System.out.println("Do you want to take the last remaining case? Or take your first chosen case? (1 for first, 2 for last): ");
            String userChoice = scan.nextLine();
            while (true) {
                if (userChoice.equals("1") || userChoice.equals("2")) {
                    break;
                } else {
                    System.out.println("Invalid Input! Do you want to take the last remaining case? Or take your first chosen case? (1 for first, 2 for last): ");
                    userChoice = scan.nextLine();
                }
            }
            if (userChoice.equals("1")) {
                System.out.println();
                System.out.println("Congratulations on taking home your first original case! The value of this case is: $" + usercaseValue);
                System.out.println("Note: The value of the last remaining case was: $" + lastcaseValue);
                break;
            } else {
                System.out.println();
                System.out.println("Congratulations on taking home the last case! The value of this case is: $" + lastcaseValue);
                System.out.println("Note: The value of your first chosen case was: $" + usercaseValue);
                break;
            }
        }
        System.out.println("Thank you for playing Deal or No Deal!");
    }
}