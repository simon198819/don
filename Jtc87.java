class Hai
{
    class Hello
    {
        void m1()
        {
            System.out.println("m1 in Hello");
        }
        void m1(int...a)
        {
            System.out.println("m1(int...a)in Hello");
System.out.println(a);
        }
    void m1(Hai hai)
    {
        System.out.println("m1(Hai hai)in Hello");
    }
    void m2(Object O)
    {
        System.out.println("m2(Object O)in Hello");
    }
    void m2(Hello h)
    {
        System.out.println("m2(String arg)");
    }
    }
    class Jtc87
    {
    public static void main(String arg[])
    {
Hello h1=new Hello();
h1.m1(11,22);
//h1.m2(null);
}
    }