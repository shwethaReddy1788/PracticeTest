package basics1;

import java.util.Scanner;

public class print {
    public static void main(String[] args)
    {
        int i,j,n;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number to print");
       n=sc.nextInt();
        for(i=0;i<=n;i++)
        {
            for(j=0;j<=i;j++)
                System.out.print(j);
            System.out.println("");
        }

    }
}
