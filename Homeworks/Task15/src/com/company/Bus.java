package com.company;

public class Bus extends Transport {
    private int passengers;
    public Bus(int speed, int fuel, int passengers) {
        super(speed, fuel);
        if(passengers >= 0) {
            this.passengers = passengers;
        } else {
            this.passengers = 0;
        }
    }

    public int getPassengers() {
        return passengers;
    }

    public void go() {
        if(fuel >= 1) {
            fuel--;
            System.out.println("Bus go");
        } else {
            System.out.println("No fuel, please add fuel!");
        }
    }
}
