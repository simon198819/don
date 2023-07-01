class Hello
{
    int a=10;
    int b=20;
    static int c=30;
    {
        System.out.println("IB in Hello");
    }
    static
    {
        System.out.println("SB in Hello");
    }
    int m1()
    {
        System.out.println("m1 in Hello");
        return 10;
    }
    void m2()
    {
        System.out.println("m2 in Hello");
        //return 10.22;
    }
    static void m3()
    {
        System.out.println("m3 in Hello");
    }
    static int m4(int a1)
    {
        System.out.println("m4 in Hello");
        return a1;
    }
}
class Jtc61
{
    public static void main(String[]args)
    {
        Hello h1=new Hello();
        int i1=h1.m1();
        h1.m2();
        System.out.println(i1);
        int i2=Hello.m4(19090);
        System.out.println(i2);
    }
}