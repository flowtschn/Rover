package Steering;

import Exp.ExpFactory;
import Exp.Moxie;
import Exp.findWater;

public class SteeeringFactory<T> implements Steering<T> {

    private T content;
    @Override
    public T driveTo(Vector v) {
        return this.content;
    }

    public enum SteeringType {
        DIFF,

    }

    public static Steering<?> createSteering(SteeeringFactory.SteeringType TypeE) {
        switch (TypeE) {
            case DIFF:
                new DifferentialSteering();


            default:
                System.out.println("--");
        }
        return null;

    }
}
