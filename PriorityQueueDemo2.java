import java.util.*;
class PriorityQueueDemo2
{
    public static void main(String[]args)
    {
        PriorityQueue q=new PriorityQueue();
        System.out.println(q.peek());
        for(int i=0;i<10;i++)
        {
            q.offer(i);
        }
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
    }
}