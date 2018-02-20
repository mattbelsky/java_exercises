package packages_interfaces.labs.television;

public class LCDTV {
    private boolean poweredOn;
    private boolean hdmiEnabled;

    public LCDTV() {
        poweredOn = false;
        hdmiEnabled = false;
    }

    public void setPoweredOn(boolean p) {
        poweredOn = p;
    }

    protected void setHdmiEnabled(boolean h) {
        hdmiEnabled = h;
    }
}