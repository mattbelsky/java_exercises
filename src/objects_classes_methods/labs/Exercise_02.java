package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 2:
 *
 *      Create a class that demonstrates the following: (all methods below can be in the same class)
 *
 *      1) A static method that calls another static method.
 *      2) A static method that calls a non-static method.
 *      3) A non-static method1 that calls another non-static method2, but this time method2 should return a value to method1.
 *      4) A non-static method1 that calls another non-static method2 and passes a value to method2.
 */

class Reservoir {
    private int area; // acres
    private double depth; // feet
    private double volume; // cubic feet

    public Reservoir(int a, int d) {
        area = a * 6272646; // to sq inches
        depth = d * 12; // takes user input and converts to inches
        volume = calcVolume();
    }

    /**
     * Simulates how much the volume is increased by rainfall and decreased by evaporation over a period of days in a
     * given month.
     * @param inches the amount of rainfall in inches
     * @param days the number of days of rainfall
     * @param month the month of the year (a number)
     */
    public void rain(int inches, int days, int month) { // inches
        if (days < 32) {
            depth = depth + inches - (evaporation(month) * (days / daysInMonth(month)));
            volume = calcVolume();
        }
    }

    // Each month has an average amount of evaporation in inches.
    private static int evaporation(int month) {
        switch (month) {
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 5;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 9;
            case 9:
                return 8;
            case 10:
                return 5;
            case 11:
                return 4;
            case 12:
                return 3;
            default:
                return 0;
        }
    }

    public static double avgEvaporation() {
        int sum = 0;
        for (int i = 0; i < 12; i++) {
            sum += evaporation(i);
        }
        return sum / 12;
    }

    public static int daysInMonth(int month) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return 28;
            default:
                return 0;
        }
    }

    private double calcVolume() {
        return convertToGallons(area, depth); // cubic inches
    }

    private double convertToGallons(int a, double d) {
        return a * d * 0.004329;
    }

    public double getVolume() {
        return volume;
    }
}

class ReservoirDemo {
    public static void main(String[] args) {
        Reservoir hoosierDam = new Reservoir(100, 192); // no relation to Hoover Dam
        System.out.println(hoosierDam.getVolume());
        hoosierDam.rain(3,28,7);
        System.out.println(hoosierDam.getVolume());
        System.out.println(Reservoir.avgEvaporation());
    }
}