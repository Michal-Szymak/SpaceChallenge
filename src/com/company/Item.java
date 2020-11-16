package com.company;

public class Item implements Comparable <Item> {
    String name;
    int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int compareTo(Item o) {
        //sorting Items by weight in descending order
        if(this.weight > o.weight){
            return -1;
        }
        if(this.weight == o.weight){
            return this.name.compareTo(o.name);
        }
        return 1;
    }

    @Override
    public String toString() {
        return this.name + ", weight: " + this.weight;
    }
}
