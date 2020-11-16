package com.company;

public class U2 extends Rocket {

    public U2() {
        this.cost = 120;
        this.rocketWeightInKgs = 18000;
        this.cargoWeightInKgs = 0;
        this.maxWeightInKgs = 29000;
    }

    @Override
    public boolean launch() {
        double chanceOfExplosion = 0.04 * (this.cargoWeightInKgs / (double)(this.maxWeightInKgs - this.rocketWeightInKgs));
        if(Math.random() < chanceOfExplosion){
            System.out.println("Rocket exploded during launch");
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean land() {
        double chanceOfCrash = 0.08 * (this.cargoWeightInKgs / (double)(this.maxWeightInKgs - this.rocketWeightInKgs));
        if(Math.random() < chanceOfCrash){
            System.out.println("Rocket crashed during landing");
            return false;
        } else {
            return true;
        }
    }

}
