// Awais Razaque
// Homework 4 File 1
// 2/20/24

/*
Take the given array and keep track of:
1. Any duplicate numbers
2. How many times the duplicate numbers appear
3. Print out those duplicate numbers with how many times they appear
 */
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Initialization of myArray + Learning Random
        Random rand = new Random();
        int length = rand.nextInt(50);
        int[] myArray = new int[length];

        // Assign Random Values to Array
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = rand.nextInt(50);
        }

        // Print Unsorted Array
        System.out.println("Unsorted Array: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();

        // Manually Sort The Array
        int temp = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] > myArray[j]) {
                    temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }

        // Print Sorted Array
        System.out.println("Sorted Array: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();

        // Find Duplicates + Count
        System.out.println("Duplicates: ");

        //Set our initial Values
        int currCheck = -1; //This will be the number that we are currently checking, and will be used so we don't recheck the same number.
        int count = 1; //Keeps a count of the amount of times a number appears, this starts at 1, in order to include the currently checked number.

        for (int i = 0; i < myArray.length; i++) {//Loop thru each value in the array

            if (myArray[i] != currCheck) { //Only run a check for that value if we have not already checked for it. This prevents repeated checks of the same value.
                currCheck = myArray[i]; //Set the value to our currently checking value.
                for (int j = i + 1; j < myArray.length; j++) { //Loop through every value past the one we are checking. (Note, you could also probably do something fancy with a while loop here to stop checking values once they stop matching. since the list is already ordered, we know we can stop checking once its a different value. With the current statement it will check the entire list which is not needed, but left for simplicities sake.)
                    if(myArray[i]==myArray[j]) { //If they are the same value...
                        count++; //Increase the count by one
                    }
                }
                if(count!=1) { //This makes it so we will not print out any values that occur only once
                    System.out.println(myArray[i] + " repeats " + count + " times.");
                }
                count=1; //reset the count
            }


        }
    }
}