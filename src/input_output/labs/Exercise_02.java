package input_output.labs;

/**
 * Input/Output Exercise 1: File encryption
 *
 *      -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 *      -For example, change every 'a' to '-' and every 'e' to '~' .
 *      -Make sure you close the connections to both files.
 *
 *      BONUS: If you are feeling bold, read back the encrypted file using the BufferedReader and
 *      print out the unencrypted version. Does it match the original file?
 *
 */

// Creates two objects of the EncryptedDocument class to test the encryption/decryption functionality.
class EncryptionController {
    public static void main(String[] args) {
        EncryptedDocument testEncryption = new EncryptedDocument("src/input_output/labs/input.txt",
                "src/input_output/labs/output.txt", "encrypt");
        EncryptedDocument testDecryption = new EncryptedDocument("src/input_output/labs/output.txt",
                "src/input_output/labs/decrypted_output.txt", "decrypt");

        // Reads the document "input.txt", encrypts it, and writes the result to "output.txt".
        testEncryption.readWriteDocument();

        // Reads the document "output.txt", encrypts it, and writes the result to "decrypted_output.txt".
        testDecryption.readWriteDocument();
    }
}