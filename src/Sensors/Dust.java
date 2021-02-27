package Sensors;

import java.util.Random;

public class Dust extends AbstractSensor{
    private Double part ;
    @Override
    public  Double read()
    {
        Random random = new Random();
        part =Math.round((random.nextInt(100 )*-1) + random.nextDouble() * 100.0) / 100.0;
        // System.out.println("it works"+Temp);
        return part;
    }
}
