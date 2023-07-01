class Hello
{
    {
    System.out.println("IB in Hello");
}
static
{
    System.out.println("SB in Hello");
}
void m1()
{
    System.out.println("m1 in Hello");
}
static void m2()
{
    System.out.println("m2()in Hello");
}
}
class Jtc75
{
    Hello h1=new Hello();
    static Jtc75 Jtc75=new Jtc75();
    {
        System.out.println("IB in Jtc75");
        Hello h2=new Hello();
        h1.m1();
        h2.m1();
    }
    static
    {
        System.out.println("SB in Jtc75");
    }
    public static void main(String[]args)
    {
        System.out.println("main in Jtc75");
        Hello.m2();
    }
    } 