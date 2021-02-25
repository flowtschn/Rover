package Sensors;

import Sensors.*;

public class SensorFactory extends AbstractSensor  {
    public enum Sensortype {
        TEMP,
        PRE,
    }

    public static Sensor<?> createSensor(Sensortype TypeS) {
        switch (TypeS) {
            case TEMP:
                System.out.println("Temp Sensors.Sensor created");
                return new Temperature();
            case PRE:
                System.out.println("Pre Sensors.Sensor created");
                return new Pressure();
            default:
                System.out.println("--");
        }

        return  null  ;
    }
}
