package Sensors;

import Sensors.*;

public class SensorFactory  {
    public enum Sensortype {
        TEMP,
        PRE,
    }

    public  Sensor<?> createSensor(Sensortype TypeS) {
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

        return null;
    }
}
