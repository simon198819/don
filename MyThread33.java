public class MyThread33 implements Runnable
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
    public static void main(String[]args)
    {
        Test t=new Test();
        MyThread th=new MyThread(t);
        th.start();
    } 
}