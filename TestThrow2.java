import java.io.*;
public class TestThrow2
{
        public static void method()throws FileNotFoundException
        {
FileReader file=new FileReader("C:\\Users\\Anurati\\Desktop\\abc.txt");
BufferedReader fileInput=new BufferedReader(file);
throw new FileNotFoundException();
        }
        public static void main(String[]args)
        {
            try{
                method();
            }
            catch(FileNotFoundException e)
            {
e.pabrintStackTrace();
            }
            System.out.println("rest of the code");
        }
}