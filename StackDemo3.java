import java.util.*;
class StackDemo3
{
    public static void main(String[]args)
    {
        Stack s=new Stack();
        s.push("A");
        s.push("B");
        s.push("C");
        s.push("D");
        s.push("E");
        s.push("F");
        s.push("G");
        System.out.println(s);
        System.out.println(s.search("A"));
        System.out.println(s.search("Z"));
        System.out.println(s.search("L"));
    }
}