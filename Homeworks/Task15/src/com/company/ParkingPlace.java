package com.company;

public class ParkingPlace {
    private int sumPlace;
    private int sumTransport;
    private int freePlaces = sumPlace - sumTransport;

    public ParkingPlace(int sumPlace, int sumTransport) {
        if(sumPlace >= 1) {
            this.sumPlace = sumPlace;
        } else {
            this.sumPlace = 1;
        }

        if(sumTransport >= 1 && sumTransport <= sumPlace) {
            this.sumTransport = sumTransport;
        } else {
            this.sumTransport = 1;
        }
    }

    public int getSumPlace() {
        return sumPlace;
    }

    public int getSumTransport() {
        return sumTransport;
    }

    public int getFreePlaces() {
        return freePlaces;
    }

    public void addTransport(int count){
        if(freePlaces >= count) {
            Transport.stayOnParking();
            sumTransport++;
            System.out.println("Transports go on parking");
        } else {
            System.out.println("No free place");
        }
    }

    public void removeTransport() {
        if(sumTransport >= 1) {
            sumTransport--;
        }
    }

}
