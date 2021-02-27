package Sensors;

import java.util.Random;

public class Hum extends AbstractSensor{
    private Double hum ;
    @Override
    public  Double read()
    {
        Random random = new Random();
        hum =Math.round((random.nextInt(100 )*-1) + random.nextDouble() * 100.0) / 100.0;
        // System.out.println("it works"+Temp);
        return hum;
    }
}
