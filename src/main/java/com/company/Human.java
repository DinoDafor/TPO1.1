package com.company;

public class Human {

       private String name;
    private int age, weight, eatKG, allocateKG;


    //если съел больше, чем выделил, то удаляем разницу из веса и добавляем в вес планеты

    public Human(String name, int age, int weight, int eatKG, int allocateKG) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.eatKG = eatKG;
        this.allocateKG = allocateKG;
    }

   public int weightReturn(Human human, Planet planet) {
        if (human.getEatKG() > human.getAllocateKG()) {
            planet.setWeight(human.getEatKG() - human.getAllocateKG() + planet.getWeight());
            human.setEatKG(0);
            human.setAllocateKG(0);
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
}
