package com.company;

public class Main {

	//gyökvonás
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

        String koszones = "Hello!";

        int calcResAdd = addition(11, 49);
        System.out.println("11 + 49 = " + calcResAdd);

        kiir(koszones);

	double result=david_power(2,16);

    }

    private static void kiir(String koszones) {
        System.out.println(koszones);
        System.out.println(SqrRootOf(9));
    }
}

    public static double david_power(double value,int power)
    {
        double result=value;
        for (int count=0;  count<power; count++)
            result*=result;

        return result;
    }
}

