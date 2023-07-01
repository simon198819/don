class Thread A
{
    public static void main(String[]args)
    {
        Thread b=new Thread();
        b.start();
        synchronized (b)
        {
            System.out.println("main Thread callin wait");
            b.wait();
            System.out.println("main Threadgot notification");
            System.out.println(b.total);
        }
    }
}
class Thread extends Thread{
    int total=0;
    public void run()
    {
        synchronized (this)
        {
            System.out.println("child Thread start calculation");
            for(int i=0;i<=100;i++)
            {
                total=total+i;
            }
            System.out.println("child Thread giving notification");
            this.notify();
        }
    }
}