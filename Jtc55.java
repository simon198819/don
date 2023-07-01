class Hello
{
    int a=0;
    int b=20;
    static int c=30;
{
    System.out.println("IB in Hello");
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
}
static
{
    System.out.println("SB in Hello");
    System.out.println(c);
}
void m1()
{
    System.out.println("M1 in Hello");
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
}
static void m2()
{
    System.out.println("M2 in Hello");
    System.out.println(c);
}
}
class Jtc55
{
    public static void main(String[]args)
{
    System.out.println(Hello.c);
    System.out.println(Hello.c);
    Hello h1=new Hello();
    Hello h2=new Hello();
    h1.m1();
    h2.m1();
}
}