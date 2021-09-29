// Challenge.
// Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
// Finally, create another class, a specific type of Car that inherits from the Car class.
// You should be able to hand steering, changing gears, and moving (speed in other words).
// You will want to decide where to put the appropriate state and behaviours (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed should be included.
// For you specific type of vehicle you will want to add something specific for that type of car.

public class Vehicle {

    private String name;    // name of the vehicle
    private int maxSpeed;   // maximum speed
    private String steering;    // hand, remoted etc.

    public Vehicle(String name, int maxSpeed, String steering) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.steering = steering;
    }

    public void move(int speed) {
        System.out.println("Vehicle is moving at speed: " + speed);
    }

    public void steerRight(int angle) {
        System.out.println("Steering " + angle + " degrees to the right. ");
    }

    public void steerLeft(int angle) {
        System.out.println("Steering " + angle + " degrees to the left");
    }
}
