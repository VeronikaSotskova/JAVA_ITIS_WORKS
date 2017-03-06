package com.company;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        System.out.println("Факториал числа " + s + " = " + fac1(s));

        System.out.println("Введите число");
        s = scanner.nextInt();
        System.out.println("Факториал числа " + s + " = " + fac2(s));

        System.out.println("Введите число");
        s = scanner.nextInt();
        System.out.println(s + "-ое число фиббоначи = " + fib(s));
    }

    public static int fac1(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fac1(n - 1);
        }
    }

    public static int fac2(int x){
        int result=1;
        for (int i = 1; i <= x; i++)
        {
            result = result*i;
        }
        return result;
    }

    public static int fib(int n){
        if (n > 1) {
            return fib(n - 1) + fib(n - 2);
        } else {
            return 1;
        }
    }
}