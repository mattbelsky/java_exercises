package multi_threading.labs;

public class Seconds implements Runnable {
    Thread t;
    int seconds;

    public Seconds(String name, int seconds) {
        t = new Thread(this, name);
        t.start();
        this.seconds = seconds;
    }

    public void run() {
        try {
            for (int i = 0; i < seconds; i++) {
                t.sleep(1000);
                System.out.println(t.getName() + " " + i);


            }
        }
        catch (InterruptedException ie) {
            // Ignoring exception
        }
    }

    public int getSeconds() {
        return seconds;
    }
}
