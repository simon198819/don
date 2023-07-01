public class Test implements Runnable
{
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
        try{
            System.out.println("Theard Task");
            Thread.sleep(2000);
        }
        catch(Exception e)
        {e.PrintStackTrace();
        }
    }
    public static void main(String[] args)
    {
        Test t=new Test();
        Thread th=new Thread(t);
        th.start();
    } 
}