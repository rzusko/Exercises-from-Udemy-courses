// Challenge.
// Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
// Finally, create another class, a specific type of Car that inherits from the Car class.
// You should be able to hand steering, changing gears, and moving (speed in other words).
// You will want to decide where to put the appropriate state and behaviours (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed should be included.
// For you specific type of vehicle you will want to add something specific for that type of car.


public class Car extends Vehicle {

    private String gearbox;     // automatic, manual
    private int numberOfGears;
    private int numberOfWheels;

    public Car(String name, int maxSpeed, String steering, String gearbox, int numberOfGears, int numberOfWheels) {
        super(name, maxSpeed, steering);
        this.gearbox = gearbox;
        this.numberOfGears = numberOfGears;
        this.numberOfWheels = numberOfWheels;
    }

    public void changeGearUp() {
        System.out.println("Changing gear up.");
    }

    public void changeGearDown() {
        System.out.println("Changing gear down.");
    }

    @Override
    public void move(int speed) {
        changeGearUp();
        super.move(speed);
    }
}
