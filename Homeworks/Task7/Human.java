package com.company;

/**
 * Created by Notebook on 22.02.2017.
 */
public class Human {
    private String name;
    private int age;

    public Human() {
        this.name="DEFAULT_NAME";
        this.age=1;
    }

    public Human(String name, int age) {
        this.setAge(age);
        this.setName(name);
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 150) {
            this.age = age;
        } else {
            this.age = 1;
        }
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
