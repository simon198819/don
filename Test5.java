class MyThread extends Thread
{
    public void start()
    {
        System.out.println("start method");
    }
    public void run()
    {
System.out.println("run method");
}}
class Test5
{
    public static void main(String[]args)
    {
        MyThread t=new MyThread();
        t.start();
        System.out.println("main Thread");
    }
}