public class jtc181
{
    public static void main(String[]args)
    {
        Thread t=new Thread();
        System.out.println(t);
        String name=t.getName();
        System.out.println(name);
        int p=t.getPriority();
        System.out.println(p);
        t.setName(jtc-t);
        System.out.println t2=(t.getName());
        t.setPriority(9);
        //t.setPriority(11);
        //t.setPriority(0);
        System.out.println(t.getPriority());
        Thread t2=new Thread();
        System.out.println(t2);
        Thread t3=new Thread("jtc");
        System.out.println(t3);
        for(int i=0;i<5;i++)
        {
            System.out.println(Thread.currentThread().getName()+"under the Thread group of:"Thread.currentThread().getThreadGroup().getName());
            try{
                Thread.sleep(500);
            }
            catch(Exception e)
            {
                e.printSatackTrace();
            }
        }
    }
}