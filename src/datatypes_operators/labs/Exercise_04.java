package datatypes_operators.labs;

/**
 * Data Types and Operators Exercise 4: Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */
import java.util.Scanner;

public class Exercise_04{
    public static void main(String[] args) {
        int[] nums = new int[10];
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a number: ");
            Scanner in = new Scanner(System.in);
            nums[i] = in.nextInt();
            sum += nums[i];
        }
        System.out.println();
        System.out.println(sum);
    }
}