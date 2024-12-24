// Awais Razaque
// Homework 3 File 1
// 2/5/24

import java.util.Scanner; // imports Scanner for user input

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // sets up a new scanner called sc to scan the user input into
        System.out.println("Please give me any word to print back out to you character by character: "); // asks for user input
        String userWord = sc.nextLine(); // reads user input into variable called 'userWord'
        for (int i = 0; i < userWord.length(); i++) { // for loop going from start of 'userWord' to length of 'userWord'
                System.out.println(userWord.charAt(i)); //.charAt was my discovery suprisingly not from Google, basically prints the char or character at a specified index (I did look it up after wards to make sure/find out more)
        }
        /*
        My for loop goes from the start of the string provided by the user to the end which is from i = 0, since indexes start at 0 not 1 in java to the variable.length(), which in its name goes to the length of the string
        And to make it stop at the length of the string, it would have to be i < variable.length(); which would mean the loop would stop at the end of the string or when i equals the same as the length
        For example: "awais" "01234" - length of 5 - would print 5 times, before stopping, incrementing i by 1 going 0, 1 ,2 ,3, 4, stopping just before 5
        For the content inside in the loop, originally I wanted to use the .split() method to split by character, but I had no idea how to split characters or in this case I don't think that is possible
        I'm pretty sure you would need something like a : or space to split by for it to work, but if the user types one word together, .split() would not work (I think)
        So, I ended up doing some digging for characters or char and i found the java method. charAt(); which did exactly what I wanted: print the character at that specified index from start to beginning of the string
        */

    }
}
