package Exp;

import Exp.ExperimentalSetup;

import java.util.Random;

public class Moxie implements ExperimentalSetup {

    double counter = 10;
    int upperbound = 10;
    double success = 0;
    double rate =0;


    @Override
    public double runExperiment() {
        while (counter >= 0) {
            this.counter = counter - 1;
            counter = this.counter;
            Random rand = new Random();
            int int_rand = rand.nextInt(upperbound);
            if (int_rand > 5) {
                success++;
            }

        }
        return success;
    }

    @Override
     public double evaluateResult() {

        this.rate = success/10;
        return this.rate;}




    public class Roxy extends Moxie {


        @Override
        public double runExperiment() {
            return 0;
        }

        @Override
        public double evaluateResult() {
            return 0;
        }
    }

}
