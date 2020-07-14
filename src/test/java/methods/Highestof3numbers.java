package methods;

import java.util.Scanner;

public class Highestof3numbers {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First number");
        double X=sc.nextDouble();
        System.out.println("Enter the Second number");
        double Y=sc.nextDouble();
        System.out.println("Max number"+max(X,Y));
    }

  public static double max(double X, double Y)
  {
      return Math.max(X,Y);
  }


}
