class Drink extends Addition {

    public Drink(String name) {
        super(name, 1.29);
    }
}

class CocaCola extends Drink {

    public CocaCola() {
        super("Coca-Cola");
    }
}

class Fanta extends Drink {

    public Fanta() {
        super("Fanta");
    }
}

class Sprite extends Drink {

    public Sprite() {
        super("Sprite");
    }
}
