// Awais Razaque
// Homework 5 File 2
// 3/19/24

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //for double
        Scanner scan = new Scanner(System.in); //for String

        while (true) { //Less Code = More Efficiency = Better Readablity, especially when someone else looks at your code!
            System.out.println("My reason for using a function is to make code less repetitive and limit the amount of code which focuses more on efficiency.");
            System.out.println("When using functions, we are able to shortcut typing out repetitive or larger texts like introductions or endings in any program or game! For example:");
            System.out.println();
            printStart();
            System.out.println();
            System.out.println("Functions can also help with doing math (hence why we import the Math Class in python which contains methods such as trigonometric, exponential, logarithmic, and other functions or Math is built in like in java!");
            System.out.println();
            System.out.println("Give me a number: ");
            double one = sc.nextInt();
            System.out.println("The square root of your number " + one + " is: " + doMath(one));
            System.out.println();
            System.out.println("Do you wish to restart this program/game? (Y/N): ");
            String userRestart = scan.nextLine().toUpperCase();
            if (userRestart.equals("Y")) {
                System.out.println();
            } else if (userRestart.equals("N")) {
                System.out.println();
                printEnd();
                break;
            }
        }
    }

    public static void printStart() { //Sample Introduction (from Intro Project - Fakemon)
        System.out.println("In the world of Fakemon, there is a region known as Astaria, which is home to a diverse range of species and trainers. This region is known to attract trainers from all over the world with its abundance of resources for expert training of these species, known as Fakemon. The region has rugged terrain with mountains and forests for the Fakemon to receive adequate training in their skills, and it houses growing cities in this new world of Fakemon.");
        System.out.println("However, the region has advanced so much that a group of trainers known as Team Dauntless, who are some of the best trainers in the world, have claimed the region for themselves when it comes to harnessing the power of the legendary Fakemon within the region and ruling with an iron fist. The Astarian government has been unable to stop them, so it's up to a new generation of Fakemon trainers to take up the challenge and put an end to Team Dauntless's evil plans.");
        System.out.println("As a young trainer, you set out on a journey across Astaria, battling other trainers to improve your skills. Along the way, you'll encounter members of Team Dauntless and their minions, who will stop at nothing to achieve their goals. You'll need to use all of your wits, skills, and the power of your developed Fakemon to overcome them and save the region from their tyranny.");
    }

    public static void printEnd() { //Sample Ending (from Intro Project - Good ending if you win batte)
        System.out.println("Congratulations you have won against the Leader of Team Dauntless and have taken back the region of Astaria.");
        System.out.println("As the sun sets over the horizon, you are approached by Professor Oak. He congratulates you on your victory and tells you that you have become a true Fakemon Master. He also hands you a new Fakedex, which he has been working on. This Fakedex has the ability to detect and track all the legendary Pokemon in the region. With your new Fakedex in hand, you set out on a new adventure to catch all the legendary Fakemon. Who knows what challenges and obstacles lie ahead, but one thing is for sure - you are ready for whatever comes your way. Is this the end... or is it just the beginning?");
    }

    public static double doMath(double num1) { //Sample use of Math Class
        return Math.sqrt(num1);
    }

}