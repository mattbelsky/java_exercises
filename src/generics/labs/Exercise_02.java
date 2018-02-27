package generics.labs;

import java.io.*;

/**
 * Generics Exercise 2:
 *
 *      Create a class with a generic method that takes in an array and prints out the value at a certain index.
 */
class GenArray {
    // Prints the array
    private static <T> void printArray(T[] arr, int index) {
        System.out.println(arr[index]);
    }

    // Also trying to practice IO concepts learned (already comfortable with Scanner).
    public static void main(String[] args) {
        Integer[] a = {7, 2, 5, 0, 6};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = null;
        int index = 0;
        boolean exception = false;

        /* Prompts for and reads user input until no format or out of bounds exceptions are generated, then calls the
            printArray() method.
            Inner try/catch catches exceptions related to user input. Outer catches the standard IO exception thrown by
            readLine(). */
        do {
            System.out.println("Choose a number between 0 and " + (a.length - 1));
            try {
                try {
                    // readLine() reads and returns a string value which parseInt() converts into an integer
                    /* Alternate method read() reads a character value, including numbers, but returns their Unicode
                        numerical value. */
                    input = br.readLine();
                    index = Integer.parseInt(input);
                    printArray(a, index);
                    exception = false;
                } catch (NumberFormatException | ArrayIndexOutOfBoundsException e1) {
                    exception = true;
                }
            }
            catch (IOException e2) {
                // Ignores IO Exception thrown by readLine()
            };
        }
        while (exception == true);
    }
}