class MyThread extends Thread
{
}
class Test7
{
    public static void main(String[]args)
    {
        System.out.println(Thread.currentThread().getName());
        MyThread t=new MyThread();
        System.out.println(t.getName());
        Thread.currentThread().setName("Simom Toppo");
        System.out.println(Thread.currentThread().getName());
    }
}