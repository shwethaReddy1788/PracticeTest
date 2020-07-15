package basics1;

import java.util.Scanner;

public class switch1 {
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day");
      int day=sc.nextInt();

        System.out.println(weekname(day));

    }

    public static String weekname(int day)
    {
        String dayname;
        switch(day)
        {
            case 1:dayname="Monday";
            break;
            case 2:dayname="Tuesday";
                break;
            case 7:dayname="Friday";
                break;
            default:dayname="invlaid";

        }
        return dayname;
    }
}




