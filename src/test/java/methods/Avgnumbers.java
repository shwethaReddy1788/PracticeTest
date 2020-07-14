package methods;

import java.util.Scanner;

public class Avgnumbers {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        double X=sc.nextDouble();
        System.out.println("Enter the Sec number");
        double Y=sc.nextDouble();
        System.out.println("Average of 2 numbers: "+avg(X,Y));
    }
    public static double avg(double X, double Y)
    {
        return (X+Y)/2;
    }
}
