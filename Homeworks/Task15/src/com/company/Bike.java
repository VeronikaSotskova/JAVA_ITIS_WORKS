package com.company;

public class Bike extends Transport {
    public Bike(int speed, int fuel) {
        super(speed, fuel);
    }

    public void go() {
        if(fuel >= 1) {
            fuel--;
            System.out.println("Bike go");
        } else {
            System.out.println("No fuel, please add fuel!");
        }
    }
}
