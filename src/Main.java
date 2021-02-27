import Exp.ExpFactory;
import Exp.Moxie;
import Sensors.*;

class Main {
public static void main (String[] args){
    Rover r = new Rover.RoverBuilder()
            .addname("juhu")
            .addSensor(SensorFactory.Sensortype.PRE)
            .addSensor(SensorFactory.Sensortype.TEMP)
            .addSensor(SensorFactory.Sensortype.HUM)
            .addSensor(SensorFactory.Sensortype.WIND)
            .addSensor(SensorFactory.Sensortype.RAD)
            .addExperimentalSetup(ExpFactory.Exptype.MOXIE)
            .addExperimentalSetup(ExpFactory.Exptype.ROXY)
            .build();

    // READ DATA FROM SENSORS:
    System.out.println("Current planetary temperature: "+
            r.readSensorData(SensorFactory.Sensortype.TEMP)+"°C");
    System.out.println("Current planetary windspeed: "+
            r.readSensorData(SensorFactory.Sensortype.WIND)+"km/h");

    //Disable a Sensor:
    r.disabled(SensorFactory.Sensortype.WIND);

    //Enable a Sensor:
   r.enabled(SensorFactory.Sensortype.WIND);


    // RUN AN EXPERIMENT:
  // r.runExperiment(ExpFactory.Exptype.MOXIE);
   // EVALUATE EXPERIMENT:
    //System.out.println("CO2 conversion success rate: "
       //     r.evaluateExperiment(Experiment.MOXIE));










    //r.disabled();

    //r.read();

    //Sensors.Temperature.getData();
  //System.out.println(r);


//    .createSensor(Rover.RoverBuilder.Sensortype.TEMP)
//    .createSensor(Rover.RoverBuilder.Sensortype.DUST)
//    .createSensor(Rover.RoverBuilder.Sensortype.WIND);

   // r.read();




    //Sensors.SensorFactory T = new Sensors.SensorFactory();
    //T.read(true);
   // T.enabled(false);
    // Sensoren erzeugen
   // T.createSensor(Sensors.SensorFactory.Sensortype.TEMP);

    }
}


