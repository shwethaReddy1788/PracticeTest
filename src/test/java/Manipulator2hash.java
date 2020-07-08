public class Manipulator2hash {
    public static void main(String[] args)
    {
        String fname=" Rutvi";
        String lname=" RUtvi";
        System.out.println(fname==lname);
        System.out.println(10==19);

            System.out.println(fname.hashCode());
        System.out.println(lname.hashCode());
        System.out.println(fname.equals(lname));
        System.out.println("Euql ignore "+fname.equalsIgnoreCase(lname));


    }


}
