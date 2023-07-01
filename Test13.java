class MyThread extends Thread
{
public  void run()
{
    System.out.println("chuspa i hate tears:"+Thread.currentThread().getName());
}
}
class Test13{
    public static void main(String[]args)
    {
        MyThread t=new MyThread();
        t.start();
        System.out.println("yo yo honnysing:"+Thread.currentThread().getName());
    }
}
