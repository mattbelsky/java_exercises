package packages_interfaces.labs;

/**
 * Packages Exercise 1: Protected modifier
 *
 *      1) Within this package, create two new packages.
 *      2) Create a new Java class in each package.
 *      3) Create at least two methods in each class, with at least one with the protected access modifier
 *      4) Demonstrate how the the protected access modifier restricts access from package to package
 *
 */
import packages_interfaces.labs.radio.AnalogRadio;
import packages_interfaces.labs.television.LCDTV;

class Controller {
    public static void main(String[] args) {
        LCDTV sony = new LCDTV();
        sony.setPoweredOn(true);
        // This statement will try to access a protected method and will cause an error.
        // sony.setHdmiEnabled(true);

        AnalogRadio panasonic = new AnalogRadio();
        panasonic.setPoweredOn(true);
        panasonic.setChannel(107.5);
        // This statement will try to access a protected method and will cause an error.
        // panasonic.setBandRange(2, 10000000);
    }
}