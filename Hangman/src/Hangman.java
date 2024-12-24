// File Management
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

// Class that creates a word object with characteristics: length (can be later expanded to starting with letter, ending with letter, etc)
public class Hangman {
    int difficulty;
// Constructor
    public Hangman (int d) {
        difficulty = d;
    }
// Method to extract the strings from the words.txt file that match the word length of the difficulty selected by the user in the gameIntro()
    String getWord () {
        File inputfile = new File("words.txt");
        List<String> wordsofDifficulty = new ArrayList<String>();
        String currentWord = "";

        //Try-Catch for Adding All Strings to List from File
        try {
            Scanner input = new Scanner(inputfile);
            while (input.hasNext()) {
                currentWord = input.nextLine();
                if (currentWord.length() <= this.difficulty) {
                    wordsofDifficulty.add(currentWord);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Random rand = new Random();
        // Deleting a length of Shorter Strings in List, since there are a lot of shorter words than longer ones in words.txt
        int deleteDifficulty = this.difficulty - 2; // So if the user had chosen 7 as their max, all 5 length words would be deleted to increase the chance for them to get a higher length word, either way there are a lot of shorter words, so still in the users benefit (depends on luck)
        for (int i = 0; i < wordsofDifficulty.size(); i++) {
            if (wordsofDifficulty.get(i).length() == deleteDifficulty)
                wordsofDifficulty.remove(i);
        }
        // Random Index for a Random String from List of Words that match the users difficulty after deleting a length fully
        int randomwordIndex = rand.nextInt(wordsofDifficulty.size());
        return wordsofDifficulty.get(randomwordIndex);
    }

}