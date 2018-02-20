package exception_handling.labs;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */
import java.util.InputMismatchException;
import java.util.Scanner;

class TVChannels {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean exception = true;
        int[] channels;
        System.out.println("How many channels does this subscriber have access to? ");

        // Why does this generate an infinite loop when an InputMismatchException is generated?
        while (exception == true) {
            try {
                channels = new int[in.nextInt()];
                exception = false;
            } catch (InputMismatchException exc) {
                System.out.println("You must enter an integer.");
            } catch (NegativeArraySizeException exc) {
                System.out.println("You must enter a POSITIVE integer.");
            }
        }
    }
}
