class Test1 extends Thread
{
    public void run()
    {
        System.out.println("Theard Task");
    }
    public static void main(String[]args)
    {
        System.out.println("Main Thread");
        Test t=new Test();
        Test3 t3=new Test3();
        t.start(t);
        t3.start();
    }
}