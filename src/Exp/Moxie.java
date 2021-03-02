package Exp;

import Exp.ExperimentalSetup;

import java.util.Random;

public class Moxie implements ExperimentalSetup {

    double counter = 10;
    int upperbound = 10;
    double success ;
    double rate;
    int expdata;


    @Override
    public double Experiment() {
        //success=0;
        while (counter > 0) {
            this.counter = counter-1;
            counter = this.counter;
//            System.out.println("counter="+counter);
            Random rand = new Random();
            int int_rand = rand.nextInt(upperbound);
//            System.out.println("rand="+int_rand);
            if (int_rand > 5) {
                success++;
//                System.out.println("success="+success);
            }

        }

        return success;

    }

    @Override
     public double evaluateExperiment() {

        this.rate = Experiment()/10;
        return this.rate;}

//public  int readExpData(){
//        return expdata;
//}



}
