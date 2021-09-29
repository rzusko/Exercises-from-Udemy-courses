package Java.MasterClass;

import java.util.HashSet;
import java.util.Set;

public final class Planet extends HeavenlyBody{

    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.PLANET);
    }

    @Override
    public boolean addSatellite(HeavenlyBody moon) {
        if (moon.getKey().getBodyType() == BodyTypes.MOON) {
            System.out.println("Moon succesfully added");
            return super.addSatellite(moon);
        }

        System.out.println("Unable to add moon " + moon.getKey().getName() + ", because it is not moon.");
        return false;
    }
}
