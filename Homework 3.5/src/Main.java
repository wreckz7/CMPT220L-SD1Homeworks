// Awais Razaque
// Homework 3.5 - ExtraLoopPractice
// 2/15/24

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please give me a number that you want the multiplication table for: ");
        int num = scan.nextInt();
        int temp = 1;
        System.out.println("Multiplication Table (" + num + "):");
        while (temp <= 10) {
            System.out.println(num + " x " + temp + " = " + (num * temp));
            temp++;
        }

    }
}