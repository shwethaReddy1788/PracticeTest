package day5;

public class Cars extends Students{
    public static void main(String[] args)
    {
        Cars car=new Cars();
        car.newCars("AAA",123);
        car.newCars("BBB",5555);
studentDetails("SSS",589);
    }
    public void newCars(String name, int num)
    {
        System.out.println(name);
        System.out.println(num);

    }
}
