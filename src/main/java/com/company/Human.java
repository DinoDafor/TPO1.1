package com.company;

public class Human {

    private String name;
    private int age, weight, eatKG, allocateKG, mood;


    //если съел больше, чем выделил, то удаляем разницу из веса и добавляем в вес планеты

    public Human(String name, int age, int weight, int eatKG, int allocateKG, int mood) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.eatKG = eatKG;
        this.allocateKG = allocateKG;
        this.mood = mood;
    }

    public Human() {

    }

    public Human(String name, int age, int weight, int eatKG, int allocateKG) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.eatKG = eatKG;
        this.allocateKG = allocateKG;
    }

    public int weightReturn(Planet planet) {
        if (this.getWeight() < 0 ||
                this.getAllocateKG() < 0 ||
                this.getEatKG() < 0 ||
                planet.getWeight() < 0) {
            throw new ArithmeticException();
        }
        if (this.getEatKG() > this.getAllocateKG()) {
            planet.setWeight(this.getEatKG() - this.getAllocateKG() + planet.getWeight());
            this.setEatKG(this.getAllocateKG());
            System.out.println("Теперь вес планеты: " + planet.getWeight());

        } else {
            System.out.println("Вес планеты без изменений: " + planet.getWeight());
        }
        return planet.getWeight();


    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getEatKG() {
        return eatKG;
    }

    public void setEatKG(int eatKG) {
        this.eatKG = eatKG;
    }

    public int getAllocateKG() {
        return allocateKG;
    }

    public void setAllocateKG(int allocateKG) {
        this.allocateKG = allocateKG;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }
}
