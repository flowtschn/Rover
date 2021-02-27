package Sensors;

import java.util.Random;

public class Pressure extends AbstractSensor {
    private Double psi ;
    @Override
    public  Double read()
    {
        Random random = new Random();
        psi =Math.round((random.nextInt(100 )*-1) + random.nextDouble() * 100.0) / 100.0;
        // System.out.println("it works"+Temp);
        return psi;
    }
}
