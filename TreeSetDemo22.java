import java.util.*;
class TreeSetDemo22
{
    public static void main(String[]args)
        {
            TreeSet t=new TreeSet(new MyComparator());
            t.add("Ram");
            t.add("Gopi");
            t.add("Sita");
            t.add("Ganga");
            t.add("Don");
            t.add("Love");
            t.add("Rina");
            t.add("Rohit");
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
    