package multi_threading.labs;

public class Hours implements Runnable {
    Thread t;
    int hours;

    public Hours(String name, int hours) {
        t = new Thread(this, name);
        t.start();
        this.hours = hours;
    }

    public void run() {
        try {
            for (int i = 0; i < hours; i++) {
                t.sleep(5000);
                System.out.println(t.getName() + " " + i);
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
