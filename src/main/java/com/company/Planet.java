package com.company;

public class Planet {

    String name;
    int countPeople, weight;

    public Planet(String name, int countPeople, int weight) {
        this.name = name;
        this.countPeople = countPeople;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountPeople() {
        return countPeople;
    }

    public void setCountPeople(int countPeople) {
        this.countPeople = countPeople;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
