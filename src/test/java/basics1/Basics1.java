package basics1;

import java.util.Scanner;

public class Basics1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a= sc.nextInt();
        System.out.println("Enter the sec number");
        int b= sc.nextInt();
        System.out.println("Multiplication of 2 numbers: " +mulnum(a,b));


    }
    public static int mulnum(int a,int b)
    {
        return a*b;
    }
}

