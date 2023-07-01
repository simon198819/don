class MyThread extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Settha Thread");
            try {
                {
                    Thread.sleep(2000);
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}
class Thread Join Demo
{
    public static void main(String[]args)
    {
        MyThread t=new MyThread();
        t.start();
        t.join();
        for(int i=0;i<10;i++)
        {
            System.out.println("Rama Thread");
        }
    }
}