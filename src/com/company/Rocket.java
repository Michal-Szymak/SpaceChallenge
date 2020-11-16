package com.company;

public class Rocket implements SpaceShip {

    int cost;
    int rocketWeightInKgs;
    int cargoWeightInKgs;
    int maxWeightInKgs;

    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public boolean canCarry(Item item) {
        int newWeight = this.rocketWeightInKgs + this.cargoWeightInKgs + item.weight;
        if( newWeight <= this.maxWeightInKgs){
            return true;
        }
        return false;
    }

    @Override
    public void carry(Item item) {
        this.cargoWeightInKgs += item.weight;
    }
}
