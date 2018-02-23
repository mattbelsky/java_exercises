package multi_threading.labs;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 */
class Hrs extends Thread {
    int hours;

    public Hrs(String name, int hours) {
        super(name);
        this.hours = hours;
        start();
    }

    public void run() {
        try {
            for (int i = 0; i < hours; i++) {
                sleep(5000);
                System.out.println(getName() + " " + i);
            }
        }
        catch (InterruptedException ie) {
            // Ignoring exception
        }
    }

    public int getHours() {
        return hours;
    }
}

class HrsController {
    public static void main(String[] args) {
        Hrs e = new Hrs("hours", 3);
    }
}