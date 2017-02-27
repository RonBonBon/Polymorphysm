package com.arichafamily.java;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * Created by hackeru on 23/02/2017.
 */
public class Dog extends Animal{
    //properties:
    private String name;

    //constructor:
    public Dog() {
        super();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter " + getSpecies() + " Name");
        this.name = s.next();
    }
    //constructor:
    public Dog(LocalDateTime dateOfBirth, String name) {
        super(dateOfBirth);
        this.name = name;
    }

    @Override
    public String toString() {
        String out =  super.toString();
        out += "\nName: " + name;
        return out;
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Woof ");
    }

    public void bite(){
        System.out.println("Biting! woof. woof");
    }
}
