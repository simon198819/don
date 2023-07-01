import java.util.*;
class TreeSetDemo21
{
    public static void main(String[]args)
    {
        TreeSet t=new TreeSet(new MyComparator());
        t.add("Roja");
        t.add("ShobhaRani");
        t.add("RajaKumari");
        t.add("GangaBhavani");
        t.add("Ramulamma");
        System.out.println(t);
    }
}
class MyComparator implements Comparator
{
    public int compare(Object obj1,Object obj2)
    {
        String s1=obj1.toString();
        String s2=(String)obj2;
        return s2.compareTo(s1);
    }
}