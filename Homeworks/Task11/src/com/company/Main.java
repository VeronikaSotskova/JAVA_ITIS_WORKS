package com.company;

public class Main {
    public static void main(String[] args) {
        char brackets[] = {'{', '}'};
        System.out.println(checkBrackets(brackets));

    }

    public static boolean checkBrackets(char brackets[]) {
        int check = 0;
        for (int i = 0; i<brackets.length; i++) {
            if(brackets[i]=='(' || brackets[i]=='[' || brackets[i]=='{') {
                check++;
            }
            if(brackets[i]==')' || brackets[i]==']' || brackets[i]=='}') {
                check--;
            }
        }
        if(check==0) {
            return true;
        }
        else {
            return false;
        }
    }
}
