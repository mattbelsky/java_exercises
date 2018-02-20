package exception_handling.labs;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */

class UncapitalizedLetterException extends Exception {
    @Override
    public String toString() {
        return "A letter that should be capitalized is lowercase.";
    }
}

class CapitalizationSkills {
    public static void main(String[] args) {
        String sentence = "it's cold in Antarctica";
        int firstLetter = sentence.charAt(0);
        try {
            // Lowercase English letters are found between Unicode characters numbered 97 and 122
            if (firstLetter >= 97 && firstLetter <= 122) {
                throw new UncapitalizedLetterException();
            }
        }
        catch (UncapitalizedLetterException ule) {
            System.out.println("Always capitalize the first letter of a sentence.\n" + ule.toString());
        }
    }
}