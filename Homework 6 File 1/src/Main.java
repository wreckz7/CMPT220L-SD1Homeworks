// Awais Razaque
// Homework 6 File 1
// 3/29/24

//Imports for File Management
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File inputfile = new File("practice.txt");
        List<String> stringsfromFile = new ArrayList<String>();
        Double[] gpas;

        //Try-Catch for Adding All Strings to List from File
        try {
            Scanner input = new Scanner(inputfile);
            while(input.hasNext()) {
                stringsfromFile.add(input.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        //Print out all contents of file - all data
        System.out.println("Strings Found in File: (Data) ");
        System.out.println(stringsfromFile);
        System.out.println();

        //Converting Every Odd Index from a String to a Double and then checking if above 3.5, then printing the name which is 1 less from that the current index (i)
        System.out.println("The students who had a GPA of higher than 3.5 were:");
        for (int i = 1; i < stringsfromFile.size(); i += 2) {
            String currentGPA = stringsfromFile.get(i);
            Double gpaDouble = Double.valueOf(currentGPA);
            if (gpaDouble > 3.5) {
                System.out.println(stringsfromFile.get(i-1));
            }
        }

        System.out.println();

        //How many students in total
        int count = 0;
        for (int i = 0; i < stringsfromFile.size(); i += 2) {
            count++;
        }
        System.out.println("Number of students: ");
        System.out.print(count);

    }
}