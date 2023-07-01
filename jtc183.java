class Hello Thread extends Thread
{
    public Hello Thread()
    {
        super();
        start();
    }
    public Hello Thread(String tname)
    {
        super(tname);
        start();
    }
    Hello Thread(ThreadGroup tg,String tname)
    {
        super(tg,tname);
        start();
    }
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println(Thread.currentThread().getName()+"under the Thread group of:"+Thread.currentThread().getThreadGroup().getName());
            try{
                Thread.sleep(500);
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
    }
    public class jtc183
    {
        public static void main(String[]args)
        {
            ThreadGroup tg=Thread.currentThread().getThreadGroup();
            HelloThread t1=new HelloThread();
            HelloThread t2=new HelloThread("jtc-1");
            HelloThread t3=new HelloThread(tg,"jtc-2");
            for(int i=0;i<5;i++)
            {
                System.out.println(Thread.currentThread().getName()+"under the Thread group of:"+Thread.currentThread().getThreadGroup().getName());
                try{
                    Thread.sleep(500);
                }catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}