package com.company;

public class U1 extends Rocket {

    public U1() {
        this.cost = 100;
        this.rocketWeightInKgs = 10000;
        this.cargoWeightInKgs = 0;
        this.maxWeightInKgs = 18000;
    }

    @Override
    public boolean launch() {
        double chanceOfExplosion = 0.05 * (this.cargoWeightInKgs / (double)(this.maxWeightInKgs - this.rocketWeightInKgs));

        if(Math.random() < chanceOfExplosion){
            System.out.println("Rocket exploded during launch");
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean land() {
        double chanceOfCrash = 0.01 * (this.cargoWeightInKgs / (double)(this.maxWeightInKgs - this.rocketWeightInKgs));

        if(Math.random() < chanceOfCrash){
            System.out.println("Rocket crashed during landing");
            return false;
        } else {
            return true;
        }
    }
}
