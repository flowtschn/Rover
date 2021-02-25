import Sensors.Temperature;

class Main {
public static void main (String[] args){
    Rover r = new Rover.RoverBuilder()

//    .createSensor(Rover.RoverBuilder.Sensortype.TEMP)
//    .createSensor(Rover.RoverBuilder.Sensortype.DUST)
//    .createSensor(Rover.RoverBuilder.Sensortype.WIND);

    r.read();




    //Sensors.SensorFactory T = new Sensors.SensorFactory();
    //T.read(true);
   // T.enabled(false);
    // Sensoren erzeugen
   // T.createSensor(Sensors.SensorFactory.Sensortype.TEMP);

    }
}


