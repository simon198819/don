import java.util.*;
class TreeMapDemo36
{
    public static void main(String[]args)
    {
        TreeMap t=new TreeMap(new MyComparator());
        t.put("XXX",10);
        t.put("AAA",20);
        t.put("ZZZ",30);
        t.put("LLL",40);
        t.put("EEE",60);
        t.put("DDD",80);
        t.put("GGG",90);
        t.put("VVV",50);
        t.put("BBB",70);
        t.put("CCC",100);
        t.put("SSS",110);
        System.out.println(t);
    }
}
class MyComparator implements Comparator
{
    public int compare(Object obj1,Object obj2)
    {
        String s1=obj1.toString();
        String s2=obj2.toString();
        return s2.compareTo(s1);
    }
}
    