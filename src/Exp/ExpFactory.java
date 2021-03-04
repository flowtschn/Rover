package Exp;

import Sensors.SensorFactory;
import Sensors.Wind;

public class ExpFactory extends Moxie {


    public enum Exptype {
        MOXIE,
        WATER
    }

    public static Moxie createExp(Exptype TypeE) {
        switch (TypeE) {
            case MOXIE:
                return new Moxie();

            case WATER:
                return new findWater();
        }
        return null;
    }


}