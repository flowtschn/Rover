 class Main {
public static void main (String[] args){
    Rover r = new Rover.RoverBuilder();

    SensorFactory T = new SensorFactory();
    T.read(true);
    // Sensoren erzeugen
    SensorFactory.creatSensor(SensorFactory.Sensortype.TEMP);
    SensorFactory.creatSensor(SensorFactory.Sensortype.PRE);


    }
}


