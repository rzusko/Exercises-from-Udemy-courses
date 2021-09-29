public class SportCar extends Car {

    private boolean nitro;  // has nitro

    public SportCar(String name, int maxSpeed, String gearbox, int numberOfGears, boolean turbo, boolean nitro) {
        super(name, maxSpeed, "hand", gearbox, numberOfGears, 4);
        this.nitro = nitro;
    }

    public void applyNitro() {
        this.nitro = true;
        System.out.println("Nitro applied.");
    }
}
