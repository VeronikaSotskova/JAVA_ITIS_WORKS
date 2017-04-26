package com.company;

public class Channel {
    private int number;
    private String name;
    private String program;

    public Channel(int number, String name, String program) {
        this.number = number;
        this.name = name;
        this.program = program;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    @Override
    public String toString() {
        return number + " " + name + " " +  program;
    }
}
