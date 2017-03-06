package com.company;

public class Program {

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7};
        reverse(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

    public static void reverse(int array[]) {
        for (int i = 0; i < array.length / 2; i++) {
            int a = array[i];
            array[i] = array[(array.length - 1) - i];
            array[(array.length - 1) - i] = a;
        }
    }
}