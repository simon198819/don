 public class Hello999 implements Runnable
{
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
        try{
            System.out.println("This is First line");
            Thread.sleep(1000);
        }
catch(InterruptedException e){}
        }
    }
    class Hello124
    {
        public static void main(String[]args)
        {
            for(i=0;i<=5;i++)
            try{
                System.out.println("This is Second line");
                Thread.sleep(1000);
            }
                catch(InterruptedException e){}
                Hello h=new Hello();
                Thread t=new Thread(h);
                t.start();
            }
        }

        
    
