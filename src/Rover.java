import Sensors.*;

public class Rover extends AbstractSensor {


    public static class RoverBuilder extends Rover{

        enum Sensortype {
            TEMP,
            PRE,
            WIND,
            HUM,
            DUST,
        }

        public static RoverBuilder createSensor(Sensortype TypeS) {
            switch (TypeS) {


                case TEMP:
                    Temperature Temperature = new Temperature();
                    System.out.println("Temp Sensor created");
                    break;
                case PRE:
                    Pressure Pressure = new Pressure();
                    System.out.println("Pre Sensor created");
                    break;
                case WIND:
                    Wind Wind = new Wind();
                    System.out.println("Windspeed Sensor created");
                    break;
                case HUM:
                    Hum Hum = new Hum();
                    System.out.println("Humidity Sensor created");
                    break;
                case DUST:
                    Dust Dust = new Dust();
                    System.out.println("Dust Sensor created");
                    break;
            }

        return null;}



    }


}
