package basics1;

import java.util.Scanner;

public class Basics3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(("Enter Number"));
        int X = scanner.nextInt();
        if (X > 0) {
            System.out.println(("Positive Number"));
        } else if (X < 0) {
            System.out.println(("Negative Number"));
        } else {
            System.out.println((" Number is 0"));
        }
    }
}
