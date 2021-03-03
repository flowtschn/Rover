package Sensors;

import Exp.ExpFactory;
import Exp.ExperimentalSetup;
import Exp.Moxie;
import Exp.Roxy;

public abstract class AbstractSensor <T> implements Sensor<T> {
    static boolean status=true;
    private T content ;





    public  T  read() throws Exception {
        if (status) {
            return this.content;
        }

        throw new Exception();


    }

    @Override
    public boolean enabled(SensorFactory.Sensortype t) {
       //ourrover.sensormap.get(t).read();
        switch (t) {
            case TEMP:
                Temperature.status = true;
                System.out.println("Temp Sensor  is activated!");
                break;
            case WIND:
                Wind.status = true;
                System.out.println("Wind Sensor  is activated!");
                break;
            case PRE:
                Pressure.status = true;
                System.out.println("Pressure Sensor  is activated!");
        break;}
       System.out.println("STATUS ="+ status);
        return status;


    }

    @Override
    public boolean disabled(SensorFactory.Sensortype t) {
        switch (t) {
            case TEMP:
                Temperature.status = false;
                System.out.println("Temp Sensor  is deactivated!");
                break;
            case HUM:
                Hum.status = false;
                System.out.println("HUM Sensor  is deactivated!");
                break;
            case WIND:
                Wind.status = false;
                System.out.println("Wind Sensor  is deactivated!");
                break;
            case PRE:
                System.out.println("Pressure Sensor  is deactivated!");
                break;
            case RAD:
                System.out.println("Pressure Sensor  is deactivated!");
                break;
        }
        System.out.println("STATUS ="+ Wind.status + Temperature.status);
        return status;

    }




}
