package basics1;

import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an alphabet: ");
        String input = in.next().toLowerCase();

    boolean vowels=input.equals("a")||input.equals("e")||input.equals("i")||input.equals("o")||input.equals("u");


        if (input.length() > 1)
        {
            System.out.println("Error. Not a single character.");
        }
      else if(vowels)
        {
            System.out.println("Vowel");
        }
     else
        {
            System.out.println("Print consonant");
        }
    }


}
