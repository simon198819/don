class Hello
{
    void m1(final int a)
    {
        System.out.println("m1 in Hello"+a);
    }
}
class Jtc70
{
    public static void main(String[]args)
    {
        Hello h1=new Hello();
        h1.m1(100);
        h1.m1(200);
    }
}