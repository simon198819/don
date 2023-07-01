class MyThread extends Thread
{
    static Thread mt;
    public void run()
    {
        try{
            mt.join();
        }
        catch(InterruptedException e){}
            {
                for(int i=0;i<10;i++)
                {
                    System.out.println("Child Thread");
                }
            }
        }
    }
class ThreadjoinDemo1
{
    public static void main(String[]args)
    {
        MyThread.mt=Thread.currentThread;
        MyThread t=new MyThread();
        t.start();
        for(int i=0;i<10;i++)
        {
            try{
            System.out.println("Main Thread");
            Thread.sleep(2000);
            }
            catch(InterruptedException e){}
        }
    }
}