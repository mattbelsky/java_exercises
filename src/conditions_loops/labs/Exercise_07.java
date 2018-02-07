package conditions_loops.labs;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 */
import java.util.Scanner;
public class Exercise_07 {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = in.next();
        String vowelString = "aeiouAEIOU";
        int i = 0;
        while (i < word.length())
        {
            String letter = word.substring(i, i + 1);
            if (vowelString.contains(letter))
            {
                System.out.println(word + " " + letter);
                break;
            }
            i++;
        }
    }
}
