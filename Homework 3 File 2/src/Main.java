// Awais Razaque
// Homework 3 File 2
// 2/5/24

import java.util.Scanner; // import Scanner for user input

public class Main {
    public static void main(String[] args) {

        //P1: This one only prints 0-9, can you fix it so it prints 1-10?
        System.out.println("Problem 1:");
        for (int i = 0; i < 11; i++){ //10 to 11, increment by 1 
            System.out.println(i);
        }

        System.out.println();

        Scanner sc = new Scanner(System.in);
        
        //P2: Ask the user for a number. Create a loop to find the factorial of it
        //(factorial = X!, X being the user input, Factorials are every digit before X multiplied together)
        System.out.println("Problem 2:");
        System.out.println("Enter a number and I will tell you the factorial: ");
        int userInput = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i < userInput + 1; i++) {
            factorial *= i;
        }
        System.out.println("The factorial of your number is: " + factorial);

        System.out.println();

        //P3: Ask the user for a number, and then add together every OTHER digit (starting from 1)
        System.out.println("Problem 3:");
        System.out.println("Enter a number and I will tell you the sum of every other number: ");
        userInput = sc.nextInt();
        int sumeveryOther = 0;
        for (int i = 0; i < userInput + 1; i++) {
            if (i % 2 == 0) {

            } else {
                sumeveryOther += i;
            }
        }
        System.out.println("The sum of every other number starting from 1 of your number is: " + sumeveryOther);
        System.out.println();

        //P4: Why does this loop never stop!
        //what can you do to break out of the loop after it prints once?
        System.out.println("Problem 4:");
        boolean run = true;
        while (run == true){
            System.out.println("I printed once!");
            run = false; // to break out of this loop after it prints once, you have to change the value of the run value to anything other than true aka false
        }

        System.out.println();

        Scanner stringScan = new Scanner(System.in);

        //P5: Take a string from the user and print them the reverse!
        System.out.println("Problem 5:");
        System.out.println("Please give me a word and I will print it out in reverse: ");
        String userWord = stringScan.nextLine();
        String reverse = "";
        for (int i = 0; i < userWord.length(); i++) {
            char character = userWord.charAt(i);
            reverse = character + reverse;
        }
        System.out.println("The word printed out in reverse is: " + reverse);

    }
}