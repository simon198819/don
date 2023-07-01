class hello
{
    int a=10;
    int b=20;
    static int c=30;
    void m1()
{
System.out.println("m1 in hello");
System.out.println("a:\t"+a);
System.out.println("b:\t"+b);
System.out.println("c:\t"+c);
}
static void m2()
{
    System.out.println("m2 in hello");
    System.out.println("c:\t"+c);
}
}
class Jtc51
{
    public static void main(String[]args)
    {
        System.out.println("instance variable");
hello h2=new hello();
    System.out.println(h2.a);
    System.out.println(h2.b);
    System.out.println(h2.c);
    System.out.println("static variable");
    System.out.println("1.......");
    hello h3=new hello();
    System.out.println(h3.a);
    System.out.println(h3.b);
    System.out.println(h3.c);
    System.out.println("2.......");
    System.out.println(hello.c);
    }
}
