package exception_handling.labs;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */
class TripBudget {
    private int budget; // USD
    private int length; // days

    public TripBudget(int budget, int length) {
        this.budget = budget;
        this.length = length;
    }

    public int costPerDay() {
        /* This outer try/catch statement could be avoided with the use of Math.abs(), but for the sake of practice and
            a creativity block on my part, here it goes.
         */
        try {
            if (budget >= 0 && length >= 0) {
                try {
                    return budget / length;
                } catch (ArithmeticException exc) {
                    System.out.println(exc.toString());
                    return 0;
                }
            }
            else {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException iae) {
            System.out.println("You must not enter a negative number.");
            return 0;
        }
    }
}

class TripBudgetDemo {
    public static void main(String[] args) {
        TripBudget bgt = new TripBudget(2000,-50);
        System.out.println("$" + bgt.costPerDay() + "/day");
    }
}