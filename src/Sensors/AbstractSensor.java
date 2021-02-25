package Sensors;

public abstract class AbstractSensor <T> implements Sensor<T> {
    private boolean status;
    private T content ;



    @Override
    public T  read() {
        if (this.status == false) {

            System.out.println("Sensors.Sensor ist nicht angeschalten!");
        }

        return this.content;
    }

    @Override
    public boolean enabled() {
        status = true;
        System.out.println("Sensors.Sensor ist angeschalten!");
        return status;


    }

    @Override
    public boolean disabled() {
        status = false;
        System.out.println("Sensors.Sensor ist deaktiviert!");
        return status;

    }

}
