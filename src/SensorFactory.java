import Sensors.*;

public class SensorFactory extends AbstractSensor {
    enum Sensortype {
        TEMP,
        PRE,
    }

    public static void  createSensor(Sensortype TypeS) {
        switch (TypeS) {


            case TEMP:
                Temperature Temperature = new Temperature();
                System.out.println("Temp Sensor created");
                break;
            case PRE:
                Pressure Pressure = new Pressure();
                System.out.println("Pre Sensor created");
                break;
        }
    }
}
