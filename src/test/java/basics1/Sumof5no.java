package basics1;

import java.util.Scanner;

public class Sumof5no {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int X=scanner.nextInt();
        System.out.println("Enter the Sec number");
        int Y=scanner.nextInt();
        System.out.println("Enter the third number");
        int Z=scanner.nextInt();
        System.out.println("Enter the fourth number");
        int A=scanner.nextInt();
        System.out.println("Enter the Fifth number");
        int B=scanner.nextInt();
Sumof5no sum=new Sumof5no();
sum.add(X,Y,Z,A,B);

        System.out.println("Sum of 5 numbers : "+sum);

    }
    public static int  add(int X,int Y,int Z,int A, int B)
    {
        int sum=X+Y+Z+A+B;
        return sum;
    }


}
