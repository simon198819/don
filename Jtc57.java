class Hello
{
    int a;
    static int b;
    {
        System.out.println("IB in Hello");
    }
static
{
    System.out.println("Sb in Hello");
}
void m1()
{
    System.out.println("m1 in Hello");
}
static void m2()
{
    System.out.println("m2 in Hello");
}
}
class Jtc57
{
    {
    System.out.println("IB in Jtc57");
}
static
{
    System.out.println("Sb in Hello");
   try 
    {
        Jtc57 j57=(Jtc57)Class.forName("Jtc57").newInstance();
    }
    catch(Exception e)
    {
    }}
    public static void main(String[]args)throws Exception
    {
        Class cls=Class.forName("Hello");
        String str=cls.getName();
        System.out.println(str);
        if(str.equals("Hello"))
        {
            System.out.println("Hello is loaded");
        }
        else
        {
            System.out.println("Hello is not found");
        }
        Hello h1=(Hello)cls.newInstance();
        System.out.println(Hello.b);
    }
        }
    