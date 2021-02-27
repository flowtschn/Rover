import Exp.ExpFactory;
import Exp.ExperimentalSetup;
import Exp.Moxie;
import Sensors.*;

import java.util.HashMap;

public class Rover extends AbstractSensor {



    private HashMap<Integer, Sensor<?>> sensormap;
    private HashMap <Integer , Moxie> experimentmap ;
    private String name;
    Temperature t = new Temperature();

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
            System.out.println("Added - "+ type + " - Sensor" );
            return  this;
        }


        public RoverBuilder addname(String name){
                this.name=name;
                return this;
        }

        public RoverBuilder addExperimentalSetup(ExpFactory.Exptype temp) {
            this.experimentmap.put(IndexE, ExpFactory.createExp(temp));
            //System.out.println(experimentmap);
            IndexE = IndexE+1;
       return this ; }



        public Rover build() {
            Rover ourrover = new Rover();
            ourrover.name = this.name;
            ourrover.sensormap = this.sensormap;
            ourrover.experimentmap = this.experimentmap;
            System.out.println("Name of the Rover ->"+" "+ourrover.name); //check if right name is attached
            return ourrover;

        }


    }
    public double readSensorData(SensorFactory.Sensortype type) {
        double Sensordata = 0;
        switch (type) {
            case TEMP:
                Temperature t = new Temperature() ;
                return t.read();
            case WIND:
                Wind w = new Wind() ;
                return w.read();}
        return Sensordata ;
    }


    }











