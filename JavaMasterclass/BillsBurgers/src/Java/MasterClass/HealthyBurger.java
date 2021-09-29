package Java.MasterClass;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
        System.out.println("Added " + name + " for an extra " + price);
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
        System.out.println("Added " + name + " for an extra " + price);
    }

    @Override
    public double itemizeHamburger() {
        double totalPrice = super.itemizeHamburger();
        if (healthyExtra1Price > 0.0) {
            totalPrice += healthyExtra1Price;
        }
        if (healthyExtra2Price > 0.0) {
            totalPrice += healthyExtra2Price;
        }
        return totalPrice;
    }
}
