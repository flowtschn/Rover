 class Main {
public static void main (String[] args){
    Rover r = new Rover.RoverBuilder();

    SensorFactory T = new SensorFactory();
    T.read(true);

    // Sensoren erzeugen
    SensorFactory.createSensor(SensorFactory.Sensortype.TEMP);
    SensorFactory.createSensor(SensorFactory.Sensortype.PRE);


    }
}


