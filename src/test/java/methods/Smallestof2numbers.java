package methods;

import java.util.Scanner;

public class Smallestof2numbers{

        public static void main(String[] args)
        {

            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the First number");
            int X=sc.nextInt();
            System.out.println("Enter the Second number");
            int Y=sc.nextInt();

            System.out.println("Smallest number"+smallest(X,Y));


        }

        public static  int smallest(int X, int Y)
        {
            return Math.min(X,Y);
        }

}
