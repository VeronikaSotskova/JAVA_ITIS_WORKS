package com.company;

public class Main {

    public static void main(String[] args) {
        TVImpl tvImpl = new TVImpl("channelsList.txt");
        Channel first = new Channel(1, "First", "News");
        Channel friday = new Channel(25, "Friday", "Originals");
        Channel mtv = new Channel(98,"MTV", "VampireDiares");
        tvImpl.addChannel(first);
        tvImpl.addChannel(friday);
        tvImpl.addChannel(mtv);
        tvImpl.turnOnChannel(25);
    }
}
