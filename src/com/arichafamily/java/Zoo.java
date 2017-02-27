package com.arichafamily.java;

import java.util.ArrayList;

/**
 * Created by hackeru on 23/02/2017.
 */
public class Zoo {
    private ArrayList<Animal> animals = new ArrayList();

    public void addAnimal(Animal a){
        animals.add(a);
    }


    public void listAllAnimals(){
        for (Animal a : animals) {

            System.out.println(a.toString());
            if (a instanceof Cat) {
                Cat c = (Cat) a;
                c.purr();
            } else if (a instanceof Dog) {
                Dog d = (Dog) a;
                d.bite();
            }
        }
    }

    public void addAnimal(Cat a){
        animals.add(a);
    }
}
