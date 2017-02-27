package com.arichafamily.java;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Ron on 25/02/2017.
 */
public class PetDog extends Dog {
    //properties:
    private Date lastCareDateD;

    //constructor
    public PetDog() {
        super();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter " + getSpecies() + " last care date: ");
        String lastCareDateS = in.next();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            lastCareDateD = dateFormat.parse(lastCareDateS);
        }catch (ParseException e){
            System.out.println("Did not type valid date value\nCurrent date will be used");
            lastCareDateD = new Date();
        }
    }

    //constructor
    public PetDog(LocalDateTime dateOfBirth, String name, Date lastCareDateD) {
        super(dateOfBirth, name);
        this.lastCareDateD = lastCareDateD;
    }

    @Override
    public String toString() {
        String out = super.toString();
        out += "\nLast Care Date: " + lastCareDateD;
        return out;
    }

    public void takeWake(){

    }

    public void takeCare(){

    }
}
