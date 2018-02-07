package conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        // create scanner
        Scanner scanner = new Scanner(System.in);

        // prompt user
        System.out.print("Enter a number: ");

        // assign input to variable as int
        int number = scanner.nextInt();

        // write completed code here
        if (number >= 1 && number <= 7)
        {
            if (number == 1) System.out.print("Monday");
            else if (number == 2) System.out.print("Tuesday");
            else if (number == 3) System.out.print("Wednesday");
            else if (number == 4) System.out.print("Thursday");
            else if (number == 5) System.out.print("Friday");
            else if (number == 6) System.out.print("Saturday");
            else if (number == 7) System.out.print("Sunday");
        }
        else
        {
            System.out.print("Other");
        }


    }
}
