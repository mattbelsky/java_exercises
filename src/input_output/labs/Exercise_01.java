package input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a file byte by byte and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */

class ReadFile1 {
    public static void main(String[] args) throws IOException {
        // Declaring IO streams
        BufferedInputStream in = null;
        BufferedOutputStream out = null;

        try {
            // Initializing IO streams
            in = new BufferedInputStream(new FileInputStream("src/input_output/labs/input.txt"));
            out = new BufferedOutputStream(new FileOutputStream("src/input_output/labs/output.txt"));
            int c;

            // While there is data to read
            while ((c = in.read()) != -1) {
                // Write the data to the output stream
                out.write(c);
            }
        }
        catch (IOException ioe) {
            System.out.println("IOException caught.");
            ioe.printStackTrace();
        }
        finally {
            // Closing IO connections to files
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            }
            catch (IOException ioe) {
                System.out.println("No connection to close.");
                ioe.printStackTrace();
            }
        }
    }
}