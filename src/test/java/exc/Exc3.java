package exc;

import java.util.Scanner;

public class Exc3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter amt");
            int amt = sc.nextInt();
            if (amt > 100) {
                System.out.println("correct");
            } else {
                System.out.println("Not correct");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Thanks");
    }

}