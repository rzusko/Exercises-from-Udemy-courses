

public class HealthyBurger extends Hamburger {

    public HealthyBurger(Meat meat) {
        super("Healthy Burger", new BrownRyeBreadRoll(), meat);
    }

    @Override
    public void add(Addition addition) {
        if (adds.size() < 6) {
            adds.add(addition);
            System.out.println(addition.getName() + " added.");
        } else {
            System.out.println("No more additions allowed.");
        }
    }

    @Override
    public void setBread(Bread bread) {
        System.out.println("Change of bread is not allowed.");
    }
}
