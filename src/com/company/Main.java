package com.company;

public class Main {

    public static int addition(int a, int b) {
        return a + b;

    }

    public static void main(String[] args) {

        String koszones = "Hello!";

        int calcResAdd = addition(11, 49);
        System.out.println("11 + 49 = " + calcResAdd);

        kiir(koszones);
    }

    private static void kiir(String koszones) {
        System.out.println(koszones);
    }

    private static double multiply(double a, double b){
        if (a==0 || b==0)
            return 0;

        return a*b;
    }
}