package conditions_loops.labs;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */
import java.util.Scanner;
public class Exercise_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int upper = 0;
        int lower = 0;
        int sum = 0;
        double avg = 0.0;

        System.out.print("Enter a lower bound: ");
        lower = in.nextInt();
        System.out.print("\nEnter an upper bound: ");
        upper = in.nextInt();
        System.out.print("\n");

        for (int i = lower; i <= upper; sum += i++);
        avg = (double) sum / (upper - lower + 1);
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + avg);
    }
}
