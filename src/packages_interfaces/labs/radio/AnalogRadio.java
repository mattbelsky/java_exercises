package packages_interfaces.labs.radio;

public class AnalogRadio {
    private boolean poweredOn;
    private int minBand;
    private int maxBand;
    private double channel;

    public AnalogRadio() {
        poweredOn = false;
        minBand = 300; // kHz
        maxBand = 300000;
        channel = 89.1;
    }

    public void setPoweredOn(boolean p) {
        poweredOn = p;
    }

    public void setChannel(double c) {
        channel = c;
    }

    protected void setBandRange(int min, int max) {
        minBand = min;
        maxBand = max;
    }
}
