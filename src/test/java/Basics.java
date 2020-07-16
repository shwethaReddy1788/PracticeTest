import java.util.Scanner;

public class Basics {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
       int a= sc.nextInt();
        System.out.println("Enter the sec number");
        int b= sc.nextInt();
        System.out.println(addnum(a,b));


    }
    public static int addnum(int a,int b)
    {
        return a+b;
    }
}
