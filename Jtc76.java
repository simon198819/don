class Hello
{
    int a;
    int b;
    static int c=30;
    Hello()
    {
        System.out.println("Default constructor in Hello");
    }
    Hello(int a1)
    {
        System.out.println("1 param constructor in Hello");
        a=a1;
    }
    Hello(int a1,int b1)
    {
        System.out.println("2 param contructor in Hello");
        a=a1;
        b=b1;
    }
    void m1()
    {
        System.out.println("m1 in Hello");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
class Jtc76
{
    public static void main(String[]args)
    {
        Hello h1=new Hello();
        h1.m1();
        Hello h2=new Hello(111);
        h2.m1();
        Hello h3=new Hello(111,222);
        h3.m1();
    }
}