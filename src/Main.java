import Exp.ExpFactory;
import Sensors.Sensor;
import Sensors.SensorFactory;
import Sensors.Temperature;
import Sensors.Wind;

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

  System.out.println(r);


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


