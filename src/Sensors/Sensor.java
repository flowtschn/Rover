package Sensors;

public interface Sensor<T> {



    T read();

    public boolean enabled ();

    public boolean disabled();


}




