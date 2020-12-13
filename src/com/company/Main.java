package com.company;

public class Main {

	//gy�kvon�s
		private static double SqrRootOf(double numIn) {
			double sqrt=0;
			if (numIn<0) {
				System.out.println("Number cant be negative");
			}
			else {
				sqrt=Math.sqrt(numIn);
			}
			return sqrt;
		}
		
    public static int addition(int a, int b) {
        return a + b;

    }

    public static void main(String[] args) {

        System.out.println("\tKellemes ünnepeket mindenkinek!"+System.lineSeparator()+"\tJAVA20");

        String koszones = "Sziasztok!";

        int calcResAdd = addition(11, 49);
        System.out.println("11 + 49 = " + calcResAdd);

        kiir(koszones);
    }

    private static void kiir(String koszones) {
        System.out.println(koszones);
        System.out.println(SqrRootOf(9));
    }

    private static double multiply(double a, double b){
        if (a==0 || b==0)
            return 0;

        return a*b;
    }
}