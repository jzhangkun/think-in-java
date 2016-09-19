package typeinfo.ex14;

import typeinfo.factory.Factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: jzhangkun
 * Date: 9/12/16
 * Time: 8:05 AM
 * To change this template use File | Settings | File Templates.
 */

class Part {
    public String toString() {
        return getClass().getSimpleName();
    }
    static List<Class<? extends Factory>> partFactories =
            new ArrayList<Class<? extends Factory>>();
    static {
        partFactories.add(FuelFilter.Factory.class);
        partFactories.add(AirFilter.Factory.class);
        partFactories.add(CabinAirFilter.Factory.class);
        partFactories.add(OilFilter.Factory.class);
        partFactories.add(FanBelt.Factory.class);
        partFactories.add(PowerSteeringBelt.Factory.class);
        partFactories.add(GeneratorBelt.Factory.class);
    }
    private static Random rand = new Random(47);
    public static Part createRandom() {
        int n = rand.nextInt(partFactories.size());
        try {
            // why it shows "incompatible types"
            //return partFactories.get(n).newInstance().create();
            //System.out.println(partFactories.get(n).newInstance().create());
            // upcast
            return (Part)partFactories.get(n).newInstance().create();
        } catch (InstantiationException e) {
            System.out.println(e);
            return null;
        } catch (IllegalAccessException e) {
            System.out.println(e);
            return null;
        }
    }
}

class Filter extends Part {}

class FuelFilter extends Filter {
     public static class Factory
             implements typeinfo.factory.Factory<FuelFilter> {
         public FuelFilter create() { return new FuelFilter(); }
     }
}

class AirFilter extends Filter {
    public static class Factory
            implements typeinfo.factory.Factory<AirFilter> {
        public AirFilter create() { return new AirFilter(); }
    }
}

class CabinAirFilter extends Filter {
    public static class Factory
            implements typeinfo.factory.Factory<CabinAirFilter> {
        public CabinAirFilter create() { return new CabinAirFilter(); }
    }
}

class OilFilter extends Filter {
    public static class Factory
            implements typeinfo.factory.Factory<OilFilter> {
        public OilFilter create() { return new OilFilter(); }
    }
}

class Belt extends Part {}

class FanBelt extends Belt {
    public static class Factory
        implements typeinfo.factory.Factory<FanBelt> {
        public FanBelt create() { return new FanBelt(); }
    }
}

class GeneratorBelt extends Belt {
    public static class Factory
            implements typeinfo.factory.Factory<GeneratorBelt> {
        public GeneratorBelt create() { return new GeneratorBelt(); }
    }
}

class PowerSteeringBelt extends Belt {
    public static class Factory
            implements typeinfo.factory.Factory<PowerSteeringBelt> {
        public PowerSteeringBelt create() { return new PowerSteeringBelt(); }
    }
}

public class RegisteredFactory {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i ++)
            System.out.println(Part.createRandom());
    }
}
