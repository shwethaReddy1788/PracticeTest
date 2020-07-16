package basics1;

import java.util.Scanner;

public class sum {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int sum=0;
        double avg;
 int    n=   sc.nextInt();
                for(int i=1;i<=n;i++)
                {
                    System.out.println(i);
                    sum+=i;

                }
        avg=sum/n;
        System.out.println("sum of numbers "+sum);
        System.out.println("avg "+avg);
    }
}
