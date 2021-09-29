public class Television {

    private String manufacturer;
    private String model;
    private int size;
    private Resolution resolution;

    public Television(String manufacturer, String model, int size, Resolution resolution) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.size = size;
        this.resolution = resolution;
    }

    public void turnOn() {
        System.out.println("Television turning on.");
    }

    public void turnOff() {
        System.out.println("Television turning off.");
    }
}
