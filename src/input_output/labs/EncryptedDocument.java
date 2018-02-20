package input_output.labs;

import java.io.*;

/*
    Reads a text document to encrypt, encrypts it, and writes the output into another document.
    "input": the path of the document to read
    "output": the path of the document to write
 */
public class EncryptedDocument {
    private String input;
    private String output;
    private String encryptOrDecrypt;

    public EncryptedDocument(String input, String output, String encryptOrDecrypt) {
        this.input = input;
        this.output = output;
        if (encryptOrDecrypt.equals("encrypt") || encryptOrDecrypt.equals("decrypt")) {
            this.encryptOrDecrypt = encryptOrDecrypt;
        }
        else {
            this.encryptOrDecrypt = "encrypt";
        }
    }

    /*
        Reads and writes from and to the specified documents.
        Calls the encrypt or decrypt method.
     */
    public void readWriteDocument() {
        // Declaring variables referencing IO streams
        BufferedReader in = null;
        PrintWriter out = null;

        try {
            // Initializing variables
            in = new BufferedReader(new FileReader(input));
            out = new PrintWriter(new FileWriter(output));
            int value = 0;

            // While there is data to read, reads each character individually, which is stored in char variable "c".
            while ((value = in.read()) != -1) {
                char c = (char) value;

                // Calls the "encrypt" or "decrypt" methods depending on the value of instance variable "encryptOrDecrypt".
                if (encryptOrDecrypt.equals("encrypt")) {
                    encrypt(c);
                }
                else {
                    decrypt(c);
                }

                out.write(c);
            }
        }
        catch (IOException ioe) {
            System.out.println("IOException caught");
            ioe.printStackTrace();
        }
        finally {
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
            }
        }
    }

    // Encrypts the file by replacing each instance of the specified characters with a replacement value.
    private char encrypt(char c) {
        if (c == encryptionReplacementValues()[0]) {
            c = encryptionReplacementValues()[1];
        }
        if (c == encryptionReplacementValues()[2]) {
            c = encryptionReplacementValues()[3];
        }
        return c;
    }

    // Decrypts the file by replacing each instance of the specified characters with a replacement value.
    private char decrypt(char c) {
        if (c == encryptionReplacementValues()[1]) {
            c = encryptionReplacementValues()[0];
        }
        if (c == encryptionReplacementValues()[3]) {
            c = encryptionReplacementValues()[2];
        }
        return c;
    }

    // Defines the list of values that will be used to replace each other in the encrypt and decrypt methods.
    // Why doesn't this work? I initially plugged the values directly into the encrypt & decrypt
    //  methods, and it worked then.
    private char[] encryptionReplacementValues() {
        char[] values = {'a', '-', 'e', '~'};
        return values;
    }
}