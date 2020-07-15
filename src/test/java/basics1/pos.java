package basics1;

import java.util.Scanner;

public class pos {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        double X=sc.nextDouble();
        if(X>0)
        {
            System.out.println("Pos");
        }
        else if(X<0)
        {
            System.out.println("neg");
        }
        else
        {
            System.out.println("zero");
        }
    }
}
