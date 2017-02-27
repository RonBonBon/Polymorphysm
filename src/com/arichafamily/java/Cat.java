package com.arichafamily.java;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * Created by hackeru on 23/02/2017.
 */
public class Cat extends Animal {
    //properties:
    private String name;

    //constructor
    public Cat() {
        super();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Name for your "  + getSpecies());
        name = scan.next();
    }

    //constructor
    public Cat(LocalDateTime dateOfBirth, String name) {
        super(dateOfBirth);
        this.name = name;
    }

    @Override
    public String toString() {
        String out = super.toString();
        out+="\nName: " + name;

        return out;
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Meow!");
    }

    public void purr(){
        System.out.println("purr");
    }
}
