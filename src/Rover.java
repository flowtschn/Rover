import Exp.ExpFactory;
import Exp.ExperimentalSetup;
import Exp.Moxie;
import Sensors.*;

import java.util.HashMap;

public class Rover extends AbstractSensor {


    private HashMap<Integer, Sensor<?>> sensormap;
    private HashMap <Integer , Moxie> experimentmap ;
    private String name;

    public static class RoverBuilder extends Rover  {

//        private  SensorFactory sensor;
        private int IndexS = 0;
        private int IndexE = 0;
        private HashMap <Integer , Sensor<?>>sensormap = new HashMap<>();
        private HashMap <Integer , Moxie> experimentmap = new HashMap<>();
        private String name;





        public RoverBuilder addSensor(SensorFactory.Sensortype type) {

            this.sensormap.put(IndexS, SensorFactory.createSensor(type));
            IndexS = IndexS+1;
            System.out.println(sensormap);
            return  this;
        }


        public RoverBuilder addname(String name){
                this.name=name;
                return this;
        }

        public RoverBuilder addExperimentalSetup(ExpFactory.Exptype temp) {
            this.experimentmap.put(IndexE, ExpFactory.createExp(temp));
            System.out.println(experimentmap);
            IndexE = IndexE+1;

       return this ; }

        public Rover build() {
            Rover ourrover = new Rover();
            ourrover.name = this.name;
            ourrover.sensormap = this.sensormap;
            ourrover.experimentmap = this.experimentmap;
            System.out.println(ourrover.name); //check if right name is attached
            return ourrover;

        }
    }



    }











