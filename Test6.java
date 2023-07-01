class MyThread extends Thread
{
    public void start()
    {
        super.start();
        System.out.println("start method");
    }
}
class Test6
{
    public static void main(String[]args)
    {
        MyThread t=new MyThread();
        t.start();
        System.out.println("main Thread");
    }
}