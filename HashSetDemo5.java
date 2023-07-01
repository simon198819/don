import java.util.*;
class HashSetDemo5
{
    public static void main(String[]args)
    {
        HashSet h=new HashSet();
        h.add("F");
        h.add("G");
        h.add("B");
        h.add("A");
        h.add("X");
        h.add("S");
        h.add("T");
        h.add(null);
        h.add(10);
        System.out.println(h.add("Z"));
        System.out.println(h);
    }
}