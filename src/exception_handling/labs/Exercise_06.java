package exception_handling.labs;

/**
 * Exception Handling Exercise 6:
 *
 *      Demonstrate throwing an exception in one method and catching it in another method.
 *
 */
class Exercise6 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        try {
            for (int num : nums) {
                System.out.println(num);
                throwException();
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught.");
        }
    }

    public static void throwException() {
        throw new ArrayIndexOutOfBoundsException();
    }
}