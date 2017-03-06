package com.company;

/**
 * Created by Notebook on 28.02.2017.
 */
public class Program {
    public static void main(String[] args) {
        int array[] = {2, 5, -10, 1, -100, -9};
        System.out.println("Минимальное элемент в массиве = " + min(array));
    }

    public static int min(int array[]) {
        int m = array[0];
        for(int i = 0; i < array.length; i++) {
            if(m > array[i]) {
                m = array[i];
            }
        }
        return m;
    }
}
