class Hello
{
    int a;
    Hello(int a1)
    {
        System.out.println("1 param constrction in Hello");
        a=a1;
    }
    void m1()
    {
        System.out.println("m1 in Hello");
        System.out.println(a);
    }
}
class Jtc79
{
    public static void main(String[]args)
    {
        Hello h2=new Hello(222);
        h2.m1();
    }
}