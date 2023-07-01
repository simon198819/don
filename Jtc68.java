class Hai
{
}
class Hello
{
    void m1()
    {
        System.out.println("m1 in Hello");
    }
    void m1(Hai hai)
    {
        System.out.println("m1(Hai hai)in Hello");
    }
    void m1(int a[])
    {
        System.out.println("m1(int a[])in Hello");
    }
    void m1(Object O)
    {
        System.out.println("m1(m1(Object O)in Hello");
    }
    void m1(String str)
    {
        System.out.println("m1(String str)in Hello");
    }
}
class Jtc68
{
    public static void main(String[]args)
    {
        Hello h1=new Hello();
        h1.m1();
        h1.m1(new Hai());
        h1.m1("abc");
    }
}
