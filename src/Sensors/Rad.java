package Sensors;

import java.util.Random;

public class Rad extends AbstractSensor {
    private Double rad ;
    @Override
    public  Double read()
    {
        Random random = new Random();
        rad =Math.round((random.nextInt(30 )*-1) + random.nextDouble() * 100.0) / 100.0;
        // System.out.println("it works"+Temp);
        return rad;
    }
}
