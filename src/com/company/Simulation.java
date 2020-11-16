package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;

public class Simulation {

    public ArrayList<Item> loadItems (String filename){
        ArrayList<Item> result = new ArrayList<>();
        Scanner scanner = null;
        File file = new File(filename);

        try{ scanner = new Scanner(file); }
        catch(FileNotFoundException e){
            System.out.println("File does not exist. Program will now shut down");
            System.exit(1);
        }

        while(scanner.hasNextLine()){
            String[] line = scanner.nextLine().split("=", 2);
            result.add(new Item(line[0], Integer.parseInt(line[1])));
        }

        return result;
    }

    public ArrayList<Rocket> loadU1(ArrayList<Item> cargo){
        ArrayList<Rocket> result = new ArrayList<>();
        ArrayList<Item> cargoItems = new ArrayList<>(cargo);
        Collections.sort(cargoItems);

        while(!cargoItems.isEmpty()){
            U1 newRocket = new U1();

            ListIterator<Item> iterator = cargoItems.listIterator();
            while(iterator.hasNext()){
                Item item = iterator.next();
                if(newRocket.canCarry(item)){
                    newRocket.carry(item);
                    iterator.remove();
                }
            }
            result.add(newRocket);
        }
        return result;
    }

    public ArrayList<Rocket> loadU2(ArrayList<Item> cargo){
        ArrayList<Rocket> result = new ArrayList<>();
        ArrayList<Item> cargoItems = new ArrayList<>(cargo);
        Collections.sort(cargoItems);

        while(!cargoItems.isEmpty()){
            U2 newRocket = new U2();

            ListIterator<Item> iterator = cargoItems.listIterator();
            while(iterator.hasNext()){
                Item item = iterator.next();
                if(newRocket.canCarry(item)){
                    newRocket.carry(item);
                    iterator.remove();
                }
            }
            result.add(newRocket);
        }
        return result;
    }

    public int runSimulation(ArrayList<Rocket> rockets){
        int totalBudget = 0;
        for(Rocket rocket : rockets){
            do {
                totalBudget += rocket.cost;
            } while (!rocket.launch() || !rocket.land());
        }

        return totalBudget;
    }


}

