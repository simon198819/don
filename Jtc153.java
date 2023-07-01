class Hello
{
    int a=10;
    int b=200;
    static int c=30;
    void m1()
    {
        int aa=11;
        System.out.println("m1 in Hello");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(aa);
    }
static void m2()
{
    int ab=101;
    System.out.println("m2 in Hello");
    System.out.println(c);
    System.out.println(ab);
}
}
class Jtc153
{
    public static void main(String[]args)
    {
    Hello h1=new Hello();
    h1.m1();
    h1.m2();
}
}