package com.company;

public class Main {

    public static void main(String[] args) {
    	ParkingPlace parkingPlace = new ParkingPlace(5,0);
    	Bike bike = new Bike(60,60);
    	Bike bike2 = new Bike(70,10);
    	Auto auto = new Auto(50,50);
    	Auto auto2 = new Auto(80,80);
    	Bus bus = new Bus(75,40, 30);
    	Transport[] transports = {bike, bike2, auto, auto2, bus};
    	parkingPlace.addTransport(transports.length);

    	for(int i = 0; i < transports.length; i++) {
    		transports[i].go();
		}
    }
}
