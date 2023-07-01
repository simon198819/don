class MyThread extends Thread
{
}
class Test9
{
    public static void main(String[]args)
    {
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setPriority(7);
        MyThread t=new MyThread();
        System.out.println(t.getPriority());
    }
}