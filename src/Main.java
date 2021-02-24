 class Main {
public static void main (String[] args){

    SensorFactory T = new SensorFactory();
    T.read(false);
    
    SensorFactory.addSensor(SensorFactory.Sensortype.TEMP);
    SensorFactory.addSensor(SensorFactory.Sensortype.PRE);
    }
}


