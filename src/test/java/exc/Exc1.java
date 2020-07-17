package exc;

public class Exc1 {
    public static void main(String[] args)
    {
        System.out.println("Starting");
        try {
            int i, j;
            i = 10;
            j = 0;

            System.out.println(i / j);
        }catch(Exception a)
        {
a.printStackTrace();
        }
        System.out.println("Ending");
    }
}
