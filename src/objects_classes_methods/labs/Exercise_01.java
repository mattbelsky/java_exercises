package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 1:
 *
 *      Create three classes, all of which can be inside this file. The first class (the controller)
 *      should have the main method. The main method should create at least two objects using the
 *      constructors of the second and third class. The second and third class should each have at least
 *      three instance variables that should be set using the constructor when an object is created.
 *
 *      Once the objects are created, try changing the values of some of the instance variables.
 *
 *      Think about some of the examples we have seen from the lectures or Confluence Docs.
 *
 *      Be creative. Have some fun. Using Java objects you can model just about anything you want.
 *      Cars, animals, poker games, sports teams, trees, beers, people and so on.
 */
class Demo {
    public static void main(String[] args) {
        Aircraft Cessna172 = new Aircraft("Cessna 172",1, 1, true, 4, true);
        Airport JFK = new Airport(4, 8, true, "JFK", false);

        JFK.displayStats();
        JFK.delays(true);
        JFK.displayStats();
    }
}

class Aircraft {
    private String name;
    private int numEngines;
    private int numWings;
    private boolean fixedWing;
    private int numPassengers;
    private boolean tankFull;

    public Aircraft(String name, int engines, int wings, boolean fixed, int passengers, boolean tank) {
        this.name = name;
        numEngines = engines;
        numWings = wings;
        fixedWing = fixed;
        numPassengers = passengers;
        tankFull = tank;
    }
}

class Airport {
    private int numRunways;
    private int numTerminals;
    private boolean controlTower;
    private String code;
    private boolean delaysExpected;

    public Airport(int runways, int terminals, boolean tower, String code, boolean delays) {
        this.numRunways = runways;
        this.numTerminals = terminals;
        this.controlTower = tower;
        this.code = code;
        this.delaysExpected = delays;
    }

    public void displayStats() {
        System.out.println(code);
        System.out.println("No. of runways: " + numRunways);
        System.out.println("No. of terminals: " + numTerminals);
        System.out.println("Has a control tower? " + controlTower);
        System.out.println("Delays expected? " + delaysExpected + "\n");
    }

    public void delays(boolean d) {
        delaysExpected = d;
    }
}