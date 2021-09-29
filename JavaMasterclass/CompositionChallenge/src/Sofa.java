public class Sofa {
    private int numberOfSeats;
    private Dimensions dimensions;
    private String color;

    public Sofa(int numberOfSeats, Dimensions dimensions, String color) {
        this.numberOfSeats = numberOfSeats;
        this.dimensions = dimensions;
        this.color = color;
    }

    public void sitOn() {
        System.out.println("Maximum people that can sit on sofa: " + numberOfSeats);
    }
}
