public class DeluxeBurger extends Hamburger{

    public DeluxeBurger(Bread bread, Meat meat, Drink drink) {
        super("Deluxe Burger", bread, meat);
        Chips chips = new Chips();
        super.add(chips);
        super.add(drink);
    }

    @Override
    public void add(Addition addition) {
        System.out.println("No extra additions allowed.");
    }


}
