class JtcThread extends Thread
{
    public void run()
    {
        for(int i=0;i<15;i++)
        {
            System.out.println("JT1\t"+1);
            try{
                Thread.sleep(100);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
class JtcThread2 extends Thread{
    Thread th=null;
    void setThreadToJoin(Thread t)
    {
        this.th=th;
    }
    public void run()
    {
        for(int i=0;i<115;i++)
        {
            System.out.println("JT2\t"+i);
            try{
                if(i==105){
                    th.join();
                }
                Thread.sleep(100);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
public class Jtc189
{
public static void main(String[]args)
{
jtcThread1 ath=new jtcThread1();
jtcThread2 bth=new jtcThread2();
bth.setThreadToJoin(ath);
ath.start();
bth.start();
}}