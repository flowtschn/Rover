import Sensors.*;

import java.util.HashMap;

public class Rover extends AbstractSensor {
private  SensorFactory sensor;
private HashMap <SensorFactory , SensorFactory.Sensortype > sensormap = new HashMap<>();

    public class RoverBuilder extends Rover {

    }
        public RoverBuilder addSensor(SensorFactory sensor){
            this.sensormap.put(sensor, SensorFactory.Sensortype );


        }






    }



