import java.util.*;
class ListIteratorDemo
{
    public static void main(String[]args)
{
    LinkedList l=new LinkedList();
    l.add("suraj");
    l.add("ravi");
    l.add("simon");
    l.add("chiru");
    l.add("nag");
    System.out.println(l);
    ListIterator ltr=l.listIterator();
    while(ltr.hasNext())
    {
        String s=(String)ltr.next();
        if(s.equals("ravi"))
        {
            ltr.remove();
        }
        else if(s.equals("nag"))
        {
            ltr.add("chaitu");
        }
        else if(s.equals("chiru"))
        {
            ltr.set("charan");
        }
        }
        System.out.println(l);
        }
    }
