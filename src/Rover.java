import Sensors.*;

import java.util.HashMap;

public class Rover extends AbstractSensor {



    public static class RoverBuilder extends Rover  {

        private  SensorFactory sensor;
        private int Index;
        private HashMap <Integer , Sensor<?>>sensormap = new HashMap<>();
        private String name;




        public RoverBuilder addSensor(SensorFactory.Sensortype type) {

            this.sensormap.put(Index, SensorFactory.createSensor(type));
            Index = Index+1;
            System.out.println(sensormap);
            return  this;


        }
            public RoverBuilder addname(String name){
                this.name=name;
                return this;

        }
    }



    }











