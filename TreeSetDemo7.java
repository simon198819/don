import java.util.*;
class TreeSetDemo6
{
    public static void main(String[]args)
    {
        TreeSet t=new TreeSet(New My Comparator());
        t.add(10);
        t.add(0);
        t.add(15);
        t.add(5);
        t.add(20);
        t.add(20);
        t.add(13);
        t.add(44);
        t.add(90);
        System.out.println(t);
    }
}
Class MyComparator implements comparator
{
    public int compare(Object obj1,Object obj2)
    {
        Integer I1=(Integer)obj1;
        Integer I2=(Integer)obj2;
        if(I1<I2)
        return +1;
        else if(I1>I2)
        return -1;
        else 0 ;
    }
}
