package com.company;

public class Parser {

    public static int parseInt(char number[]) {
        int result = 0;
        for (int i = number.length - 1; i > -1; i--) {
            result = (int) (result + (( number[i] - '0') * Math.pow(10, number.length - 1 - i)));
        }
        return result;
    }
}
