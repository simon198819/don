class Hello
{
    int a;
    final int b;
    static final int c;
    static
    {
        System.out.println("SB in Hello");
c=100;
    }
Hello()
{
    System.out.println("Default constructor in Hello");
}
Hello(int a1)
{
    System.out.println("1 param constructor in Hello");
    b=a1;
}
void m1()
{
    System.out.println("m1 in Hello");
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
}
}
class Jtc80
{
    public static void main(String[]args)
    {
        Hello h2=new Hello(999);
        h2.m1();
        Hello h3=new Hello(888);
        h3.m1();
    }
}