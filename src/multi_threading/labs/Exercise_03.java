package multi_threading.labs;

/**
 * Multithreading Exercise 3:
 *
 *      In one of the previous exercises, demonstrate changing the priority of a thread
 */

class Exercise3 {
    public static void main(String[] args) {
        int hours = 2;
        int minutes = 3;
        int seconds = 4;
        Seconds s = new Seconds("Seconds", seconds);
        Minutes m = new Minutes("Minutes", minutes);
        Hours h = new Hours("Hours", hours);
        s.t.setPriority(Thread.MIN_PRIORITY);
    }
}