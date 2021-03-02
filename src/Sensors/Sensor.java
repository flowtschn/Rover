package Sensors;

public interface Sensor<T> {



    public T read() throws Exception;

    public boolean enabled (SensorFactory.Sensortype t);

    public boolean disabled(SensorFactory.Sensortype t);


}




