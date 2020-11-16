package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Simulation simulation = new Simulation();
        ArrayList<Item> itemsPhase1 = simulation.loadItems("phase-1.txt");
        ArrayList<Item> itemsPhase2 = simulation.loadItems("phase-2.txt");

        ArrayList<Rocket> rocketsPhase1 = simulation.loadU1(itemsPhase1);
        ArrayList<Rocket> rocketsPhase2 = simulation.loadU1(itemsPhase2);

        System.out.println("U1 Rockets loaded.");
        System.out.println(rocketsPhase1.size() + " rockets loaded for Phase 1.");
        System.out.println(rocketsPhase2.size() + " rockets loaded for Phase 2.");
        System.out.println("Running simulation for U1 rockets...");
        System.out.println("Total budget for Phase 1: $" + simulation.runSimulation(rocketsPhase1) + " Million");
        System.out.println("Total budget for Phase 2: $" + simulation.runSimulation(rocketsPhase2) + " Million");

        System.out.println("##################");

        rocketsPhase1 = simulation.loadU2(itemsPhase1);
        rocketsPhase2 = simulation.loadU2(itemsPhase2);

        System.out.println("U2 Rockets loaded.");
        System.out.println(rocketsPhase1.size() + " rockets loaded for Phase 1.");
        System.out.println(rocketsPhase2.size() + " rockets loaded for Phase 2.");
        System.out.println("Running simulation for U2 rockets...");
        System.out.println("Total budget for Phase 1: $" + simulation.runSimulation(rocketsPhase1) + " Million");
        System.out.println("Total budget for Phase 2: $" + simulation.runSimulation(rocketsPhase2) + " Million");



    }
}
