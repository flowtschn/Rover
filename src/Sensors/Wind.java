package Sensors;

import java.util.Random;

public class Wind extends AbstractSensor  {
    private Double Windspeed ;
    private String dir [] = {"N","NE","E","SE","S","SW","W","NW"};
    private String Winddirection;
    private Pair<String , Double> p = new Pair<>(Winddirection,Windspeed);


    @Override
    public Pair<?,?> read() throws Exception
    {
        super.read();
        Random random = new Random();
        int rnd = new Random().nextInt(dir.length);
        Winddirection =  "Direction: "+dir[rnd];
        Windspeed =Math.round((random.nextInt(100 )) + random.nextDouble() * 100.0) / 100.0;
        // System.out.println("it works"+Temp);
        p= new Pair(Winddirection,Windspeed);
        return p;
    }
}
