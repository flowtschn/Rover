package Sensors;

import Exp.ExpFactory;
import Exp.ExperimentalSetup;
import Exp.Moxie;
import Exp.Roxy;

public abstract class AbstractSensor <T> implements Sensor<T> {
    private boolean status;
    private T content ;





    public  T  read() {
        return this.content;
    }

    @Override
    public boolean enabled(SensorFactory.Sensortype t) {
        status = true;
        switch (t) {
            case TEMP:
                System.out.println("Temp Sensor  is activated!");
                break;
            case WIND:
                System.out.println("Wind Sensor  is activated!");
                break;
            case PRE:
                System.out.println("Pressure Sensor  is activated!");
        break;}
        return status;


    }

    @Override
    public boolean disabled(SensorFactory.Sensortype t) {
        status = true;
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
        return status;

    }




}
