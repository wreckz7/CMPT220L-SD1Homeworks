// Awais Razaque
// Homework 5 File 1
// 3/19/24

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example Function
        System.out.println("Enter your first number to be added: ");
        int firstInput = sc.nextInt();
        System.out.println("Enter your second number to be added: ");
        int secondInput = sc.nextInt();
        System.out.println("These two numbers added is " + add(firstInput,secondInput) + ".");
        System.out.println();

        // Example Function 2
        System.out.println("I'm going to print out the word Dog now.");
        printDog();
        System.out.println();

        // Function 1 for Problem 2
        System.out.println("Enter a number you want the factorial of: ");
        int factorialInput = sc.nextInt();
        System.out.println("The factorial of " + factorialInput + " is " + findFactorial(factorialInput) + ".");
        System.out.println();

        // Function 2 for Problem 3
        System.out.println("Enter a number and I will tell you the sum of every other number: ");
        int otherInput = sc.nextInt();
        System.out.println("The sum of every other number starting from 1 for your number " + otherInput + " is " + addeveryotherNumber(otherInput) + ".");
        System.out.println();

        // Function 3 for Problem 5
        Scanner scan = new Scanner(System.in);
        System.out.println("Please give me a word and I will print it out in reverse: ");
        String normalInput = scan.nextLine();
        printReverse(normalInput);
    }

    public static int add(int zyx, int tuv){
        return(zyx + tuv);
    }

    public static void printDog(){
        System.out.println("Dog");
    }

    public static int findFactorial(int fac) {
        int factorial = 1;
        for (int i = 1; i < fac + 1; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int addeveryotherNumber(int other) {
        int sumeveryOther = 0;
        for (int i = 0; i < other + 1; i++) {
            if (i % 2 == 0) {

            } else {
                sumeveryOther += i;
            }
        }
        return sumeveryOther;
    }

    public static void printReverse(String normal) {
        String reverse = "";
        for (int i = 0; i < normal.length(); i++) {
            char character = normal.charAt(i);
            reverse = character + reverse;
        }
        System.out.println("The word printed out in reverse is: " + reverse);
    }

}