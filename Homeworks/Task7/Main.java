package com.company;

public class Main {

    public static void maxAgeHuman(Human humans[]) {
        Human maxAgeHuman  = humans[0];
        for(int i = 0; i < humans.length ; i++) {
            if(maxAgeHuman.getAge() < humans[i].getAge()){
                maxAgeHuman = humans[i];
            }
        }
        System.out.println("Max age = " + maxAgeHuman.getName());
    }

    public static void sort(Human humans[]) {
        for (int i = humans.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (humans[j].getAge() > humans[j+1].getAge()) {
                    Human temp = humans[j];
                    humans[j] = humans[j+1];
                    humans[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Human marsel = new Human("Marsel", 23);
        Human ruslan = new Human("Ruslan", 16);
        Human maksim = new Human("Maksim", 13);
        Human karim = new Human("Karim", 16);
        Human guzel = new Human("Guzel", 18);
        Human nika = new Human("Nika", 16);
        Human marat = new Human("Marat", 16);

        Human humans[] = {marsel, ruslan, maksim, karim, guzel, nika, marat};

        sort(humans);

        for(int i = 0; i < humans.length  - 1; i++) {
            System.out.println(humans[i].getName() + " " + humans[i].getAge());
        }
        maxAgeHuman(humans);
    }
}
