package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 3:
 *
 *      Create at least three example classes (class1, class2, class3) that demonstrate comfort
 *      in creating multiple classes with multiple methods, and then call between those methods across classes.
 *      These methods can perform any task, such as getter/setter methods or simple addition/subtraction.
 *      1) Class1 should have the main method.
 *      2) The main method then needs to create an object of class1, class2, class3.
 *      3) The main method should then  call one or more non-static methods in class2 and class3.
 *
 */
import java.util.Scanner;

class Starship {
    String name;
    int maxSpeed;
    int currentSpeed;
    int torpedoRange;
    int shielding;
    int valCargo;
    boolean belligerance;

    public Starship(String n, int speed, int range, int value) {
        name = n;
        maxSpeed = speed;
        torpedoRange = range;
        valCargo = value;
        currentSpeed = 0;
        shielding = 100;
        belligerance = false;
    }

    void changeSpeed(int speed) {
        if (speed <= maxSpeed) { maxSpeed = speed; }
        else {
            System.out.println("Invalid speed -- higher than max capability.");
        }
    }

    boolean b(int valueOtherShipsCargo) {
        if (valueOtherShipsCargo >= 100000) { belligerance = true; }
        else { belligerance = false; }
        return belligerance;
    }
}

class SpaceAnomoly {
    String type;
    int location;

    public SpaceAnomoly() {
        type = "";
        location = 0;
    }

    void setType() {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose a type of space anomaly.");
        System.out.println("(1 for a black hole, 2 for a solar flare)");
        int next = in.nextInt();
        if (next == 1) { type = "Black Hole"; }
        else if (next == 2) { type = "Solar Flare"; }
        else { type = ""; }
        System.out.println(type);
    }

    // Ship at position 0, max position 50 -- i.e. half the distance to the other ship from their starting locations
    void setLocation() {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose a location for the anomaly between 0 and 50.");
        if (type != "") {
            location = in.nextInt();
            if (location < 0 || location > 50) {
                System.out.println("Invalid selection.");
            }
            else {
                System.out.println(location);
            }
        }
    }
}

class SpacePiratesDemo {
    public static void main(String[] args) {
        Starship Enterprise = new Starship("Enterprise", 5, 20, 7000);
        Starship PlanetExpress = new Starship("Planet Express", 2, 7, 500000);
        System.out.println("The value of " + PlanetExpress.name + "'s cargo is " + PlanetExpress.valCargo + ".");
        System.out.println(Enterprise.name + " wants to attack: " + Enterprise.b(PlanetExpress.valCargo));
        SpaceAnomoly anomoly = new SpaceAnomoly();
        anomoly.setType();
        anomoly.setLocation();
    }
}

