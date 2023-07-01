class MtThread extends Thread{}
class Test12
{
    public static void main(String[]args)
    {
        System.out.println(Thread.currentThread().getName());
        MyThread t=new MyThread();
        System.out.println(t.getName());
        Thread.currentThread().setName("Simon");
        System.out.println(Thread.currentThread().getName());
    }
}