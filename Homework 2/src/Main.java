// Awais Razaque
// Homework 2 File 1
// 1/29/24

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //for this section: are these all printing the best option? If they aren't, fix it!
        //(However you interpret 'fix' is fine i promise, any way you fix it shows you get the concept to me)

        //Made the first code section fully interactive with user input
        //Made the others interactive in that the user chooses the first number, and then it is compared to the one provided
        //Print statements are given when a variable is initialized!
        Scanner sc = new Scanner(System.in);
        System.out.println("What number do you want to check is bigger than another number?");
        int var1 = sc.nextInt();
        System.out.println("Variable 1: " + var1);
        System.out.println("What is the other number? (" + var1 + " > ?)");
        int var2 = sc.nextInt();
        System.out.println("Variable 2: " + var2);
        System.out.println();
        if (var1 > var2){
            System.out.println("Variable 1 is greater than variable 2!");
        }else{
            System.out.println("Variable 1 is less than variable 2!");
        }

        System.out.println();
        System.out.println("Choose any number: ");
        int var3 = sc.nextInt();
        System.out.println("Variable 3: " + var3);
        System.out.println();
        if (var3 == 5){
            System.out.println("Variable 3 is equal to 5!");
        } else if (var3 > 5){
            System.out.println("Variable 3 is greater than 5!");
        } else if (var3 < 5){
            System.out.println("Variable 3 is less than 5!");
        } else{
            System.out.println("Variable 3 is equal to 6");
        }

        System.out.println();

        System.out.println("Choose another number: ");
        int var4 = sc.nextInt();
        System.out.println("Variable 4: " + var4);
        System.out.println();
        if (var4 > 10){
            System.out.println("Variable 4 is greater than 10!");
        } else {
            System.out.println("Variable 4 is less than 10!");
        }

        System.out.println();

        //for this section: why are we not entering the if statement?

        //The first if statement is not being entered because when comparing strings (" "), they are case-sensitive.
        //In this case Marist compared to marist to us seems like the same thing, but the capital M makes java think it's different.
        if ("Marist" == "marist"){
            System.out.println("Marist college!");
        } else{
            System.out.println("Not marist college :(!");
        }

    }
}