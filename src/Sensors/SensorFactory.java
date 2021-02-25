package Sensors;

import Sensors.*;

public class SensorFactory extends AbstractSensor  {
    public enum Sensortype {
        TEMP,
        PRE,
        HUM,
        WIND,
        RAD
    }

    public static Sensor<?> createSensor(Sensortype TypeS) {
        switch (TypeS) {
            case TEMP:
                System.out.println("Temp Sensors.Sensor created");
                return new Temperature();
            case PRE:
                System.out.println("Pre Sensors.Sensor created");
                return new Pressure();
            case HUM:
                System.out.println("Hum Sensors.Sensor created");
                return new Hum();
            case WIND:
                System.out.println("Wind Sensors.Sensor created");
                return new Wind();
            case RAD:
                System.out.println("Radiation Sensors.Sensor created");
                return new Rad();
            default:
                System.out.println("--");
        }

        return  null  ;
    }
}
