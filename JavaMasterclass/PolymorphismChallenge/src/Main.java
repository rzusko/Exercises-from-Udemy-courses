// We are going to go back to the car analogy.
// Create a base class called Car
// It should have a few fields that would be appropriate for a generice car calss.
// engine, cylinders, wheels, etc.
// Constructor should initialize cylinders (number of) and name, and set wheels to 4
// and engine to true. Cylinders and names would be passed parameters.
//
// Create appropriate getters
//
// Create some methods like startEngine, accelerate, and brake
//
// show a message for each in the base class
// Now create 3 sub classes for your favorite vehicles.
// Override the appropriate methods to demonstrate polymorphism in use.
// put all classes in the one java file (this one).

class Car {

    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public void startEngine() {
        System.out.println("Car -> Starting the engine.");
    }

    public void accelerate() {
        System.out.println("Car -> Accelerating.");
    }

    public void brake() {
        System.out.println("Car -> Braking");
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }
}

class Mustang extends Car {
    public Mustang() {
        super("Mustang", 8);
    }

    @Override
    public void startEngine() {
        System.out.println("Mustang -> Starting the engine.");
    }

    @Override
    public void accelerate() {
        System.out.println("Mustang -> Accelerating.");
    }
}

class Ferrari extends Car {
    public Ferrari() {
        super("Ferrari", 12);
    }

    @Override
    public void brake() {
        System.out.println("Ferrari -> Braking.");
    }
}

class Golf extends Car {
    public Golf() {
        super("Golf", 4);
    }

}




public class Main {
    public static void main(String[] args) {
        Car car = new Car("Unknown Car", 16);
        Mustang mustang = new Mustang();
        Ferrari ferrari = new Ferrari();
        Golf golf = new Golf();

        car.startEngine();
        mustang.startEngine();
        ferrari.startEngine();
        golf.startEngine();
    }

}

