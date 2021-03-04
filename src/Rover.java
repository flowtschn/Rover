import Exp.ExpFactory;
import Exp.Moxie;
import Sensors.*;
import Steering.DifferentialSteering;
import Steering.Steering;
import Steering.Vector;
import Steering.*;

import java.util.HashMap;

public class Rover extends AbstractSensor {



    public static HashMap<Enum, Sensor<?>> sensormap;
    public static HashMap<Enum, Steering<?>> steeringmap;
    public HashMap <Enum , Moxie> experimentmap ;
    private String name;



    public static class RoverBuilder extends Rover  {

//        private  SensorFactory sensor;
        private int IndexS = 0;
        private int IndexE = 0;
        private HashMap <Enum , Sensor<?>>sensormap = new HashMap<>();
        private HashMap <Enum , Moxie> experimentmap = new HashMap<>();
        private HashMap<Enum, Steering<?>> steeringmap =new HashMap<>();
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
            return this; }

        public RoverBuilder setSteering(SteeeringFactory.SteeringType t) {
            this.steeringmap.put(t, SteeeringFactory.createSteering(t));
            return this; }



        public Rover build() {
            Rover ourrover = new Rover();
            ourrover.name = this.name;
            ourrover.sensormap = this.sensormap;
            ourrover.experimentmap = this.experimentmap;
            ourrover.steeringmap = this.steeringmap;
            System.out.println("Name of the Rover ->"+" "+ourrover.name); //check if right name is attached
            return ourrover;

        }


    }
    public Object readSensorData(SensorFactory.Sensortype type) throws Exception {
        try {
            return sensormap.get(type).read() ;
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
                System.out.println("Experiment "+ exptype+ " success rate: " + experimentmap.get(exptype).evaluate());
    }
public  void sensoron (SensorFactory.Sensortype type){
         sensormap.get(type).enabled();
    }
public void senoroff (SensorFactory.Sensortype type){
    sensormap.get(type).disabled();
}
public Object move(Vector v) {
        DifferentialSteering x = new DifferentialSteering();
        return x.driveTo(v);
    }
    }











