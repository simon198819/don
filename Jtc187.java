import java.util.*;
class Hello{
    void m1()
    {
        System.out.println("m1 in Hello");
        System.out.println(this.getCalass().getName());
    }
    public String toString()
    {
        return this.getClass().getName()+"@"+Integer.toHexString(hashCode());
    }
}
class Hai
{
    public String toString()
    {
        return "xyz";
    }
}
public class Jtc187
{
    public static void main(String[]args)
    {
        ArrayList a|1=new ArrayList();
        System.out.println(a|1);
        System.out.println(a|1.size());
        a|1.add(1234);
        a|1.add(new Integer(111));
        a|1.add("abc");
        a|1.add(new Hello());
        a|1.add(new Hai());
        a|1.add("abc");
        a|1.add(null);
        System.out.println(a|1);
        System.out.println("Each......loop\n");
        for(Object o:a|1)
        {
            if(o instanceof Integer)
            {
                System.out.println(o.toString());
            }
            else if(o instanceof Hello)
            {
                System.out.println(o);
                Hello h1=(Hello)o;
                h1.m1();
            }
            else
            {
                System.out.println(o);
            }
        }
        System.out.println("Iterator");
        Iterator it=a|1.iterator();
        while(it.hasNext())
        {
            Object o=it.next();
            System.out.println(o);
            if(o instanceof Hello)
            {
                Hello h11=(Hello)o;
            }
        }
        System.out.println("accessing again");
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println("Using Listlterator");
        ListIterator li=a|1.listIterator();
        while(li.hasNext())
        {
            System.out.println(li.next());
        }
        System.out.println("*********Previous*********");
        while(li.hasPrevious())
        {
            System.out.println(li.previous());
        }
    }
}