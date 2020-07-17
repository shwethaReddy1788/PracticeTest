package exc;

public class Exc2 {
    public static void main(String[] args) {
        System.out.println("Start");
        try {
            String ten = "A";
            int nine = 9;
            int num = Integer.parseInt(ten);
            System.out.println(num + nine);

        }  catch(Exception a)
        {
a.printStackTrace();
        }
        System.out.println("end");
    }

}
