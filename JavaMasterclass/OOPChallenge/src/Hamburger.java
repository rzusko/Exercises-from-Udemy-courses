import java.util.ArrayList;

public class Hamburger {

    private String name;
    private Bread bread;
    private Meat meat;
    private double basePrice;
//    private Addition add1 = null;
//    private Addition add2 = null;
//    private Addition add3 = null;
//    private Addition add4 = null;
    protected ArrayList<Addition> adds;

    public Hamburger(String name, Bread bread, Meat meat) {
        this.name = name;
        this.bread = bread;
        this.meat = meat;
        this.basePrice = (meat.getPrice() + bread.getPrice());
        this.adds = new ArrayList<Addition>();
    }

    // adding additions
    public void add(Addition addition) {
//        if (add1 == null) {
//            this.add1 = addition;
//        } else if (add2 == null) {
//            this.add2 = addition;
//        } else if (add3 == null) {
//            this.add3 = addition;
//        } else if (add4 == null) {
//            this.add4 = addition;
//        } else {
//            System.out.println("No more additions allowed.");
//        }

        if (adds.size() < 4) {
            adds.add(addition);
            System.out.println(addition.getName() + " added.");
        } else {
            System.out.println("No more additions allowed.");
        }
    }

    // show prices of base burger + additions + total price
    public void showPrices() {

        System.out.println();
        System.out.println("***********************");
        System.out.println("Base burger (" + bread.getName() + " and "
                + meat.getName() + "): " + String.format("%.2f", this.getBasePrice()) + " $.");

        int i = 1;

        for (Addition addition : adds){
            System.out.println("Addition " + i +" (" + addition.getName() + "): "
                    + String.format("%.2f", addition.getPrice()) + " $.");
            i++;
        }

        System.out.println("-----------------------");
        System.out.println("Total price for burger: " + String.format("%.2f",this.getTotalPrice()) + " $.");
        System.out.println("***********************");
        System.out.println();
    }

    // getter for total price
    public double getTotalPrice() {
        double totalPrice = this.getBasePrice();

        for (Addition addition : adds) {
            totalPrice += addition.getPrice();
        }

        return totalPrice;
    }

//    // getter for price of addition
//    private double getAddPrice(Addition addition) {
//        if (addition != null) {
//            return addition.getPrice();
//        } else {
//            return 0.0;
//        }
//    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bread getBread() {
        return bread;
    }

    public void setBread(Bread bread) {
        this.bread = bread;
        System.out.println("Bread set to > " + bread.getName());
    }

    public Meat getMeat() {
        return meat;
    }

    public double getBasePrice() {
        return basePrice;
    }

//    public Addition getAdd1() {
//        return add1;
//    }
//
//    public Addition getAdd2() {
//        return add2;
//    }
//
//    public Addition getAdd3() {
//        return add3;
//    }
//
//    public Addition getAdd4() {
//        return add4;
//    }
}
