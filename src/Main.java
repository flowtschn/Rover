import Exp.ExpFactory;
import Exp.Moxie;
import Sensors.*;
import Steering.SteeeringFactory;
import Steering.Vector;

class Main {
public static void main (String[] args) throws Exception {
    Rover r = new Rover.RoverBuilder()
            .addname("juhu")
            .addSensor(SensorFactory.Sensortype.PRE)
            .addSensor(SensorFactory.Sensortype.TEMP)
            .addSensor(SensorFactory.Sensortype.HUM)
            .addSensor(SensorFactory.Sensortype.WIND)
            .addSensor(SensorFactory.Sensortype.RAD)
            .addSensor(SensorFactory.Sensortype.DUST)
            .addExperimentalSetup(ExpFactory.Exptype.MOXIE)
            .addExperimentalSetup(ExpFactory.Exptype.WATER)
            .setSteering(SteeeringFactory.SteeringType.DIFF)
            .build();

    // READ DATA FROM SENSORS:
    System.out.println("Current planetary temperature: "+
            r.readSensorData(SensorFactory.Sensortype.TEMP)+"°C");
    System.out.println("Current planetary windspeed: "+
            r.readSensorData(SensorFactory.Sensortype.WIND)+"km/h");
    System.out.println("Current planetary Data From Dust Sensor [shape,diameter]: "+
            r.readSensorData(SensorFactory.Sensortype.DUST)+ " μm");


    //Disable a Sensor:
    //r.disabled(SensorFactory.Sensortype.WIND);
    System.out.println("Current planetary windspeed: "+
            r.readSensorData(SensorFactory.Sensortype.WIND)+"km/h");

    //Enable a Sensor:
    r.senoroff(SensorFactory.Sensortype.TEMP);
    System.out.println("Current planetary TEMP: "+
            r.readSensorData(SensorFactory.Sensortype.TEMP)+"km/h");
    r.sensoron(SensorFactory.Sensortype.TEMP);
    System.out.println("Current planetary TEMP: "+
            r.readSensorData(SensorFactory.Sensortype.TEMP)+"km/h");



    // RUN AN EXPERIMENT:
  r.runExperiment(ExpFactory.Exptype.MOXIE);
  r.runExperiment(ExpFactory.Exptype.WATER);

   // EVALUATE EXPERIMENT:
    r.evaluateExperiment(ExpFactory.Exptype.MOXIE);
    r.evaluateExperiment(ExpFactory.Exptype.WATER);

    System.out.println("ML,MR: " +    r.move(new Vector(0,10)));

    }
}


