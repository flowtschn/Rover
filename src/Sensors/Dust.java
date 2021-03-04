package Sensors;

import Exp.Moxie;

import java.util.HashMap;
import java.util.Random;

public class Dust extends AbstractSensor{
    private String arr [] = {"spherical","prismatic","bladelike"};
    private String shape;
    private Double partsize ;
    private Pair<String , Double> p = new Pair<>(shape, partsize);
    @Override
    public  Pair<?,?> read()
    {
        Random random = new Random();
        int rnd = new Random().nextInt(arr.length);
        shape = arr[rnd];
        partsize = Math.round((random.nextInt(10 )) + random.nextDouble() * 100.0) / 100.0;
        p =new Pair(shape,partsize);

        return  p ;
    }

}
