package com.company;

/**
 * Created by Notebook on 06.03.2017.
 */
import java.util.Random;
public class Program {
    public static void main(String[] args) {
        int array[][];

        array = new int[10][5];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = random.nextInt(25);
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("---------------");

        for (int i = 0; i < array.length; i++) {
            int min = array[i][0];
            int max = array[i][0];
            int jmin = 0;
            int jmax = 0;
            for (int j = 0; j < array[0].length; j++) {
                if (min > array[i][j]) {
                    min = array[i][j];
                    jmin = j;
                }

                if (max < array[i][j]){
                    max = array[i][j];
                    jmax = j;
                }
            }
            int temp = array[i][jmax];
            array[i][jmax] = array[i][jmin];
            array[i][jmin] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
