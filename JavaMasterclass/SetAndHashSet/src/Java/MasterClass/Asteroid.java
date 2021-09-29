package Java.MasterClass;

public final class Asteroid extends HeavenlyBody {
    public Asteroid(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.ASTEROID);
    }
}
