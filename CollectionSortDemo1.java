import java.util.*;
class CollectionsSortDemo1
{
    public static void main(String[]args)
    {
        ArrayList l=new ArrayList();
        l.add("Z");
        l.add("A");
        l.add("K");
        l.add("N");
        System.out.println("Before Sorting;" + l);
        Collections.sort(l);
        System.out.println("After Sorting;" + l);
    }
}
