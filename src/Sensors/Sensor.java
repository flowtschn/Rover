package Sensors;

public interface Sensor<T> {



    public T read() throws Exception;

    public boolean enabled ();

    public boolean disabled();


}




