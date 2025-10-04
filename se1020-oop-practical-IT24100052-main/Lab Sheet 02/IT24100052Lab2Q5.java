package Labsheeet2;
import java.util.Scanner;

public class IT24100052Lab2Q5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] words = new String[5];

        System.out.println("Enter 5 words:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter word " + (i + 1) + ": ");
            words[i] = input.nextLine();
        }

        // Find the longest word
        String longestWord = words[0];
        int totalCharacters = 0;

        System.out.println("Words with an even number of characters:");

        for (int i = 0; i < 5; i++) {
            // Update the total number
            totalCharacters += words[i].length();

            // Check if longest
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }

            // Check for even number
            if (words[i].length() % 2 == 0) {
                System.out.println(words[i]);
            }
        }

        System.out.println("Longest Word: " + longestWord);
        System.out.println("Total Number of Characters in All Words: " + totalCharacters);

    }
}

