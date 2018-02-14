package datatypes_operators.labs;

/**
 * Data Types and Operators Exercise 5: More arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */
import java.util.Scanner;
public class Exercise_05{

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // write code here
        Scanner in = new Scanner(System.in);
        boolean outOfBounds = true;

        while (outOfBounds) {
            System.out.println("Enter a number: ");
            int index = in.nextInt();
            if (index >= 0 && index < array.length) {
                outOfBounds = false;
                System.out.println(array[index]);
            }
        }
    }
}