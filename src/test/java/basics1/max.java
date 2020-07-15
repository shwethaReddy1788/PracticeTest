package basics1;

import java.util.Scanner;

public class max {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        double X=sc.nextDouble();
        System.out.println("Enter sec number");
        double Y=sc.nextDouble();
        System.out.println(max(X,Y));

        }
        public static double max(double X,double Y)
        {
            return Math.max(X,Y);
        }
}
