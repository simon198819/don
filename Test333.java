public class Test333 extends Thread
{
    public void run()
    {
        System.out.println("Thread Task is extended by "+ Thread.currentThread().getName());
        // System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args)
    {
        System.out.println("Hello is printed by "+ Thread.currentThread().getName());
        Test333 t1=new Test333();
        t1.start();
        // System.out.println(Thread.currentThread().getName());
    }
}