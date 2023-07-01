import java.util.*;
class TreeSetDemo25
{
    public static void main(String[]args)
    {
        TreeSet t=new TreeSet(new MyComparator());
        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("Z"));
        t.add(new StringBuffer("K"));
        t.add(new StringBuffer("L"));
        t.add(new StringBuffer("E"));
        t.add(new StringBuffer("O"));
        t.add(new StringBuffer("P"));
        t.add(new StringBuffer("T"));
        t.add(new StringBuffer("W"));
        t.add(new StringBuffer("Y"));
        t.add(new StringBuffer("E"));
        t.add(new StringBuffer("X"));
        t.add(new StringBuffer("S"));
        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("B"));
        t.add(new StringBuffer("C"));
        t.add(new StringBuffer("D"));
        t.add(new StringBuffer("F"));
        t.add(new StringBuffer("G"));
        t.add(new StringBuffer("H"));
        t.add(new StringBuffer("I"));
        System.out.println(t);
    }
    }
    class MyComparator implements Comparator
    {
    public int compare(Object obj1,Object obj2)
    {
        String s1=obj1.toString();
        String s2=obj2.toString();
        return-s1.compareTo(s2);
    }
    }
    
