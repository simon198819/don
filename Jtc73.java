class Hai
{
    static
    {
        System.out.println("SB in Hai");
        String str[]={"abc"};
        Jtc73.main(str);
    }
    public static void main(String []args)
    {
        System.out.println("main in Hai");
    }
}
class Jtc73{
    static 
    {
        System.out.println("SB in Jtc73");
        String str[]={"abcd"};
        Hai.main(str);
    }
public static void main(String[]args)
{
    System.out.println("main in Jtc73");
}}