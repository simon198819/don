class Hello
{
    int a=10;
    int b=20;
    static int c=30;
    {
        System.out.println("IB in Hello");
    }
    static{
        System.out.println("SB in Hello");
    }
    void m1()
    {
        System.out.println("mi in Hello");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    static void m2()
    {
        System.out.println("m2 in hello");
        System.out.println(c);
    }
    }
class Hai extends Hello
{
    void showAll()
    {
        System.out.println("show in Hai");
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    m1();
    m2();
}
}
class Jtc180
{
public static void main(String[]args)
{
    Hai hai=new Hai();
    System.out.println(hai.a);
    hai.m1();
    Hello h1=new Hello();
    h1.m1();
}
}
