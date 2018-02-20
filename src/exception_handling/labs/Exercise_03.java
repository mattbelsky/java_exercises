package exception_handling.labs;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */

/* Averages and prints three years worth of order costs within a chosen range of months. If an exception is generated,
    averages and prints the cost for the entire three year period.
 */
class Exercise3 {
    public static void main(String[] args) {
        double[][] orderCostByMonth = {
                {2872.7, 2974.2, 2678.3, 3021.3, 2123.0, 1837.2, 1873.2, 2220.0, 1720.1, 2575.9, 2637.1, 4256.8},
                {1872.7, 2374.2, 2978.3, 3121.3, 2023.0, 1937.2, 1573.2, 3220.0, 1920.1, 2571.9, 2647.1, 4756.8},
                {2472.7, 3174.2, 2728.3, 3341.3, 2213.0, 2037.2, 1633.2, 2490.0, 2120.1, 1875.9, 2837.1, 3956.8}
        };
        int firstMonth = 1;
        int lastMonth = 2;
        double sum = 0.0;
        double avg = 0.0;

        try {
            for (int i = 0; i < orderCostByMonth.length; i++) {
                for (int j = (firstMonth - 1); j < lastMonth; j++) {
                    sum += orderCostByMonth[i][j];
                }
            }
            avg = sum / ((lastMonth - firstMonth + 1) * orderCostByMonth.length);
            System.out.println("Your average order cost for the specified period was $" + avg);
        }
        catch (ArrayIndexOutOfBoundsException | ArithmeticException exc) {
            System.out.println("Exception caught.");
        }
        finally {
            sum = 0.0;
            avg = 0.0;
            for (int i = 0; i < orderCostByMonth.length; i++) {
                for (int j = 0; j < orderCostByMonth[i].length; j++) {
                    sum += orderCostByMonth[i][j];
                }
            }
            avg = sum / 36;
            System.out.println("Your average order cost for the three year period was $" + avg);
        }
    }
}
