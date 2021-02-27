package Sensors;

public interface Sensor<T> {



    public T read();

    public boolean enabled ();

    public boolean disabled();


}




