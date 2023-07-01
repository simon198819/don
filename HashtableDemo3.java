import java.util.*;
class HashtableDemo3
{
    public static void main(String[]args)
    {
        Hashtable h=new Hashtable();
        h.put(new Temp(1),"A");
        h.put(new Temp(2),"B");
        h.put(new Temp(3),"C");
        h.put(new Temp(4),"D");
        h.put(new Temp(5),"E");
        h.put(new Temp(6),"F");
        h.put(new Temp(7),"G");
        h.put(new Temp(8),"H");
        h.put(new Temp(9),"I");
        h.put(new Temp(10),"J");
        h.put(new Temp(11),"K");
        h.put(new Temp(12),"L");
        System.out.println(h);
    }
}
class Temp
{
    int i;
    Temp (int i)
    {
        this.i=i;
    }
    public int hashcode()
    {
        return i;
    }
    public String toString()
    {
        return i+" ";
    }
}