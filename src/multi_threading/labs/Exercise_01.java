package multi_threading.labs;

/**
 * Multithreading Exercise 1:
 *
 *      Create an application that creates a Thread using the Runnable interface
 */

class Exercise1 {
    public static void main(String[] args) {
        int hours = 2;
        int minutes = 3;
        int seconds = 4;
        Seconds s = new Seconds("Seconds", seconds);
        Minutes m = new Minutes("Minutes", minutes);
        Hours h = new Hours("Hours", hours);
    }
}