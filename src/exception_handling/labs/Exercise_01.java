package exception_handling.labs;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */

class Sentence {
    public static void main(String[] args) {
        String sentence = "Follow the yellow brick road.";
        try {
            for (int i = 0; i <= sentence.length(); i++) {
                if (sentence.substring(i, i + 1).equals("!")) {
                    System.out.println("This is exciting!");
                }
            }
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Index is beyond the length of the string.");
        }
    }
}

