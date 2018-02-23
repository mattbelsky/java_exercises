package multi_threading.labs;

public class Minutes implements Runnable {
    Thread t;
    int minutes;

    public Minutes(String name, int minutes) {
        t = new Thread(this, name);
        t.start();
        this.minutes = minutes;
    }

    public void run() {
        try {
            for (int i = 0; i < minutes; i++) {
                t.sleep(2500);
                System.out.println(t.getName() + " " + i);

            }
        }
        catch (InterruptedException ie) {
            // Ignoring exception
        }
    }

    public int getMinutes() {
        return minutes;
    }
}
