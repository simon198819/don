class HelloThread implements Runnable
{
    HelloThread()
    {
        Thread t1=new Thread(this);
        t1.start();
    }
    HelloThread(String tname)
    {
        Thread t2=new Thread(this,tname);
    t2.start();
} 
Hello Thread(String tname,ThreadGroup tg)
{
    Thread t3=new Thread(tg,this,tname);
    t3.start();
}
    public void run()
    {
        System.out.println(Thread.currentThread().getName()+"under the Thread group of:"+Thread.currentThread().getThreadGroup().getName());
        try{
            Thread.sleep(500);
        }catch(Exception e){
            e.printStackTrace();
            }
        }
    }
}
public class jtc103
{
    public static void main(String[]args)
    {
        ThreadGroup tg1=new ThreadGroup("jtc-pg");
        HelloThread t1=new HelloThread("jtc-TG");
        HelloThread t2=new HelloThread("jtc-1");
    }
}
class MyThread extends Thread implements Runnable
{
    void m1()
    {
        System.out.println("M1 in MyThread");
        String tname="jtc-ch";
        Thread t1=new Thread(this);
        Thread t2=new Thread(this,tname);
        t1.start();
        t2.start();
    }
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println(Thread.currentThread().getName());
            try{
                sleep(1000);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            }
        }
    }
    public class jtc184
    {
        public static void main(String[]args)
        {
            MyThread mt=new MyThread();
            mt.m1();
        }
    }

