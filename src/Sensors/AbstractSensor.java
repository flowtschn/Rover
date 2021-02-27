package Sensors;

import Exp.ExpFactory;
import Exp.ExperimentalSetup;

public abstract class AbstractSensor <T> implements Sensor<T> {
    private boolean status;
    private T content ;





    public  T  read() {
        return this.content;
    }

    @Override
    public boolean enabled() {
        status = true;
        System.out.println("Sensor ist angeschalten!");
        return status;


    }

    @Override
    public boolean disabled() {
        status = false;
        System.out.println("Sensor ist deaktiviert!");
        return status;

    }

   public void runExperiment(ExpFactory.Exptype exptype) {
        ExpFactory.getExperimentData(exptype);
    }

}
