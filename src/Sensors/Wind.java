package Sensors;

import java.util.Random;

public class Wind extends AbstractSensor <Double> {
    private Double Windspeed ;
    @Override
    public  Double read()
    {
        Random random = new Random();
        Windspeed =Math.round((random.nextInt(100 )) + random.nextDouble() * 100.0) / 100.0;
        // System.out.println("it works"+Temp);
        return Windspeed;
    }
}
