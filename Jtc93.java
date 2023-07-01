class Hello
{
    static int s;
    static final int c=30;
    static final int b;
    static
    {
        System.out.println("SB in Hello");
        b=10;
    }
}
class Jtc93
{
    public static void main(String[]args)
    {
        System.out.println("in main");
        System.out.println(Hello.c);
    }
}