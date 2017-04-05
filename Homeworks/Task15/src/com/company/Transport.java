package com.company;

public abstract class Transport {
    protected int speed;
    protected int fuel;

    public Transport(int speed, int fuel) {
        if(speed >= 0){
            this.speed = speed;
        } else {
            this.speed = 0;
        }

        if(fuel >= 0) {
            this.fuel = fuel;
        } else {
            this.fuel = 0;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public int getFuel() {
        return fuel;
    }

    public abstract void go();
    public void addFuel(int a) {
        fuel+=a;
    }

    public static void stayOnParking() {
        System.out.println("Transport stay on parking");
    }
}
