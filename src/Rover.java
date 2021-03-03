import Exp.ExpFactory;
import Exp.ExperimentalSetup;
import Exp.Moxie;
import Exp.Roxy;
import Sensors.*;

import java.util.HashMap;

public class Rover extends AbstractSensor {



    public static HashMap<Enum, Sensor<?>> sensormap;
    public HashMap <Enum , Moxie> experimentmap ;
    private String name;



    public static class RoverBuilder extends Rover  {

//        private  SensorFactory sensor;
        private int IndexS = 0;
        private int IndexE = 0;
        private HashMap <Enum , Sensor<?>>sensormap = new HashMap<>();
        private HashMap <Enum , Moxie> experimentmap = new HashMap<>();
        private String name;





        public RoverBuilder addSensor(SensorFactory.Sensortype type) {

            this.sensormap.put(type, SensorFactory.createSensor(type));
            System.out.println("Added - "+ type + " - Sensor" );
            return  this;
        }


        public RoverBuilder addname(String name){
                this.name=name;
                return this;
        }

        public RoverBuilder addExperimentalSetup(ExpFactory.Exptype temp) {
            this.experimentmap.put(temp, ExpFactory.createExp(temp));
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
    public String readSensorData(SensorFactory.Sensortype type) throws Exception {
        try {
            String Sensordata = sensormap.get(type).read().toString();
            return Sensordata ;

        }
        catch(Exception e) {
            String Sensorerror="<<<---!!Sensors not activated!!-->>>";
            return Sensorerror;
        }

    }

    public void runExperiment(ExpFactory.Exptype exptype) {
        experimentmap.get(exptype).Experiment();
    }

    public void evaluateExperiment(ExpFactory.Exptype exptype) {
                System.out.println("CO2 conversion success rate: " + experimentmap.get(exptype).evaluate());

        //double eva =0;
//        ExpFactory.getExperimentData(exptype);
    }


    }











