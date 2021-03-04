package Exp;

import java.util.Random;

public class findWater extends Moxie {


    Vector water1 = new Vector(2, 2); //Location of Water in a 3x3 Area nearby.
    Vector water2 = new Vector(3, 1);
    Vector water3 = new Vector(1, 1);
    int upperbound = 5;
    int tries = 100;
    static int success;
    double rate;

    @Override
    public double Experiment() {
        for (int i = 0; i < tries; i++) {

            Random rand = new Random();
            int x = rand.nextInt(upperbound);
            int y = rand.nextInt(upperbound);
            Vector trial = new Vector(x, y);
            if ((trial.x == water1.x && trial.y == water1.y) | (trial.x == water2.x && trial.y == water2.y) || (trial.x == water3.x && trial.y == water3.y)) {
                success++;
            }
//        System.out.println(" "+success);
        }
        return success;
    }

    @Override
    public double evaluate() {

//      System.out.println(" " + success);
        this.rate = success / 100.0;
        return this.rate;
    }
}


