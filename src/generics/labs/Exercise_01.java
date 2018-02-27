package generics.labs;

/**
 * Generics Exercise 1:
 *
 *      1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 *      2.) Create a few objects of your generic class with different data types to demonstrate it's
 *          dynamic usage.
 */

/* Test generic class that takes in an array of any type of Number and performs calculations on it. Interestingly, the
    class Number does not seem to play well with generics as it is impractical or impossible in some cases to perform
    certain types of computations with it. Learned a good lesson about simply reading the JavaDoc though, which is how
    I discovered an elegant solution with the method Number.doubleValue().
 */
class Gen<T extends Number> {
    private T vals[];
    private T maxValue;

    public Gen(T[] vals, T maxValue) {
        this.vals = vals;
        this.maxValue = maxValue;
    }

    // Calculates and returns the minimum value in the array.
    public T min() {
        T min = maxValue;
        for (T val : vals) {
            if (val.doubleValue() < min.doubleValue()) {
                min = val;
            }
        }
        return min;
    }

    // Sorts the array in descending order
    public void sort() {
        T placeholder;

        for (int i = 0; i < vals.length - 1; i++) {
            if (vals[i + 1].doubleValue() < vals[i].doubleValue()) {
                placeholder = vals[i + 1];
                vals[i + 1] = vals[i];
                vals[i] = placeholder;
            }
        }

        for (int i = 0; i < vals.length - 1; i++) {
            if (vals[i].doubleValue() < vals[0].doubleValue()) {
                placeholder = vals[i];
                for (int j = i; j > 0; j--) {
                    vals[j] = vals[j-1];
                }
                vals[0] = placeholder;
            }
        }
    }

    // Reverses the array
    public void reverse() {
        T placeholder;
        for (int i = 0; i < vals.length / 2; i++) {
            placeholder = vals[i];
            vals[i] = vals[vals.length - i - 1];
            vals[vals.length - i - 1] = placeholder;
        }
    }

    @Override
    public String toString() {
        String arrayString = "";
        for (T val : vals) {
            arrayString += val + " ";
        }
        return arrayString;
    }
}

class GenController {
    public static void main(String[] args) {
        Integer[] a = {7, 2, 5, 0, 6};
        Double[] b = {7.22, 3.17, 0.52};
        Long[] c = {719827384739827l, 12346578992989234l, 1283748656988l, 56838289327624l, 195628387492873l};

        Gen<Integer> intArray = new Gen<Integer>(a, Integer.MAX_VALUE);
        Gen<Double> doubleArray = new Gen<Double>(b, Double.MAX_VALUE);
        Gen<Long> longArray = new Gen<Long>(c, Long.MAX_VALUE);

        System.out.println(intArray.min());
        System.out.println(doubleArray.min());
        System.out.println(longArray.min());

        intArray.sort();
        doubleArray.sort();
        longArray.sort();

        System.out.println("\n" + intArray.toString());
        System.out.println(doubleArray.toString());
        System.out.println(longArray.toString());

        intArray.reverse();
        doubleArray.reverse();
        longArray.reverse();

        System.out.println("\n" + intArray.toString());
        System.out.println(doubleArray.toString());
        System.out.println(longArray.toString());
    }
}