package Exp;

import Sensors.SensorFactory;
import Sensors.Wind;

public class ExpFactory extends Moxie {



    public enum Exptype {
            MOXIE,
            ROXY
        }
    public static Moxie createExp(Exptype TypeE) {
        switch (TypeE) {
            case MOXIE:
                return new Moxie();



            case ROXY:
                return new Roxy();
        }
        return null;
    }


    public static double getExperimentData(Exptype exptype) {
        double data = 0;
        Wind w= new Wind();
        Moxie m= new Moxie();


        if (exptype == Exptype.MOXIE) {
            data= m.runExperiment();

            System.out.println("CO2 conversion success rate: " + data ); }
        else if (exptype == Exptype.ROXY) {
            data = w.read();
            System.out.println("Sensor WIND DATA = " + data); }
            return data;
        }

}
