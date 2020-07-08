public class Manipulatorequals {
    public static  void main(String[] args)
    {
        String browser="chr0me";
                if(browser.equalsIgnoreCase("chrome"))
                {
                    System.out.println("launch browser");
                }
                else
                {
                    System.out.println("check input");
                }
        System.out.println(browser.contains("chr"));
    }
}
