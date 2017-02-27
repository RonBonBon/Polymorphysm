package com.arichafamily.java;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * Created by Ron on 26/02/2017.
 */
public class Bird extends Animal {
    //properties:
    private String name;

    //constructor:
    public Bird() {
        super();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter " + getSpecies() + " Name");
        this.name = s.next();
    }

    //constructor:
    public Bird(LocalDateTime dateOfBirth, String name) {
        super(dateOfBirth);
        this.name = name;
    }

    @Override
    public String toString() {
        String out =  super.toString();
        out += "\nName: " + name;
        return out;
    }
}
