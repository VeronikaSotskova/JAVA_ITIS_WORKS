package com.company;

public class Auto extends Transport {
    public Auto(int speed, int fuel) {
        super(speed, fuel);
    }

    public void go() {
        if(fuel >= 1) {
            fuel--;
            System.out.println("Auto go");
        } else {
            System.out.println("No fuel, please add fuel!");
        }
    }
}
