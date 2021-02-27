package Sensors;


import java.util.Random;

public class Temperature extends AbstractSensor<Double> {
    private Double Temp ;
@Override
    public  Double read()
    {
        Random random = new Random();
        Temp =Math.round((random.nextInt(100 )*-1) + random.nextDouble() * 100.0) / 100.0;
       // System.out.println("it works"+Temp);
        return Temp;
    }


}
