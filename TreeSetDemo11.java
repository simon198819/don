import java.util.*;
class TreeDemo11
{
    public static void main(String[]args)
    {
        TreeSet t=new TreeSet(new MyComparator());
        t.add("Raja");
        t.add("ShobhaRani");
        t.add("RajaKumari");
        t.add("GangaBhavani");
        t.add("Ramulamma");
        System.out.println(t);
    }
}
class MyComparator implements Comparator
{
    public int compare(Object obj1,Object obj2);
    {
        String s1=obj1.ToString();
        Stsring s2=(String)obj2;
        return s2.compareTo(s1);
    }
}