package Sensors;

import Sensors.*;

public class SensorFactory extends AbstractSensor  {
    public enum Sensortype {
        TEMP,
        PRE,
        HUM,
        WIND,
        RAD,
        DUST
    }

    public static Sensor<?> createSensor(Sensortype TypeS) {
        switch (TypeS) {
            case TEMP:
                //System.out.println("Temp Sensor created");
                return new Temperature();
            case PRE:
                //System.out.println("Pre Sensor created");
                return new Pressure();
            case HUM:
                //System.out.println("Hum Sensor created");
                return new Hum();
            case WIND:
                //System.out.println("Wind Sensor created");
                return new Wind();
            case RAD:
                //System.out.println("Radiation Sensor created");
                return new Rad();
            case DUST:
                //System.out.println("Radiation Sensor created");
                return new Dust();
            default:
                System.out.println("--");
        }

        return  null  ;
    }

}
