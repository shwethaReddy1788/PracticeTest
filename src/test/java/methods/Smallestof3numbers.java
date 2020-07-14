package methods;

import java.util.Scanner;

public class Smallestof3numbers {
    public static void main(String[] args)
    {

       Scanner sc= new Scanner(System.in);
        System.out.println("Enter the First number");
        int X=sc.nextInt();
        System.out.println("Enter the Second number");
        int Y=sc.nextInt();
        System.out.println("Enter the Third number");
        int Z=sc.nextInt();
        System.out.println("Smallest number"+smallest(X,Y,Z));


    }

public static  int smallest(int X, int Y,int Z)
{
    return Math.min(Math.min(X,Y),Z);
}

}
