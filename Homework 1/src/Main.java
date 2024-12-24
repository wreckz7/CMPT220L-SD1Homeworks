// Awais Razaque
// Homework 1
// 1/25/24

import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Reference:
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "! ");

        System.out.println();

        // Input/Print:
        System.out.println("How old are you? ");
        int age = sc.nextInt();
        System.out.println("Thank you for telling me your age of: " + age);

        System.out.println();

        // Math:
        int num1 = 10;
        int num2 = 37;
        int sum = num1 + num2;
        System.out.println("The sum of your two numbers " + "(" + num1 + " and " + num2 + ") is " + sum + ".");

        System.out.println();
    }
}