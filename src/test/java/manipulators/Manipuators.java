package manipulators;

public class Manipuators {
    public static void main (String[] args)
    {
        String name= "Rutvi_123";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println(name.split("-")[0]);
        System.out.println(name.split("_")[1]);
        System.out.println(name.replace("Rutvi", "Prashanth"));

    }
}
