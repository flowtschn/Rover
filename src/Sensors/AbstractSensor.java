package Sensors;

import Exp.ExpFactory;
import Exp.ExperimentalSetup;
import Exp.Moxie;
import Exp.Roxy;

public abstract class AbstractSensor <T> implements Sensor<T> {
    private boolean status;
    private T content ;





    public  T  read() throws Exception {
        if (status) {
            return this.content;
        }
        throw new Exception("Sensor is not activated");


    }

    @Override
    public boolean enabled(SensorFactory.Sensortype t) {

        switch (t) {
            case TEMP:
                status = true;
                System.out.println("Temp Sensor  is activated!");
                break;
            case WIND:
                status = true;
                System.out.println("Wind Sensor  is activated!");
                break;
            case PRE:
                status = true;
                System.out.println("Pressure Sensor  is activated!");
        break;}
        return status;


    }

    @Override
    public boolean disabled(SensorFactory.Sensortype t) {
        status = false;
        switch (t) {
            case TEMP:
                System.out.println("Temp Sensor  is deactivated!");
                break;
            case HUM:
                System.out.println("HUM Sensor  is deactivated!");
                break;
            case WIND:
                System.out.println("Wind Sensor  is deactivated!");
                break;
            case PRE:
                System.out.println("Pressure Sensor  is deactivated!");
                break;
            case RAD:
                System.out.println("Pressure Sensor  is deactivated!");
                break;
        }
        System.out.println("STATUS ="+ status);
        return status;

    }




}
