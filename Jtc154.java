class Hello
{
    void m1()
    {
        System.out.println("m1 in Hello");
    }
}
class Jtc154
{
    int a=10;
    static int b=20;
    Hello h1=new Hello();
    static Hello h2=new Hello();
    public static void main(String[]args)
    {
        System.out.println("ln main method");
        System.out.println(a);
        System.out.println(b);
        System.out.println(h1);
        System.out.println(h2);
        h1.m1();
        h2.m1();
    }
}