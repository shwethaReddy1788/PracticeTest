package methods;

import java.util.Scanner;

public class Addnum {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter Second number");
       int b= sc.nextInt();

        System.out.println("addition of 2 numbers: " +addnum(a,b));
    }
    public static int addnum(int a, int b)
    {
        return a+b;
    }
}
