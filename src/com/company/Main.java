package com.company;

public class Main {

	//gyï¿½kvonï¿½s
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

    public static double david_power(double value,int power)
    {
        double result=value;
        for (int count=0;  count<power; count++)
            result*=result;

        return result;
    }

    public static int osztas (int szam1, int szam2){
        int eredmeny = szam1 /szam2;
        if (szam2 == 0){
            System.out.println(" A 0-val való osztást nem értelmezzük");
            System.exit(0);}

        return eredmeny;
    }

    private static double multiply(double a, double b){
        if (a==0 || b==0)
            return 0;

        return a*b;
    }




    public static void main(String[] args) {

        System.out.println("\tKellemes ünnepeket mindenkinek!"+System.lineSeparator()+"\tJAVA20");

        String koszones = "Helló, sziasztok!";

        int calcResAdd = addition(11, 49);
        System.out.println("11 + 49 = " + calcResAdd);

        kiir(koszones);

        double result=david_power(2,16);

        System.out.println(result);

        double multipleEredmeny =multiply(1,1);
        System.out.println(multipleEredmeny);

        int osztasEredmeny = osztas(1,1);
        System.out.println(osztasEredmeny);
    }

    private static void kiir(String koszones) {
        System.out.println(koszones);
        System.out.println(SqrRootOf(9));
    }

}