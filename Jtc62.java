class Hello
{
    int a=10;
    static int b=20;
    void m1()
    {
        System.out.println("m1 in Hello");
    }
    static void m2()
{
    System.out.println("m2 in Hello");
}
void m11()
{
    System.out.println("m11 in Hello");
    System.out.println(a);
    System.out.println(b);
    m1();
    m2();
}
static void m22(Hello h1)
{
    System.out.println("M22 in Hello");
    System.out.println(a);
    System.out.println(h1.a);
    System.out.println(b);
    m1();
    m2();
    h1.m1();
}
}
class Jtc62
{
    public static void main(String[]args)
    {
        Hello.m22(new Hello());
        Hello.m22(null);
    }
    }
