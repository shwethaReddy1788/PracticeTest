package basics1;

import java.util.Scanner;

public class Basics4 {
    public static void main(String[] args)
    {
        int i,j,n;

        System.out.print("Input number of n : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        for(i=0;i<=n;i++)
        {
         for(j=0;j<=i;j++)
                System.out.print(i);
       System.out.println("");
        }
    }
}
