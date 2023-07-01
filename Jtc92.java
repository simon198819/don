class Hello
{
    int a=30;
    private int b=20;
    void m1()
    {
        System.out.println("m1 in Hello");
        System.out.println(a);
        System.out.println(b);
    }
}
class Jtc92
{
public static void main(String[]args)
{
    Hello h1=new Hello();
    h1.m1();
    System.out.println(h1.a);
}
}