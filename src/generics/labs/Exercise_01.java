package generics.labs;

/**
 * Generics Exercise 1:
 *
 *      1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 *      2.) Create a few objects of your generic class with different data types to demonstrate it's
 *          dynamic usage.
 */
class Gen<T extends Number> {
    private T ob;
    private T vals[];

    public Gen(T ob, T[] vals) {
        this.ob = ob;
        this.vals = vals;
    }

    public T min() {
        T min;
        for (T val : vals) {
            if (val < min) {
                min = val;
            }
        }
        return min;
    }
}

class GenController {
    public static void main(String[] args) {
        Integer a = {3, 2, 9, 10};
        Double b = {7.22, 3.17, 0.52};
        Long c = {719827384739827l, 12346578992989234l, 1283748656988l, 56838289327624l, 195628387492873l};
        
    }
}