class A
{
    public synchronized 
}void d1(B,b)
{
    System.out.println("Thread 1 start execution of d1()method");
    try{
        Thread.sleep(6000);
    }
    catch(Interrupted Exception e){}
    System.out.println("Thread 1 trying to call B's last()");
    b.last();
}
public synchronized void last()
{
    System.out.println("Inside A,this is last()method");
}
class b{
    public synchronized void d2(A,a)
    {
        System.out.println("Thread starts execution of d2()method");
        try{
            Thread.sleep(6000);
        }
        catch(Interuupted Exception e){}
        System.out.println("Thread 2 trying to call A's last()");
        a.last();
    }
    public synchronized void last()
    {
        System.out.println("Inside B,this is last()method");
    }
}
class Deadlock1 extends Thread{
    A a=new A();
    B b=new B();
    public void m1()
    {
        this.start();
        a.d1(b);
    }
    public void run()
    {
        d.d2(a);
    }
    public static void main(String[]args)
    {
        DeadLock1 d=new DeadLock();
        d.m1();
    }
}