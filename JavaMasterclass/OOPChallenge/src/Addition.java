public class Addition {

    private String name;
    private double price;

    public Addition(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Onion extends Addition {

    public Onion() {
        super("Onion", 0.25);
    }
}

class Cheese extends Addition {

    public Cheese() {
        super("Cheese", 0.45);
    }
}

class Chips extends Addition {

    public Chips() {
        super("Chips", 0.70);
    }
}

class Lettuce extends Addition {    // salat

    public Lettuce() {
        super("Lettuce", 0.33);
    }
}

class Tomato extends Addition {

    public Tomato() {
        super("Tomato", 0.28);
    }
}

class Carrot extends Addition {

    public Carrot() {
        super("Carrot", 0.75);
    }
}

class Bacon extends Addition {

    public Bacon() {
        super("Bacon", 0.99);
    }
}

class Meat extends Addition {

    public Meat() {
        super("Meat", 1.69);
    }
}






