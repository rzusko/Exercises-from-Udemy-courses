class Bread extends Addition {

    public Bread(String name, double price) {
        super(name, price);
    }
}

class BrownRyeBreadRoll extends Bread {

    public BrownRyeBreadRoll() {
        super("Brown Rye bread roll", 0.82);
    }
}

class KaiserBreadRoll extends Bread {

    public KaiserBreadRoll() {
        super("Kaiser bread roll", 0.46);
    }
}

class OnionBreadRoll extends Bread {

    public OnionBreadRoll() {
        super("Onion bread roll", 0.67);
    }
}

class PotatoBreadRoll extends Bread {

    public PotatoBreadRoll() {
        super("Potato bread roll", 0.59);
    }
}

class SesameSeedBreadRoll extends Bread {

    public SesameSeedBreadRoll() {
        super("Sesame seed bread roll", 0.46);
    }
}
