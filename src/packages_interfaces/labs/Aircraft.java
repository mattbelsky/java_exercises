package packages_interfaces.labs;

public class Aircraft implements Vehicle {
    public void turnOn() {
        // Turn key in ignition
        // Feed power to engine
    }

    public void accelerate() {
        // Pull throttle back
        // Feed more power to engine
    }

    public void decelerate() {
        // Push throttle forward
        // Feed less power to engine
        // Raise flaps
    }

    public void turn() {
        // Set direction
        // Turn yoke in set direction
        // Raise ailerons on the side of set direction
        // Lower ailerons on the opposite side of set direction
    }
}
