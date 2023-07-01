import java.util.*;
class LinkedHashSetDemo6
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
        h.add("V");
        h.add("C");
        h.add("D");
        h.add("E");
        h.add("H");
        h.add("I");
        h.add(null);
        h.add(15);
        System.out.println(h.add("O"));
        System.out.println(h);
    }
}