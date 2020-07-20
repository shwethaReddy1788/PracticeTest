package filehandling;

import java.io.*;

public class FileH {

    public static void main(String[] args) throws IOException
    {
        String path=System.getProperty("user.dir")+ File.separator+"Testdata"+ File.separator+"test2.txt";


        System.out.println(path);
       File file=new File(path);

      file.createNewFile();
Writer wr = new FileWriter(path);
        BufferedWriter br=new BufferedWriter(wr);

        br.write("sss");
        br.flush();
        br.close();

  Reader R=new FileReader(path);
 BufferedReader b=new BufferedReader(R);
 System.out.println(b.readLine());
      }



    }

